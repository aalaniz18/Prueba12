package resources;

import java.util.ArrayList;
import java.util.Date;

public class Compra {
	
	private ArrayList<Producto> carrito;
	private double total;
	private FormaPago f;
	private Codigo c;
	private int items;
	
	public Compra(){
		total= 0.0;
		carrito = new ArrayList<Producto>();
		c=new Codigo("xxxxxxxx");
		items=0;
	}
	
	public void agregarProducto(int IDprod,double precioU, String nomPelicula){
			carrito.add(new Entrada(IDprod,precioU,nomPelicula));
			items++;
	}
	
	public void agregarProducto(int IDprod,double precioU,int cantidad, String nombre){
		carrito.add(new Merchandising(IDprod,precioU,cantidad,nombre));
		items++;
}
	
	public void setEntrada(int cantidad, String ubicacion){
		Entrada e= (Entrada) carrito.get(0);
		e.setCant(cantidad);
		e.setUbicacion(ubicacion);
	}

	public void setCodigo(String a){
		c.setCode(a);
	}
	
	public String getCod(){
		return c.getCode();
	}
	
	public Date getTime(){
		return c.getInicio();
	}
	
	public void startValido(){
		c.iniciar();
	}
	
	public void calculartotal(){
		for(int i=0; i<items+1; i++){
			total=total+carrito.get(i).getPrecio();
		}
	}

	/* El parametro i es el orden de casillero elegido por el usuario. Supongo primero a Efectivo
	  segundo a Credito y tercero a Debito. */
	public void	definirFormaPago(int i){
		if(i==1){
			f= new Efectivo();}
		if(i==2){
			f= new Credito();}
		if(i==3){
			f= new Debito();}
	}
}
