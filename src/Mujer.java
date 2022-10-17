public class Mujer extends Humano{
    String nombre;

    public Mujer(String nombre) {
        this.nombre = nombre;
    }

    public String dormir(){
       return nombre+" "+super.dormir();
    }

}
