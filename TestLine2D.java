public class TestLine2D {
    public static void main(String[]args){
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        Point p3 = new Point(4,9);
        Point p4 = new Point(6,8);
        Line2D l1 = new Line2D(p1,p2);
        Line2D l2 = new Line2D(p3,p4);
        System.out.println("The end points:");
        System.out.println("    p1: x="+ p1.getX()+", y="+ p1.getY());
        System.out.println("    p2: x="+ p2.getX()+", y="+ p2.getY());
        System.out.println("    p3: x="+ p3.getX()+", y="+ p3.getY());
        System.out.println("    p4: x="+ p4.getX()+", y="+ p4.getY());
        System.out.println("Testing constructor using 2 Point objects and the toString method");
        System.out.println("    Line 1: "+l1.toString());
        System.out.println("    Line 2: "+l2.toString());
        System.out.println("Testing get ");
        System.out.println("x = " +l1.getP1().getX()+ ", y = " + l1.getP1().getY());
        System.out.println("x = " +l1.getP2().getX()+ ", y = " + l1.getP2().getY());
        System.out.println("x = " +l2.getP1().getX()+ ", y = " + l2.getP1().getY());
        System.out.println("x = " +l2.getP2().getX()+ ", y = " + l2.getP2().getY());
        System.out.println("Testing getSlope:");
        System.out.println("    Line 1 slope: "+l1.getSlope());
        System.out.println("    Line 2 slope: "+l2.getSlope());
        System.out.println("Testing isCollinear:");
        System.out.println("    Line1 and p3: "+l1.isCollinear(p3));
        System.out.println("    Line1 and p4: "+l1.isCollinear(p4));



    }
    
}
