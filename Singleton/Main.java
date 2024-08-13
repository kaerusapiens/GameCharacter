public class Main {
    public static void main(String[] args) {
        // Attempt to create multiple instances
        PokemonTrainer trainer1 = PokemonTrainer.getInstance();
        PokemonTrainer trainer2 = PokemonTrainer.getInstance();

        //トレーナー名前設定
        trainer1.setName("Satoshi");


        // Pokémonゲットだぜ
        trainer1.catchPokemon("Pikachu");
        trainer2.catchPokemon("Mew");

        // 同じインスタンスがでるだぜ
        if (trainer1 == trainer2 && trainer1.getName().equals(trainer2.getName())) {
            System.out.println("Both trainer1 and trainer2 are the same instance with the name: " + trainer1.getName());
        } else {
            System.out.println("trainer1 and trainer2 are different instances or have different names.");
        }

        // 最後トレーナーの名前確認
        trainer1.showTrainer();
        trainer2.showTrainer();
    }
}