public class Vehicles {

    // Encapsulation
    private String Type;

    public Vehicles() {
        this.Type = "Land Transportation";
    }

    public String GetType() {
        return Type;
    }

    public void SetType(String newType) {
        this.Type = newType;
    }

    // Polymorphism
    public void HornSound() {
        System.out.println("Bruumm...");
    }

    // Polymorphism
    public void HornSound(String newSound) {
        System.out.println(newSound);
    }

}