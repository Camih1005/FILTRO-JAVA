package persona.application;

import persona.domain.Persona;
import persona.domain.ServicePersona;


public class AsignarSkillPersona {
private ServicePersona servicePersona;

public AsignarSkillPersona(ServicePersona servicePersona) {
    this.servicePersona = servicePersona;
}

public void execute(Persona persona){
     servicePersona.asignarSkillPerson(persona);
}

}
