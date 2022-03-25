package sqlbaglanti;

final class C {
	 
    private final double a;
    private final double b;
 
    public C(double a, double b) {
        this.a = a;
        this.b = b;
    }
 
    public String toString() {
        return "(" + a + " + " + b + ")";
    }
}
 
class M {
  public static void main(String args[])
  {
       C c = new C(10, 15);
       System.out.println("Çýktý = " + c.toString());
  }         
}

