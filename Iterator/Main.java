import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Add Pokemon
        PokemonCollection collection = new PokemonCollection();
        collection.addPokemon(new Pokemon("Pikachu", "Electric"));
        collection.addPokemon(new Pokemon("Charmander", "Fire"));
        collection.addPokemon(new Pokemon("Squirtle", "Water"));
        collection.addPokemon(new Pokemon("Bulbasaur", "Grass"));

         // Iteratorを使ってコレクションの本を反復処理
        Iterator<Pokemon> iterator = collection.iterator();

        while (iterator.hasNext()) {
            Pokemon pokemon = iterator.next();
            System.out.println(pokemon);
        }
    }
}