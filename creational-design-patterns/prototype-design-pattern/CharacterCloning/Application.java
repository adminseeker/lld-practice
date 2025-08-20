public class Application {
    public static void main(String[] args) {
        Character warrior1 = new Character("Warrior 1",100,40,60,"Shield");
        Character warrior2 = warrior1.clone();
        warrior2.setName("Warrior 2");

        System.out.println(warrior1.toString());
        System.out.println(warrior2.toString());

    }
}