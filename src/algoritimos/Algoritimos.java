package algoritimos;

public class Algoritimos {

    public static void quadrado(double n) {

        double r = n * n;

    }

    public static double metade(double v) {

        double r = v / 2;
        return r;
    }

    public static void main(String[] args) {

        double raiz;
        raiz = Math.sqrt(15);

        System.out.println("A raiz é " + raiz);

        quadrado(raiz);

        double result;
        result = metade(15);

    }

}
