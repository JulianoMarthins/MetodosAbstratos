
import entities.Retangulo;
import entities.Shape;
import entities.enums.Circulo;
import entities.enums.Color;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Shape> lista = new ArrayList<>();

        System.out.println("Digite o número de formas: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.printf("\n%d° Forma:", i + 1);

            System.out.print("\nDigite (R) para retângulo ou (C) circulo: ");
            char op = sc.next().charAt(0);

            System.out.print("Cor: [BLACK/BLUE/RED]: ");
            Color color = Color.valueOf(sc.next());

            if (op == 'r' || op == 'R') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                lista.add(new Retangulo(color, largura, altura));

            } else if (op == 'c' || op == 'C') {
                System.out.println("Digite o raio do circulo: ");
                double radius = sc.nextDouble();
                lista.add(new Circulo(color, radius));

            } else{
                System.out.println("Você digitou um valor inválido");
            }

            System.out.println("\n\n\t\t\tArea das figuras: ");
            for(Shape shape : lista){
                System.out.println(String.format("%.2f", shape.area()));
            }


        }


        sc.close();
    }
}