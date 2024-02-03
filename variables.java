/**
 * variables
 */
public class variables {

    public static void main(String[] args) {
        int x = 012; /* Octal*/
        byte b = 0x15; /*Hexadecimal*/
        short s = 0X23; /*Hexadecimal*/
        long l = 15L; /*long*/
        int y = 0b1011; /*binary*/
        int z = 125_256_652; /*for readability */
        int p = 0b1110_1101_1101_0010; /*for readability */
        double j = Math.sqrt(x*b);
        System.out.println(j);

    }
}