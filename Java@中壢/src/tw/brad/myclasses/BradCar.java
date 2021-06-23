package tw.brad.myclasses;

public class BradCar extends RacingCar {
	// 1. 所有類別一定有建構子
	// 	1.1 如果沒有定義, 編譯器會幫忙, 指定的父類別無參數的建構子
	// 	1.2 其他就要自己想辦法
	// 2. 所有建構子的第一道敘述句, 在將其祖宗八代一直到Object給進行初始化
	// 	2.1 不寫 => super();
	
	// If the constructor is private, you cannot even new an instance of that class.
	public BradCar() {
		super(1);
		System.out.println("BradCar()");
	}
}
