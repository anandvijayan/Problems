package com.sabre.intvw;

import static org.junit.Assert.*;

public class MatTest {
    @org.junit.Test
    public void computeAreaSquares() throws Exception {
        Shape[] shapes = {new Square(5,5), new Square(10,10),new Square(20,20), new Square(50,50), new Square(100,100)};
        Mat mat = new Mat(shapes);
        assertEquals(13025.0,mat.computeArea(),0.001);
    }

    @org.junit.Test
    public void computeAreaRectangles() throws Exception {
        Shape[] shapes = {new Rectangle(5,15), new Rectangle(10,20),new Rectangle(30,20), new Rectangle(100,50), new Rectangle(200,100)};
        Mat mat = new Mat(shapes);
        assertEquals(25875.0,mat.computeArea(),0.001);
    }

    @org.junit.Test
    public void computeAreaCircles() throws Exception {
        Shape[] shapes = {new Circle(5), new Circle(10),new Circle(20), new Circle(50),new Circle(100)};
        Mat mat = new Mat(shapes);
        assertEquals(40898.5,mat.computeArea(),0.001);
    }

    @org.junit.Test
    public void computeAreaAll() throws Exception {
        Shape[] shapes = {new Circle(5),new Rectangle(5,15), new Rectangle(10,20),new Rectangle(30,20), new Circle(10),new Circle(20), new Square(5,5), new Square(10,10),new Square(20,20), new Square(50,50), new Square(100,100), new Circle(50),new Circle(100), new Rectangle(100,50), new Rectangle(200,100)};
        Mat mat = new Mat(shapes);
        assertEquals(79798.5,mat.computeArea(),0.001);
    }
}