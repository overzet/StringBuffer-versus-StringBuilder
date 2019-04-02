package builderbuffer;

//Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.
public class ConcatTest {
    public static void main(String[] args) {

        long startTime = 0L;
        long totalRunTimeStringBuffer = 0L;
        long totalRunTimeStringBuilder = 0L;

        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("Java");
        for (int i = 0; i < 1_000_000; i++) {
            stringBuffer.append(" String");
        }
        totalRunTimeStringBuffer = System.currentTimeMillis() - startTime;
        System.out.println("Time taken by StringBuffer: " + totalRunTimeStringBuffer + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Java");
        for (int i = 0; i < 1_000_000; i++) {
            stringBuilder.append(" String");
        }
        totalRunTimeStringBuilder = System.currentTimeMillis() - startTime;
        System.out.println("Time taken by StringBuilder: " + totalRunTimeStringBuilder + "ms");

        if (totalRunTimeStringBuffer < totalRunTimeStringBuilder) {
            System.out.println("\nStringBuffer is the fastest");
        } else {
            System.out.println("\nQ: When would you use string builder and when string buffer?");
            System.out.println("\tA: StringBuilder is the fastest, but not thread safe. While StringBuffer is thread safe.\n" +
                    "\t So in a multithreaded environment I would use StringBuffer");
            System.out.println("\nQ: What are the benefits of using each of them and what are the negative sides?");
            System.out.println("\tA: Best described here: https://softwareengineering.stackexchange.com/a/162342\n");
            System.out.println("\nQ: What is String in java?");
            System.out.println("\tA: String is a sequence of characters, for example: “Hello” is a string of 5 characters.\n" +
                    "\t In java, string is an immutable object which means it is constant and can cannot be changed once it has been created. ");
        }
    }

}