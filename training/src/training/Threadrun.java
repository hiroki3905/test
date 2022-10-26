package training;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


/**
 * スレッドです
 * @see Thread
 * @author gorin
 *
 */
class Threadrun extends Thread{
	
	/**
	 * 
	 * ランダム秒数後にコンソールを出力する関数
	 */
	public void run() {
		Random rand = new Random();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("kk/mm/ss");
		
		
		int x = rand.nextInt(10);
        System.out.println(getName()+"が起動しました。"+x+"後に停止します。");
        
        try {
            Thread.sleep(1000 * x);
        } catch (InterruptedException e) {
        }
        
        System.out.println(getName()+"が終了すました");
    }

}
