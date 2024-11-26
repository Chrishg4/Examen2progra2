/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Asistentes;

import Mapper.Mapper;

/**
 *
 * @author Student
 */
public class AsistenteMapper implements Mapper<Asistente, AsistenteDTO> {

    @Override
    public AsistenteDTO toDto(Asistente ent) {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
                return new AsistenteDTO(
                ent.getCedula(),
                ent.getNombre(),
                ent.getTelefono(),
                ent.getCorreo()
        );

>>>>>>> 9a99a9b860c2bb3216c661ad7bb6bcb63bc33899
    }

    @Override
    public Asistente toEntity(AsistenteDTO dto) {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
        if(dto == null) return null;
        return new Asistente(
               dto.getCedula(),
               dto.getNombre(),
               dto.getTelefono(),
               dto.getCorreo()
       );

>>>>>>> 9a99a9b860c2bb3216c661ad7bb6bcb63bc33899
    }
    
}
