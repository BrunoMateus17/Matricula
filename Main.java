
public class Main
{
	public static void main(String[] args) throws Exception
	{
        // Criando instâncias dos objetos
		Classroom<Student> s1 = new Classroom<Student>();
        Classroom<Student> s2 = new Classroom<Student>();
        Classroom<Student> s3 = new Classroom<Student>();
        s1.setStudent(new ComputerScienceStudent("Jobson"));
        s2.setStudent(new MedicineStudent("Frederico"));
        s3.setStudent(new PsychologyStudent("Claudecir"));

        ComputerScienceStudent ccStudent = (ComputerScienceStudent) s1.getStudent();
        MedicineStudent medStudent = (MedicineStudent) s2.getStudent();
        PsychologyStudent psyStudent = (PsychologyStudent) s3.getStudent();

        Teacher teacher = new Teacher("Ismar");
        Assistant assistant = new Assistant("Edenilson");

        Parents parents = new Parents();
        Friends friends = new Friends();

        // Atribuição das notas das provas
        ccStudent.gradeA1 = Float.parseFloat("6");
        ccStudent.gradeA2 = Float.parseFloat("6");

        medStudent.gradeA1 = Float.parseFloat("9");
        medStudent.gradeA2 = Float.parseFloat("5");

        psyStudent.gradeA1 = Float.parseFloat("2");
        psyStudent.gradeA2 = Float.parseFloat("2");

        // Atribuição das médias finais
        teacher.job(ccStudent);
        teacher.job(medStudent);
        teacher.job(psyStudent);

        // Resultados do aluno de Ciência da Computação
        System.out.println(ccStudent.isApproved(assistant));
        System.out.println("Os pais disseram: " + parents.knowResults(assistant.job(ccStudent)));
        System.out.println("Os amigos disseram: " + friends.knowResults(assistant.job(ccStudent)));

        System.out.println("----------------------------------------------");

        // Resultados do aluno de Medicina
        System.out.println(medStudent.isApproved(assistant));
        System.out.println("Os pais disseram: " + parents.knowResults(assistant.job(medStudent)));
        System.out.println("Os amigos disseram: " + friends.knowResults(assistant.job(medStudent)));

        System.out.println("----------------------------------------------");
        
        // Resultados do aluno de Psicologia
        System.out.println(psyStudent.isApproved(assistant));
        System.out.println("Os pais disseram: " + parents.knowResults(assistant.job(psyStudent)));
        System.out.println("Os amigos disseram: " + friends.knowResults(assistant.job(psyStudent)));
	}
}
