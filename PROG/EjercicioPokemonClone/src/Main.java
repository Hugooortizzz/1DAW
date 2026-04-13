public class Main {
    public static void main(String[] args) {
        Pokemon[] equipo = new Pokemon[4];

        equipo[0] = new PokemonFuego("Charizard", 36, 78, 80);
        equipo[1] = new PokemonAgua("Greninja", 36, 72, 500);
        equipo[2] = new PokemonFuego("Rapidash", 40, 76, 120);
        equipo[3] = new PokemonAgua("Palkia", 47, 220, 700);


        for (int i = 0; i < equipo.length; i++) {
            equipo[i].mostrarDatos();
        }

        for (int i = 0; i < equipo.length; i++) {
            equipo[i].subirNivel();
        }

        equipo[0].atacar(equipo[1]);

        Pokemon pokemonClonado = equipo[2].clone();

        System.out.println("Original");
        equipo[2].mostrarDatos();

        System.out.println("Copia");
        pokemonClonado.mostrarDatos();

        System.out.println("Si modificamos copia");
        pokemonClonado.subirNivel();

        System.out.println("Original");
        equipo[2].mostrarDatos();

        System.out.println("Copia");
        pokemonClonado.mostrarDatos();
    }
}
