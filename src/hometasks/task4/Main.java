package hometasks.task4;


public class Main {

    public static void main(String[] args) {

        //Если верно понял ДЗ
        Thread thread = new myThread();
        System.out.println("thread = " + Thread.currentThread());
        thread.setDaemon(false);

        System.out.println(thread.getState());
        System.out.println(thread.getName());
        System.out.println(thread.getId());
        System.out.println(thread.getContextClassLoader());
        System.out.println(thread.hashCode());
        System.out.println(thread.getClass());

        // данный метод вызовет run()
        thread.start();

    }

}

class myThread extends Thread {

    myThread() {
        setDaemon(false);
    }

    @Override
    public void run() {
        boolean d = isDaemon();
        System.out.println("daemon = " + d);
    }
}