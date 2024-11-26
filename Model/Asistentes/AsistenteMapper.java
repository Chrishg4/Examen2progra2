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
        return new AsistenteDTO(
                ent.getCedula(),
                ent.getNombre(),
                ent.getTelefono(),
                ent.getCorreo()
        );
    }

    @Override
    public Asistente toEntity(AsistenteDTO dto) {
        if (dto == null) {
            return null;
        }
        return new Asistente(
                dto.getCedula(),
                dto.getNombre(),
                dto.getTelefono(),
                dto.getCorreo()
        );
    }

}
