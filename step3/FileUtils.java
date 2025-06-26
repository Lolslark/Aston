package Aston.step3;

import java.io.*;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.List;

public class FileUtils {
    public static void main(String[] args) {
        String fileInputPath = "C:\\Users\\Даниил\\Jaba\\src\\Aston\\step3/input.txt";
        String fileOutputPath = "C:\\Users\\Даниил\\Jaba\\src\\Aston\\step3/output.txt";
        List<String> list = new ArrayList<>();
        try {
            fileRead(fileInputPath,list);
            if (!list.isEmpty()) {
                print(list);
                fileWrite(fileOutputPath, list);
            }
            else System.out.print("файл не содержит данных.");
        }
        catch (MyException e) {
            System.err.println("Ошибка при обработке файла: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void fileRead (String inputPath, List<String> list) throws MyException {
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

    public static void fileWrite(String outPath, List<String> list) throws MyException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outPath))) {
            for (String s : list) {
                writer.write(String.valueOf(s) + '\n');
            }
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            throw new MyException("Ошибка при записи в файл: " + outPath, e);
        }
    }

    public static void print(List<String> list) {
        System.out.println(list);
    }
}
