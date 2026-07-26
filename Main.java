public class Main {
    public static void main(String[] args){
        Car bmw = new Car();
        bmw.startEngine();
        bmw.setDetails("BMW" , "Black");
        bmw.startEngine();
        bmw.moveFast();
        bmw.moveFast();
        bmw.drive(50);
        bmw.turboMode();
        bmw.toggleHeadlights();
        bmw.displayState();
        System.out.println("Brand: " + bmw.getBrand()+ "Speed" + ", Speed: " + bmw.getSpeed()+ ",FuelLevel: " + bmw.getFuelLevel());
        System.out.println();
    }
    
}
