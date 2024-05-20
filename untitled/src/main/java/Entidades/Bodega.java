package Entidades;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Bodega {

    private int coordenadasUbicacion;
    private String descripcion;
    private String historia;
    private String nombre;
    private int periodoActualizacion;


}
