public class EX2 {
    public static void main(String[] args) {
        StringFunction exc = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        prinFormatted("hello", exc);
        prinFormatted("java", ask);
    }

    public static void prinFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

interface StringFunction {
    String run(String str);
}