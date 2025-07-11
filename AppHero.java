public class AppHero {
    public static void main(String[] args) {
        Hero hero=new Hero("batman", 59, 90.5);
        Hero hero2=new Hero("joker",55,71.3);

        System.out.println(hero.name);
        hero.eat();
        hero.drink();

        System.out.println(hero2.name);
        hero2.eat();
        hero2.drink();
    }
}
