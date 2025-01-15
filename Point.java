public class Point{
    private int x;
    private int y;

    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int px, int py){
        x = px;
        y = py;
    }
    public int manhattanDistance(Point other){
        int md = 0;
        md = (Math.abs(this.getX()-other.getX()) + Math.abs(this.getY() - (other.getY())));
        return md;
    }
    public boolean isCollinear(Point p1, Point p2){
        boolean collinear = false;
        double s1 = (((this.getY())-(p1.getY())/(this.getX())-(p1.getX())));
        if((this.getX())-(p1.getX()) == 0){
            s1 = 0.0;
        }
        double s2 = (((this.getY())-(p2.getY())/(this.getX())-(p2.getX())));
        if((this.getX())-(p2.getX()) == 0){
            s2 = 0.0;
        }
        double s3 = (((p1.getY())-(p2.getY())/(p1.getX())-(p2.getX())));
        if((p1.getX())-(p2.getX()) == 0){
            s3 = 0.0;
        }
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