public class Car {
    Integer id;
    String license;
    Accaunt Driver;
    Integer Passenger;

    public Car(String license,Accaunt driver){
        this.license = license;
        this.Driver = driver;
    }

    void printDataCar(){
        System.out.println("License: "+ license + " Driver Name: "+Driver.name);
    }

}

