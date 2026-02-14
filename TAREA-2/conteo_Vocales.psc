Algoritmo conteo_Vocales
	definir palabra como cadena; definir letra como caracter
	definir i, conteo Como entero
	
	conteo <- 0
	
	//Solicitamos la palabra
	Escribir "Escribe una palabra"
	Leer palabra
	
	//Convertimos todos los caracteres de la palabra en minúsculas
	palabra <- Minusculas(palabra)
	
	//usamos la condición de "para"
	Para i <- 1 Hasta Longitud(palabra) Con Paso 1 Hacer
		
		//separamos la cadena por medio de la pos
		letra <- Subcadena(palabra, i, i)
		
		//usamos la conducion "if", para determinar si el caracter es una vocal
		Si letra = "a" o letra = "e" o letra = "i" o letra = "o" o letra = "u" Entonces
			conteo <- conteo + 1
		Fin Si
	Fin Para
	
	Escribir "La palabra: ", palabra, ", contiene ", conteo, " vocales."
	
FinAlgoritmo
