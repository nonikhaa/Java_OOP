public class Bicycle extends Vehicles { // Inheritence

    // Encapsulation
    private String Color;

    public Bicycle() {
        this.Color = "Yellow";
    }

    public String GetColor() {
        return Color;
    }

    public void SetColor(String newColor) {
        this.Color = newColor;
    }

    public void Greetings() {
        System.out.println("Hi I am Bicycle and my Color is " + Color);
    }
}