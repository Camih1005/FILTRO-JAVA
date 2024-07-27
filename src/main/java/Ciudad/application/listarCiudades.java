package Ciudad.application;

import java.util.ArrayList;

import Ciudad.domain.Ciudad;
import Ciudad.domain.ServiceCiudad;
import persona.domain.Persona;

public class listarCiudades {
private ServiceCiudad serviceCiudad;

public listarCiudades(ServiceCiudad serviceCiudad) {
    this.serviceCiudad = serviceCiudad;
}
public  ArrayList<Ciudad> execute(){
    return serviceCiudad.listarCiudades();
    
}

}
