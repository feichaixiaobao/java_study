public class ArrayExercise01 {
    public static void main(String[] args) {
        int count = -1;
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)('A'+ i);
            count++;
            if (count %5 == 0) {
                System.out.println("\t");
            }
            System.out.print(chars[i] + " ");
        }
    }
}
