public class ConvertDoubleToInt {
    public static void main(String[] args) {
        double num = 10.99;
        int converted = (int) num;
        System.out.println("Double: " + num);
        System.out.println("Converted Int (Data Loss): " + converted);
    }
}