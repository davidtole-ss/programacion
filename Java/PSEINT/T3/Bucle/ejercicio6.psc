Algoritmo ejercicio6
	Definir numero1,numero2,resultado Como Entero
	Definir operacion Como Caracter
	Definir seguir Como Logico
	Definir guardar Como Entero
	seguir=Verdadero
	Mientras seguir=Verdadero Hacer
		Escribir 'Introduce 2 números'
		Leer numero1
		Leer numero2
		Escribir 'Selecciona que operacion quieres hacer:'
		Leer operacion
		Segun operacion Hacer
			'+':
				resultado=numero1+numero2
				Escribir numero1,'+',numero2,'=',resultado
			'-':
				resultado=numero1-numero2
				Escribir numero1,'-',numero2,'=',resultado
			'*':
				resultado=numero1*numero2
				Escribir numero1,'*',numero2,'=',resultado
			'/':
				resultado=numero1/numero2
				Escribir numero1,'/',numero2,'=',resultado
			De Otro Modo:
				Escribir 'Error: El caracter introducido es incorrecto'
				seguir=Falso
		Fin Segun
		Si resultado%2=0 Entonces
			Escribir 'El numero es par'
		SiNo
			Escribir 'El numero es impar.'
		Fin Si
	Fin Mientras
		
		
		
	
FinAlgoritmo
