import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date date = new Date();
		SimpleDateFormat time = new SimpleDateFormat("kk/mm/ss");
		System.out.println(time.format(date));
	}

}
