package Unit3;

public class thread {
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);
        t.setName("Rip");
        System.out.println("Current Thread: " + t.getName());
    }
}
