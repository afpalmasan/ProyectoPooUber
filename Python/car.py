from account import Account

class Car:
    id = int
    license = str
    Driver = Account("","")
    Passenger = int

    def __init__(self, license, driver):
        self.license = license
        self.Driver = driver
