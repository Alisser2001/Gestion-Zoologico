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
public class AnimalesMamiferosAcuaticos extends AnimalesMamiferos {
    private int numAletas;
    private String capacidadBuceo, especiesCompatibles[], mecanismoRespiracion;
    
    public AnimalesMamiferosAcuaticos(
        int codigo, 
        CaracteristicasEspecie morfologia,
        Ubicacion ubicacion,
        Reproduccion reproduccion,
        Dieta dieta,
        Peligrosidad peligrosidad,
        int numAletas,
        String capacidadBuceo,
        String especiesCompatibles[],
        String mecanismoRespiracion
    ){
        super(
                codigo, 
                morfologia,
                ubicacion,
                reproduccion,
                dieta,
                peligrosidad
        );
        this.numAletas = numAletas;
        this.capacidadBuceo = capacidadBuceo;
        this.mecanismoRespiracion = mecanismoRespiracion;
        this.especiesCompatibles = especiesCompatibles;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    public String getCapacidadBuceo() {
        return capacidadBuceo;
    }

    public void setCapacidadBuceo(String capacidadBuceo) {
        this.capacidadBuceo = capacidadBuceo;
    }

    public String[] getEspeciesCompatibles() {
        return especiesCompatibles;
    }

    public void setEspeciesCompatibles(String[] especiesCompatibles) {
        this.especiesCompatibles = especiesCompatibles;
    }

    public String getMecanismoRespiracion() {
        return mecanismoRespiracion;
    }

    public void setMecanismoRespiracion(String mecanismoRespiracion) {
        this.mecanismoRespiracion = mecanismoRespiracion;
    }
    
    
}
