import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseGradeTest {

    @Test
    public void testCalculatePercentage()
    {
    	CourseGrade paul = new CourseGrade("Paul McCartney", 45, 50);
    	
        // TODO: Create a grade of 45/50 and verify that the result is 90.0.
    	assertEquals(90.0, paul.calculatePercentage());
    }

    @Test
    public void testIsPassing()
    {
    	CourseGrade ringo = new CourseGrade("Ringo Starr", 25, 50);
    	
        // TODO: Create a grade of 25/50 and verify that isPassing() is false.
    	assertFalse(ringo.isPassing());
    }
}
