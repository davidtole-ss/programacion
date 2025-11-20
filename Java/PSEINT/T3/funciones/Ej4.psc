Funcion  variableResultado<-parImpar (numero)
	Si numero%2==0
		variableResultado=Verdadero
	SiNo
		variableResultado=Falso
	FinSi
	
FinFuncion

Algoritmo Ej4
	Definir numero como Entero
	Definir resultado Como Logico
	Escribir 'Introduce un numero'
	Leer numero
	resultado=parImpar(numero)
	Escribir resultado
FinAlgoritmo
