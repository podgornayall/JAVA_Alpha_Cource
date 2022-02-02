package work23;

public class Task23 {
    public static void main(String[] args) {
        int value1=265, value2=728;
        System.out.println("value1=" + value1+"; value2="+value2);
        value1-=value2;
        value2+=value1;
        value1=value2-value1;
        System.out.println("value1=" + value1+"; value2="+value2);

    }
}
