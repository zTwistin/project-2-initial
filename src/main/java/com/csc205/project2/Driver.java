package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Driver {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape rectangle = new RectangularPrism(5,5,5);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(rectangle);

        shapes.forEach(System.out::println);
        /*
        /*
        The following code works with the code given.
         */
        /*
        Cylinder cylin = new Cylinder(5,10);
        System.out.println(cylin);
        Cube cub =new Cube(5);
        System.out.println(cub);
        RectangularPrism rect = new RectangularPrism(5.0,10.0,15.0);
        System.out.println(rect);
        Sphere spher = new Sphere(2.0);
        System.out.println(spher);
           */

    }

}

