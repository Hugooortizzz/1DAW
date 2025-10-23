//Funcion introduccion
//	Escribir "Bienvenidos al Juego de Cartas"; Esperar 3 segundos;
//	Escribir "El juego pedirá el nombre de los dos jugadores, más su presupuesto"; Esperar 3 segundos
//	Escribir "Luego, se pedirá una apuesta, y se sacarán dos cartas aleatorias"; Esperar 3 segundos
//	Escribir "Pulsa una tecla para comenzar";
//	Esperar Tecla;
//	Limpiar Pantalla
//FinFuncion

Funcion t<-lee_texto(mensaje)
	Definir t como Cadena;
	Escribir mensaje;
	Leer t;
FinFuncion

Funcion n<-lee_numero(mensaje)
	Definir n como numero;
	Escribir mensaje;
	Leer n;
FinFuncion

Funcion c<-ncarta
    // función que realizar un sorteo para seleccionar un número de carta
    // muestra por pantalla el número o figura en texto
    // retorna el valor númerico de 1 a 12 de la carta para poder comparar número entre dos cartas distintas
    
    Definir c como entero;
    c=azar(12)+1;
    segun c Hacer
        1: Escribir "El AS " sin saltar;
        2: Escribir "El Dos " sin saltar;
        3: Escribir "El Tres " sin saltar;
        4: Escribir "El Cuatro " sin saltar;
        5: Escribir "El Cinco " sin saltar;
        6: Escribir "El Seis " sin saltar;
        7: Escribir "El Siete " sin saltar;
        8: Escribir "El Ocho " sin saltar;
        9: Escribir "El Nueve " sin saltar;
        10: Escribir "La Sota " sin saltar;
        11: Escribir "El Caballo " sin saltar;
        12: Escribir "El Rey " sin saltar;
    FinSegun
    
FinFuncion

Funcion p<-pcarta
    // Función que realizaun sorteo para selecionar el palo
    // muestra por pantalla el palo en texto 
    // retorna un valor numérico de 1 a 4 para poder comparar palos entre dos cartas distintas
    Definir p como entero;
    p=azar(4)+1;
    Segun p Hacer
        1: Escribir "de Oros";
        2: Escribir " de Copas";
        3: Escribir "de Espadas";
        4: Escribir "de Bastos";
    FinSegun
    
FinFuncion

Funcion n<-sacacarta(jugador)
	Escribir "Tirada de " jugador ":"
	Definir p como Entero;
	Definir n como Entero;
	
	n = ncarta;
	p = pcarta;
	
FinFuncion

Funcion j<-partida(jugador1, jugador2)
	Definir j como Entero;
	Definir tj1, tj2 como Entero;
	
	tj1 = sacacarta(jugador1);
	Esperar Tecla
	Escribir "-----------------------------------------------------"
	tj2 = sacacarta(jugador2);
	Esperar Tecla
	
	Si tj1 > tj2 Entonces
		j = 1
	SiNo
		Si tj2 > tj1 Entonces
			j = 2
		SiNo
			j = 0
		FinSi
	FinSi

FinFuncion

Funcion f<-finJuego(carteraj1, carteraj2, apuesta)
	Definir f como Logico;
	f <- Verdadero;
	
	Si carteraj1 < 1 o apuesta < 1 Entonces
		f = Falso
	FinSi
FinFuncion

Algoritmo Juego_Cartas
//	introduccion;
	Definir jugador1 como Texto;
	Definir jugador2 como Texto;
	Definir ganador como Entero;
	Definir carteraj1, carteraj2 como Entero;
	Definir apuesta como Entero;
	
	
	jugador1 <- lee_texto("¿Cómo se llama el jugador 1");
	jugador2 <- lee_texto("¿Cómo se llama el jugador 2");
	
	carteraj1 = lee_numero("Con cuánto dinero va a empezar " + jugador1);
	carteraj2 = lee_numero("Con cuánto dinero va a empezar " + jugador2);
	
	Repetir 
		Limpiar pantalla;
		apuesta = lee_numero("¿Cuál va a ser la apuesta de la ronda?: ")
		
		ganador = partida(jugador1, jugador2)
		Escribir "-----------------------------------------------------"
		Segun ganador Hacer
			0:
				Escribir "Ha habido un empate";
			1:
				Escribir "Ha ganado la ronda " jugador1;
				carteraj1 = carteraj1 + apuesta;
				carteraj2 = carteraj2 - apuesta;
			2:
				Escribir "Ha ganado la ronda " jugador2;
				carteraj1 = carteraj1 - apuesta;
				carteraj2 = carteraj2 + apuesta;
				
		Fin Segun
		
		Escribir "Cartera " + jugador1 + ": " + ConvertirATexto(carteraj1);
		Escribir "Cartera " + jugador2 + ": " + ConvertirATexto(carteraj2);
		Esperar Tecla
	Mientras Que finJuego(carteraj1, cateraj2, apuesta);
	
	Escribir "-----------------------------------------------------"
	Si carteraj1 > carteraj2 Entonces
		Escribir "Ha ganado la partida " jugador1;
		
	SiNo
		Escribir "Ha ganado la partida " jugador2;
	FinSi
	
	
	
FinAlgoritmo
