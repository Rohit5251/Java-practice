/**
 * practice
 */
public class practice {

    public static void main(String[] args) {
        String binaryInput1 = "101";
        String binaryInput2 = "100";
        int decimal1 = Integer.parseInt(binaryInput1, 2);
        int decimal2 = Integer.parseInt(binaryInput2, 2);
        int sum = decimal1 + decimal2;
        String sumInBinary = Integer.toBinaryString(sum);
        System.out.println(sumInBinary);
    }
}