import javax.swing.JOptionPane;

public class Encargado_Stock extends Usuario {

	public Encargado_Stock(int id, String nombre, String mail, String contrasenia, String sucursal) {
		super(id, nombre, mail, contrasenia, sucursal);
	}
	
	public void agregarStock() {
		String menu [] = {"Agregar Productos","Salir"};
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
	
	public void actualizarStock() {
		String menu [] = {"Ingrese el id del producto","Salir"};
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
	
	public void eliminarStock() {
		String menu [] = {"Ingrese el id del producto","Salir"};
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
	
	public void verStock() {
		String menu [] = {"Seleccione Producto","Salir"};
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
