import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PokemonCollection implements Iterable<Pokemon> {
    private List<Pokemon> pokemons;

    public PokemonCollection() {
        pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    @Override
    public Iterator<Pokemon> iterator() {
        return new PokemonIterator();
    }

    private class PokemonIterator implements Iterator<Pokemon> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < pokemons.size();
        }

        @Override
        public Pokemon next() {
            return pokemons.get(currentIndex++);
        }
    }
}