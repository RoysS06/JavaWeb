<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio Servlet</title>
    </head>
    <body>
        <h1>Datos del Cliente</h1>
        
        <form action="SvUsuarios" method="POST">
            <p>
                <label>Dni: </label>
                <input type="type" name="dni">
            </p>
            <p>
                <label>Nombre: </label>
                <input type="type" name="nombre">
            </p>
            <p>
                <label>Apellido: </label>
                <input type="type" name="apellido">
            </p>
            <p>
                <label>Telefono: </label>
                <input type="type" name="telefono">
            </p>
            <button type="submit"> Guardar </button>
            
        </form>
    
        
        <p>----------------------------</p>
        
        <h2>Lista de Usuarios Registrados </h2>
        <p>Haz click en el boton para mostrar los usuarios registrados</p>
        <form action="SvUsuarios" method="GET">
            <button type="submit"> Mostrar Usuarios </button>
        </form>
        
        
        <p>----------------------------</p>
        
        <h2>¿Deseas eliminar algún usuario? </h2>
        <p>Registra el id del usuario que deseas eliminar</p>
        <form action="SvEliminar" method="POST">
            <p>                
            <label>Id: </label>
            <input type="text" name="usuarioEliminar">
            </p>
            <button type="submit"> Eliminar Usuarios </button>
        </form>
        
        
        <p>----------------------------</p>
        
        <h2>¿Deseas editar algún usuario? </h2>
        <p>Registra el id del usuario que deseas editar</p>
        <form action="SvEditar" method="GET">
            <p>                
            <label>Id: </label>
            <input type="text" name="usuarioEditar">
            </p>
            <button type="submit"> Editar Usuarios </button>
        </form>
        
        
    </body>
</html>
