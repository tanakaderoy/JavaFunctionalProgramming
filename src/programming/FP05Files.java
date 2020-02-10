package programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP05Files {
    public static void main(String[] args) {

        try {
//            Files.lines(Paths.get("input.txt")).map(s -> s.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
            Files.list(Paths.get(".")).filter(path -> {
                try {
                    return Files.isHidden(path);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return false;
            }).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
