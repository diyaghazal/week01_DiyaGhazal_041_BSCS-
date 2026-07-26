public class Car{
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private double fuelLevel;
    private int gear;
    private boolean headLightsOn;
    private double odometer;
    private boolean autopilotEnabled;
    public Car(){
        this.brand = null;
        this.color = null;
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 0.0;
        this.gear =0;
        this.headLightsOn = false;
        this.odometer =0.0;
        this.autopilotEnabled = false;
    }
    public void setDetails(String brand, String color){
        this.brand = brand;
        this.color =color;
        this.fuelLevel = 100.0;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getColor(){
        return this.color;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean isEngineOn(){
        return this.engineOn;
    }
    public double getFuelLevel(){
        return this.fuelLevel;
    }
    public int getGear(){
        return this.gear;
    }
    public boolean isHeadLightsOn(){
        return this.headLightsOn;
    }
    public double getOdometer(){
        return this.odometer;
    } 
    public boolean isAutopilotEnabled(){
        return this.autopilotEnabled;
    }
    private boolean detailsReady(){
        if(this.brand==null||this.color==null){
        System.out.println("Set brand and color first using setDetails()");
    return false;
}
return true;
    }
    public void startEngine(){
        if(!detailsReady())return;
        if(this.fuelLevel<=0){
            System.out.println(this.brand + "cannot start: fuel tank empty.");
            return;
        }
        this.engineOn = true;
        this.gear = 1;
        System.out.println(this.brand + "engine started.");
    }
    public void stopEngine(){
        if(!detailsReady()) return;
       this.engineOn = false;
       this.speed = 0;
       this.gear = 0;
       System.out.println(this.brand + "engine stopped.");
    }
    public void moveFast(){
        if(!detailsReady()) return;
        if(!this.engineOn){
            System.out.println(this.brand + "engine is off, cannot accelerate.");
            return;
        }
        if(this.fuelLevel<=0){
            System.out.println(this.brand + "is out of fuel.");
            this.speed = 0;
            return;
        }
        this.speed += 20;
        this.fuelLevel -= 2;
        if(this.fuelLevel<0)this.fuelLevel = 0;
        System.out.println(this.brand + "speeds up to" + this.speed + "km/h.");
    }
    public void moveSlow(){
        if(!detailsReady()) return;
        if(!this.engineOn){
            System.out.println(this.brand + "engine is off.");
            return;
        } 
        this.speed -= 10;
        if(this.speed < 0) this.speed = 0;
        System.out.println(this.brand + "slows down to" + this.speed +  "km/h.");
    }
    public void moveLeft(){
        if(!detailsReady()) return;
        if(!this.engineOn){
            System.out.println(this.brand + "engine is off ,cannot steer.");
            return;
        }
        System.out.println(this.brand + "turns left.");
    }
    public void moveRight(){
        if(!detailsReady()) return;
        if(!this.engineOn){
            System.out.println(this.brand + "engine is off ,cannont steer.");
            return;
        }
        System.out.println(this.brand + "turns Right.");
    }
    public void drive(double distanceKm){
        if(!detailsReady()) return;
        if(!this.engineOn){
            System.out.println(this.brand + "engine is off , cannot drive.");
            return;
        }
        if(distanceKm <=0){
            System.out.println("Distance must be positive");
            return;
        }
        double fuelNeeded = distanceKm *0.1;
        if(fuelNeeded > this.fuelLevel){
            System.out.println(this.brand + "does not have enough fuel for");
            return;
        }
        this.odometer += distanceKm;
        this.fuelLevel -= fuelNeeded;
        System.out.println(this.brand + "drove" + distanceKm + "km. odometer:" + this.odometer + "km."); 
    }
    public void toggleHeadlights(){
        if(!detailsReady()) return;
        this.headLightsOn = !this.headLightsOn;
        System.out.println(this.brand + "headlights" + (this.headLightsOn ? "ON": "OFF")+ ".");
    }
    public void turboMode(){
        if(!detailsReady()) return;
        if(!this.engineOn){
            System.out.println(this.brand + "engine is off, turbo unavailable.");
            return;
        }
        if(this.fuelLevel<10){
            System.out.println(this.brand + "fuel too low for turbo mode.");
            return;
        }
        this.speed += 50;
        this.fuelLevel -= 15;
        this.autopilotEnabled = false;
        System.out.println(this.brand + "TURBO engaged! Speed jumps to" + this.speed + "km/h.");
    }
    public void displayState(){
       System.out.println("Brand :" + this.brand);
        System.out.println("Color :" + this.color);
         System.out.println("Speed :" + this.speed +"km/h");
          System.out.println("Engine on :" + this.engineOn);
           System.out.println("Fuel level :" + this.fuelLevel + "%");
            System.out.println("Gear :" + this.gear);
             System.out.println("Headlights :" + this.headLightsOn);
              System.out.println("Odometer :" + this.odometer + "km");
               System.out.println("Autopilot :" + this.autopilotEnabled);
         System.out.println();
            }
}