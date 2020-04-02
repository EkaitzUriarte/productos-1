package modelo.bean;

public class Descuento {

	private int id;
	private int valor;
	private String descripcion;
	public Descuento() {
		super();
	}
	public Descuento(int id, int valor, String descripcion) {
		super();
		this.id = id;
		this.valor = valor;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
	
}
