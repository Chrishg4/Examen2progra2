/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Inscripcion;

import Mapper.Mapper;
import Utils.UtilDate;

/**
 *
 * @author Student
 */
public class InscripcionMapper implements Mapper<Inscripcion, InscripcionDto> {

    @Override
    public InscripcionDto toDto(Inscripcion ent) {
          return new InscripcionDto(
                ent.getId(),
                ent.getEvento(),
                ent.getAsistente(),
                UtilDate.toSqlDate(ent.getFecha()),
                ent.isAsistencia()
        );
    }

    @Override
    public Inscripcion toEntity(InscripcionDto dto) {
            if (dto == null) {
            return null;
        }
        return new Inscripcion(
                dto.getId(),
                dto.getEvento(),
                dto.getAsistente(),
                UtilDate.toLocalDate(dto.getFecha()),
                dto.isAsistencia()
                
        );
    }
    }
    
