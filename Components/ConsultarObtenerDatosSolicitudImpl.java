package Components;

import commonj.sdo.DataObject;
import com.bgba.classes.bpmrest.RestObject;
import com.bgba.logger.Log;
import com.bgba.services.PropertiesFile;
import com.bgba.services.RestServices;
import com.ibm.websphere.sca.ServiceManager;

public class ConsultarObtenerDatosSolicitudImpl {

	public ConsultarObtenerDatosSolicitudImpl() {
		super();
	}

	@SuppressWarnings("unused")
	private Object getMyService() {
		return (Object) ServiceManager.INSTANCE.locateService("self");
	}

	public DataObject consultarObtenerDatosSolicitud(DataObject inputConsultarObtenerDatosSolicitud) {
		Log.log_BPMInfo(inputConsultarObtenerDatosSolicitud.getString("uuid"), "Java", "consultarObtenerDatosSolicitud", "Inicio");
		com.ibm.websphere.bo.BOFactory boFactory = (com.ibm.websphere.bo.BOFactory) ServiceManager.INSTANCE.locateService("com/ibm/websphere/bo/BOFactory");
		DataObject solicitud = boFactory.create("http://AccionesInstrumentacion", "out_consultarObtenerDatosSolicitud");
		RestServices restServices = new RestServices();
		String URL = PropertiesFile.getPropertiesValue("journey_paquetes_url").concat(inputConsultarObtenerDatosSolicitud.getString("id"));
		try{
			RestObject restObject = restServices.executeHTTPMethod(URL, "GET", "", false);
			solicitud.setInt("codigo", restObject.getResponseCode());
			solicitud.setString("body", restObject.getBody());
			Log.log_BPMDebug(inputConsultarObtenerDatosSolicitud.getString("uuid"), "Java", "consultarObtenerDatosSolicitud", "Codigo HTTP: ".concat(solicitud.getString("codigo")));
			Log.log_BPMDebug(inputConsultarObtenerDatosSolicitud.getString("uuid"), "Java", "consultarObtenerDatosSolicitud", "Body HTTP: ".concat(solicitud.getString("body")));
		}catch(Exception ex){
			Log.log_BPMError(inputConsultarObtenerDatosSolicitud.getString("uuid"), "Java", "consultarObtenerDatosSolicitud", ex.toString());
		}
		Log.log_BPMInfo(inputConsultarObtenerDatosSolicitud.getString("uuid"), "Java", "consultarObtenerDatosSolicitud", "Fin");
		return solicitud;
	}

}