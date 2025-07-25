import java.util.HashMap;

public class HashMapExample{
    public static void main(String[] args){
        //HashMap implements the Map interface (need import)
        //HashMap is similar to ArrayList, but with key-value pairs
        //stores objects, need to use Wrapper Class
        //ex. name-email, username-userID, country-capital

        //      no primitive types here! only objects (wrapper classes)
        HashMap<String,String> countries = new HashMap<String,String>();

        //add keys and values
        countries.put("greece","athens");
        countries.put("germany","berlin");
        countries.put("france","paris");
        countries.put("usa","washington dc");

        //countries.remove("usa");
        //System.out.println(countries); //{usa=washington dc, greece=athens, germany=berlin, france=paris}

        //System.out.println(countries.get("greece")); //athens

        //countries.clear();
        //System.out.println(countries); //{}

        //System.out.println(countries.size()); //4

        //                key, new value for that key
        //countries.replace("greece","thessaloniki");
        //System.out.println(countries); //{usa=washington dc, greece=thessaloniki, germany=berlin, france=paris}

        //System.out.println(countries.containsKey("england")); //false

        //System.out.println(countries.containsValue("athens")); //true

        //print everything formated
        for(String i : countries.keySet()){
            System.out.print(i+"\t"+"= ");
            System.out.println(countries.get(i));
        }
        // usa     = washington dc
        // greece  = athens
        // germany = berlin
        // france  = paris
        
    }
}