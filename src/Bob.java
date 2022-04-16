public class Bob {

    protected Go getGo(String str) {
        Echo echo = new Echo(new Fruit());

        if(echo == null) {
            System.out.println("!!@#");
        } else if(echo instanceof Echo) {
            System.out.println("!@#");
        } else {
            int i = 3 + 2;
        }

        return new Go();
    }
}
