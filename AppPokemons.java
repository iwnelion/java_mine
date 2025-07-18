import java.util.Scanner;
public class AppPokemons {
    public static void main(String[] args) {
        //uses: Pokemon, Oshawott, Eevee
        //dynamic polymorphism: decide which pokemon to create at runtime

        Scanner sc = new Scanner(System.in);
        Pokemon pokemon;
        System.out.println("which pokemon do you want to create?");
        System.out.println("1. Eevee --- 2. Oshawott");
        int choice = sc.nextInt();

        if(choice==1){
            pokemon = new Eevee();
        }else if(choice==2){
            pokemon = new Oshawott();
        }else{
            pokemon = new Pokemon();
        }

        pokemon.speak();    //dynamic polymorphism: method call resolved at runtime
        
        sc.close();
    }
}
