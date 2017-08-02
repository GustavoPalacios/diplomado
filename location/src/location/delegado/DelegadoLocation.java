package location.delegado;

import business.BusinessImpl;
import location.logica.LogicaLocation;

public class DelegadoLocation {
	
	public DelegadoLocation() {
		// TODO Auto-generated constructor stub
	}
	
	LogicaLocation logicaLocation = new LogicaLocation().getInstance();
		
	public String geolocalizacion(String direcciones){
		//String direcciones = "Colombia,Valle%20del%20Cauca,Cali,Belalcazar,Cra17,21,16-Colombia,Valle%20del%20Cauca,Cali,Belalcazar,Cra17,21,16";
		return logicaLocation.geolocalizacion(direcciones);
	}	

}
