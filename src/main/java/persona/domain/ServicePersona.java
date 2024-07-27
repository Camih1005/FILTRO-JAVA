package persona.domain;

import java.util.ArrayList;

import skills.domain.Skill;

public interface ServicePersona {

    void RegistrarPersona(Persona persona);
    ArrayList<Persona> ListarPersona();
    void asignarSkillPerson(Persona persona);
    void eliminarPersona(int id);
}
