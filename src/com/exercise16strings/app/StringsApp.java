package com.exercise16strings.app;

import com.exercise16strings.model.Tuneador;

public class StringsApp 
{
	public int numero1;

	public static void main(String[] camote) {
		
		String cad1 = "El secretario de la Defensa Nacional Luis, Cresencio Sandoval, admitió que hubo errores en el operativo mediante el cual intentaron detener a Ovidio Guzmán, hijo de El Chapo. y que derivó en los hechos violentos que aterrorizaron ayer a la ciudad de Culiacán";
		String cad2 = "       El secretario de la Defensa Nacional Luis, Cresencio Sandoval, admitió que hubo errores en el operativo mediante el cual intentaron detener a Ovidio Guzmán, hijo de El Chapo, y que derivó en los hechos violentos que aterrorizaron ayer a la ciudad de Culiacán.        ";
		
		System.out.println(cad1.charAt(3));
		System.out.println(cad1.codePointAt(4));
		System.out.println(cad1.codePointBefore(4));
		System.out.println(cad1.codePointCount(3,4));
		System.out.println(cad1.compareTo(cad2));
		System.out.println(cad1.equals(cad2));
		System.out.println(cad1.concat(cad2));
		System.out.println(cad1.contains("El Chapo"));
		System.out.println(String.valueOf(115));
		System.out.println(cad1.endsWith("Culiacán."));
		System.out.println(cad2.trim()+cad2.trim());
		System.out.println(cad1.indexOf('s')); //Non greedy
		System.out.println(cad1.lastIndexOf('s')); //Greedy
		System.out.println(cad1.length());
		
		String[] cads = cad1.split(",");
		/*for(String c:cads)
		{
			System.out.println(c);
		}*/
		for(int i=0;i<cads.length;i++)
			System.out.println(cads[i]);
		String cad3="";
		cad3 = cad1.replace('a', 'e');
		System.out.println(cad3);
		System.out.println(cad3.toLowerCase());
		System.out.println(cad3.toUpperCase());
		
		//Algorithm for reversing strings
		String reversedString="";
		for(int index=cad1.length()-1;index>=0;index--)
		{
			reversedString=reversedString+cad1.charAt(index);
		}
		System.out.println(reversedString);
	
		
		System.out.println(camote[0]);
		System.out.println(camote[1]);
		System.out.println(camote[2]);
		System.out.println(camote[3]);
		
		String[] misCadenas = {cad1, cad2, cad3};
		String[] misNuevasCadenas = Tuneador.tunea(misCadenas);
		for(int i=0;i<misNuevasCadenas.length;i++)
		{
			System.out.println(misNuevasCadenas[i]);
		}
		int[] misEnteros = {5,7,2,3,5,8,1,5,6,7,9};
		System.out.println("La media es:"+Tuneador.mediaVector(misEnteros));
	}

}
