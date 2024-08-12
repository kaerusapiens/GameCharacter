class Wizard extends Character {
    // コンストラクタ: 名前と体力を設定
    public Wizard(String name, int health) {
        super(name, health);
    }

    // 攻撃メソッドの具体的な実装
    @Override
    public int attack(Character target) {
        int damage = 10; // 攻撃ダメージ
        System.out.println(getName() + "が" + target.getName() + "にファイアボールを唱えました!" + "\nダメージ:-" + damage);
        target.takeDamage(damage);
        return damage;
    }
}