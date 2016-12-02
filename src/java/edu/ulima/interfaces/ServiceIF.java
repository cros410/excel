/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.interfaces;

import edu.ulima.beans.Documento;
import edu.ulima.beans.ReqSave;
import edu.ulima.beans.Usuario;
import java.util.List;


public interface ServiceIF {

    public Usuario Login(String username, String pwd);

    public void SaveDoc(ReqSave reqsave);

    public void SaveUser(String username, String pwd);
    
    public List<Documento> GetDocumentos(String usuario);
    

}
