package location.delegado;

import business.BusinessImpl;
import location.logica.LogicaLocation;

public class DelegadoLocation {
	
	public DelegadoLocation() {
		// TODO Auto-generated constructor stub
	}
	
	LogicaLocation logicaLocation = new LogicaLocation().getInstance();
		
	public String geolocalizacion(String direcciones){
		return logicaLocation.geolocalizacion(direcciones);
	}	

}
