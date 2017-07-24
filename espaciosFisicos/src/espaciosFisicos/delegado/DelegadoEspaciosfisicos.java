package espaciosFisicos.delegado;

import business.BusinessImpl;
import espaciosFisicos.logica.LogicaEspaciosFisicos;
import espaciosFisicos.logica.LogicaHorarios;

public class DelegadoEspaciosfisicos {
	
	public DelegadoEspaciosfisicos() {
		// TODO Auto-generated constructor stub
	}
	
	LogicaEspaciosFisicos logicaEspaciosFisicos = new LogicaEspaciosFisicos().getInstance();
	LogicaHorarios logicaHorarios = new LogicaHorarios();
	
	/*
	 * Horarios
	 */	
	
	public String getHorariosAll(){
		return logicaHorarios.getHorariosAll();
	}
	
	public String getHorarioById(String id){
		return logicaHorarios.getHorarioById(id);
	}
	
	/*
	 * Grupos
	 */
	
	public String getGruposAll(){
		return logicaEspaciosFisicos.getGruposAll();
	}
	
	public String getGrupoById(String id){
		return logicaEspaciosFisicos.getGrupoById(id);
	}
	
	public String getGrupoByName(String name){
		return logicaEspaciosFisicos.getGrupoByName(name);
	}
	
	public String getGrupoByMateria(String materia){
		return logicaEspaciosFisicos.getGrupoByMateria(materia);
	}
	
	public String getGrupoByUnidad(String unidad){
		return logicaEspaciosFisicos.getGrupoByUnidad(unidad);
	}
	
	public String getGrupoByEstado(String estado){
		return logicaEspaciosFisicos.getGrupoByEstado(estado);
	}
	
	/*
	 * Materias
	 */
	
	public String getMateriaByName(String name) {
		return logicaEspaciosFisicos.getMateriaByName(name);
	}

	public String getMateriaById(String id) {
		return logicaEspaciosFisicos.getMateriaById(id);
	}

	public String getMateriasAll() {
		return logicaEspaciosFisicos.getMateriasAll();
	}
	
	/*
	 * Materia recursos fisico
	 */
	
	public String getMateriaRecursoFisicoByRecursoFisico(String recursoFisico) {
		return logicaEspaciosFisicos.getMateriaRecursoFisicoByRecursoFisico(recursoFisico);	
	}

	public String getMateriaRecursoFisicoByIdMateria(String id) {
		return logicaEspaciosFisicos.getMateriaRecursoFisicoByIdMateria(id);
	}

	public String getMateriaRecursoFisicosAll() {
		return logicaEspaciosFisicos.getMateriaRecursoFisicosAll();
	}
	
	
	/*
	 * Recursos fisicos
	 
	public String getRecursoFisicosByMateria(String idMateria) {
		return logicaEspaciosFisicos.getRecursoFisicosByMateria(idMateria);
	}*/
		

}
