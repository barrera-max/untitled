import Control.GestorActualizaciones;
import Entidades.*;

import java.util.ArrayList;

public class PantallaAdm {

    private ArrayList<Bodega> bodegas;
    private Bodega bodegaSeleccionada;
    private ArrayList<Vino> vinos;

    public static void main(String[] args) {

        TipoUva tipoUva = new TipoUva("violeta", "uva violeta");

        Varietal varietal =  new Varietal("varietal", 12.5f, tipoUva);
        Maridaje maridaje = new Maridaje();

        Vino vino = new Vino(2015, "imagen.jpg", "Balbo", "es rico con pritty",
                1500.50, varietal, maridaje);

        System.out.println();
        System.out.println(vino.toString() );

        GestorActualizaciones control = new GestorActualizaciones();

        Vino nuevo = control.crearVino();

        System.out.println("\n\nEn esta parte el control crea un nuevo vino");
        System.out.println(nuevo.toString());
    }

    public void opcionImportarActDeVinoDeBodega(){

    }
    public static void habilitarPantalla(){

    }
    public static void solicitarSeleccionBodegas(){

    }

    public static void tomarSeleccionBodega(){

    }

    public static void mostrarActDeVinosActualizadosYcreados(){

    }

    public static void mostrarOpcionFinalizar(){

    }

    public static void opcionFinalizar(){}

}
