package com.sabre.intvw;

/**
 * The Mat class serves as the container for the objects to be placed
 */
public class Mat {
    private Shape[] shapes;
    public Mat(Shape[] shapes) {
        this.shapes = shapes;
    }

    /**
     * Compute the area occupied by the objects on mat
     */
    public double computeArea() {
        double totArea=0.0d;
        int cCount=0;
        int rCount=0;
        int sCount=0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) cCount++;
            else if (shape instanceof Square) sCount++;
            else if (shape instanceof Rectangle) rCount++;
            totArea+=shape.area();
        }
        System.out.println("Found "+cCount+" circles, "+sCount+" squares and "+rCount+" rectangles");
        System.out.println("Total area is:"+totArea);
        return totArea;
    }
}
