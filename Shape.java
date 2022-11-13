/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO6;

/**
 *
 * @author dzpa1
 */
public class Shape {
     public static void main(String[] args) {
    Shape segitiga = new Triangle(20,4);
    Shape lingkaran = new Circle(5);

    System.out.println("Luas dari segitiga adalah " + segitiga.getArea());
    System.out.println("Luas dari lingkaran adalah " + lingkaran.getArea());

  }

    private String getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

abstract class Shape {
  String color;

  void setColor(String color) {
    this.color = color;
  }

  String getColor() {
    return this.color;
  }

  abstract float getArea();
}

class Triangle extends Shape {
  float base;
  float height;

  Triangle(float base, float height) {
    this.base = base;
    this.height = height;
  }

  float getArea() {
    return 0.5f * base * height;
  }
}


class Circle extends Shape {
  float radius;

  Circle(float radius) {
    this.radius = radius;
  }

  float getArea() {
    return (float) Math.PI * radius * radius;
  }
}
