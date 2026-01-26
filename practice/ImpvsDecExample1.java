//Example 1 for imperative vs declarative programming
//Imperative is normal programming where we define how the algorithm runs and gives output
//Declarative is where we just ask what we want, no idea about how its executing


import java.util.stream.IntStream;

public class ImpvsDecExample1{
    public static void main(String[] args){
        //imperative

        int sum = 0;
        for(int i=0;i<=100;i++)
        {
            sum+=i;
        }
        System.out.println("Imperative programming: "+sum);

        //declarative style 

        int sum1 = IntStream.rangeClosed(0, 100).sum();

        System.out.println("Declarative programming: "+sum1);
    }

}