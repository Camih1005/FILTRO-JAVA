package com.sgpzf;

import java.util.Scanner;

import Ciudad.application.listarCiudades;
import Ciudad.domain.ServiceCiudad;
import Ciudad.infrastructure.out.RepositoryCiudad;
import genero.application.ListarGeneros;
import genero.domain.ServiceGenero;
import genero.infrastructure.out.RepositoryGenero;
import persona.application.EliminarPersona;
import persona.application.ListarPersona;
import persona.application.RegistrarPersona;
import persona.domain.ServicePersona;
import persona.infrastructure.in.ControllerPersona;
import persona.infrastructure.out.RepositoryPersona;
import skills.application.CrearHablilidad;
import skills.application.ListarHabilidades;
import skills.domain.ServiceSkill;
import skills.infrastructure.in.ControllerSkill;
import skills.infrastructure.out.RepositorySkill;

public class MenuPrincipal {

    public void MenuPrincipal(){
        ServicePersona servicePersona = new RepositoryPersona();
        ServiceGenero serviceGenero = new RepositoryGenero();
        ServiceCiudad serviceCiudad = new RepositoryCiudad();
        RegistrarPersona registrarPersona = new RegistrarPersona(servicePersona);
        listarCiudades listarCiudades = new listarCiudades(serviceCiudad);
        ListarGeneros listarGeneros = new ListarGeneros(serviceGenero);
        ListarPersona listarPersona = new ListarPersona(servicePersona);
        ServiceSkill serviceSkill = new RepositorySkill();
        CrearHablilidad crearHablilidad = new CrearHablilidad(serviceSkill);
        EliminarPersona eliminarPersona = new EliminarPersona(servicePersona);
        ListarHabilidades listarHabilidades = new ListarHabilidades(serviceSkill);
        ControllerPersona controllerPersona = new ControllerPersona(registrarPersona, listarCiudades, listarGeneros,listarPersona,listarHabilidades,crearHablilidad,eliminarPersona);
        ControllerSkill controllerSkill = new ControllerSkill(crearHablilidad);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            
       
        System.out.println("==============================");
        System.out.println("======== MENU PRINCIPAL=======");
        System.out.println("==============================");

        System.out.println("1. Registrar persona");
        System.out.println("2. Asignar una habilidad a persona");
        System.out.println("3. Crear nueva habilidad");
        System.out.println("4. Eliminar una persona");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                controllerPersona.registrarPersona();
                break;
        case 2:
        controllerPersona.AgregarSkillPersona();
        break;
        case 3:
      
        controllerSkill.CrearHabilidad();
        break;

        case 4:
        controllerPersona.EliminarPersona();
        break;
            default:
                break;
        }
    }

    }
}
