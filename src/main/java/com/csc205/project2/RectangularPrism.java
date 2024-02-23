package com.csc205.project2;

public class RectangularPrism extends Shape{
   private double length;
   private double width;
   private double height;

   public RectangularPrism() {
       super();
       this.length = 0.0;
       this.width = 0.0;
       this.height = 0.0;
   }
   public RectangularPrism(double length, double width, double height){
       super();
       this.length = length;
       this.width = width;
       this.height = height;
   }
   public double getLength() {
       return length;
   }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double surfaceArea() {
        return 2.0*(height*width+width*length+length*height);
    }
    public double volume() {
        return height*width*length;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RectangularPrism{");
        sb.append("length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

