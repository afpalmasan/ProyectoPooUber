public class UberPool extends Car{
    String brand;
    String model;

    public UberPool(String license, Accaunt driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;

    }
}
