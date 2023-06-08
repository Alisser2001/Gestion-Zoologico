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
public class AnimalesMamiferosTerrestres extends AnimalesMamiferos {

    private int numeroPatas;

    public AnimalesMamiferosTerrestres(
        int codigo, 
        CaracteristicasEspecie morfologia,
        Ubicacion ubicacion,
        Reproduccion reproduccion,
        Dieta dieta,
        Peligrosidad peligrosidad,
        int numeroPatas,
        String comportamiento
    ) 
    {
        super(
                codigo, 
                morfologia,
                ubicacion,
                reproduccion,
                dieta,
                peligrosidad
        );
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
}
