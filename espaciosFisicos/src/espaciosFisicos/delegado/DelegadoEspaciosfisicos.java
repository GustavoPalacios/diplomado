package espaciosFisicos.delegado;

import espaciosFisicos.logica.LogicaEspaciosFisicos;
import espaciosFisicos.logica.LogicaHorarios;

public class DelegadoEspaciosfisicos {
	
	public DelegadoEspaciosfisicos() {
		// TODO Auto-generated constructor stub
	}
	
	LogicaEspaciosFisicos logicaPrueba = new LogicaEspaciosFisicos().getInstance();
	LogicaHorarios logica2 = new LogicaHorarios();
	
	
	public String saludo()
	{
		return logicaPrueba.prueba1();
	}
	
	public String saludo2(String nombres, String apellidos)
	{
		return "clases";
	}
	
	
	
	
	
	
	
	

}
