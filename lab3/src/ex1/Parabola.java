package ex1;

class Parabola {
    private final int a;
    private final int b;
    private final int c;

    public Parabola(int a,int b,int c){
        super();
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public String toString() {
        return "f(x)= "+a+"x^2+"+b+"x+"+c;
    }
    public Punct varf(){
        return new Punct((-b)/(2*a),(-b)^2+(4*a*c)/(4*a));

    }
}
