package Components;

import java.util.List;

public class Producto{

	private String IdProducto;
	private String DescripcionProducto;
	private String Familia;
	private String SubFamilia;
	private String Modificador;
	private String Accion;
	private boolean EsProductoPrincipal;
	private float Monto;
	private float MontoDisponible;
	private String SucursalRadicacion;
	private List<Integrante> Integrantes;
	private List<Particularidad> Particularidades;
	
	public String getIdProducto(){
		return IdProducto;
	}
	
	public void setIdProducto(String IdProducto){
		this.IdProducto = IdProducto;
	}
	
	public String getDescripcionProducto(){
		return DescripcionProducto;
	}
	
	public void setDescripcionProducto(String DescripcionProducto){
		this.DescripcionProducto = DescripcionProducto;
	}
	
	public String getFamilia(){
		return Familia;
	}
	
	public void setFamilia(String Familia){
		this.Familia = Familia;
	}
	
	public String getSubFamilia(){
		return SubFamilia;
	}
	
	public void setSubFamilia(String SubFamilia){
		this.SubFamilia = SubFamilia;
	}
	
	public String getModificador(){
		return Modificador;
	}
	
	public void setModificador(String Modificador){
		this.Modificador = Modificador;
	
	}
	
	public String getAccion(){
		return Accion;
	}
	
	public void setAccion(String Accion){
		this.Accion = Accion;
	}
	
	public boolean isEsProductoPrincipal(){
		return EsProductoPrincipal;
	}
	
	public void setEsProductoPrincipal(boolean EsProductoPrincipal){
		this.EsProductoPrincipal = EsProductoPrincipal;
	}
	
	public float getMonto(){
		return Monto;
	}
	
	public void setMonto(float Monto){
		this.Monto = Monto;
	}
	
	public float getMontoDisponible(){
		return MontoDisponible;
	}
	
	public void setMontoDisponible(float MontoDisponible){
		this.MontoDisponible = MontoDisponible;
	}
	
	public String getSucursalRadicacion(){
		return SucursalRadicacion;
	}
	
	public void setSucursalRadicacion(String SucursalRadicacion){
		this.SucursalRadicacion = SucursalRadicacion;
	}
	
	public List<Integrante> getIntegrantes(){
		return Integrantes;
	}
	
	public void setIntegrantes(List<Integrante> Integrantes){
		this.Integrantes = Integrantes;
	}
	
	public List<Particularidad> getParticularidades(){
		return Particularidades;
	}

	public void setParticularidades(List<Particularidad> Particularidades){
		this.Particularidades = Particularidades;
	}

}