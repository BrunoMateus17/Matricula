
public class Teacher extends Employee
{
	public Teacher(String name)
	{
        this.setName(name);
		this.setRole("Professor");
	}

    /**
     * Calculates student's arithmetic average
     */
	@Override
	public String job(Student student)
	{
        float average = (student.gradeA1 + student.gradeA2) / 2;
        student.setAverage(average);
		return Float.toString(average);
	}
}
