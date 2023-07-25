import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> myArraylist = new ArrayList<>();
        myArraylist.add("String1");
        myArraylist.add("String2");
        myArraylist.add("String3");
        System.out.println( myArraylist.get(2));
        for (String m : myArraylist){
            System.out.println(m);
        }


        //HashMap(key,value)
        HashMap<Integer , String> myUserHashMap = new HashMap<>();
        myUserHashMap.put(1,"User1");
        myUserHashMap.put(2,"User2");
        myUserHashMap.put(3,"User3");
        System.out.println(myUserHashMap.get(1));


        // HashSet
        HashSet<String> myHashset = new HashSet<>();
        myHashset.add("set1");
        myHashset.add("set2");
        myHashset.add("set2");
        myHashset.add("set3");
        System.out.println(myHashset.size());//3

    }
}