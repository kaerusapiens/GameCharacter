class Warrior extends Character {
    // コンストラクタ: 名前と体力を設定
    public Warrior(String name, int health) {
        super(name, health);
    }

    // 攻撃メソッドの具体的な実装
    @Override
    public int attack(Character target) {
        int damage = 15; // 攻撃ダメージ
        System.out.println(getName() + "が" + target.getName() + "に剣を振りました!"+ "\nダメージ:-" + damage);
        target.takeDamage(damage); // 例として15のダメージを与える
        return damage;
    }
}