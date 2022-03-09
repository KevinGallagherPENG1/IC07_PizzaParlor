import java.text.NumberFormat;

public class PizzaOrder {

    private static final int MAX_PIZZAS = 100;
    private int numPies; //fields are initialized by java by default to 0 / null value
    private Pizza[] pies = new Pizza[MAX_PIZZAS];

    public boolean addPizzaToOrder(char size, boolean pepp, boolean mush, boolean saus, boolean vegan)
    {
        //checks to see if you can actually add a pizza to the order
        if(numPies < MAX_PIZZAS) {
            pies[numPies++] = new Pizza(size, pepp, saus, mush, vegan);
            return true;
        }
        return false;
    }

    public String toString() {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String output = "Pizza order: Number of Pies = " + numPies + "\n";
        //loop through the array again!
        for (int i = 0; i < numPies; i++)
            output += "Pie #" + (i+1) + ": " +pies[i] +"\n"; //toString isnt necessary, Java will do that
        output += "Total Cost = " + currency.format(calcCost()) + "\n";
        return output;

    }

    public double calcCost() {
        //s = 8, m = 10, l = 12
        // each topping adds 1 to cost
        double cost = 0.0;
        //what I tried:

        for (int i = 0; i < numPies; i++) {
            if(pies[i] == null)
                return cost;
            cost += pies[i].getNumToppings();
            switch (pies[i].getSize())
            {
                case 's':
                case 'S':
                    cost+= 8.0;
                    break;
                case 'm':
                case 'M':
                    cost+= 10.0;
                    break;
                case 'l':
                case 'L':
                    cost+= 12.0;
                    break;
            }

            /* WHAT I DID (didnt work):
            if (pies[i].getSize.equalsIgnoreCase('s'))
                cost += 8;
            if (pies[i].getSize.equalsIgnoreCase('m'))
                cost += 10;
            if (pies[i].getSize.equalsIgnoreCase('l'))
                cost += 12;

             */
        }
        return cost;
    }

}
