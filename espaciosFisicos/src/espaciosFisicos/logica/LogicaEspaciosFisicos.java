package espaciosFisicos.logica;

import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;

import business.BusinessImpl;

public class LogicaEspaciosFisicos {
	
	HashMap<String,String> rs;
	private Gson gson;

	
	public LogicaEspaciosFisicos()
	{		
		gson = new Gson();
		rs = new HashMap<String,String>();
		rs.put("ResultCode", "002");
		rs.put("Descripción", "Error");
		rs.put("Response", "Campos Obligatorios");
	}

private static LogicaEspaciosFisicos instance;
	
	public static LogicaEspaciosFisicos getInstance(){
		if(instance == null){
			instance = new LogicaEspaciosFisicos();
		}
		 return instance;
	}
	
	/*
	 * Grupos
	 */

	public String getGrupoByName(String name) {
		if(name.equals("")){return gson.toJson(rs);}
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getGrupoByName(name);
	}

	public String getGrupoById(String id) {
		if(id.equals("")){return gson.toJson(rs);}
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getGrupoById(id);
	}

	public String getGruposAll() {
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getGruposAll();
	}

	public String getGrupoByMateria(String materia) {
		if(materia.equals("")){return gson.toJson(rs);}	
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getGrupoByMateria(materia);
	}

	public String getGrupoByUnidad(String unidad) {
		if(unidad.equals("")){return gson.toJson(rs);}	
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getGrupoByUnidad(unidad);
	}

	public String getGrupoByEstado(String estado) {
		if(estado.equals("")){return gson.toJson(rs);}	
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getGrupoByEstado(estado);
	}
	
	
	/*
	 * Materias
	 */
	
	public String getMateriaByName(String name) {
		if(name.equals("")){return gson.toJson(rs);}	
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getMateriaByName(name);	
	}

	public String getMateriaById(String id) {
		if(id.equals("")){return gson.toJson(rs);}	
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getMateriaById(id);	
	}

	public String getMateriasAll() {
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getMateriasAll();	
	}
	
	/*
	 * Materia recursos fisico
	 */
	
	public String getMateriaRecursoFisicoByRecursoFisico(String recursoFisico) {
		if(recursoFisico.equals("")){return gson.toJson(rs);}	
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getMateriaRecursoFisicoByRecursoFisico(recursoFisico);		
	}

	public String getMateriaRecursoFisicoByIdMateria(String id) {
		if(id.equals("")){return gson.toJson(rs);}		
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getMateriaRecursoFisicoByIdMateria(id);	
	}

	public String getMateriaRecursoFisicosAll() {
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getMateriaRecursoFisicosAll();
	}	
	
	/*
	 * Recursos fisicos
	 
	
	public String getRecursoFisicosByMateria(String idMateria) {
		if(idMateria.equals("")){return gson.toJson(rs);}		
		BusinessImpl businessImpl = new BusinessImpl();		
		return businessImpl.getRecursoFisicosByMateria(idMateria);	
	}*/	
	
}
