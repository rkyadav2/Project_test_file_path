package hello;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePaths {

    public void createNewPaths() {
        Path path = Paths.get("C:\\Ram\\Background\\..\\Foreground\\Necklace\\..\\Earrings\\..\\Etc");

        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            System.err.println("Cannot create directories - " + e);
        }

    }


    public void createNewPathsRelative() throws IOException {
        File path = new File("tmp/ram/test");

        if (!path.exists()) {
            if (path.mkdirs()) {
                System.out.println("Multiple directories are created!");
            } else {
                System.out.println("Failed to create multiple directories!");
            }
        }
        File tmp = new File (path, "newFile.txt");
        tmp.createNewFile();

    }

}
