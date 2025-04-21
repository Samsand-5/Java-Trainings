class Car {
    private Engine engine;  
    
    public Car() {
        engine = new Engine();  
    }
    void startCar() {
        engine.start();
        System.out.println("Car is starting");
    }
}
