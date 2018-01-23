package hello;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFilesandFolders {


    public void deleteForderRecursively(String directoryToDelete) throws IOException {
        for(Path p : Files.walk(directoryToDelete).
                sorted((a, b) -> b.compareTo(a)). // reverse; files before dirs
                toArray(Path[]::new))
        {
            Files.delete(p);
        }
    }
}
