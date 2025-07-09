import java.util.ArrayList;

public class ArrayList2d{
    public static void main(String[] args){
        ArrayList<ArrayList<String>> partyList=new ArrayList<ArrayList<String>>();
        
        ArrayList<String> drinkList=new ArrayList<String>();
        drinkList.add("tsipouro");
        drinkList.add("ouzo");
        drinkList.add("gin");

        ArrayList<String> sodaList=new ArrayList<String>();
        sodaList.add("tonic");
        sodaList.add("cola");
        sodaList.add("soda");
        
        ArrayList<String> foodList=new ArrayList<String>();
        foodList.add("pitogiro");
        foodList.add("pizza");

        //add all the 3 arraylists to partyList
        partyList.add(drinkList);
        partyList.add(sodaList);
        partyList.add(foodList);

        //print all the arraylist elements of partyList
        //[[tsipouro, ouzo, gin], [tonic, cola, soda], [pitogiro, pizza]]
        System.out.println(partyList);

        //print specific arraylist element
        //[pitogiro, pizza]
        System.out.println(partyList.get(2));

        //print specific element of arraylist
        //pizza
        System.out.println(partyList.get(2).get(1));
    }
}