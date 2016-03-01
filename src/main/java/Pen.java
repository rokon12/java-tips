/**
 * @author Bazlur Rahman Rokon
 * @since 12/19/15.
 */
public class Pen {
    private int color; // 1 = Red, 2= Blue, 3 = black

    public Pen(int color) {
        this.color = color;
    }

    public void write(){
        grabInk();
        System.out.println("writing ...");

    }

    private void grabInk(){

    }
}
