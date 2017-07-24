package espaciosFisicos.logica;

import business.BusinessImpl;

public class LogicaHorarios {
	

	
	public LogicaHorarios()
	{
		
	}

private static LogicaHorarios instance;
	
	public static LogicaHorarios getInstance(){
		if(instance == null){
			instance = new LogicaHorarios();
		}
		 return instance;
	}
		
	public String getHorariosAll()
	{
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getHorariosAll();
	}
	
	
	public String getHorarioById(String id)
	{
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getHorarioById(id);
	}
	
	
	public String getHorarioByName(String name)
	{
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getHorarioByName(name);
	}
	
	public String getHorarioByHoraIni(String horaIni)
	{
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getHorarioByHoraIni(horaIni);
	}
	
	public String getHorarioByHoraFin(String horaFin)
	{
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getHorarioByHoraFin(horaFin);
	}
	
	public String getHorarioByHoraBetween(String horaIni, String horaFin)
	{
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getHorarioByHoraBetween(horaIni, horaFin);
	}
	
}
