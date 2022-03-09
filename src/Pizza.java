import java.util.Objects;

public class Pizza {
    private boolean mush, pepp, saus, vegan;
    private char size;

    public char getSize() {
        return size;
    }

    public Pizza(char size, boolean pepp, boolean saus, boolean mush, boolean vegan) {
        this.size = size;
        this.pepp = pepp;
        this.saus = saus;
        this.mush = mush;
        this.vegan = vegan;

    }

    @Override
    public String toString() {
        String output =  "Pizza [" +
                "size=" + size;
                if(pepp) output += ", Pepperoni";
                if(saus) output += ", Sausage";
                if(mush) output += ", Mushrooms";
                if(vegan) output += ", Vegan";
                output += "]";
                return output;

    }

    public int getNumToppings()
    {
        int numTop = 0;
        if(pepp) numTop ++;
        if(saus) numTop ++;
        if(mush) numTop ++;
        if(vegan) numTop++;
     return numTop;
    }
}
