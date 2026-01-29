public class stringbuffer_insert {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello ");

        sb.insert(6, "Java");
        System.out.println(sb);
    }
}
