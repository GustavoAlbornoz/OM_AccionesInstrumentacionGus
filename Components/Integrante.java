package Components;

import java.util.List;

public class Integrante{
	
	private long IdHost;
	private Documento Documento;
	private String Apellido;
	private String Nombre;
	private String TipoIntegrante;
	private String SemaforoIndividual;
	private boolean ResponsableImpositivo;
	private int Edad;
	private String EstadoCivil;
	private List<Particularidad> Particularidades;
	
	public long getIdHost(){
		return IdHost;
	}
	
	public void setIdHost(long IdHost){
		this.IdHost = IdHost;
	}
	
	public Documento getDocumento(){
		return Documento;
	}
	
	public void setDocumento(Documento Documento){
		this.Documento = Documento;
	}
	
	public String getApellido(){
		return Apellido;
	}
	
	public void setApellido(String Apellido){
		this.Apellido = Apellido;
	}
	
	public String getNombre(){
		return Nombre;
	}
	
	public void setNombre(String Nombre){
		this.Nombre = Nombre;
	}
	
	public String getTipoIntegrante(){
		return TipoIntegrante;
	}
	
	public void setTipoIntegrante(String TipoIntegrante){
		this.TipoIntegrante = TipoIntegrante;
	}
	
	public String getSemaforoIndividual(){
		return SemaforoIndividual;
	}
	
	public void setSemaforoIndividual(String SemaforoIndividual){
		this.SemaforoIndividual = SemaforoIndividual;
	}
	
	public boolean isResponsableImpositivo(){
		return ResponsableImpositivo;
	}
	
	public void setResponsableImpositivo(boolean ResponsableImpositivo){
		this.ResponsableImpositivo = ResponsableImpositivo;
	}
	
	public int getEdad(){
		return Edad;
	}
	
	public void setEdad(int Edad){
		this.Edad = Edad;
	}
	
	public String getEstadoCivil(){
		return EstadoCivil;
	}
	
	public void setEstadoCivil(String EstadoCivil){
		this.EstadoCivil = EstadoCivil;
	}
	
	public List<Particularidad> getParticularidades(){
		return Particularidades;
	}
	
	public void setParticularidades(List<Particularidad> Particularidades){
		this.Particularidades = Particularidades;
	}

}