public interface India {
    void test1();

    default int test2() {
        System.out.println("!");
        return 3;
    }
}
