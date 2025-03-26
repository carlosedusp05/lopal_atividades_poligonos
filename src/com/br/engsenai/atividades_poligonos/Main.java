package com.br.engsenai.atividades_poligonos;

import java.util.Scanner;

import com.br.engsenai.atividades_poligonos.ui.Menu;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println(nome.length());
		System.out.println("Olá, " + nome);
		System.out.println(nome.toUpperCase());
		
		Menu menu = new Menu();
		menu.criarMenu();
	}
}
