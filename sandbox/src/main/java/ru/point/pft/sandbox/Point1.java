package ru.point.pft.sandbox;

public class Point1 {
  public double p1;
  public double p2;

  public Point1(double p1, double p2){
    this.p1 = p1;
    this.p2 = p2;
  }

  public double distance(){
    return Math.sqrt(this.p1) + Math.sqrt(this.p2);
  }
}

