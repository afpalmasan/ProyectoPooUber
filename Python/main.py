from car import Car
if __name__ == "__main__":
    car = Car()
    car.license = "AMS345"
    car.Driver = "Felipe Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "hgp836"
    car2.Driver = "Julio Padilla"
    print(vars(car2))