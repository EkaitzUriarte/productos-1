package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.*;
import modelo.dao.*;

/**
 * Servlet implementation class InsertarProducto
 */
@WebServlet("/InsertarProducto")
public class InsertarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ModeloProducto mPro=new ModeloProducto();
		Producto producto=new Producto();	// crear un ojbeto de la clase Modelo Actividad	
		// Recuperar mediante request.getParameter los valores del formulario
		Date fecha = null;
		String nombre=request.getParameter("nombre");

		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			fecha = formato.parse(request.getParameter("fechaCompra"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		int stock=Integer.parseInt(request.getParameter("stock"));
		String color=request.getParameter("color");
		String made_in=request.getParameter("madein");
		Double precio=Double.parseDouble(request.getParameter("precio"));
		int descuento=Integer.parseInt(request.getParameter("descuento"));
		String[] tallas= request.getParameterValues("tallas");
		
		producto.setNombre(nombre);
        producto.setStock(stock);
        producto.setFecha_compra(fecha);
        producto.setColor(color);
        producto.setMade_in(made_in);
        producto.setPrecio(precio);
        producto.setDescuento(descuento);
        producto.setTallas(tallas);
		// crear una actividad con los datos del formulario	
		
	    //insertar actividad
		
        mPro.insert(producto);
		response.sendRedirect("verProductos.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
