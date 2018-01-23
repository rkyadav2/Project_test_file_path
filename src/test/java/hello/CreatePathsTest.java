package hello;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class CreatePathsTest {

    @Test
    public void  ShouldVerifyCurrentFilePath() throws IOException {
        CreatePaths createPaths = new CreatePaths();
        createPaths.createNewPathsRelative();
        Assert.assertTrue(new File("tmp/ram/test", "newFile.txt").exists());

    }
}