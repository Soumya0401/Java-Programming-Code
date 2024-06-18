package Methods;

public class PrintNumber {

    public static void main(String[] args) {
        Studentdetail studentDetail = new Studentdetail();
        studentDetail.showDetails();
    }
    
    public static class Studentdetail {
        public void showDetails() {
            PrintNumber obj = new PrintNumber();
            obj.printn(200);
            obj.printn(10.87f);
            obj.printn("JAVA");
            obj.printn(10000000000L);
        }
    }

    public void printn(int x) {
        System.out.println("Integer = " + x);
    }

    public void printn(float y) {
        System.out.println("Float = " + y);
    }

    public void printn(String str) {
        System.out.println("String: " + str);
    }

    public void printn(long z) {
        System.out.println("Long = " + z);
    }
}
