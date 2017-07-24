package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import model.Bloquehora;

public class BusinessImpl {
	
	public EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
	
	@PersistenceContext
    public EntityManager em = emf.createEntityManager();	
	
	public Gson gson;
	public HashMap<String,String> lstRs;
	
	/*
	 * Horarios
	 */
	
	public String getHorarioById(String id){
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();			
			List lst =  em.createNamedQuery("Bloquehora.findId").setParameter("blhoId", id).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}		
		return gson.toJson(lstRs);
	}
	
	public String getHorarioByName(String name){		
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Bloquehora.findName").setParameter("blhoNombre", name).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
		
	}
	
	public String getHorarioByHoraIni(String horaIni){
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Bloquehora.findHoraIni").setParameter("blhoHorainicio", horaIni).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}
	
	public String getHorarioByHoraFin(String horaFin){
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Bloquehora.findHoraFin").setParameter("blhoHorafinal", horaFin).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}
	
	public String getHorarioByHoraBetween(String horaIni, String horaFin){
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Bloquehora.findHoraBetween").setParameter("blhoHorainicio", horaIni).setParameter("blhoHorafinal", horaFin).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}
	public String getHorariosAll(){
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Bloquehora.findAll").getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}
	
	/*
	 * Grupos
	 */	

	public String getGrupoByName(String name) {
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Grupo.findName").setParameter("grupNombre", name).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}

	public String getGrupoById(String id) {
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Grupo.findId").setParameter("grupId", id).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}

	public String getGruposAll() {	
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Grupo.findAll").getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}

	public String getGrupoByMateria(String materia) {
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Grupo.findMateria").setParameter("mateCodigomateria", materia).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}

	public String getGrupoByUnidad(String unidad) {
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Grupo.findUnidad").setParameter("unidIdregional", unidad).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}

	public String getGrupoByEstado(String estado) {
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Grupo.findEstado").setParameter("grupActivo", estado).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}
	
	/*
	 * Materias
	 */
	
	public String getMateriaByName(String name) {
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();	
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Materia.findName").setParameter("mateNombre", name).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}

	public String getMateriaById(String id) {
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();		
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Materia.findId").setParameter("mateCodigomateria", id).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}

	public String getMateriasAll() {
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();		
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Materia.findAll").getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().replaceAll("\"", "'"));
		}		
	
		return gson.toJson(lstRs);
	}
	
	/*
	 * Materia recursos fisico
	 */
	
	public String getMateriaRecursoFisicoByRecursoFisico(String recursoFisico) {
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();		
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Materiarecursofisico.findRFisico").setParameter("mateNombre", recursoFisico).getResultList();
			em.getTransaction().commit();
						lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}

	public String getMateriaRecursoFisicoByIdMateria(String id) {
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();		
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Materiarecursofisico.findIdMateria").setParameter("mateCodigomateria", id).getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}
		return gson.toJson(lstRs);
	}

	public String getMateriaRecursoFisicosAll() {
		
		gson = new Gson();
		lstRs = new HashMap<String,String>();		
		try {
			em.getTransaction().begin();
			List lst =  em.createNamedQuery("Materiarecursofisico.findAll").getResultList();
			em.getTransaction().commit();
			lstRs.put("ResultCode", "000");
			lstRs.put("Descripción", "Éxito");
			lstRs.put("Response", gson.toJson(lst));			
		} catch (Exception e) {			
			em.close();
			e.printStackTrace();
			lstRs.put("ResultCode", "001");
			lstRs.put("Descripción", "Error");
			lstRs.put("Response", e.getMessage().toString());
		}	
		
		return gson.toJson(lstRs);
	}

}