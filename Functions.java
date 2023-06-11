public class Functions {
    public static void main(String[] args){
        calculate(1.2,2.3);

    }
    public static void calculate(double value1,double value2){
        double area=value1*value2;
        result(area);
    }
    public static void result(double value){
        System.out.println("The area : "+value);
    }
}
