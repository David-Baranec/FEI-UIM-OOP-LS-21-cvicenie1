package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
        for (int a = 0; a < 6; a++) {
            switch (a) {
                case 1:
                    System.out.println("a je jedna");
                    break;
                case 2:
                    System.out.println("a je dva");
                    break;
                case 3:
                case 4:
                    System.out.println("a je 3 alebo 4");
                    break;
                default:
                    System.out.println(String.format("a je %d", a));
            }
        }
    }
}
