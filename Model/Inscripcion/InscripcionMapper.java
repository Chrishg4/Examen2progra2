/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Inscripcion;

import Mapper.Mapper;
import Model.Asistentes.AsistenteDTO;

/**
 *
 * @author Student
 */
public class InscripcionMapper implements Mapper<Inscripcion, InscripcionDto> {

    @Override
    public InscripcionDto toDto(Inscripcion ent) {
          return new InscripcionDto(
                ent.getCedula(),
                ent.getNombre(),
                ent.getTelefono(),
                ent.getCorreo()
        );
    }

    @Override
    public Inscripcion toEntity(InscripcionDto dto) {
        
    }
    
}
