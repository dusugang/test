package InitClass;

public class TestInstance {

    public static int a;
    public static int b = 0;
    public static TestInstance instance = new TestInstance();

    public TestInstance() {
        a++;
        b++;
    }

    public static void main(String[] args) {
        System.out.println(TestInstance.a);
        System.out.println(TestInstance.b);

    }
}


