SubProceso tablaMultiplicar (numero)
	Para x=1 Hasta 10 Con Paso 1 Hacer
		Escribir numero,'*',x,'=',numero*x
	Fin Para
FinSubProceso


Algoritmo Ej5
	Definir numero Como Entero
	Escribir 'Introduce un numero'
	Leer numero
	tablaMultiplicar(numero)
FinAlgoritmo
