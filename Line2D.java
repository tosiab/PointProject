public class Line2D {
    private Point p1;
    private Point p2;
    public Line2D(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Line2D(int x1, int y1, int x2, int y2){
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }
    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }
    public String toString(){
        String re = "[("+p1.getX()+","+p1.getY()+"), (" +p2.getX()+","+p2.getY()+")]";
        return re;
    }
    public double getSlope(){
        if(p1.getX() == p2.getX()){
            throw new IllegalArgumentException("undefined slope");
        }
        double sy = p1.getY() - p2.getY();
        double sx = p1.getX() - p2.getX();
        double slope = (double)(sy/(sx));
        return slope;
    }
    public boolean isCollinear(Point p){
        boolean collinear = false;
        double s1 = getSlope();
        double s2 = (double)(p.getY() - p1.getY()) / (p.getX() - p1.getX());
        if ((Math.abs(s1-s2))<= 0.01){
            collinear = true;
        }
        return collinear;
    }
    
    
}
