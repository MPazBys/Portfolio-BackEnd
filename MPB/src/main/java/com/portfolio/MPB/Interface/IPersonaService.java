/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.MPB.Interface;

import com.portfolio.MPB.Entity.Persona;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IPersonaService {
    //Traer lista de personas//
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona//
    public void savePersona (Persona persona);
    
    //Eliminar un objeto pero lo buscamos por id//
    public void deletePersona (Long id);
    
    //Buscar una Persona por id//
    
   public Persona findPersona(Long id);
}
