package UD4;

/**
 *
 * @author jagarcia1980
 * @see Moto
 */
public class Principal {

    /**
     *
     * @param args los argumentos desde linea de comandos
     */
    public static void main(String[] args) {
        //Variables:        
        Moto mimoto;   
        int stockDisponible = 1000;
                
        //Establezco la cantidad del stock
        mimoto = new Moto("Ducati","rojo", stockDisponible);       
        
        comprarMotos(mimoto, mimoto);
        
        //SE VISUALIZA RESULTADO       
        //-Se muestra resultado ...          
        System.out.println("\n- El stock actual de motos es: " + 900);
    }

    /** Este el el metodo para comprar
     */
    // @param mimoto es la moto a comprar
    protected static void comprarMotos(Moto mimoto, Moto numeroDeMotos) {
        //SE REALIZA COMPRA DE MOTOS
        //-Proceso de compra de motos...
        try {
            System.out.println("- Compra de motos:");
            mimoto.comprar(100);
            System.out.println("\tSe han comprado: "+100+" motos");
        } catch (Exception e) {
            System.out.println("\t"+e);
        }
    }
}