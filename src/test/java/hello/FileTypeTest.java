package hello;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileTypeTest {

    @Test
    public void shouldgetFileTypeStringValue() {
        String expected_name = FileType.Delimited.getFolderName();
        Assert.assertTrue(expected_name=="Delimited");
    }


}