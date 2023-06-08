package Principal;
import Principal.View.InitView;
import Control.GestionAnimales.Animales.Tipos.Animales;
import Control.GestionAnimales.Animales.Tipos.AnimalesAves;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import Control.GestionAnimales.CopiaAnimales.InfoJSON.GetInfoJSON;
import Control.GestionAnimales.CopiaAnimales.InfoJSON.ReadJSON;

/**
 *
 * @author brahiam.acosta
 */
public class Zoologico {

    public static void main(String[] args) throws IOException{
            //JSON info to Animals static attributes (ArrayList)
            GetInfoJSON info = new GetInfoJSON();
            info.GetInfoAnfibios();
            info.GetInfoAvesAcuaticas();
            info.GetInfoAvesCarroñaRapiña();
            info.GetInfoAvesExoticas();
            info.GetInfoAvesTerrestres();
            info.GetInfoInsectos();
            info.GetInfoMamiferosAcuaticos();
            info.GetInfoMamiferosTerrestres();
            info.GetInfoPeces();
            info.GetInfoReptilesAcuaticos();
            info.GetInfoReptilesTerrestres();
            
            System.out.println("Nuestros Animles: ");
            System.out.println(Animales.animales);
            
            //Init window view
            InitView iniciar = new InitView();
    }
}
