package persona.infrastructure.in;
import java.util.ArrayList;
import java.util.Scanner;

import Ciudad.application.listarCiudades;
import Ciudad.domain.Ciudad;
import config.ManejoErrores;
import genero.application.ListarGeneros;
import genero.domain.Genero;
import persona.application.AsignarSkillPersona;
import persona.application.EliminarPersona;
import persona.application.ListarPersona;
import persona.application.RegistrarPersona;
import persona.domain.Persona;
import skills.application.CrearHablilidad;
import skills.application.ListarHabilidades;
import skills.domain.Skill;

public class ControllerPersona {
Scanner scanner = new Scanner(System.in);

private final RegistrarPersona registrarPersona;
private final listarCiudades listarCiudades;
private final ListarGeneros listarGeneros;
private final ListarPersona listarPersona;
private final ListarHabilidades listarHabilidades;
private final CrearHablilidad crearHablilidad;
private final EliminarPersona eliminarPersona;

public ControllerPersona(RegistrarPersona registrarPersona,listarCiudades listarCiudades,ListarGeneros listarGeneros,ListarPersona listarPersona,ListarHabilidades listarHabilidades,CrearHablilidad crearHablilidad,EliminarPersona eliminarPersona) {
    this.registrarPersona = registrarPersona;
    this.listarCiudades = listarCiudades;
    this.listarGeneros = listarGeneros;
    this.listarPersona = listarPersona;
    this.listarHabilidades = listarHabilidades;
    this.crearHablilidad = crearHablilidad;
    this.eliminarPersona= eliminarPersona;
}

public void registrarPersona(){
    
        try{

       
    
    System.out.println("==========================");
    System.out.println("==== REGISTAR PERSONA=====");
    System.out.println("==========================");

    int id = ManejoErrores.leerEntero("ingresa la cedula: ", scanner);
   
    String name = ManejoErrores.leerString("Ingrese el nombre: ", scanner);
    
   


    String lastname =   ManejoErrores.leerString("Ingrese apellido: ", scanner);

    ArrayList<Ciudad> listCiudades = listarCiudades.execute();
    
    for (Ciudad ciudad : listCiudades) {
        System.out.println("ID: " + ciudad.getId()+ "| Ciudad: " + ciudad.getName());
    }

    int idcity = ManejoErrores.leerEntero("Ingrese lel id de la ciudad ", scanner);


    String address = ManejoErrores.leerString("Ingresar la direccion: ", scanner);


    

    int age = ManejoErrores.leerEntero("Ingrese la edad: ", scanner);


    String email = ManejoErrores.leerString("Ingrese el correo: ", scanner);

    ArrayList<Genero> listGeneros = listarGeneros.execute();

    for (Genero genero : listGeneros) {
        System.out.println("ID: " + genero.getId() + " | Genero: " + genero.getName());
    }

    System.out.println("Ingresa el ID del tipo de genero: ");
    int idgender = ManejoErrores.leerEntero("Ingrese el ID del tipo de documento: ", scanner);


    
    Persona persona = new Persona();
    persona.setId(id);
    persona.setName(name);
    persona.setLastname(lastname);
    persona.setIdcity(idcity);
    persona.setAddress(address);
    persona.setAge(age);
    persona.setEmail(email);
    persona.setIdGender(idgender);

    registrarPersona.execute(persona);

}catch(Exception e){
System.out.println("ERROR: " + e);
}
    System.out.println("REGISTRO EXITOSO!");
    return;

}

public void AgregarSkillPersona(){
    System.out.println("=======================================");
    System.out.println("======AGREGAR HABILIDAD A PERSONA======");
    System.out.println("=======================================");

    ArrayList<Persona> listarPerson = listarPersona.execute();

    for (Persona persona : listarPerson) {
        System.out.println("ID: " + persona.getId() + "| nombre: " + persona.getName());
        
    }
    
    int idperson = ManejoErrores.leerEntero("Ingresa el id de la persona a agregarla Habilidad", scanner);


    ArrayList<Skill> listarHabilidadesd = listarHabilidades.execute();

    for (Skill skill : listarHabilidadesd) {
        System.out.println("ID: " + skill.getId()+ "Habilidad: " + skill.getName());
    }

    int habilidad = ManejoErrores.leerEntero("Ingresa el id de la habilidad: ", scanner);


    String fech = ManejoErrores.leerString("Ingresa la fecha (AÑO/MES/DIA): ", scanner);

    System.out.println("REGISTRO EXITOSO!");

    Persona persona = new Persona();
   

return;

}

public void EliminarPersona(){
    System.out.println( "ELIMINAR PERSONA");

    int id = ManejoErrores.leerEntero("ID DE LA PERSONA: ", scanner);


    eliminarPersona.execute(id);
    System.out.println("PERSONA ELIMINADA");
    return;
}

}



