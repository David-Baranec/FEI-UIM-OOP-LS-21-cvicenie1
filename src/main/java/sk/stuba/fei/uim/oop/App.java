package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
        int[] mojePole = new int[10];

        for (int i = 0; i < mojePole.length; i++) {
            if (i == 0) {
                mojePole[i] = 1;
                continue;
            }

            mojePole[i] = mojePole[i - 1] * 2;
        }

        for (int i = 0; i < mojePole.length; i++) {
            System.out.println(i + " : " + mojePole[i]);
        }
    }
}
