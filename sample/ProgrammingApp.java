/*
Goal : What is programming.
Step : 
    Compile lib/Home.java 
        cd lib // change lib directory 
        javac --class-path "." Home.java // Create Home.class, Aircon.class...  
        cd .. // Change directory to Programming.java path 
    Compile Programming.java
        javac --class-path ".;lib" Programming.java // Compile Programming.java 
    Run Programming
        java --class-path ".;lib" Programming
*/
class ProgrammingApp{
    public static void main(String[] args){
        Home.aircon.off();
        Home.window.close();
        Home.window.lock();        
    }
}