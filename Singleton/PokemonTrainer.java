public class PokemonTrainer {
    private static PokemonTrainer instance;
    private String name; 

    // トレーナーのConstructor作成
    private PokemonTrainer() {
        this.name = "Satoshi"; 
    }

    // Singleton：the single instance of the class
    public static PokemonTrainer getInstance() {
        if (instance == null) {
            instance = new PokemonTrainer();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Catch a Pokémon
    public void catchPokemon(String pokemon) {
        System.out.println(name + " caught a " + pokemon + "!");
    }

    public void showTrainer() {
        System.out.println("Trainer: " + name);
    }
}