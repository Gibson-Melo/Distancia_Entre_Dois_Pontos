package aplicacao;

import entidade.Calculo;
import java.util.Scanner;

public class Programa {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Calculo ca = new Calculo();

    System.out.println("DIGITE AS COORDENADAS DO PONTO (1)");
    System.out.print("RETA X1: ");
    ca.setX1(sc.nextDouble());
    System.out.print("RETA Y1: ");
    ca.setY1(sc.nextDouble());
    System.out.println("DIGITE AS COORDENADAS DO PONTO (2)");
    System.out.print("RETA X2: ");
    ca.setX2(sc.nextDouble());
    System.out.print("RETA Y2: ");
    ca.setY2(sc.nextDouble());

    System.out.printf("\nA Distância entre os pontos 1 e 2 é de: %.2f", ca.distancia());

    sc.close();
  }
}
