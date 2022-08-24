package lesson13;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage{

        private static Semaphore smp;

        public Tunnel() {
            this.length = 80;
            this.description = "Тоннель " + length + " метров";
        }
        @Override
        public void go(Car c) {
            if (smp == null) {
                smp = new Semaphore(Car.getCarsCount()/2);
            }
            try {
                try {
                    System.out.println(c.getName() + " готовится к этапу(ждет): " +
                            description);
                    smp.acquire();
                    System.out.println(c.getName() + " начал этап: " + description);
                    Thread.sleep(length / c.getSpeed() * 1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(c.getName() + " закончил этап: " +
                            description);
                    smp.release();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
