package encapsulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileStore {

    private String workingDirectory;

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public void save(int id, String message) {
        Path path = getFileName(id);
        try {
            Files.write(path, message.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String read(int id) {
        Path path = getFileName(id);
        String result = null;
        try {
            List<String> lines = Files.readAllLines(path);
            result = String.join("\n", lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Path getFileName(int id) {
        return Paths.get(workingDirectory, id + ".txt");
    }
}
