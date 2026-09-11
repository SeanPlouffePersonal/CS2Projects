public class CourseGrade
{
    // TODO: Declare the three required private fields.

	private String studentName;
	private int pointsEarned;
	private int pointsPossible;
	
    public CourseGrade(String studentName, int pointsEarned, int pointsPossible)
    {
        // TODO: Initialize all three fields.
    	
    	this.studentName = studentName;
    	this.pointsEarned = pointsEarned;
    	this.pointsPossible = pointsPossible;
    }

    public double calculatePercentage() {
        // TODO: Return the percentage using decimal division.
    	
    	// Could be done as:
    	// return ((double)pointsEarned/pointsPossible) * 100
    	// But I feel the way I did it is easier to read.
    	
    	double decimalPercent = (double)pointsEarned / pointsPossible;

    	double truePercent = decimalPercent * 100;
    	
        return truePercent;
    }

    public boolean isPassing()
    {
        // TODO: Return true when the percentage is at least 60.0.
        return calculatePercentage() >= 60.0;
    }

    // TODO: Add getter methods for all three fields.
    public String getStudentName()
    {
    	return studentName;
    }
    
    public int getPointsEarned()
    {
    	return pointsEarned;
    }
    
    public int pointsPossible()
    {
    	return pointsPossible();
    }
    
}
