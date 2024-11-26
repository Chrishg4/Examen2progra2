/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Mapper;

/**
 *
 * @author Student
 * @param <Entity>
 * @param <Dto>
 */
public interface Mapper <Entity,Dto> {
    
      public Dto toDto(Entity ent);

    public Entity toEntity(Dto dto);
}
