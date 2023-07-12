
public class Assistant extends Employee
{
	public Assistant(String name)
	{
        this.setName(name);
		this.setRole("Assistente do professor");
	}

	/**
     * Verifies if student is approved based on his/her grade
     */
	@Override
	public String job(Student student)
	{
		if (student.getAverage() >= 6) {
            return "Aprovado :)";
        }
        return "Reprovado :(";
	}
}
