import com.homedepot.search.concourse.Tutorial.TestClass;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zack Sparks on 6/14/17, in package PACKAGE_NAME.
 */
public class mainTest {
  @Test
  public void multiplicationOfZeroIntegersShouldReturnZero() {
    TestClass tester = new TestClass(); // MyClass is tested

    // assert statements
    assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
    assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
    assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
  }

  @Test
  public void passTest() {
    Assert.assertTrue(true);
  }

  @Test
  public void passTest2() {
    Assert.assertFalse(false);
  }
}
