# Java_OOP

# Inheritence
Inheritence = penurunan
	contoh =
		Bicycle extends Vehicles
		
		Vehicles = kelas induk (Base Class)
		Bicycle = kelas anak (Derived Class)
		
# Encapsulation
Encapsulation = enkapsulasi (konsep melindungi kode/value yang ada pada class dari pengaksesan luar class)
	contoh = 
	private String Color;
		private = hanya class itu sendiri yang bisa melihat / mengakses

# Polymorphism
Polymorphism = sebuah objek yang mempunyai bentuk lebih dari satu.
	contoh = 
	 public void HornSound() {
        System.out.println("Bruumm...");
    }

    public void HornSound(String newSound) {
        System.out.println(newSound);
    }
	
	memiliki nama method yang sama namun memiliki perlakuan yang berbeda.
