package DataStructure.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Integer, Character> map = new HashMap<>();
        int ind=1;
        for(char ch: str.toCharArray()){
            map.put(ind++, ch);
        }
        for (int i=1;i<= map.size();i++){
            var val = map.remove(i);
            if(map.containsValue(val)){

            }else{
                System.out.println(val);
                break;
            }
        }
    }
}
