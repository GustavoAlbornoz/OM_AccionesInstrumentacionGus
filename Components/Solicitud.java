package Components;

import java.util.List;

public class Solicitud{
	
	private String NumeroSolicitud;
	private String Canal;
	private String NumeroDeSucursal;
	private String SemaforoGenerico;
	private String Comercializadora;
	private String Convenio;
	private String Riesgo;
	private String TipoSolicitud;
	private List<Producto> Productos;
	private List<Particularidad> Particularidades;
	private String IdEvaluacion;
	
	public String getNumeroSolicitud(){
		return NumeroSolicitud;
	}
	
	public void setNumeroSolicitud(String NumeroSolicitud){
		this.NumeroSolicitud = NumeroSolicitud;
	}
	
	public String getCanal(){
		return Canal;
	}
	
	public void setCanal(String Canal){
		this.Canal = Canal;
	}
	
	public String getNumeroDeSucursal(){
		return NumeroDeSucursal;
	}
	
	public void setNumeroDeSucursal(String NumeroDeSucursal){
		this.NumeroDeSucursal = NumeroDeSucursal;
	}
	public String getSemaforoGenerico(){
		return SemaforoGenerico;
	}
	
	public void setSemaforoGenerico(String SemaforoGenerico){
		this.SemaforoGenerico = SemaforoGenerico;
	}
	
	public String getComercializadora(){
		return Comercializadora;
	}
	
	public void setComercializadora(String Comercializadora){
		this.Comercializadora = Comercializadora;
	}
	
	public String getConvenio(){
		return Convenio;
	}
	
	public void setConvenio(String Convenio){
		this.Convenio = Convenio;
	}
	
	public String getRiesgo(){
		return Riesgo;
	}
	
	public void setRiesgo(String Riesgo){
		this.Riesgo = Riesgo;
	}
	
	public String getTipoSolicitud(){
		return TipoSolicitud;
	}
	
	public void setTipoSolicitud(String TipoSolicitud){
		this.TipoSolicitud = TipoSolicitud;
	}
	
	public List<Producto> getProductos(){
		return Productos;
	}
	
	public void setProductos(List<Producto> Productos){
		this.Productos = Productos;
	}
	
	public List<Particularidad> getParticularidades(){
		return Particularidades;
	}
	
	public void setParticularidades(List<Particularidad> Particularidades){
		this.Particularidades = Particularidades;
	}

	public String getIdEvaluacion() {
		return IdEvaluacion;
	}

	public void setIdEvaluacion(String idEvaluacion) {
		this.IdEvaluacion = idEvaluacion;
	}

}