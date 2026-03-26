public class Test
{
    public static void main(String[] args) {
        Engine engine =EngineFactory.getEngine("petrol");
        car car = new car(engine);
        car.drive();
    }
}
