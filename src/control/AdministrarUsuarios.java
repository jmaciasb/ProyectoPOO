/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Usuario;


public class AdministrarUsuarios {
        
    private ArrayList<Usuario> userList;

    public AdministrarUsuarios() {
        userList= new ArrayList();
    }

    public AdministrarUsuarios(ArrayList<Usuario> userList) {
        this.userList = userList;      }
    
    
    public void crearUsuario(Usuario u){
        userList.add(u);
    }
    
    public void editarUsuario(Usuario u){
        userList.set(userList.indexOf(u), u);
    }
    
    public void borrarUsuario(Usuario u){
        userList.remove(u);
    }
    
    public Usuario buscarUsuario(String username){
        Usuario u = new Usuario();
        for (Usuario usuario : userList) {
            if(usuario.getUserID().equals(username)) u=usuario;
        }
        return u;
    }
    
    
    
}

    

