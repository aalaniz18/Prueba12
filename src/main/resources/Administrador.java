package resources;

public class Administrador {
	private String usuario;
	private String contrasena;
	//private String nombre;
	
	public Administrador(String u, String c, String n){
		usuario=u;
		contrasena=c;
		//nombre=n;
	}
	
	public void setPass(String c){
		contrasena=c;}
	
	public String getUsuario(){
		return usuario;
	}
	
	public String getPass(){
		return contrasena;}
}
