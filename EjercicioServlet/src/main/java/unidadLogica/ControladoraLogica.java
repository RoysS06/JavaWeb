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

    public void borrarUsuario(int idEliminar) {
        controlPersis.borrarUsuario(idEliminar);
    }

    public Usuario traerUsu(int idEditar) {
        return controlPersis.traerUsu(idEditar);
    }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }

    
}
