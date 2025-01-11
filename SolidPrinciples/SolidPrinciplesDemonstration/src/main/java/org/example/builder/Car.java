// Product class
public class Car {
    private String engine;
    private String color;
    private boolean hasGPS;
    private int airbags;

    // Private constructor to enforce object creation via Builder
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.color = builder.color;
        this.hasGPS = builder.hasGPS;
        this.airbags = builder.airbags;
    }

    // Getters for the fields (optional, for immutability demonstration)
    public String getEngine() { return engine; }
    public String getColor() { return color; }
    public boolean hasGPS() { return hasGPS; }
    public int getAirbags() { return airbags; }

    @Override
    public String toString() {
        return "Car [Engine=" + engine + ", Color=" + color +
               ", GPS=" + hasGPS + ", Airbags=" + airbags + "]";
    }

    // Static nested Builder class
    public static class CarBuilder {
        private String engine;
        private String color;
        private boolean hasGPS;
        private int airbags;

        // Builder methods for setting each field
        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public CarBuilder setAirbags(int airbags) {
            this.airbags = airbags;
            return this;
        }

        // Method to "build" the final Car object
        public Car build() {
            return new Car(this);
        }
    }
}
