package unidadLogica;

import java.util.List;
import unidadPersistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearUsuario(Usuario usu) {
        controlPersis.crearUsuario(usu);
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public void eliminarUsuario(int idEliminar) {
        controlPersis.eliminarUsuario(idEliminar);
    }

    public Usuario editarUsuario(int idEditar) {
        return controlPersis.editarUsuario(idEditar);
    }

    public void modificarUsuario(Usuario usu) {
        controlPersis.modificarUsuario(usu);
    }
    
}
