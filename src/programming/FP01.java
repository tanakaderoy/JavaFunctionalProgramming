package programming;

import java.util.List;

public class FP01 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(12, 9, 13, 4, 6, 2, 12, 15);
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices", "Kubernetes");
//        courses.forEach(System.out::println);
//        courses.stream().filter((c)-> c.contains("Spring")).forEach(System.out::println);
//        courses.stream().filter((c)-> c.length() > 4).forEach(System.out::println);
//        printAllNumbersInList(list);
//        printAllEvenNumbersInList(list);
        printSquaresOfEvenNumbers(nums);
        courses.stream().map(String::length).forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbers(List<Integer> nums) {
        nums.stream().filter(FP01::isEven).map((num)-> Math.pow(num,2)).forEach(System.out::println);
    }

    private static void printAllEvenNumbersInList(List<Integer> nums) {
        nums.stream().filter(FP01::isEven).forEach(System.out::println);//Method Reference ClassName::Method in class
    }

    private static Boolean isEven(int num) {
        return num % 2 == 0;
    }
    private static Boolean isOdd(int num) {
        return num % 2 != 0;
    }

    private static void printAllNumbersInList(List<Integer> nums) {
        nums.forEach(System.out::println);
//        for(int num : nums){
//            System.out.println(num);
//        }
//        for(int i = 0; i<nums.size();i++){
//            System.out.println(nums.get(i));
//        }
    }


    public static void print(int number) {
        System.out.println(number);
    }


}
