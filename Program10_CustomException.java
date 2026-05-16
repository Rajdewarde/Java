class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class Program10_CustomException {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom Exception Occurred");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
