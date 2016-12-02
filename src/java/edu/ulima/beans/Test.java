/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.beans;

import edu.ulima.dao.ServiceDAO;
import edu.ulima.interfaces.ServiceIF;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ServiceIF service = new ServiceDAO();
        Usuario u = service.Login("christian", "password");
        if (u != null) {
            System.out.println(u.getUsuario());
            System.out.println(u.getClave());
        }else{
            System.out.println("No hay usuario");
        }
        
        String cad = "1/1%123&1/2%124&1/3%125";
        
        String cels[] = cad.split("&");
        for(int i=0;i<cels.length; i++){
            String cel[] = cels[i].split("%");
            System.out.println("pos: "+cel[0]);
            System.out.println("val: "+cel[1]);
        }
         */
        String cad = "1/1%123&1/2%124&1/3%125";
        ServiceIF service = new ServiceDAO();
        List<Documento> docs  = service.GetDocumentos("Christian");
        for (Documento doc : docs) {
            System.out.println(doc.getCadena());
        }
    }

}
