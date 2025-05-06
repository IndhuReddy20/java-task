class Computer {
    static String os = "Windows";
    String ram;

    public static void main(String[] args) {
        System.out.println("OS: " + Computer.os);
        Computer comp1 = new Computer();
        comp1.ram = "8GB";
        Computer comp2 = new Computer();
        comp2.ram = "16GB";

        System.out.println("Computer 1 RAM: " + comp1.ram);
        System.out.println("Computer 2 RAM: " + comp2.ram);
    }
}