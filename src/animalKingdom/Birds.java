package animalKingdom;

public class Birds extends Animals
{
    public Birds(String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }
}
