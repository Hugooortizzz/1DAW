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

Funcion j<-partida(jugador1, jugador2)
	Definir pj1, pj2, j como Entero;
	
	
	pj1 = sacaCarta(jugador1);
	pj2 = sacaCarta(jugador2);
	
	Si (pj1 > pj2) Entonces
		j = 1;
	SiNo 
		Si (pj2 > pj1) Entonces
			j = 2;
		SiNo
			j = 0;
		FinSi
	FinSi


FinFuncion

Funcion n<-sacaCarta(jugador)
	Definir p, n como Entero;
	Escribir "Tirada de " jugador " :";
	n = ncarta;
	p = pcarta;
	
	
FinFuncion

Funcion f<-finJuego(carteraj1, carteraj2, apuesta)
	Definir f como Logico;
	f <- Verdadero;
	
	Si carteraj1 < apuesta o carteraj2 < apuesta Entonces
		f = Falso;
	FinSi
FinFuncion

Algoritmo juegocartaspreexamen
	Definir jugador1, jugador2 como Cadena;
	Definir resultado, carteraj1, carteraj2, apuesta como Entero;
	
	
	jugador1 = lee_texto("Introduzca el nombre del jugador 1");
	carteraj1 = lee_numero("Introduzca el saldo total del jugador 1");
	
	jugador2 = lee_texto("Introduzca el nombre del jugador 2");
	carteraj2 = lee_numero("Introduzca el saldo total del jugador 2");
	
	Repetir
		apuesta = lee_numero("Cuál va a ser la apuesta de esta ronda?");
		
		resultado = partida(jugador1, jugador2);
		
		Segun resultado Hacer
		1:
			Escribir "Ha ganado " jugador1;
			carteraj1 = carteraj1 + apuesta;
			carteraj2 = carteraj2 - apuesta;
		2:
			Escribir "Ha ganado " jugador2;
			carteraj1 = carteraj1 - apuesta;
			carteraj2 = carteraj2 + apuesta;
		De Otro Modo:
			Escribir "Habéis empatado";
		Fin Segun
		
		Escribir "Cartera " jugador1 " : " carteraj1;
		Escribir "Cartera " jugador2 " : " carteraj2;
		Esperar Tecla;
		Limpiar Pantalla;
	
	Mientras Que finJuego(carteraj1, carteraj2, apuesta);
	
	Si carteraj1 < apuesta Entonces
		Escribir "Ha ganado " jugador2;
	SiNo
		Escribir "Ha ganado " jugador1;
	FinSi

	
FinAlgoritmo
