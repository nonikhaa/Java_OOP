public class Bus extends Vehicles { // Inheritence

    // Encapsulation
    private String Color;

    public Bus() {
        this.Color = "Green";
    }

    public String GetColor() {
        return Color;
    }

    public void SetColor(String newColor) {
        this.Color = newColor;
    }

    public void Greetings() {
        System.out.println("Hi I am Bus and my Color is " + Color);
    }
}