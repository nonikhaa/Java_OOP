public class Car extends Vehicles { // Inheritence

    // Encapsulation
    private String Color;

    public Car() {
        this.Color = "Black";
    }

    public String GetColor() {
        return Color;
    }

    public void SetColor(String newColor) {
        this.Color = newColor;
    }

    public void Greetings() {
        System.out.println("Hi I am Motorbike and my Color is " + Color);
    }
}