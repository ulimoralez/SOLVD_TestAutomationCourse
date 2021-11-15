package homework4.readText;

import homework4.Child;

import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadText {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(ReadText.class.getName());
        String fileName = "E://Github//SolvdCourse//src//homework4//readText//text.txt";
        FileHandler fh = new FileHandler("src/homework4/readText/Logs.txt");
        String line;
        File file = new File(fileName);
        FileReader fr = new FileReader(file);

        logger.addHandler(fh);
        logger.setLevel(Level.ALL);

        try (BufferedReader br = new BufferedReader(fr)){
            while((line = br.readLine()) != null){
                logger.info(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
