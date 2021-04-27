package UD4;

/**
 * 
 * @author jagarcia1980
 * Puedes mirar {@link Principal#main} 
 */
public class Moto {    
    private String modelo;
    private int numeroRuedas;
    private int cilindrada;
    private int velocidadMaxima;
    private int peso;
    private String color;
    private int precio;
    private int stock;//Cantidad de motos de las que se disponen
    /**
     * 
     * @param modelo es el modelo del coche a crear
     * @param color es el color que tendra el coche
     * @param stock el numero de unidades en almacen
     */
    public Moto(String modelo, String color, int stock) {
        this.modelo = modelo;
        this.color = color;
        this.stock = stock;
        
        
    }    
    
    /**
     * 
     * @param cantidad esta sería la cantidad a comprar
     * @throws Exception que se lanza en caso de cantidad negativa
     */
    public void comprar(int cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de motos");
        stock = stock + cantidad;
    }
}
