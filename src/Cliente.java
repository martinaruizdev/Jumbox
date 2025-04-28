import javax.swing.JOptionPane;

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
	
	public void realizarCompra() {
		String menu [] = {"Seleccionar Producto","Pagar","Salir"};
		int elegido = 0;
		do {
			elegido = JOptionPane.showOptionDialog(null, "Seleccione una Opción", "Jumbox", 0, 0, null, menu, menu[0]);
			switch (elegido) {
			case 0:
				JOptionPane.showMessageDialog(null, "En Proceso...");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "En Proceso...");
				break;
			}
		} while (elegido!=2);
	}
	
	public void verCompra() {
		String menu [] = {"Ver Compra","Salir"};
		int elegido = 0;
		do {
			elegido = JOptionPane.showOptionDialog(null, "Seleccione una Opción", "Jumbox", 0, 0, null, menu, menu[0]);
			switch (elegido) {
			case 0:
				JOptionPane.showMessageDialog(null, "En Proceso...");
				break;
			}
		} while (elegido!=1);
		}
	}
