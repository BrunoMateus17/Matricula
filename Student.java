
abstract public class Student
{
    public float gradeA1;
    public float gradeA2;
    private String course;
    private String name;
    private float average;
    private String finalResult;

    public String getCourse()
    {
        return this.course;
    }
    
    public void setCourse(String course)
    {
        this.course = course;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public float getAverage()
    {
        return this.average;
    }
    
    public void setAverage(float average)
    {
        this.average = average;
    }

    public String getFinalResult()
    {
        return this.finalResult;
    }

    public void setFinalResult(String finalResult)
    {
        this.finalResult = finalResult;
    }

    public String isApproved(Employee employee)
    {
        return "Aluno " +
            this.getName() +
            ", do curso de: " +
            this.getCourse() +
            ": " + employee.job(this);
    }
}
