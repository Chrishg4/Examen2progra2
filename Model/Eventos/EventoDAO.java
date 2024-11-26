/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Eventos;

/**
 *
 * @author Student
 */
import DAO.DaoCRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EventoDAO extends DaoCRUD<EventoDto> {

     public EventoDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean update(EventoDto dto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean create(EventoDto dto) throws SQLException {
        stmt = connection.prepareStatement("call EventosCreate(?,?,?,?,?)");
        stmt.setInt(1, dto.getId());
        stmt.setString(2, dto.getNombre());
        stmt.setDate(3, dto.getFecha());
        stmt.setString(4, dto.getLugar());
        stmt.setInt(5, EventoDto.getCAPACIDAD());
        //Verifica si agrega a la bd los datos
        return stmt.executeUpdate() > 0;
    }

    @Override
    public EventoDto read(Object id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<EventoDto> readAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

   
}
