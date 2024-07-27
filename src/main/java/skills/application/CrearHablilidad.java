package skills.application;
import skills.domain.ServiceSkill;
import skills.domain.Skill;

public class CrearHablilidad {
private ServiceSkill serviceSkill;

public CrearHablilidad(ServiceSkill serviceSkill) {
    this.serviceSkill = serviceSkill;
}

public void execute(Skill skill){
    serviceSkill.CrearHabilidad(skill);
}

}
