public class EngineFactory {
    public static Engine getEngine(String s) {
        if (s == null) {
            return null;
        }
        return switch (s.toLowerCase()) {
            case "diesel" -> new DiselEngine();
            case "petrol" -> new PetrolEngine();
            default -> null;
        };
    }
}
