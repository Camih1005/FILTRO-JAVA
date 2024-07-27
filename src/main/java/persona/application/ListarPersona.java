package persona.application;

import java.util.ArrayList;

import persona.domain.Persona;
import persona.domain.ServicePersona;

public class ListarPersona {
ServicePersona servicePersona;

public ListarPersona(ServicePersona servicePersona) {
    this.servicePersona = servicePersona;
}

public ArrayList<Persona> execute(){
    return servicePersona.ListarPersona();
}

}
