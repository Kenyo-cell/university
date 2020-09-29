class Main {
    public static void main(String[] args) {
        Result exp = new Substract(
            new Multiply(new Const(2), new Variable("x")),
            new Const(3));
        System.out.println(exp);


            System.out.println(new Add(new Substract(
                new Multiply(new Const(2), new Variable("x")),
                new Const(3)), new Divide(new Const(8),
                new Multiply(new Variable("x"), new Variable("x")))).extract(5));
    }
}