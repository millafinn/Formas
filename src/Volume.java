public class Volume {
    private double a, b, c, r, h;


    void setA(double a){
        this.a=a;
    }

    double getA(){
        return a;
    }

    void setB(double b){
        this.b=b;
    }

    double getB(){
        return  b;
    }

    void setC(double c){
        this.c=c;
    }

    double getC(){
        return c;
    }

    void setR(double r){
        this.r=r;
    }

    double getR(){
        return r;
    }

    void setH(double h){
        this.h=h;
    }

    double getH(){
        return h;
    }

    public double getCubo(){
        return Math.pow(a, 3);
    }

    public double getPrisma(){
        return (a*b*c);
    }

    public double getCilindro(){
        return (Math.PI * Math.pow(r, 2)*h);
    }

    public double getEsfera(){
        return (4/3 * Math.pow(r, 3)*h);
    }
    public double getCone(){
        return ((Math.PI * Math.pow(r, 2)*h)/3);
    }

    public double getPiramide(){
        return (4*(Math.pow(a, 2)* r)/3);
    }


}
