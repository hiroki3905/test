package training;

import java.util.Random;

class Threadrun extends Thread{
	public void run() {
		Random rand = new Random();
		rand.nextInt(10);
        System.out.println(getName()+"が起動しました。"+rand.nextInt(10)+"後に停止します。");
    }

}
