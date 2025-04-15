public class Calculator {
    protected double ac;
    public Calculator() {
        this.ac = 0;
    }
    public Calculator(double x)
    {
        this.ac = x;
    }
    public Calculator adunare(double b) {
        this.ac += b;
        return this;
    }

    public Calculator scadere(double b) {
        this.ac-=b;
        return this;
    }

    public Calculator inmultire(double b) {
        this.ac *= b;
        return this;
    }

    public Calculator impartire(double b) {
        if (b == 0) {
            throw new RuntimeException("Nu se poate impartii la 0");
        }
        this.ac/=b;
        return this;
    }

    public void getRezultat(){
        System.out.println(this.ac);
    }
    }