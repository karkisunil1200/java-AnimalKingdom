package animalKingdom;

public class Mammals extends Animals
{

    public Mammals(String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}
