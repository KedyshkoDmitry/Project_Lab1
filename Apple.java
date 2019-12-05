package bsu.rfe.java.group8.lab1.Kedyshko.var7;

public class Apple extends Food
{
    private String size;
    public Apple(String size)
    {
        super("Apple");
        this.size = size;
    }

    public void consume()
    {
        System.out.println(this + " eaten");
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public boolean equals(Object arg0)
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        }
        else
            return false;
    }

    public String toString()
    {
        return size + " " + super.toString();
    }

    public int calculateCalories(){
        if (size.equals("big")){
            return 50;
        }
        else if(size.equals("medium")){
            return 35;
        }
        else if(size.equals("little")){
            return 20;
        }
        else{
            return 0;
        }
    }
}
