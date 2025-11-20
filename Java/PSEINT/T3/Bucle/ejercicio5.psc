Algoritmo ejercicio5
	Definir numero Como Entero
	Definir numeroAleatorio Como Entero
	DEFINIR ganar Como Logico
	Definir contador Como Entero
	numeroAleatorio=Aleatorio(1,50)
	contador=0
	ganar=Verdadero
	Escribir numeroAleatorio
	Mientras ganar=Verdadero y contador<6
		Escribir 'Introduce un numero'
		Leer numero
		contador=contador+1
		Si numero<numeroAleatorio
			Escribir 'Mayor'			
		SiNo
			Si numero>numeroAleatorio
				Escribir 'Menor'
			SiNo
				Escribir 'Has acertado'
				ganar=Falso
			FinSi
		FinSi
	FinMientras
	Si contador=6
		Escribir 'Superaste el limite de intentos'
	FinSi
	
FinAlgoritmo
