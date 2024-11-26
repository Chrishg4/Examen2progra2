/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Eventos;

import Mapper.Mapper;
import Model.Asistentes.Asistente;
import Model.Asistentes.AsistenteDTO;
import Utils.UtilDate;

/**
 *
 * @author Student
 */
public class EventoMapper implements Mapper<Evento,EventoDto> {

    @Override
    public EventoDto toDto(Evento ent) {
        return new EventoDto(

        

                ent.getId(),
                ent.getNombre(),
                 UtilDate.toLocalDate(ent.getFecha()),
                ent.getLugar(),
                ent.getCAPACIDAD()
        );

    }

    @Override
    public Evento toEntity(EventoDto dto) {
        if (dto == null) {
            return null;
        }
        return new Evento(
                dto.getId(),
                dto.getNombre(),
                 UtilDate.toLocalDate(dto.getFecha()),
                dto.getLugar(),
                dto.getCAPACIDAD()
        );

    }
    }
    

