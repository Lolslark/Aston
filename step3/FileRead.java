package Aston.step3;

import java.io.*;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.List;

public class FileRead {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Даниил\\Jaba\\src\\Aston\\step3/input.txt";
        String filePath2 = "C:\\Users\\Даниил\\Jaba\\src\\Aston\\step3/output.txt";
        List<String> list = new ArrayList<>();
        fileRead(filePath,list);
        print(list);
        fileWrite(filePath2, list);
    }

    public static void fileRead(String inputPath, List list) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            System.out.println("Содержимое файла:");
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void fileWrite(String outPath, List list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outPath))) {
                for (int i = 0; i < list.size(); i++) {
                    writer.write(String.valueOf(list.get(i)) + '\n');
                }
                System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void print(List list) {
        System.out.println(list);
    }
}
