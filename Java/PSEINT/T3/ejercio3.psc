Algoritmo ejercio
	//Definimos las varibles
	Definir nota Como Entero
	Escribir 'Inserta una nota entre el 0 y el 10'
	Leer nota
	//Comprobamos la nota
	Si nota <=4
		Escribir 'Suspenso'
	SiNo
		Si nota==5 o nota==6
			Escribir 'Aprobado'
		SiNo
			Si nota==7 o nota==8
				Escribir 'Notable'
			SiNo
				Si nota==9 o nota==10
					Escribir 'Sobresaliente'
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
