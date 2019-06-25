package Components;

import com.bgba.logger.Log;
import com.ibm.websphere.bo.BOFactory;
import com.ibm.websphere.sca.Service;
import com.ibm.websphere.sca.Ticket;
import commonj.sdo.DataObject;
import com.ibm.websphere.sca.ServiceManager;

public class AccionesInstrumentacion_HandlerImpl{

	public AccionesInstrumentacion_HandlerImpl(){
		super();
	}

	@SuppressWarnings("unused")
	private Object getMyService(){
		return (Object) ServiceManager.INSTANCE.locateService("self");
	}

	private Service _AccionesInstrumentacionInterfacePartner = null;

	public Service locateService_AccionesInstrumentacionInterfacePartner(){
		if(_AccionesInstrumentacionInterfacePartner == null){
			_AccionesInstrumentacionInterfacePartner = (Service) ServiceManager.INSTANCE.locateService("AccionesInstrumentacionInterfacePartner");
		}
		return _AccionesInstrumentacionInterfacePartner;
	}

	public DataObject consultarAccionInstrumentacion(DataObject inputConsultarAccionInstrumentacion){
		Log.load_BPMAppend("LogTomAplicaciones");
		BOFactory boFactory = (BOFactory) ServiceManager.INSTANCE.locateService("com/ibm/websphere/bo/BOFactory");
		DataObject input = boFactory.create("http://AccionesInstrumentacion","in_consultarAccionInstrumentacion");
		try{
			input.setString("id", inputConsultarAccionInstrumentacion.getString("id"));	
			input.setString("origen", inputConsultarAccionInstrumentacion.getString("origen"));
			Log.log_BPMDebug("NON-UUID", "Java", "consultarAccionInstrumentacionHandler", "id : ".concat(input.getString("id")));
		}catch(NullPointerException ex){
			Log.log_BPMError("NON-UUID", "Java", "consultarAccionInstrumentacionHandler", "Se recibio el campo id NULL");
		}
		Service serviceOne = locateService_AccionesInstrumentacionInterfacePartner();
		DataObject resBo = (DataObject) serviceOne.invoke("consultarAccionInstrumentacion", input); 
		return resBo;
	}

	public void onConsultarAccionInstrumentacionResponse(Ticket __ticket, DataObject returnValue, Exception exception){		}

}