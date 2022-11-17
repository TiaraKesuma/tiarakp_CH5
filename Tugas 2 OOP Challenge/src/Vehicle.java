public class Vehicle {
    public static String wheel(){
        return "Memiliki roda bulat";
    }

    public static String move(){
        return "Dapat bergerak maju dan mundur";
    }

    public static void Main(String[] args) {

    }
}

class Car extends Vehicle{
    public static String wheelCount(){
        int roda = 4;
        return "Jumlah rodanya ada " + roda;
    }

    public static String tankCapacity(){
        int tank = 957000;
        return "Jumlah kapasitas tanknya yaitu " + tank;
    }

    public void displayMethod(String Msg){
        System.out.println(Msg);
    }
}

class HondaJazz extends Car{
    public static String wheelCount(){
        int roda = 10;
        return "Jumlah rodanya ada " + roda;
    }

    public static void Main(String[] args){
        HondaJazz honda = new HondaJazz();
        honda.displayMethod("Ini mobil Honda Jazz!");
    }
}

class ToyotaFortuner extends Car{
    public static String tankCapacity(){
        int tank = 1000000;
        return "Jumlah kapasitas tanknya yaitu " + tank;
    }

    public static void Main(String[] args){
        HondaJazz honda = new HondaJazz();
        honda.displayMethod("Ini mobil Toyota Fortuner ges!");
    }
}

class Main{
    public static void Main(String[] args){
        Car myCar = new Car();
        myCar.displayMethod(myCar.wheelCount());
        myCar.displayMethod(myCar.tankCapacity());

        HondaJazz mySecondCar = new HondaJazz();
        mySecondCar.displayMethod(mySecondCar.wheelCount());
        mySecondCar.displayMethod(mySecondCar.tankCapacity());

        ToyotaFortuner myThirdCar = new ToyotaFortuner();
        myThirdCar.displayMethod(myThirdCar.wheelCount());
        myThirdCar.displayMethod(myThirdCar.tankCapacity());
    }
}

