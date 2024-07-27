package genero.infrastructure.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DataBaseConfig;
import genero.domain.Genero;
import genero.domain.ServiceGenero;

public class RepositoryGenero implements ServiceGenero{

    @Override
    public ArrayList<Genero> listarGeneros() {
        ArrayList<Genero> listarGenero = new ArrayList<>();
        String sql = "select id,name from gender";
         try (Connection connection = DataBaseConfig.getConnection();
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet resultSet = statement.executeQuery()) {
          
          while (resultSet.next()) {
              int id = resultSet.getInt("id");
              String name = resultSet.getString("name");
            
              
            Genero genero = new Genero();
              genero.setId(id);
              genero.setName(name);
             
              listarGenero.add(genero);
              
          }  
          
      } catch (SQLException e) {
          System.out.println("Error al listar los generos: " + e.getMessage());
          e.printStackTrace();
      }
        return listarGenero;
        
    }

}
