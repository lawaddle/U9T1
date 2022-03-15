public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object

    Bicycle myBike = new Bicycle("Jeremy", 2, 2);
    System.out.println(myBike.getName()); // inherited method
    System.out.println(myBike.getWheels()); // inherited method
    System.out.println(myBike.getGears());
    myBike.move(15); // inherited method
    myBike.turn(-30); // inherited method
    myBike.brake(0.10); // inherited method
    myBike.ringBell();

    Train myTrain = new Train("Thomas", 60, true, true, 7);
    System.out.println(myTrain.getName()); // inherited method
    System.out.println(myTrain.getWheels()); // inherited method
    System.out.println(myTrain.getRailcar());
    System.out.println(myTrain.isCaboose());
    System.out.println(myTrain.isLocomotive());
    myTrain.move(3000); // inherited method
    myTrain.turn(7); // inherited method
    myTrain.brake(0.75); // inherited method
    myTrain.drawTrain();




  }
}