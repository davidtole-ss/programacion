Algoritmo ejercicio10
	Definir nota,sumaNotas,notaMaxima,notaMinima,maximoAlumnos,numeroAlumno,aprobados,suspensos  Como Entero
	Definir seguir Como Logico
	seguir=Verdadero
	maximoAlumnos=0
	numeroAlumno=1
	Mientras maximoAlumnos<31 y seguir=Verdadero Hacer
		Escribir 'Introduce la nota del alumno nº',numeroAlumno
		Leer nota
		si maximoAlumnos=0
			notaMinima=nota
		FinSi
		si nota>=0 y nota<=10
			sumaNotas=sumaNotas+nota
			maximoAlumnos=maximoAlumnos+1
			numeroAlumno=numeroAlumno+1
			si nota>notaMaxima
				notaMaxima=nota
			FinSi
			si nota<notaMinima
				notaMinima=nota
				
			FinSi
			si nota>=5
				aprobados=aprobados+1
			SiNo
				suspensos=suspensos+1
			FinSi
		SiNo
			seguir=Falso
		FinSi
	Fin Mientras
	si sumaNota>=0 y sumaNotasnota<=10
		Escribir 'La media de las notas es = ',sumaNotas/maximoAlumnos
		Escribir 'La nota minima es ',notaMinima
		Escribir 'La nota maxima es ',notaMaxima
		Escribir 'Hay ',aprobados,' aprobados, y ',suspensos,' suspensos'
	FinSi
	
	
FinAlgoritmo
