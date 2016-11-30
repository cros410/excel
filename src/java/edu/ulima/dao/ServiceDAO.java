package edu.ulima.dao;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import edu.ulima.beans.Documento;
import edu.ulima.beans.Usuario;
import edu.ulima.interfaces.ServiceIF;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;

public class ServiceDAO implements ServiceIF {

    MongoClient mongoClient = null;
    DB db = null;

    private DB getConnection() {
        try {
            mongoClient = new MongoClient(
                    new MongoClientURI("mongodb://excel:excel@ds113628.mlab.com:13628/excelweb")
            );
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        db = mongoClient.getDB("excelweb");

        return db;
    }

    @Override
    public Usuario Login(String user, String pwd) {

        db = getConnection();
        DBCursor cursor;
        DBCollection coll = db.getCollection("usuarios");
        BasicDBObject query = new BasicDBObject();
        Usuario u = null;
        query.put("user", user);
        query.put("pwd", pwd);
        cursor = coll.find(query);
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            u = new Usuario();
            u.setUsuario((String) obj.get("user"));
            u.setClave((String) obj.get("pwd"));
        }
        cursor.close();
        mongoClient.close();
        return u;
    }

    @Override
    public void SaveDoc(String cadena, String usuario) {
        db = getConnection();
        DBCollection coll = db.getCollection("usuarios");
        BasicDBObject filtro = new BasicDBObject("user", usuario);
        DBObject item = new BasicDBObject("docs", new BasicDBObject("cod", "3").append("cadena", cadena));
        DBObject updateQuery = new BasicDBObject("$push", item).append("$set", new BasicDBObject().append("cont", 1));;
        coll.update(filtro, updateQuery);
        mongoClient.close();
    }

    @Override
    public void SaveUser(String username, String pwd) {
        db = getConnection();
        DBCollection coll = db.getCollection("usuarios");
        BasicDBObject doc = new BasicDBObject("name", username)
                .append("pwd", pwd)
                .append("cont", 0)
                .append("docs", new ArrayList<>());

        coll.insert(doc);
        mongoClient.close();

    }

    @Override
    public List<Documento> GetDocumentos(String usuario) {
        Documento doc;
        db = getConnection();
        List<Documento> docs = new ArrayList<>();
        DBCollection coll = db.getCollection("usuarios");
        BasicDBObject query = new BasicDBObject();
        query.put("user", usuario);
        BasicDBObject fields = new BasicDBObject("docs", 1).append("_id", false);
        DBCursor curs = coll.find(query, fields);

        while (curs.hasNext()) {
            DBObject o = curs.next();
            BasicDBList lights = (BasicDBList) o.get("docs");
            BasicDBObject[] lightArr = lights.toArray(new BasicDBObject[0]);
            for (BasicDBObject dbObj : lightArr) {
                // shows each item from the lights array
                doc = new Documento();
                doc.setCod((int) dbObj.get("cod"));
                doc.setCadena((String) dbObj.get("cadena"));
                docs.add(doc);
            }
        }

        /*user = new Usuario();
        user.setUsuario((String) obj.get("user"));
        user.setDocs((List<Documento>) obj.get("docs"));
        mongoClient.close();*/
        return docs;

    }

}
