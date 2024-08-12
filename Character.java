// 抽象クラス 
abstract class Character {
    private String name; // キャラクターの名前
    private int health;  // キャラクターのHP

    // コンストラクタ: 名前とHPを設定
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // 名前を取得するメソッド
    public String getName() {
        return name;
    }

    // HPを取得するメソッド
    public int getHealth() {
        return health;
    }

    // ダメージを受けるメソッド
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    // HPを回復するメソッド
    public void heal(int amount) {
        health += amount;
    }

    // 抽象メソッド: サブクラスで具体的に実装する必要がある
    public abstract int attack(Character target);
}
