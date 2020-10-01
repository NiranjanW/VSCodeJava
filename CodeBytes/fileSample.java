package CodeBytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class fileSample {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        try (Stream<String> stream = Files.lines(Paths.get("C:\\temp\\test.txt")) ) {

            list = stream
                    .filter(line -> line.startsWith("Fox"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

            // stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();

     } 
     list.forEach(System.out::println);
    }
}
