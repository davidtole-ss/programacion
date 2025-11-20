Algoritmo ejercicio1
	Definir pagos Como Entero
	Definir pagoAcumulado Como Entero
	pagos=5
	pagoAcumulado=0
	Para x<-1 Hasta 12 Con Paso x+1 Hacer
		pagoAcumulado=pagoAcumulado+pagos
		pagos=pagos*2
	Fin Para
Escribir 'Despues de los 12 meses pago ',pagoAcumulado, '$'
	
FinAlgoritmo
