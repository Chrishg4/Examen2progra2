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
        stmt = connection.prepareStatement("call EventosUpdate(?,?)");
        stmt.setInt(1, dto.getId());
        stmt.setDate(2, dto.getFecha());
        stmt.setString(3, dto.getLugar());
        return stmt.executeUpdate()>0;
    }

    @Override
    public boolean create(EventoDto dto) throws SQLException {
        stmt = connection.prepareStatement("call EventosCreate(?,?,?,?,?)");
        stmt.setInt(1, dto.getId());
        stmt.setString(2, dto.getNombre());
        stmt.setDate(3, dto.getFecha());
        stmt.setString(4, dto.getLugar());
        stmt.setInt(5, dto.getCAPACIDAD());
        //Verifica si agrega a la bd los datos
        return stmt.executeUpdate() > 0;
    }

    @Override
    public EventoDto read(Object id) throws SQLException {
        stmt = connection.prepareStatement("call EventosRead(?)");
        stmt.setString(1, String.valueOf(id));
        rs = stmt.executeQuery();
        if (rs.next()) {
            return new EventoDto(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDate(3),
                    rs.getString(4),
                    rs.getInt(5)
            );
        }
        return null;
    }

    @Override
    public List<EventoDto> readAll() throws SQLException {
        stmt = connection.prepareStatement("call EventosReadAll()");
        rs = stmt.executeQuery();
        List<EventoDto> dtos = new ArrayList();
        while (rs.next()) {
            dtos.add(new EventoDto(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDate(3),
                    rs.getString(4),
                    rs.getInt(5)
            ));
        }
        return dtos;
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        stmt = connection.prepareStatement("call CustomerDelete(?)");
        stmt.setString(1, String.valueOf(id));
        return stmt.executeUpdate()>0;
    }
    
    

   
}
