/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.GestionAnimales.Animales.Tipos;

import Control.GestionAnimales.Animales.Caracteristicas.CaracteristicasEspecie;
import Control.GestionAnimales.Animales.Caracteristicas.Dieta;
import Control.GestionAnimales.Animales.Caracteristicas.Peligrosidad;
import Control.GestionAnimales.Animales.Caracteristicas.Reproduccion;
import Control.GestionAnimales.Animales.Caracteristicas.Ubicacion;

/**
 *
 * @author Alisser
 */
public class AnimalesAvesCarroñaRapiña extends AnimalesAves{
    private String especiesCompatibles[];
    
    public AnimalesAvesCarroñaRapiña(
            int codigo,
            CaracteristicasEspecie morfologia,
            Ubicacion ubicacion,
            Reproduccion reproduccion,
            Dieta dieta,
            Peligrosidad peligrosidad,
            String[] especiesCompatibles
    ){
        super(
                codigo,
                morfologia,
                ubicacion,
                reproduccion,
                dieta,
                peligrosidad
        );
        this.especiesCompatibles = especiesCompatibles;
    }

    public String[] getEspeciesCompatibles() {
        return especiesCompatibles;
    }

    public void setEspeciesCompatibles(String[] especiesCompatibles) {
        this.especiesCompatibles = especiesCompatibles;
    }
    
}
