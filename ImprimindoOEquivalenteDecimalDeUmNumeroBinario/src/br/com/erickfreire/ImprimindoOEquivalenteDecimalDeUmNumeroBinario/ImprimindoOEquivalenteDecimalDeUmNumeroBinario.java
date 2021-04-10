package br.com.erickfreire.ImprimindoOEquivalenteDecimalDeUmNumeroBinario;

import java.util.Scanner;

/**
 * Programa em Java que transforma um número Binario em um decimal
 * @author Erick Freire
 * @version 1 - Criado em 10-04-2021
 */

public class ImprimindoOEquivalenteDecimalDeUmNumeroBinario {
	public static void main(String[] args) {
		
		String bin = null;
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que converte Binario para decimal: ");
		
		System.out.print("Digite um número em binário: ");
		bin = entrada.nextLine();

		numero = Integer.parseInt(bin, 2);
		
		System.out.printf("O valor é: %d", numero);
				
	}

}
