public class StringManipulation {
    public static void main(String[] args) {
        String name="joana";

        boolean result=name.equals("joana");            //true
        System.out.println(result);

        result=name.equals("Joana");                    //false
        System.out.println(result);

        result=name.equalsIgnoreCase("Joana");      //true
        System.out.println(result);

        char res=name.charAt(0);                //j
        System.out.println(res);

        int ind=name.indexOf("o");            //1
        System.out.println(ind);

        boolean mpt=name.isEmpty();            //false
        System.out.println(mpt);

        String up=name.toUpperCase();            //JOANA
        System.out.println(up);

        String low=name.toLowerCase();            //joana
        System.out.println(low);

        String untrimmed="   joana   ";
        String trimmed=untrimmed.trim();            //joana
        System.out.println(trimmed);

        String repl=name.replace("jo", "Jo");            //Joana
        System.out.println(repl);
    }
}
