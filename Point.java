public class Point{
    private int x;
    private int y;

    public Point(){
        x = 0;
        y=0;
    }
    public Point(int px, int py){
        x = px;
        y = py;
    }
    public int manhattanDistance(Point other){
        int md = 0;
        md = Math.abs(((this.getX())-(other.getX()) + ((this.getY()) - (other.getY()))));
        return md;
    }
    public boolean isCollinear(Point p1, Point p2){
        boolean collinear = false;
        double s1 = (((this.getY())-(p1.getY())/(this.getX())-(p1.getX())));
        double s2 = (((this.getY())-(p2.getY())/(this.getX())-(p2.getX())));
        double s3 = (((p1.getY())-(p2.getY())/(p1.getX())-(p2.getX())));
        if(s1 == s2 && s2 == s3){
            collinear = true;
        }
        return collinear;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int px){
        x = px; 
    }
    public void setY(int py){
        y = py;
    }

}