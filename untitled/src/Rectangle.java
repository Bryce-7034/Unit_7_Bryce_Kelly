public class Rectangle extends Quadralateral{
    public static final int[] RECT_ANGLES = {90, 90, 90, 90};

    public Rectangle(int s1, int s2){
        super(new int[]{s1,s1,s2,s2}, RECT_ANGLES);
    }

    public double calcArea(){
        return sides[0] * sides[3];
    }
}
