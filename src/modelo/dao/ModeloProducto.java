package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Producto;
import modelo.bean.Talla;

public class ModeloProducto extends Conector {

	public ArrayList<Producto> getAll() {
		// TODO implementar
		ArrayList<Producto> productos = new ArrayList<Producto>();
		try {

			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select productos.* from productos");
			while (rs.next()) {
				Producto producto = new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getInt("stock"),
						rs.getDate("fecha_compra"), rs.getString("color"), rs.getString("made_in"),
						rs.getDouble("precio"), rs.getInt("descuento"), rs.getString("talla"));

				productos.add(producto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return productos;
	}

	public Producto get(int id) {

		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select productos.* from productos where id='" + id + "'");

			while (rs.next()) {
				Producto producto = new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getInt("stock"),
						rs.getDate("fecha_compra"), rs.getString("color"), rs.getString("made_in"),
						rs.getDouble("precio"), rs.getInt("descuento"), rs.getString("talla"));
				return producto;
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	public void insert(Producto producto) {         
		
	
	        try {
	            PreparedStatement pst = super.conexion.prepareStatement(
	                    "insert into productos (nombre, stock, fecha_compra,color,made_in,precio,descuento,tallas) values (?, ?, ?, ?, ?, ?,?,?)");
	            pst.setString(1, producto.getNombre());
	            pst.setInt(2, producto.getStock());
	            pst.setDate(3, new java.sql.Date(producto.getFecha_compra().getTime()));
	            pst.setString(4, producto.getColor());
	            pst.setString(5, producto.getMade_in());
	            pst.setDouble(6, producto.getPrecio());
	            pst.setInt(7, producto.getDescuento());
	            pst.setString(8, producto.getTallas());

	            pst.execute();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	public void update(Producto producto) {
		// TODO implementar
	}

	public void delete(int id) {

		try {

			PreparedStatement pstUpdate = conexion.prepareStatement("delete from productos where id=?");
			pstUpdate.setInt(1, id);

			pstUpdate.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Producto> deLaTalla(Talla talla) {
		// TODO implementar, un poco mas dificil
		return null;
	}
}
