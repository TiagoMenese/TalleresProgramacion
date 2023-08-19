
package transCauca_S.A;

public class Bus {
    //declaracion de atributos
    int codigoBus, modeloBus;
    String marcaBus, placaBus, Datos;
    
    //creacion del metodo constructor de la clase bus
    public Bus(int codigoBus, int modeloBus, String marcaBus, String placaBus) {
        this.codigoBus = codigoBus;
        this.modeloBus = modeloBus;
        this.marcaBus = marcaBus;
        this.placaBus = placaBus;
    }
    
    //creacion del metodo con retorno
    public String mostrarDatos(int codigoBus, int modeloBus, String marcaBus, String placaBus){
        Datos = "EL CODIGO DEL BUS ES: "+codigoBus+ " "+"\nEL MODELO DEL BUS ES: " + modeloBus
                +"\nLA MARCA DEL BUS ES: "+marcaBus+ " " +"\nLA PLACA DEL BUS ES: " +placaBus;
        return Datos;
    }
}
