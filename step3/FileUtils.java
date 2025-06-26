package Aston.step3;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public class FileUtils {
    public static void main(String[] args) {
        String fileInputPath = "C:\\Users\\Даниил\\Jaba\\src\\Aston\\step3/input.txt";
        String fileOutputPath = "C:\\Users\\Даниил\\Jaba\\src\\Aston\\step3/output.txt";
        List<String> list = new ArrayList<>();
        try {
            fileRead(fileInputPath,list);
            if (!list.isEmpty()) {
                System.out.println(list);
                fileWrite(fileOutputPath, list);
            } else
                System.out.print("Файл не содержит данных.");
        }
        catch (MyException e) {
            System.err.println("Ошибка при обработке файла: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void fileRead(String inputPath, List<String> list) throws MyException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            System.out.print("Содержимое файла: ");
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            throw new MyException("Ошибка при чтении файла: " + inputPath, e);
        }
    }

    public static void fileWrite(String outputPath, List<String> list) throws MyException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (String s : list) {
                writer.write(String.valueOf(s) + '\n');
            }
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            throw new MyException("Ошибка при записи в файл: " + outputPath, e);
        }
    }
}
