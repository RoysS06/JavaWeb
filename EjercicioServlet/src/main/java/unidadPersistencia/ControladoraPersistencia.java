package unidadPersistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import unidadLogica.Usuario;
import unidadPersistencia.exceptions.NonexistentEntityException;



public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }

    public void borrarUsuario(int idEliminar) {
        try {
            usuJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsu(int idEditar) {
        return usuJpa.findUsuario(idEditar);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}
