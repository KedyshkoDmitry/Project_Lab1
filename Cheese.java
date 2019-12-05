package bsu.rfe.java.group8.lab1.Kedyshko.var7;

public class Cheese extends Food
{
    public Cheese()
    {
        super("Cheese");
    }
    public void consume()
    {
        System.out.println(this + " eaten");
    }

    public int calculateCalories()
    {
        return 100;
    }

}

