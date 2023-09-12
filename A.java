public class A {
    public static String getPublic() {
      return getPrivate();
    }
  
    private static String getPrivate() {
      return "hello";
    }

    public static void main(String[] args) {
        System.err.println(A.getPublic());
    }
}
