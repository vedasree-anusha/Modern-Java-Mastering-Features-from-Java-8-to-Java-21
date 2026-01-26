public class LambdaExample1 {
    public static void main(String[] args) {

        //without Lambda
        Runnable runnable = new Runnable() {
            @Override
            public void run()
            {
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable).start();

        //With Lambda
        Runnable runnable2 = () -> System.out.println("Inside runnable 2");
        new Thread(runnable2).start();

        Runnable runnable3 = () -> {
            System.out.println("Inside runnable 3.1");
            System.out.println("Inside runnable 3.2");
        };

        new Thread(runnable3).start();

        new Thread(() -> System.out.println("Inside runnable 4")).start();

        //without lambda
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Inside runnable 4.1");
            }
        }).start();

        IAnimal animal = (String food) -> {
            System.out.println("This animal eats "+food);
            if(food.equals("grass"))
                return 200;
            else if(food.equals("pedigree"))
                return 1000;
            return 0;
        };

        System.out.println("Cow: ");
        System.out.println("Cost of feeding is: "+animal.feeding("grass"));

        System.out.println("Dog: ");
        System.err.println("Cost of feeding is: "+animal.feeding("pedigree"));
    }
}
