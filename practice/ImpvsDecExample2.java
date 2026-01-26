//Imperative vs Declarative to remove duplicates from a list

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class ImpvsDecExample2 {
    public static void main(String[] args) {
        
        //Imperative programming

        List<Integer> intList =  Arrays.asList(1,1,2,2,4,4,6,6,9,9,3,5,7,8,10,10);
        List<Integer> uniqueList = new ArrayList<>();

        for( Integer number: intList){
            if(!uniqueList.contains(number)){
                uniqueList.add(number);
            }
        }
        System.out.println("uniqueList: "+uniqueList);

        //Declarative

        List<Integer> uniqueList2 = intList.stream().
                                            distinct().
                                            collect(Collectors.toList());

        System.out.println("uniqueList2: "+uniqueList2);
    }
}
