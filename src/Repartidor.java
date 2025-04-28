import javax.swing.JOptionPane;

public class Repartidor extends Usuario {

	public Repartidor(int id, String nombre, String mail, String contrasenia, String sucursal) {
		super(id, nombre, mail, contrasenia, sucursal);
	}
	
	public void enviarPedido() {
		String menu [] = {"Seleccione el Producto","Salir"};
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
