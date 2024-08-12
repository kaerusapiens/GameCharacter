public class Main {
    public static void main(String[] args) {
        // キャラクターを作成
        Wizard wizard = new Wizard("ガンダルフ", 100);
        Warrior warrior = new Warrior("アラゴルン", 120);
        Healer healer = new Healer("エルロンド", 80);

        // 攻撃前の体力を表示
        System.out.println("攻撃前:");
        System.out.println(wizard.getName() + "の体力: " + wizard.getHealth());
        System.out.println(warrior.getName() + "の体力: " + warrior.getHealth());

        // キャラクターの攻撃テスト
        System.out.println("\n攻撃");
        wizard.attack(warrior); // ガンダルフの攻撃ダメージ
        warrior.attack(wizard); // アラゴルンの攻撃ダメージ
        healer.heal(wizard); // エルロンドのヒール量

        // 攻撃後の体力を表示
        System.out.println("\n攻撃後:");
        System.out.println(wizard.getName() + "の体力: " + wizard.getHealth());
        System.out.println(warrior.getName() + "の体力: " + warrior.getHealth());
    }
}