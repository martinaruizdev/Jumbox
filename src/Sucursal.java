import java.util.LinkedList;

public class Sucursal {
	//Atributos
	private int id;
	private String nombre;
	private String direccion;
	private Cliente cliente;
	private Repartidor repartidor;
	private Encargado_stock encargado_stock;
	private LinkedList<Producto>productos = new LinkedList<Producto>();
	private LinkedList<Venta>productos = new LinkedList<Venta>();
	
	//Constructor
	public Sucursal(int id, String nombre, String direccion, Cliente cliente, Repartidor repartidor,
					Encargado_stock encargado_stock, LinkedList<Producto> productos) {
		super();
		this.id = id;
		this.nombre = "Jumbox";
		this.direccion = direccion;
		this.cliente = cliente;
		this.repartidor = repartidor;
		this.encargado_stock = encargado_stock;
		this.productos = productos;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Repartidor getRepartidor() {
		return repartidor;
	}

	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}

	public Encargado_stock getEncargado_stock() {
		return encargado_stock;
	}

	public void setEncargado_stock(Encargado_stock encargado_stock) {
		this.encargado_stock = encargado_stock;
	}

	public LinkedList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(LinkedList<Producto> productos) {
		this.productos = productos;
	}

	public LinkedList<Venta> getProductos() {
		return productos;
	}

	public void setProductos(LinkedList<Venta> productos) {
		this.productos = productos;
	}

	//To String
	@Override
	public String toString() {
		return "Sucursal [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
