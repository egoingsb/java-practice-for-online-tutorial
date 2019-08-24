/*
Goal : 
    1. Understanding String data type.
    2. Try read Java API Documentation.
Step 
    javac StringApp.java ; java --class-path "." StringApp 
*/
public class StringApp{
    public static void main(String[] args){
        System.out.println("Hello world String!!");
        System.out.println("Hello world String!!".length());
        System.out.println("Hello world String!!".indexOf("world"));
        System.out.println("Hello world String!!".replace("Hello", "Hi"));
        System.out.println("Hello world String!!".startsWith("Hello")); // True
        System.out.println("Hello world String!!".startsWith("Hi")); // False
    }
}