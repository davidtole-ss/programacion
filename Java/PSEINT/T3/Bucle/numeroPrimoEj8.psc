Algoritmo numeroPrimo
	Definir numero,contadorDivisibles Como Entero
	contadorDivisibles=0
	Escribir 'Introduce un numero entero.'
	Leer numero
	si numero<=0 o numero=1
		Escribir 'Los numeros negativos, el 1 o 0 no son primos.'
	SiNo
		Para x<-1 Hasta numero+ Con Paso x+1 Hacer
			si numero%x=0
				contadorDivisibles=contadorDivisibles+1
			FinSi
		Fin Para
		si contadorDivisibles>2
			Escribir 'El número no es primo.'
		SiNo
			Escribir 'El número es primo.'
		FinSi
	FinSi
	
FinAlgoritmo
