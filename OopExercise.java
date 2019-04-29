public class OopExercise {

    public static void main(String[] args) {
        Car objCar = new Car();
        String type = objCar.GetType();

        System.out.println(type);
        objCar.Greetings();
        objCar.HornSound();

        Bicycle objBicycle = new Bicycle();
        objBicycle.Greetings();
        objBicycle.HornSound("Kriiing Kriiing");

    }
}