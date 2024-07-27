package Ciudad.infrastructure.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Ciudad.domain.Ciudad;
import Ciudad.domain.ServiceCiudad;
import config.DataBaseConfig;

public class RepositoryCiudad implements ServiceCiudad {

    @Override
    public ArrayList<Ciudad> listarCiudades() {
        ArrayList<Ciudad> listarCiudades = new ArrayList<>();
           String sql = "Select id, name,idregion from city";
          
           try (Connection connection = DataBaseConfig.getConnection();
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet resultSet = statement.executeQuery()) {
          
          while (resultSet.next()) {
              int id = resultSet.getInt("id");
              String name = resultSet.getString("name");
              int idregion = resultSet.getInt("idregion");
            
              
              Ciudad ciudad = new Ciudad();
              ciudad.setId(id);
              ciudad.setName(name);
              ciudad.setIdregion(idregion);
              listarCiudades.add(ciudad);
          }  
          
      } catch (SQLException e) {
          System.out.println("Error al listar las ciudades: " + e.getMessage());
          e.printStackTrace();
      }
      
      return listarCiudades;



}

}