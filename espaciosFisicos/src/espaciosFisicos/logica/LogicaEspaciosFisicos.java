package espaciosFisicos.logica;

public class LogicaEspaciosFisicos {
	
	public LogicaEspaciosFisicos()
	{
		
	}

private static LogicaEspaciosFisicos instance;
	
	public static LogicaEspaciosFisicos getInstance(){
		if(instance == null){
			instance = new LogicaEspaciosFisicos();
		}
		 return instance;
	}
	
	public String prueba1()
	{
		return "hellow world";
	}
		
	
}
