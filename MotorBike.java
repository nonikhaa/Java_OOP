
public class MotorBike extends Vehicles { // Inheritence

    // Encapsulation
    private String Color;

    public MotorBike() {
        this.Color = "Red";
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