package tests;

public class DataExpression {

    public static class intExpression {
        public static final String intExp = "(1 + 2) × 3 - 40 ÷ 5";
        public static final String resultIntExp = "1";
    }

    public static class divideOnZero {
        public static final String zeroExp = "6 ÷ 0";
        public static final String resultZeroExp = "Infinity";
    }
}
