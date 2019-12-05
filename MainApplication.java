package bsu.rfe.java.group8.lab1.Kedyshko.var7;

import java.util.Arrays;
import java.util.Comparator;

public class MainApplication
{
    public static void main(String[] args) throws Exception
    {
        int count = 0;
        for (String arg: args)
        {
            if(!arg.equals("-sort") && !arg.equals("-calories"))
            {
                count++;
            }
        }
        Food[] breakfast = new Food[count];
        int countItems = 0;
        boolean flagSort = false;
        boolean flagCalculate = false;
        for (String arg: args)
        {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese"))
            {
                breakfast[countItems] = new Cheese();
            }
            else if (parts[0].equals("Apple"))
            {
                breakfast[countItems] = new Apple(parts[1].toLowerCase());
            }
            else if(parts[0].equals("IceCream"))
            {
                breakfast[countItems] = new IceCream(parts[1].toLowerCase());
            }

            else
                {
                switch (parts[0])
                {
                    case "-sort":
                        flagSort = true;
                        break;
                    case "-calories":
                        flagCalculate = true;
                        break;
                    default:
                        System.out.println("Cannot find class " + parts[0] + ".\nContinue...\n");
                        countItems--;
                }
            }
            countItems++;
        }
        System.out.println("List of classes");
        for(Food item: breakfast)
        {
            System.out.println(item);
        }
        if (flagSort)
        {
            Arrays.sort(breakfast, new Comparator<Food>()
            {
                @Override
                public int compare(Food obj1, Food obj2)
                {
                    if(obj1.getName().length() > obj2.getName().length())
                        return -1;
                    else
                        return 0;
                }
            });
        }
        System.out.println("List of classes after sort");
        for(Food item: breakfast)
            System.out.println(item);

        for (Food item: breakfast)
        {
            if (item != null)
                item.consume();
            else break;
        }

        int counter = 0;
        IceCream check = new IceCream("caramel");
        for (Food item: breakfast)
        {
            if (item != null)
                if (item.equals(check))
                    counter++;
        }
        System.out.println("Amount products of type " + "'" + check + "'" + ": " + counter);

        counter = 0;
        for (Food item: breakfast)
        {
            if (item != null)
                if (item.equals_type(check))
                    counter++;
        }
        System.out.println("Amount products of type " + "'" + check.getName() + "'" + ": " + counter);

        if (flagCalculate)
        {
            int calories = 0;
            for (Food item: breakfast)
            {
                if (item != null)
                    calories += item.calculateCalories();
                else break;
            }
            System.out.println("Calories: " + calories + '\n');
        }

    }
}
