package bsu.rfe.java.group8.lab1.Kedyshko.var7;

public class IceCream extends Food
{
    private String sirup = null;

    public IceCream(String sirup)
    {
        super("IceCream");
        this.sirup = sirup;
    }

    public void setSirup(String sirup)
    {
        this.sirup = sirup;
    }

    public String getSirup()
    {
        return sirup;
    }

    public void consume()
    {
        System.out.println(this + " eaten");
    }

    public int calculateCalories()
    {
        if (sirup.equals("caramel"))
        {
            return 400;
        }
        else if(sirup.equals("chocolate"))
        {
            return 500;
        }
        else
        {
            return 0;
        }
    }

    public String toString()
    {
        return super.toString() + " with " + sirup;
    }

    public boolean equals(Object arg0)
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof IceCream)) return false;
            return sirup.equals(((IceCream)arg0).sirup);
        }
        else
            return false;
    }

}

