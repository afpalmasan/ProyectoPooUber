public class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Accaunt driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;

    }
}
