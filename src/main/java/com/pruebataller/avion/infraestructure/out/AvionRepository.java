package com.pruebataller.avion.infraestructure.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.pruebataller.avion.domain.entity.Avion;
import com.pruebataller.avion.domain.service.AvionService;

public class AvionRepository implements AvionService{
    private Connection connection;

    public AvionRepository() {
        try {
            Properties props = new Properties();
            props.load(getClass().getClassLoader().getResourceAsStream("configdb.properties"));
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");

            System.out.println("URL: " + url); // Verificar la URL cargada
            System.out.println("User: " + user); // Verificar el usuario cargado
            // N
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void createAvion(Avion avion) {
        try{
            String query= "INSERT INTO aviones (id,matricula,fechafabricacion,idestado, idmodelo,idaerolinea) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps=connection.prepareStatement(query);
            ps.setInt(1,avion.getId());
            ps.setString(2,avion.getFechaFabricacion());
            ps.setString(3,avion.getMatricula());
            ps.setInt(4,avion.getIdEstado());
            ps.setInt(5,avion.getIdModelo());
            ps.setInt(6,avion.getIdAerolinea());

            ps.executeUpdate();

        }catch(SQLException e){

        }
       


    }

    @Override
    public void updateAvion(Avion avion) {

    }

   
    @Override
    public void deleteAvion(Avion avion) {

    }

 

}
