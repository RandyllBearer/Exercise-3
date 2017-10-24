package exercise3;
import org.junit.Test;
import static org.junit.Assert.*;

import exercise3.Exercise3;

public class Exercise3Test {

    @Test
    public void testTriangle0() {
    	assertEquals(Exercise3.triangleNumberSequence(0), 0);
    }

    @Test
    public void testTriangle1() {
    	assertEquals(Exercise3.triangleNumberSequence(1), 1);
    }

    @Test
    public void testTriangle6() {
    	assertEquals(Exercise3.triangleNumberSequence(6), 21);
    }


    @Test
    public void testLazyCaterer1() {
      assertEquals(Exercise3.lazyCatererSequence(1), 2);
    }

    @Test
    public void testLazyCaterer0() {
      assertEquals(Exercise3.lazyCatererSequence(0), 1);
    }

    @Test
    public void testLazyCaterer6() {
      assertEquals(Exercise3.lazyCatererSequence(6), 22);
    }



}
