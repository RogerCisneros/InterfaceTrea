public abstract class Animal implements ComportamientoGeneral {
    public abstract void cazar();

    @Override
    public void jugar(){
        System.out.println("Juega");
    }
    @Override
    public String dormir(){
        System.out.println("Duerme");
        return null;
    }
}
