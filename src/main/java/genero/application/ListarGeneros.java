package genero.application;

import java.util.ArrayList;

import genero.domain.Genero;
import genero.domain.ServiceGenero;

public class ListarGeneros {
private ServiceGenero serviceGenero;

public ListarGeneros(ServiceGenero serviceGenero) {
    this.serviceGenero = serviceGenero;
}

public ArrayList<Genero> execute(){
    return serviceGenero.listarGeneros();
}

}
