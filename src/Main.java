
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> colerMap = new HashMap<String,String>();
        colerMap.put("black", "0,1");
        colerMap.put("brown", "1,10");
        colerMap.put("red", "2,100");
        colerMap.put("orange", "3,1000");
        colerMap.put("yellow", "4,10000");
        colerMap.put("green", "5,100000");
        colerMap.put("blue", "6,1000000");
        colerMap.put("violet", "7,10000000");
        colerMap.put("grey", "8,100000000");
        colerMap.put("white", "9,1000000000");

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        sc.close();

        String[] get1 = colerMap.get(a).split(",");
        String[] get2 = colerMap.get(b).split(",");
        String[] get3 = colerMap.get(c).split(",");

        Long result = Long.parseLong(get1[0]+get2[0]) * Long.parseLong(get3[1]);
        System.out.println(result);

    }
}
