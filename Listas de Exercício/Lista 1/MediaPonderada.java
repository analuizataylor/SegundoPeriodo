/* 1. Faça um programa que leia três valores inteiros, e calcule e exiba a sua média ponderada. A primeira notatem peso 2, a segunda tem peso 3 e a terceira tem peso 5. */

import java.util.Scanner; 

public class MediaPonderada {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite a primeira nota: ");
    int n1 = entrada.nextInt();
    int p1 = n1 * 2;
    
    System.out.print("Digite a segunda nota:");
    int n2 = entrada.nextInt();
    int p2 = n2 * 3;
    
    System.out.print("Digite a terceiraa nota:");
    int n3 = entrada.nextInt();
    int p3 = n3 * 5;
    
    int media = (p1 + p2 + p3) / 10;
    System.out.print("A média ponderada é de:" + media);
    
    entrada.close();
  }
