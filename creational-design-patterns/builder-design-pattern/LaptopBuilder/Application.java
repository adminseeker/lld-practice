public class Application {
    public static void main(String[] args) {
        Laptop gamingLaptop = new Laptop.Builder()
                            .cpu("Intel i9")
                            .ram("32 GB")
                            .storage("1TB SSD")
                            .os("Windows 11")
                            .graphicsCard("NVIDIA RTX 4060")
                            .build();
        
        Laptop budgetLaptop = new Laptop.Builder()
                            .cpu("Intel i3")
                            .ram("8 GB")
                            .storage("256GB SSD")
                            .os("Windows 11")
                            .graphicsCard("")
                            .build();

        Laptop developerLaptop = new Laptop.Builder()
                            .cpu("Intel i5")
                            .ram("16 GB")
                            .storage("512GB SSD")
                            .os("MAC OS")
                            .graphicsCard("Apple Silicon")
                            .build();
        
        System.out.println(gamingLaptop.toString());
        System.out.println(budgetLaptop.toString());
        System.out.println(developerLaptop.toString());
    }
}
