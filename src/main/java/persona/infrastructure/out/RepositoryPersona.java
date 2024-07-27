package persona.infrastructure.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Ciudad.domain.Ciudad;
import config.DataBaseConfig;
import persona.domain.Persona;
import persona.domain.ServicePersona;
import skills.domain.Skill;

public class RepositoryPersona implements ServicePersona {

    @Override
    public void RegistrarPersona(Persona persona) {
        String sql = "Insert into persons(id,name,lastname,idcity,address,age,email,idgender) values(?,?,?,?,?,?,?,?)";
            try (
            Connection connection = DataBaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){
                statement.setInt(1, persona.getId());
             statement.setString(2, persona.getName());
              statement.setString(3,persona.getLastname());
              statement.setInt(4,persona.getIdcity());
              statement.setString(5,persona.getAddress());
             statement.setInt(6,persona.getAge());
             statement.setString(7, persona.getEmail());
             statement.setInt(8, persona.getIdGender());
            statement.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public ArrayList<Persona> ListarPersona() {
       ArrayList<Persona> listaPersonas = new ArrayList<>();
       String sql = "select id, name,lastname,idcity,address,age,email,idgender from persons";
   try (Connection connection = DataBaseConfig.getConnection();
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet resultSet = statement.executeQuery()) {
          
          while (resultSet.next()) {
              int id = resultSet.getInt("id");
              String name = resultSet.getString("name");
              String lastname = resultSet.getString("lastname");
              int idcity = resultSet.getInt("idcity");
              String address = resultSet.getString("address");
              int age = resultSet.getInt("age");
              String email = resultSet.getString("email");
              int idgender = resultSet.getInt("idgender");
            
              
              Persona persona = new Persona();
              persona.setId(id);
              persona.setName(name);
              persona.setLastname(lastname);
              persona.setIdcity(idcity);
              persona.setAddress(address);
              persona.setAge(age);
              persona.setEmail(email);
              persona.setIdGender(idgender);
              listaPersonas.add(persona);
              
          }  
          
      } catch (SQLException e) {
          System.out.println("Error al listar las ciudades: " + e.getMessage());
          e.printStackTrace();
      }
      


    return listaPersonas;
    }
    @Override
    public void asignarSkillPerson(Persona persona) {
        Skill skill = new Skill();
       String sql = "call AsigSkillPersona(?,?,?)";
       try (
        Connection connection = DataBaseConfig.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS)){
        statement.setString(1, persona.getFecha());
        statement.setInt(0, persona.getId());
        statement.setInt(3, skill.getId());
        statement.executeUpdate();
        try(ResultSet generateKeys = statement.getGeneratedKeys()){;
            if(generateKeys.next()){
                persona.setId(generateKeys.getInt(1));
            }
        }
    }catch (SQLException e) {
        System.out.println("Error al listar las ciudades: " + e.getMessage());
        e.printStackTrace();
    }
        
    }
    @Override
    public void eliminarPersona(int id) {
       String sql = "delete from Persons where id = ?";
       try (
        Connection connection = DataBaseConfig.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1,id);
            int rowDelete = statement.executeUpdate(); // Ejecuta la actualización sin pasar el SQL nuevamente
            if(rowDelete>0){
                System.out.println("Revision eliminada Satisfactoriamente");
            }else{
                System.out.println("Error  Revision  no se elimino correctamente");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }


    
    }




