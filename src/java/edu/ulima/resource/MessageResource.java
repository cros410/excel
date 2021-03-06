package edu.ulima.resource;

import edu.ulima.beans.Documento;
import edu.ulima.beans.ReqSave;
import edu.ulima.beans.ResLogin;
import edu.ulima.beans.ResReg;
import edu.ulima.beans.ResSave;
import edu.ulima.beans.Usuario;
import edu.ulima.dao.ServiceDAO;
import edu.ulima.interfaces.ServiceIF;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/excelweb")
public class MessageResource {

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/login")
    public ResLogin login(Usuario usuario) throws Exception {
        ResLogin rs = new ResLogin();
        ServiceIF service = new ServiceDAO();
        Usuario u = service.Login(usuario.getUsuario(), usuario.getClave());
        if (u != null) {
            rs.setCod(1);
        } else {
            rs.setCod(0);
        }
        rs.setUser(u);
        return rs;
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/saveDoc")
    public ResSave guarDatos(ReqSave reqsave) throws Exception {

        ServiceIF service = new ServiceDAO();
        service.SaveDoc(reqsave);
        ResSave rs = new ResSave();
        rs.setCod(1);
        rs.setMsg("Ingreso correcto");
        return rs;
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/saveUser")
    public ResReg guarUser(Usuario usuario) throws Exception {

        ServiceIF service = new ServiceDAO();
        service.SaveUser(usuario.getUsuario(), usuario.getClave());
        ResReg rs = new ResReg();
        rs.setCod(1);
        rs.setMsg("Ingreso correcto");
        return rs;
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/getDocusUser")
    public List<Documento> GetDocus(Usuario usuario) throws Exception {

        ServiceIF service = new ServiceDAO();
        List<Documento> docs  = service.GetDocumentos(usuario.getUsuario());
        return docs;
    }
}
