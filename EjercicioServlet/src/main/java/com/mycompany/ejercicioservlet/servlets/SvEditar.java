
package com.mycompany.ejercicioservlet.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import unidadLogica.ControladoraLogica;
import unidadLogica.Usuario;


@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {

    ControladoraLogica controlLog = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idEditar = Integer.parseInt(request.getParameter("usuarioEditar"));
        Usuario usu = controlLog.editarUsuario(idEditar);
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("usuEditar", usu);
        
        response.sendRedirect("editarUsuario.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");
        usu.setDni(dni);
        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setTelefono(telefono);
        
        controlLog.modificarUsuario(usu);
        
        response.sendRedirect("index.jsp");
        
        
    }


    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
