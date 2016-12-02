package edu.ulima.beans;

import java.util.List;


public class Usuario {

    private String usuario;
    private String clave;
    private List<Documento> docs;

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public List<Documento> getDocs() {
        return docs;
    }

    public void setDocs(List<Documento> docs) {
        this.docs = docs;
    }
    
    

}
