public class RunStudentTask {

    public static void main(String[] args) {
        RedisStorage rs = new RedisStorage();
        rs.init();
        rs.initData();
        rs.hgettall();
        if (rs.increment("Bech O.I.", "Web dev", 21)) {
            System.out.println("OK");
            rs.hgettall();
        } else {
            System.out.println("System error.");
        }
    }
}
