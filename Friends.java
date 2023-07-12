
public class Friends extends Acquaintances
{
    public String knowResults(String result)
    {
        if (result.equals("Aprovado :)")) {
            return "Boa! Bora tomar uma cerveja!";
        } else {
            return "Pô! Temos que estudar mais!";
        }
    }
}
