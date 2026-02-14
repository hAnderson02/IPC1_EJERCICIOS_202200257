Algoritmo piramide
	//definimos los espacios y asteriscos como caracter
	definir asterisco, espacios Como caracter;
	//definimos niveles, i y j como valores enteros
	definir niveles, i, j como entero;
	
	//Pedimos los niveles de la piramide
	Escribir "De cuantos niveles sera la piramide";
	leer niveles
	
	//comenzamos el comando para generar la piramide
	Para i <- 1 Hasta niveles Con Paso 1 Hacer
		
		//damos valor a los caracteres
		asterisco <- "";
		espacios <- "";
		
		//definimos el espacio necesario para que se de una forma de piramide
		Para j <- 1 Hasta niveles - i Con Paso 1 Hacer
			espacios <- espacios + " "
		Fin Para
		
		//definimos los asteriscos para formar la piramide
		Para j <- 1 Hasta (2*i - 1) Con Paso 1 Hacer
			asterisco <- asterisco + "*"
		Fin Para
		
		//generamos cada nivel de la piramide
		escribir espacios, asterisco
	Fin Para
	
FinAlgoritmo
