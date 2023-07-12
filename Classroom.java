
public class Classroom <S extends Student>
{
	private S student;

    public void setStudent(S s)
    {
        this.student = s;
    }

    public S getStudent()
    {
        return this.student;
    }
}
