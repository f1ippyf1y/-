public class PR14 {

    static class NumberTask implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Number: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static class LetterTask implements Runnable {
        @Override
        public void run() {
            try {
                for (char c = 'A'; c <= 'E'; c++) {
                    System.out.println("Letter: " + c);
                    Thread.sleep(700);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Thread numberThread = new Thread(new NumberTask());
        Thread letterThread = new Thread(new LetterTask());

        numberThread.start();
        letterThread.start();

        try {
            numberThread.join();
            letterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Обе задачи завершены.");
    }
}