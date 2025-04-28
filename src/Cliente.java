
public class Cliente extends Usuario{
	
	private String direccion;

	public Cliente(int id, String nombre, String mail, String contrasenia, String sucursal, String direccion) {
		super(id, nombre, mail, contrasenia, sucursal);
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
