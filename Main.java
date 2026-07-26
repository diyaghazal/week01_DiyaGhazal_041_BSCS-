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
public class Main{
    public static void main(String[] args){
        Calculator casio = new Calculator();
        casio.add();
        casio.show();
        casio.subtract();
        casio.show();
        casio.multiply();
        casio.show();
        casio.divide();
        casio.show();
        casio.modulus();
        casio.show();
        casio.power();
        casio.show();
        casio.set(8,0);
        casio.divide();
        casio.show();
        casio.set(,);
        casio.average();
        casio.show();
        
