package com.sgpzf;

import Ciudad.application.listarCiudades;
import Ciudad.domain.ServiceCiudad;
import Ciudad.infrastructure.out.RepositoryCiudad;
import genero.application.ListarGeneros;
import genero.domain.ServiceGenero;
import genero.infrastructure.out.RepositoryGenero;
import persona.application.RegistrarPersona;
import persona.domain.ServicePersona;
import persona.infrastructure.in.ControllerPersona;
import persona.infrastructure.out.RepositoryPersona;
import skills.application.CrearHablilidad;
import skills.domain.ServiceSkill;
import skills.infrastructure.in.ControllerSkill;
import skills.infrastructure.out.RepositorySkill;

public class Main {
   
    public static void main(String[] args) {
    //     ServiceGenero serviceGenero = new RepositoryGenero();
    //     ListarGeneros ListarGeneros = new ListarGeneros(serviceGenero);
    // ServicePersona servicePersona = new RepositoryPersona();
    // ServiceCiudad serviceCiudad = new RepositoryCiudad();
    // RegistrarPersona registrarPersona = new RegistrarPersona(servicePersona);
    // listarCiudades listarCiudades = new listarCiudades(serviceCiudad);
    // ControllerPersona controllerPersona = new ControllerPersona(registrarPersona, listarCiudades,ListarGeneros);
    //     controllerPersona.registrarPersona();

    // ServiceSkill serviceSkill = new RepositorySkill();
    // CrearHablilidad crearHablilidad = new CrearHablilidad(serviceSkill);
    // ControllerSkill controllerSkill = new ControllerSkill(crearHablilidad);
    // controllerSkill.CrearHabilidad();
        
    MenuPrincipal menuPrincipal = new MenuPrincipal();
    menuPrincipal.MenuPrincipal();
    }
}