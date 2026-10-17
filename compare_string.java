class compare_string{
    public static void main(String args[]){
        String a=new String("apple");
        String b=new String("apple");
        String c=b;
        System.out.println(a==c);
        System.out.println(a.equals(c));
    }
}