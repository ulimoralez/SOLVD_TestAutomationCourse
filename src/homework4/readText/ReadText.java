package homework4.readText;

import java.io.*;

public class ReadText {
    public static void main(String[] args) throws IOException {
        String fileName = "E://Github//SolvdCourse//src//homework4//readText//text.txt";
        String line;
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(fr)){
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
