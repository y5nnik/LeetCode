package Java;

public class RomanToInteger_13 {

    public static int romanToInt(String s) {
        int current = 0;
        int answer = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            current = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> throw new IllegalStateException("Unexpected value: " + s.charAt(i));
            };

            if (current*4 < answer) {
                answer -= current;
            }
            else {
                answer += current;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XIV"));
    }

}