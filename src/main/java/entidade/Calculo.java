package entidade;

public class Calculo {

  private double x1, y1, x2, y2, d;

  public Calculo() {}

  public double getX1() {
    return x1;
  }

  public void setX1(double x1) {
    this.x1 = x1;
  }

  public double getY1() {
    return y1;
  }

  public void setY1(double y1) {
    this.y1 = y1;
  }

  public double getX2() {
    return x2;
  }

  public void setX2(double x2) {
    this.x2 = x2;
  }

  public double getY2() {
    return y2;
  }

  public void setY2(double y2) {
    this.y2 = y2;
  }

  public double getD() {
    return d;
  }

  public void setD(double d) {
    this.d = d;
  }

  public double distancia() {
    double a, b;
    a = this.getX2() - this.getX1();
    b = this.getY2() - this.getY1();

    this.setD((Math.pow(a, 2)) + (Math.pow(b, 2)));
    return Math.sqrt(this.getD());
  }
}
