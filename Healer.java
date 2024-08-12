class Healer extends Character {
    // コンストラクタ: 名前と体力を設定
    public Healer(String name, int health) {
        super(name, health);
    }

    // 攻撃メソッドの具体的な実装
    @Override
    public int attack(Character target) {
        int damage = 5; // 基本的な攻撃ダメージ
        System.out.println(getName() + "が" + target.getName() + "にスタッフで攻撃しました!" + "\nダメージ:-" + damage);
        target.takeDamage(damage); // 例として5のダメージを与える
        return damage;
    }

    // 回復機能を追加
    public int heal(Character target) {
        int healAmount = 20; // 回復量
        System.out.println(getName() + "が " + target.getName() + " を回復しました!"+ "\n回復量:+" + healAmount);
        target.heal(healAmount); // 例として20の体力を回復
        return healAmount;
    }
    }