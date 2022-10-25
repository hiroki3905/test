package training;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

class Threadrun extends Thread{
	public void run() {
		Random rand = new Random();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("kk/mm/ss");
        System.out.println(getName()+"が起動しました。"+rand.nextInt(10)+"後に停止します。"+sdf.format(date));
    }

}
