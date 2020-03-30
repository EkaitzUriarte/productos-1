package modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.bean.Producto;
import modelo.bean.Talla;
import modelo.Conector;

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
						rs.getDouble("precio"), rs.getInt("descuento"));

				productos.add(producto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return productos;
	}

	public ArrayList<Producto> get(int id) {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select productos.* from productos where id='" + id + "'");

			while (rs.next()) {
				Producto producto = new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getInt("stock"),
						rs.getDate("fecha_compra"), rs.getString("color"), rs.getString("made_in"),
						rs.getDouble("precio"), rs.getInt("descuento"));
				productos.add(producto);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return productos;
	}

	public void insert(Producto producto) {
		// TODO implementar
	}

	public void update(Producto producto) {
		// TODO implementar
	}

	public void delete(int id) {
		// TODO implementar
	}

	public ArrayList<Producto> deLaTalla(Talla talla) {
		// TODO implementar, un poco mas dificil
		return null;
	}
}
