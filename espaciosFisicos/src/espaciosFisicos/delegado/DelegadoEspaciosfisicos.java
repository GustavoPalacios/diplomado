/**
 * DelegadoEspaciosfisicos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package espaciosFisicos.delegado;

public interface DelegadoEspaciosfisicos extends java.rmi.Remote {
    public java.lang.String getMateriaRecursoFisicosAll() throws java.rmi.RemoteException;
    public java.lang.String getMateriasAll() throws java.rmi.RemoteException;
    public java.lang.String getMateriaById(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String getMateriaByName(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String getHorariosAll() throws java.rmi.RemoteException;
    public java.lang.String getHorarioById(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String getGrupoByEstado(java.lang.String estado) throws java.rmi.RemoteException;
    public java.lang.String getGrupoByUnidad(java.lang.String unidad) throws java.rmi.RemoteException;
    public java.lang.String getGrupoByMateria(java.lang.String materia) throws java.rmi.RemoteException;
    public java.lang.String getGrupoByName(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String getMateriaRecursoFisicoByIdMateria(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String getMateriaRecursoFisicoByRecursoFisico(java.lang.String recursoFisico) throws java.rmi.RemoteException;
    public java.lang.String getGruposAll() throws java.rmi.RemoteException;
    public java.lang.String getGrupoById(java.lang.String id) throws java.rmi.RemoteException;
}
