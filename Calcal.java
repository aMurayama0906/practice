package calapp.main;
public class Calcal{
  public static void main(String[] args) {
    int a = 10;
    int b = 6;
    int total = calapp.logics.CalcalLogic.tasu (a,b);
    int delta = calapp.logics.CalcalLogic.hiku (a,b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
