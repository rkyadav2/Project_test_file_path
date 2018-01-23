package hello;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreaterTest {
@Test
 public void shouldTestHelloMethod() {
    Greater greater = new Greater();
    String expectedResult = "Hi there";
    String actualResult = greater.sayHello();
    assertEquals(expectedResult,actualResult);
}
}