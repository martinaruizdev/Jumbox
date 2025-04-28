import javax.swing.JOptionPane;
public class Usuario {
    private int id;
    private String nombre;
    private String mail;
    private String contrasenia;
    private String sucursal;

    public Usuario(int id, String nombre, String mail, String contrasenia, String sucursal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.mail = mail;
		this.contrasenia = contrasenia;
		this.sucursal = sucursal;
	}
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
    public void iniciarSesion() {
        JOptionPane.showMessageDialog(null, "Iniciando sesión para el usuario: " + nombre, "Inicio de Sesión", JOptionPane.INFORMATION_MESSAGE);
    }

    public void cerrarSesion() {
        JOptionPane.showMessageDialog(null, "Cerrando sesión para el usuario: " + nombre, "Cierre de Sesión", JOptionPane.INFORMATION_MESSAGE);
    }
}