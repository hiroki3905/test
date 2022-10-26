package training;

/**
 * メインクラスです
 * 
 * @author omaoma
 *
 */
public class Main {

	/**
	 * メインメソッドです
	 * @param args 文字列配列です
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("こんにちは！");
		Threadrun t1 = new Threadrun();
		Threadrun t2 = new Threadrun();
		Threadrun t3 = new Threadrun();
		Threadrun t4 = new Threadrun();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
	}

}
