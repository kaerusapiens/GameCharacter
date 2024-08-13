# Iterator


### まとめ

Iterator。反復子。

全体を順番でスキャンしていく処理を行うためのもの
```java
while (iterator.hasNext()) {
    Pokemon pokemon = iterator.next();
    System.out.println(pokemon.getName());
})
```
### メリット
コレクションの内部実装（例えば、リストやセットの具体的なデータ構造）に依存せずに、コレクションの要素にアクセスできます。これにより、データ構造を変更しても、Iteratorを使ったアクセス方法は変わりません。


### Class map
```mermaid
classDiagram
    %% Define the Pokemon class
    class Pokemon {
        +String name
        +String type
        +Pokemon(String name, String type)
        +String getName()
        +String getType()
        +String toString()
    }

    %% Define the PokemonCollection class
    class PokemonCollection {
        -List<Pokemon> pokemons
        +PokemonCollection()
        +void addPokemon(Pokemon pokemon)
        +Iterator<Pokemon> iterator()
    }

    %% Define the PokemonIterator class (inner class of PokemonCollection)
    class PokemonIterator {
        -int currentIndex
        +boolean hasNext()
        +Pokemon next()
    }

    %% Define the Main class
    class Main {
        +void main(String[] args)
    }

    %% Define relationships
    PokemonCollection --> Pokemon : contains
    PokemonCollection --> PokemonIterator : uses
    Main --> PokemonCollection : uses
```