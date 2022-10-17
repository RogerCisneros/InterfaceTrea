public class Humano extends Mamifero implements ComportamientoGeneral,ComportamientoHumano{
    @Override
    public void jugar(){
        System.out.println("humano jugando");
    }

    @Override
    public String dormir(){
        return "humano durmiendo";
    }

    @Override
    public void trabajar(){
        System.out.println("humano trabajando");
    }
}
