class Program5_FinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("Answer = " + a);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
