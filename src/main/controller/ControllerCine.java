package controller;
import model.*;
import resources.*;
import interfazJPANEL.*;

public class ControllerCine implements ControllerInterface{
	Cargador model;
	Home view;
	
	public ControllerCine(Cargador model, Home view){
		this.model=model;
		this.view=view;
	}
	
	public void iniciar(){
		Home.main();
	}

}
