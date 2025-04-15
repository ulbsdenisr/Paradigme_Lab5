public class advancedCalc extends Calculator {
    public advancedCalc(){
        super();
    }
    public advancedCalc(double ac){
        super(ac);
    }
    public advancedCalc radical() {
        if (ac < 0) {
            throw new RuntimeException("Nu se poate calcula radical din numar negativ");
        }
        ac = Math.sqrt(ac);
        return this;
    }
    public advancedCalc exponent(double power) {
        ac = Math.pow(ac, power);
        return this;
    }
    @Override
    public void getRezultat() {
        System.out.println(ac);
    }
}
