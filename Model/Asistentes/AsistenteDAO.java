/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Asistentes;

import DAO.DaoCRUD;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Student
 */
public class AsistenteDAO extends DaoCRUD<AsistenteDTO> {
    

    @Override
    public boolean update(AsistenteDTO dto) throws SQLException {
       

    }

    @Override
    public boolean create(AsistenteDTO dto) throws SQLException {
        stmt = connection.prepareStatement("call AsistenteCreate(?,?,?,?)");
        stmt.setString(1, dto.getCedula());
        stmt.setString(2, dto.getNombre());
        stmt.setString(3, dto.getTelefono());
        stmt.setString(4, dto.getCorreo());
        return stmt.executeUpdate() > 0;
    }

    @Override
    public AsistenteDTO read(Object id) throws SQLException {
        
    }

    @Override
    public List<AsistenteDTO> readAll() throws SQLException {
        
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        stmt = connection.prepareStatement("call AsistenteDelete(?)");
        stmt.setString(1, String.valueOf(id));
        return stmt.executeUpdate()>0;
    }
    
    
}
