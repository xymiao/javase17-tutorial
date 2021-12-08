public class Test {
    public static void main(String[] args) {
        Cpu cpu = new ACpu();
        Computer computer = new Computer(cpu);
        computer.build();

        Cpu cpu2 = new ICpu();
        Computer computer2 = new Computer(cpu2);
        computer2.build();
    }
}
