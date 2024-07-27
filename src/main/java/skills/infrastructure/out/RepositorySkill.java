package skills.infrastructure.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DataBaseConfig;
import genero.domain.Genero;
import skills.domain.ServiceSkill;
import skills.domain.Skill;

public class RepositorySkill implements ServiceSkill{

    @Override
    public void CrearHabilidad(Skill skill) {
      String sql = "insert into skill (name) values(?)";
      try (
            Connection connection = DataBaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS)){
            statement.setString(1, skill.getName());
            statement.executeUpdate();
            try(ResultSet generateKeys = statement.getGeneratedKeys()){;
                if(generateKeys.next()){
                    skill.setId(generateKeys.getInt(1));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Skill> listarHabilidades() {
        ArrayList<Skill> listarHabilidades = new ArrayList<>();
        String sql = "select id,name from skill";
        try (Connection connection = DataBaseConfig.getConnection();
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet resultSet = statement.executeQuery()) {
          
          while (resultSet.next()) {
              int id = resultSet.getInt("id");
              String name = resultSet.getString("name");
            
              
            Skill skill = new Skill();
              skill.setId(id);
              skill.setName(name);
             
              listarHabilidades.add(skill);
              
          }  
          
      } catch (SQLException e) {
          System.out.println("Error al listar los generos: " + e.getMessage());
          e.printStackTrace();
      }
        return listarHabilidades;
        
    }
 
    }


