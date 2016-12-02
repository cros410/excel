
package edu.ulima.beans;


public class ResLogin {
   
    private int cod;
    private Usuario user = new Usuario();

    public ResLogin() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    
    
    
    
}
