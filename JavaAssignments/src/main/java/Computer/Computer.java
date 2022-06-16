package Computer;

public class Computer {
    String brand;
    int hardDisk;
    int ram;

    public static void main(String[] args) {

        Computer comp = new Computer();
        Computer myComputer = new Computer();
        Computer thisComputer = new Computer();
        Computer computer = new Computer();

        myComputer.brand = "HP";
        myComputer.hardDisk = 120;
        myComputer.ram = 8;

        System.out.println("Brand:       " +myComputer.brand);
        System.out.println("Harde disk:  " +myComputer.hardDisk + " GB");
        System.out.println("RAM:         " +myComputer.ram + " GB");
    }
}
