package Boundary;

import Entidades.Bodega;
import Entidades.Vino;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PantallaAdm {
    private ArrayList<Bodega> bodegas;
    private Bodega bodegaSeleccionada;
    private ArrayList<Vino> vinos;


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
