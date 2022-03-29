public class Controlador {
    public boolean isInt(String value)
    {
        try {
            Integer.parseInt(value);
            return true;
        }catch(Exception e)
        {
            return false;
        }
    }
}
