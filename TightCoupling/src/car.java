public class car {

    Engine engine = new DiselEngine();

    public car(Engine engine)
    {
        this.engine = engine;
    }
    public void drive(){
        engine.start();
        System.out.println("car is moving....");
    }
}
