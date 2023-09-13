class Calculator{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int ...n1){
        int sum = 0;
        for(int i=0; i<n1.length; i++){
            sum += n1[i];
        }
        return sum;
    }
    public double add(double n1, int n2){
        return n1 + n2;
    }
}



public class MethodOverloading {
    public static void main(String[] a){
        Calculator c = new Calculator();
        System.out.println(c.add(3.5, 0));
        System.out.println(c.add(1,4));
        System.out.println(c.add(12,4,1,1,1,1));
    }
}
