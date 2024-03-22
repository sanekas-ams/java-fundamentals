package edu.harbour.space.university.file.path;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        writeDataToPath(Path.of("/Users/sanekas/my_text.txt"));
    }

    private static void testPath(String fileName) throws IOException {
        Path path = Path.of(fileName);
        Files.readAllLines(path).forEach(System.out::println);
    }

    private static void writeDataToPath(Path path) throws IOException {
        List<String> list = List.of("ABC", "DEF");
        path.toFile().createNewFile();
        BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
        list.forEach(l -> {
            try {
                bufferedWriter.append(l + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
