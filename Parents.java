
public class Parents extends Acquaintances
{
    public String knowResults(String result)
    {
        if (result.equals("Aprovado :)")) {
            return "Parabéns!!! Continue assim!";
        } else {
            return "Estude mais e terá seu celular de volta.";
        }
    }
}
