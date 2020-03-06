public abstract class Quadralateral {
    private int[] sides;
    private int[] angles;

    public Quadralateral(int[] sides, int[] angles){
        this.sides = sides;
        this.angles = angles;
    }

    public int calculatePerimeter(){
    int Perimeter = 0;
    for(int side: sides){
        Perimeter += side;
    }
    return Perimeter;
    }

    public abstract double calcArea();

    public String toString(){
        String result = "Quadralateral";
        for(int s: sides){
            result+= s +" ";
        }
        return result;
    }


    public static void main(String[]args){
        int[] sides = {3,4,5,6};
        int[] angles = {90, 90, 90, 90};
    }
}
