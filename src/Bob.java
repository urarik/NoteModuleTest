public class Bob {

    protected Go getGo(String str) {
        Echo echo = new Echo(new Fruit());

        if(echo == null) {
            System.out.println("!!@#");
        } else if(echo instanceof Echo) {
            System.out.println("!@#");
        } else if(3 +2 > 3) {
            System.out.println("OMG..");
        }else {
            int i = 3 + 2;
        }

        if(3 + 9 == 10) {
            System.out.println("1");
        } else System.out.println("2");

        return new Go();
    }
}
