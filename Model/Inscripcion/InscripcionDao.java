/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Inscripcion;

import DAO.DaoCRUD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class InscripcionDao extends DaoCRUD<InscripcionDto> {

    @Override
    public boolean create(InscripcionDto dto) throws SQLException {
        stmt = connection.prepareStatement("call InscripcionCreate(?,?,?,?,?)");
        stmt.setInt(1, dto.getId());
        stmt.setString(2, dto.getEvento()); //error
        stmt.setInt(3, dto.getAsistente()); //error
        stmt.setDate(4, dto.getFecha());
        stmt.setBoolean(5, dto.isAsistencia());
        return stmt.executeUpdate() > 0;
    }

    @Override
    public InscripcionDto read(Object id) throws SQLException {
        stmt = connection.prepareStatement("call InscripcionRead(?)");
        stmt.setString(1, String.valueOf(id));
        rs = stmt.executeQuery();
        if (rs.next()) {
            return new InscripcionDto(
                    rs.getInt(1),
                    rs.getString(2), //error
                    rs.getInt(3), //error
                    rs.getDate(4),
                    rs.getBoolean(5)
            );
        }
        return null;
    }

    @Override
    public List<InscripcionDto> readAll() throws SQLException {
        stmt = connection.prepareStatement("call InscripcionReadAll()");
        rs = stmt.executeQuery();
        List<InscripcionDto> dtos = new ArrayList();
        while (rs.next()) {
            dtos.add(new InscripcionDto(
                    rs.getInt(1),
                    rs.getString(2), //error
                    rs.getDate(3), //error
                    rs.getString(4),
                    rs.getString(5)
            ));
        }
        return dtos;
    }

    @Override
    public boolean update(InscripcionDto dto) throws SQLException {
        stmt = connection.prepareStatement("call InscripcionUpdate(?,?,?)");
        stmt.setInt(1, dto.getId());
        stmt.setBoolean(2, dto.isAsistencia()
        );
        stmt.setDate(3, dto.getFecha());
        return stmt.executeUpdate()>0;
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        stmt = connection.prepareStatement("call InscripcionDelete(?)");
        stmt.setString(1, String.valueOf(id));
        return stmt.executeUpdate()>0;
    }

}
