package skills.application;

import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import skills.domain.ServiceSkill;
import skills.domain.Skill;

public class ListarHabilidades {
private ServiceSkill serviceSkill;

public ListarHabilidades(ServiceSkill serviceSkill) {
    this.serviceSkill = serviceSkill;
}

public ArrayList<Skill> execute(){
    return serviceSkill.listarHabilidades();
}

}
