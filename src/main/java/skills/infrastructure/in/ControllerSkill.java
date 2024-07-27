package skills.infrastructure.in;

import java.util.Scanner;

import config.ManejoErrores;
import skills.application.CrearHablilidad;
import skills.domain.Skill;

public class ControllerSkill {
Scanner scanner = new Scanner(System.in);
private final CrearHablilidad crearHablilidad;

public ControllerSkill(CrearHablilidad crearHablilidad) {
    this.crearHablilidad = crearHablilidad;
}

public void CrearHabilidad(){
    try{
        System.out.println("===========================");
        System.out.println("===CREAR NUEVA HABILIDAD===");
        System.out.println("===========================");

    
        String name = ManejoErrores.leerString("Ingresa la nueva habilidad: ", scanner);
    
        Skill skill = new Skill();
    
        skill.setName(name);
    
        crearHablilidad.execute(skill);

        System.out.println("Habilidad creada");
        return;
    }
    catch(Exception e){
        System.out.println("ERROR: " + e);
    }

    
    


}

}
