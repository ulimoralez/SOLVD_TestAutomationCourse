package homework6.customLogger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomLogger {
    private Logger logger;
    private FileHandler fileHandler;

    {
        try {
            fileHandler = new FileHandler("src/homework6/Log.txt");
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public CustomLogger(String className) throws IOException {
        this.logger = Logger.getLogger(className);
    }

    public void setFileLogPath(String path) throws IOException {
        this.fileHandler = new FileHandler(path);
    }
}
