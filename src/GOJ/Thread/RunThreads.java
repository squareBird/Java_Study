package GOJ.Thread;

public class RunThreads {
    public static void main(String[] args) {
        RunThreads rs = new RunThreads();
        rs.runBasic();
    }

    public void runBasic() {
        RunnableSample runable = new RunnableSample();
        new Thread(runable).start();

        ThreadSample thread = new ThreadSample();
        thread.start();
    }
}
