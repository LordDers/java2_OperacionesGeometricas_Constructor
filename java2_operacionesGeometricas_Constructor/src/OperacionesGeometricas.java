//package com.zubiri.geometria;
import java.util.Scanner;

import com.zubiri.geometria.Circulos;
import com.zubiri.geometria.Rectangulo;
//import com.zubiri.geometria.Pruebas;
//import aa.Rectangulo;

public class OperacionesGeometricas
{
	public static void main (String args[])
	{
		String figura;

		Scanner sc = new Scanner(System.in);
		System.out.print("\n Sobre que figura geometrica desea realizar las operaciones, ¿Circulo (C) o Rectangulo (R)?");
		figura = sc.nextLine();

		if (figura.equalsIgnoreCase ("C") || figura.equalsIgnoreCase ("Circulo"))
		{
			double numero1, resultadoArea, resultadoCircunferencia;
		
			System.out.print("\nIngresa un número: ");
			numero1 = sc.nextDouble(); // nextDouble --> Cambiar todos los float de los dos archivos a double

			Circulos operaciones = new Circulos(numero1);

			resultadoArea = operaciones.Area();
			resultadoCircunferencia = operaciones.Circunferencia();

			System.out.println("\nEl resultado del AREA es: " + resultadoArea);
			System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircunferencia);
	
			//System.out.println("\n\nEGUN ONA IZAN!!\n");
		}
		else if (figura.equalsIgnoreCase ("R") || figura.equalsIgnoreCase ("Rectangulo"))
		{
			double alt = 0, bs = 0;
			double area;

			// Constructor
			Rectangulo rectangulo = new Rectangulo(bs, alt);
			area = rectangulo.Area();
		
			System.out.print("\nIngresa la altura del rectangulo: ");
			alt = sc.nextDouble();
		
			System.out.print("\nIngresa la base del rectangulo: ");
			bs = sc.nextDouble();
		
			rectangulo.setBase(bs);
			rectangulo.setAltura(alt);

			System.out.println("\nEl AREA del rectangulo es: " + rectangulo.Area() + "cm");
			System.out.println("\nEl PERIMETRO del rectangulo es: " + rectangulo.Perimetro() + "cm");
		}
		else
		{
			System.out.println("\n Debes introducir C (Ciruclo) o R (Rectangulo)");
		}
	}
}


/* CLASSPATH=:/home/zubiri/ProyectosJava; export CLASSPATH 
desde src*/
