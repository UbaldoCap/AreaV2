public class Triangolo extends Forma {
    public Triangolo(int x, int y) {
        super(x, y);
    }

    @Override
    public void calcolaArea() {
        super.calcolaArea();
        System.out.println((getX() * getY())/ 2);
    }
}
