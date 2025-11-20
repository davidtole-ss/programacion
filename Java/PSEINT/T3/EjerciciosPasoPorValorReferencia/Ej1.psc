SubProceso suma10 ( numero Por Referencia)
	numero=numero+10
	Escribir 'El valor del numero dentro del procedimiento es: ',numero
FinSubProceso

Algoritmo Ej1
	Definir numero Como Entero
	Leer numero
	Escribir 'El valor de numero ahora es: ',numero
	suma10(numero)
	Escribir 'El valor de numero despues es: ',numero
FinAlgoritmo
