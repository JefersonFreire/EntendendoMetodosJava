package Retornos;

public class main {

    public static void main(String[] args) {

        System.out.println("Exercícios retornos");

        double areaQuadrado = Quadrilateros.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilateros.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilateros.area(7, 8, 9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}
