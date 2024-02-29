import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String[] tmp = value.split(" ");
        try {
            double a = Double.parseDouble(tmp[0]);
            double b = Double.parseDouble(tmp[1]);
            double c = Double.parseDouble(tmp[2]);
            double X1 = ((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
            double X2 = ((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
            System.out.println("X1 : "+X1);
            System.out.println("X2 : "+X2);
        } catch (NumberFormatException e) {
            System.out.println("Please input data in number format only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }
}
