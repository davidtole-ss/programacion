SubProceso intercambio(numero1 Por Referencia,numero2 Por Referencia)
	temporal=numero1
	numero1=numero2
	numero2=temporal
FinSubProceso


Algoritmo Ej3
	Definir numero1,numero2 Como Entero
	Escribir 'Introduce el numero 1'
	Leer numero1
	Escribir 'Introduce el numero 2'
	Leer numero2
	Escribir 'El valor de a y b ahora es:',numero1,' ',numero2
	intercambio(numero1,numero2)
	Escribir 'El valor de a y b despues es:',numero1,' ',numero2
	
FinAlgoritmo
