Algoritmo ejercicio7
	Definir numero Como Real
	Definir suma Como Real
	Definir contador Como Real
	Definir seguir Como Logico
	Definir media Como Real
	seguir=Verdadero
	
	Mientras seguir=Verdadero Hacer
		Escribir 'Introduce un numero positivo'
		Leer numero
		si numero>=0
			suma=suma+numero
			contador=contador+1
		SiNo
			Escribir 'El numero es negativo'
			Escribir 'El programa a terminado'
			seguir=Falso
		FinSi
	Fin Mientras
	media=suma/contador
	Escribir 'La media es: ',media
	
FinAlgoritmo
