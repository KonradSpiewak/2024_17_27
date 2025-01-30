public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Apple");
        System.out.println("COMPUTER 1");
        System.out.println("Origin model: " + computer1.model);
        computer1.model = "Optimus Pascal";
        computer1.data_processing("Asus");
        System.out.println("---");
        System.out.println("COMPUTER 2");
        Computer computer2 = new Computer("Apple");
        System.out.println("Origin model: " + computer2.model);
        computer2.model = "HP";
        computer2.data_processing("Dell");
    }
}