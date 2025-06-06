package conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class ControllerUsuario{

    private static Connection con = Conexion.getInstance().getConnection();


    public Usuario login(String nombre, String password) {
    	Usuario usuario = new Usuario();
        try {
            PreparedStatement stmt = con.prepareStatement(
                "SELECT * FROM usuario WHERE nombre = ? AND password = ?"
            );
            stmt.setString(1, nombre);
            stmt.setString(2, usuario.encriptar(password));

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String tipo = rs.getString("tipo");

              
                        usuario =  new Usuario(id, nombre, email, tipo,usuario.desencriptar(password));
                  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
    }

    public void agregarUsuario(Usuario usuario) {
        try {
            PreparedStatement statement = con.prepareStatement(
                "INSERT INTO usuario (nombre, email, tipo, password) VALUES (?, ?, ?, ?)"
            );
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getEmail());
            statement.setString(3, usuario.getTipo());
            statement.setString(4, usuario.encriptar(usuario.getPassword()));

            int filas = statement.executeUpdate();
            if (filas > 0) {
                System.out.println("Usuario agregado correctamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void Registrarse(Usuario nuevo) {
		LinkedList<Usuario> creados = mostrarUsuarios();
		for (Usuario creado : creados) {
			if (creado.getEmail().equalsIgnoreCase(nuevo.email)) {
				JOptionPane.showMessageDialog(null, "Usuario creado, con este mismo mail");
				return;
			}
		}
		agregarUsuario(nuevo);
		
	}


    public LinkedList<Usuario> mostrarUsuarios() {
        LinkedList<Usuario> usuarios = new LinkedList<>();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String tipo = rs.getString("tipo");
                String password = rs.getString("password");

                usuarios.add(new Usuario(id, nombre, email, tipo,password));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}
