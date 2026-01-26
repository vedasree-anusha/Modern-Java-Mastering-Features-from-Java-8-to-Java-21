import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biconsumerAddition = (a,b) -> System.out.println(a+b);
        biconsumerAddition.accept(10, 5);

        BiConsumer<Integer, Integer> biConsumerDivision = (a,b) -> System.out.println(a/b);
        biConsumerDivision.accept(10, 5);

        biconsumerAddition.andThen(biConsumerDivision).accept(20, 5);

    }
}
