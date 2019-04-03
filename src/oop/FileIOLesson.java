package oop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FileIOLesson {
    public static void main(String[] args) {
        String directory = "NewJavaIODirectory";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

//            List<String> fruit = new ArrayList<>();
//            fruit.add("banana");fruit.add("tomato");fruit.add("kiwi");fruit.add("orange");
//            Files.write(dataFile, fruit);
//
//            List<String> lines = Files.readAllLines(dataFile);
//            for (String line : lines) {
//                System.out.print(line);
//            }
            List<String> newList = new ArrayList<>();
            newList.add("strawberry");
            Files.write(
                    dataFile,
                    Arrays.asList("strawberry", "banana"), // list with one item
//                    newList,
                    StandardOpenOption.APPEND
            );
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        System.out.println("finished");
    }
}
