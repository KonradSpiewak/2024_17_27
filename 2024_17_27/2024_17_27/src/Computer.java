public class Computer {


    public String model;
//Bardzo rzadko w linijce 4 definiuje się jakas wartosc

    public Computer(String model) {
        this.model = model;

    }

    public void data_processing(String name) {
        System.out.println("Changed model: " + this.model);
        System.out.println("Passed model: " + name);

    }
}
