Algoritmo ejercicio9
	Definir pinCorrecto,pin,opcion,fallos Como Entero
	Definir saldo,ingreso,retirar Como Real
	Definir seguir Como Logico
	correcto=Verdadero
	pinCorrecto=1234
	seguir=Verdadero
	saldo=1000
	fallos=3
	Mientras intentos<3 Hacer
		Escribir 'Introduce el pin'
		Leer pin
		si pin=pinCorrecto
			Escribir 'El pin es correcto'
			Mientras seguir=Verdadero Hacer
				Escribir '¿Que operacion deseas relizar?'
				Escribir '1.Consultar saldo '
				Escribir '2.Ingresar dinero'
				Escribir '3.Retirar dinero'
				Escribir '4.Salir'
				Leer opcion
				Segun opcion Hacer
					1:
						Escribir 'Saldo:',saldo
					2:
						Escribir '¿Cuanto desea ingresar?'
						Leer ingreso
						saldo=saldo+ingreso
					3:
						Escribir '¿Cuanto dinero desea retirar?'
						Leer retirar
						saldo=saldo-retirar
					4:
						Escribir 'Saliendo...'
						seguir=Falso
						intentos=3
					De Otro Modo:
						Escribir 'Esta opcion no existe'
				Fin Segun
			Fin Mientras
		SiNo
			fallos=fallos-1
			Escribir'Pin incorrecto, vuelve a introducirlo, te quedan ', fallos, ' intentos'
			intentos=intentos+1
		FinSi
	Fin Mientras
FinAlgoritmo
