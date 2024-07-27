package persona.application;

import persona.domain.Persona;
import persona.domain.ServicePersona;

public class RegistrarPersona {
private ServicePersona servicePersona;

public RegistrarPersona(ServicePersona servicePersona) {
    this.servicePersona = servicePersona;
}

public void execute(Persona persona){
servicePersona.RegistrarPersona(persona);
}

}
