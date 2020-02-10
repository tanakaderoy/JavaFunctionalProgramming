package programming;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FP03 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        Function<Integer, Integer> squareFunction = n -> n * n;
        Consumer<Integer> sysoutConsumer = System.out::println;
//        filterAndPrint(nums, n1 -> n1 % 2 == 0);
//        filterAndPrint(nums, n -> n % 2 != 0);
//        behavior parameterization
        Supplier<Integer> randomIntegerSupplier =() ->{
            Random random = new Random();
            return  random.nextInt(10);
        };
//        System.out.println(randomIntegerSupplier.get());
        UnaryOperator<Integer> threeToThePowerOfX = (x) -> (int)(Math.pow(3,x));
//        System.out.println(threeToThePowerOfX.apply(3));
        BiPredicate<Integer,String>  biPredicate = (num,str) -> num<10 && str.length()>5;
//        System.out.println(biPredicate.test(4,"Squadeded Up"));
BiFunction<Integer,String,Boolean> biFunction = (num,str)->num<10 && str.length()>5;
//        System.out.println(biFunction.apply(4,"Squadededed Up"));
        IntConsumer intConsumer = new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println(value);
            }
        };
       intConsumer.accept(4);

    }

    private static void filterAndPrint(List<Integer> nums, Predicate<Integer> predicate) {
        nums.stream().filter(predicate).forEach(System.out::println);
    }




}


