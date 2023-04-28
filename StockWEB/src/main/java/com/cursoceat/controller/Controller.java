package com.cursoceat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cursoceat.modell.Productos;
import com.cursoceat.servicios.Validacion;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet implements Validacion {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
	String msg=null;
	List<Productos> listadoPro = new ArrayList<Productos>();
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreP=request.getParameter("nombre");
		String descripcionP=request.getParameter("descripcion");

		if(validaCantidad(request.getParameter("cantidad"))){
			int cantidadP=Integer.parseInt(request.getParameter("cantidad"));
			
			Productos pro=new Productos(cantidadP, nombreP.toUpperCase(), pasarPmayuscula(descripcionP));
			listadoPro.add(pro);
			msg="El producto se ha creado correctamente.";
			request.getSession().setAttribute("productos", listadoPro);
			request.getSession().setAttribute("msg", msg);
			response.sendRedirect("index.jsp");
			
		}else {
			msg="La cantidad debe ser numérica.";
			request.getSession().setAttribute("msg", msg);
//			request.setAttribute("msg", msg);
			/**
			 * Ese error lo tengo que despachar a la vista.
			 */
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}

}
