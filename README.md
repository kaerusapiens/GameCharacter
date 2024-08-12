# Game Charater Class making test
- Sample Java code to run Java class
- Study design pattern & UML

# Class Map
```mermaid
classDiagram
    class Character {
        - String name
        - int health
        + Character(String name, int health)
        + String getName()
        + int getHealth()
        + void takeDamage(int damage)
        + void heal(int amount)
        + abstract int attack(Character target)
        + abstract int heal(Character target)
    }

    class Wizard {
        + Wizard(String name, int health)
        + int attack(Character target)
    }

    class Warrior {
        + Warrior(String name, int health)
        + int attack(Character target)
    }

    class Healer {
        + Healer(String name, int health)
        + int attack(Character target)
        + int heal(Character target)
    }

    Character <|-- Wizard
    Character <|-- Warrior
    Character <|-- Healer