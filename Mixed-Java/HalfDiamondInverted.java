class HalfDiamondInverted {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int spaces = Math.abs(n - i);
            int stars = n - spaces;

            System.out.print(" ".repeat(spaces));
            System.out.println("*".repeat(stars));
        }
    }
}
