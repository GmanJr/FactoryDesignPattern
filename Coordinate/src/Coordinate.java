public class Coordinate {
    final int x;
    final int y;

    private Coordinate (int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Coordinate fromPolar(int r, int theta){
        int tempX = (int) (r*Math.cos(theta));
        int tempY = (int) (r*Math.sin(theta));
        return new Coordinate(tempX, tempY);
    }

    public static Coordinate fromXY(int x, int y) {
        return new Coordinate(x, y);
    }


    @Override
    public String toString() {
        return "( " + x + ", " + y + ")";
    }


    public double distanceFrom(Coordinate other) {
        return Math.sqrt(Math.pow(this.x-other.x, 2) + Math.pow(this.y-other.y,2));
    }


    public double distanceFrom() {
        return distanceFrom(new Coordinate(0,0));
    }


    public boolean equals(Coordinate other) {
        return this.x == other.x && this.y == other.y;
    }


    // copy constructor
    public Coordinate(Coordinate other) {
        this(other.x,other.y);
    }


    public int hashCode() {
        return this.x*31 + this.y;
    }



}
