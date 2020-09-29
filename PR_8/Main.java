class Main {
    public static void main(String[] args) {
        BoundedWaitList<String> bl = new BoundedWaitList<>(10);
        bl.add("element");
        bl.add("element2");
        bl.add("element3");
        System.out.println(bl);
        bl.remove();
        System.out.println(bl);

        UnfairWaitList<String> ul = new UnfairWaitList<>();
        ul.add("element");
        ul.add("element2");
        ul.add("element3");
        System.out.println(ul);
        ul.moveToBack();
        System.out.println(ul);
        ul.remove("element");
        System.out.println(ul);
        System.out.println(ul.contains("element2"));
    }
}