package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class FileEncoderAndDecoder {
    public static void main(String[] args) {
        try {
            // Replace with actual paths on your system
            String inputFilePath = "C:\\Users\\mylaptop\\OneDrive\\Desktop\\inputfilepath.txt";
            String outputFilePath = "C:\\Users\\mylaptop\\OneDrive\\Desktop\\outputfilepath.txt";

            // Encode the file to a Base64 string
            String encodeStr = encodeFile(inputFilePath);
            System.out.println("Encoded Base64 String: " + encodeStr);

            // Decode the Base64 string back to a file
            decodeFile(encodeStr, outputFilePath);
            System.out.println("File decoded successfully to " + outputFilePath);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    private static void decodeFile(String encodeStr, String outputFilePath) throws IOException {
        byte[] decodedBytes = Base64.getDecoder().decode(encodeStr);
        Files.write(Paths.get(outputFilePath), decodedBytes);
    }

    private static String encodeFile(String inputFilePath) throws IOException {
        byte[] fileContent = Files.readAllBytes(Paths.get(inputFilePath));
        return Base64.getEncoder().encodeToString(fileContent);
    }
}
