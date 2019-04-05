package ui;

import model.Mercancia;
import model.Contenedora;

import java.util.Scanner;

 public class Main{


 	public static void main(String[] args){
 	

 		Scanner reader = new Scanner(System.in);

 		int option;

 		

 		do{

 		System.out.println("\n============================");
	 	System.out.println("\n	BIENVENIDO");
	 	System.out.println("\n============================");

	 	System.out.println("Por favor introduzca las dimensiones de la contenedora 1:");

 			System.out.println("Ancho:");
	        double ancho1 = reader.nextDouble();
	        System.out.println("Alto:");
	        double alto1 = reader.nextDouble();
	        System.out.println("Largo:");
	        double largo1 = reader.nextDouble();

   		System.out.println("Por favor introduzca las dimensiones de la contenedora 2:");

   			System.out.println("Ancho:");
	        double ancho2 = reader.nextDouble();
	        System.out.println("Alto:");
	        double alto2 = reader.nextDouble();
	        System.out.println("Largo:");
	        double largo2 = reader.nextDouble();

	    System.out.println("Por favor introduzca las dimensiones de la contenedora 3:");

   			System.out.println("Ancho:");
	        double ancho3 = reader.nextDouble();
	        System.out.println("Alto:");
	        double alto3 = reader.nextDouble();
	        System.out.println("Largo:");
	        double largo3 = reader.nextDouble();

 			Contenedora c1 = new Contenedora(ancho1, alto1, largo1);
	 		Contenedora c2 = new Contenedora(ancho2, alto2, largo2);
 			Contenedora c3 = new Contenedora(ancho3, alto3, largo3);

	        Mercancia m = new Mercancia(c1, c2, c3);
 		
	 		System.out.println("Recuerde que los calculos seran hechos con los datos que usted ingreso.");
	 		System.out.println("1. Calcular volumen.");
	 		System.out.println("2. Calcular promedio del volumen de las tres contenedoras.");
	 		System.out.println("3. Salir.");
	 		System.out.print("Ingrese la opcion que desee: ");

	        option = reader.nextInt();

	        	switch(option){	
	        		case 1:
	        		System.out.println(m.volumenTotal());
	        		break;
	        		case 2:
	        		System.out.println("\n"+m.promedioVolumen()+"\n");
	        		break;
	        		case 3:
	        		System.out.println("Gracias por utilizar el software, hasta pronto.");
	        		break;

	        	}

 		}while(option!=3);


  	}


}

