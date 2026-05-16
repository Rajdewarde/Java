class Program3_NumberFormat {
    public static void main(String[] args) {
        try {
            String s = "ABC";
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
