from car import Car
from account import Account
if __name__ == "__main__":
    car = Car("trj801", Account("Andres Felipe","123456"))
    print(vars(car))
    print(vars(car.Driver))

    