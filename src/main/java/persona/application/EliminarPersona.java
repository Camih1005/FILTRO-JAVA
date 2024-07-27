package persona.application;

import persona.domain.ServicePersona;

public class EliminarPersona {
private ServicePersona servicePersona ;

public EliminarPersona(ServicePersona servicePersona) {
    this.servicePersona = servicePersona;
}

public void execute(int id){
    servicePersona.eliminarPersona(id);
}

}
