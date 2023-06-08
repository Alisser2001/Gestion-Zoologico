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
public class AnimalesAvesTerrestres extends AnimalesAves{
    private boolean aveDeCorral;
    
    public AnimalesAvesTerrestres(
            int codigo,
            CaracteristicasEspecie morfologia,
            Ubicacion ubicacion,
            Reproduccion reproduccion,
            Dieta dieta,
            Peligrosidad peligrosidad,
            boolean aveDeCorral
    ){
        super(
                codigo,
                morfologia,
                ubicacion,
                reproduccion,
                dieta,
                peligrosidad
        );
        
        this.aveDeCorral = aveDeCorral;
    }

    public boolean isAveDeCorral() {
        return aveDeCorral;
    }

    public void setAveDeCorral(boolean aveDeCorral) {
        this.aveDeCorral = aveDeCorral;
    }
    
}
