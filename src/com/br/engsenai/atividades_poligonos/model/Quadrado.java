package com.br.engsenai.atividades_poligonos.model;

public class Quadrado {
	
	private double lado;
	public void setLado(double lado) {
 	
     }
 		
 	
 	private double calcularArea() {
 		double area = lado * lado;
 		return area;
 	}
      
 	private double calcularPerimetro() {
 		double perimetro = 4 * lado;
 		return perimetro;		
 	}
 	
 	public void mostrarDados() {
 		System.out.println("----------------");
 		System.out.println("DADOS DO  QUADRADO");
 		System.out.println("----------------");
 		System.out.println("LADO: " + lado);
 		System.out.println("ÁREA: " + + calcularArea());
 		System.out.println("PERÍMETRO: " + calcularPerimetro());
 		System.out.println("----------------");
 		
 		
 	}

}
