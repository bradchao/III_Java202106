package tw.brad.myclasses;

import java.util.Scanner;

public class ComplexNumber {
	private double realPart;
	private double imaginaryPart;

	/* 預設建構函式 */
	public ComplexNumber() {
		this.realPart = 0.0;
		this.imaginaryPart = 0.0;
	}

	/*
	 * 建構函式
	 * 
	 * @param a 實部
	 * 
	 * @param b 虛部
	 */
	public ComplexNumber(double a, double b) {
		this.realPart = a;
		this.imaginaryPart = b;
	}

	/**
	 * 複數的加法運算。 c = a + b 的運演算法則是: c.實部 = a.實部 + b.實部; c.虛部 = a.虛部 + b.虛部
	 * 
	 * @param aComNum 加數
	 * @return 加法運算的結果,為一個複數物件
	 */
	public ComplexNumber add(ComplexNumber aComNum) {
		if (aComNum == null) {
			System.out.println("物件的內容不能為null");
			return new ComplexNumber();
		}
		return new ComplexNumber(this.realPart + aComNum.getRealPart(),
				this.imaginaryPart + aComNum.getImaginaryPart());
	}

	/**
	 * 複數的減法運算。 c = a - b 的運演算法則是: c.實部 = a.實部 - b.實部; c.虛部 = a.虛部 - b.虛部
	 * 
	 * @param aComNum 減數
	 * @return 減法運算的結果,為一個複數物件
	 */
	public ComplexNumber decrease(ComplexNumber aComNum) {
		if (aComNum == null) {
			System.out.println("物件不能為null");
			return new ComplexNumber();
		}
		return new ComplexNumber(this.realPart - aComNum.getRealPart(),
				this.imaginaryPart - aComNum.getImaginaryPart());
	}

	/**
	* 複數的乘法運算。
	* c = a * b 的運演算法則是:
	* c.實部 = a.實部 * b.實部 - a.虛部 * b.虛部;
	* c.虛部 = a.虛部 * b.實部 + a.實部 * b.虛部;
	* @param aComNum 乘數
	* @return 乘法運算的結果,為一個複數物件
	*/
	public ComplexNumber multiply(ComplexNumber aComNum){
		if (aComNum == null){
			System.out.println("物件不能為null");
			return new ComplexNumber();
		}
		double newReal = this.realPart* aComNum.realPart - this.imaginaryPart*aComNum.imaginaryPart;
		double newImaginary = this.realPart*aComNum.imaginaryPart + this.imaginaryPart*aComNum.realPart;
		ComplexNumber result = new ComplexNumber(newReal,newImaginary);
		return result;
		
	}

	/* @return 返回realPart */
	public double getRealPart() {
		return realPart;
	}

	/** @param realPart 要設定的 realPart。 */
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	/* @return 返回imaginaryPart */
	public double getImaginaryPart() {
		return imaginaryPart;
	}

	/** @param imaginaryPart 要設定的 imaginaryPart。 */
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	/** 將一個複數顯示為字串 */
	@Override
	public String toString() {
		return this.realPart + " + " + this.imaginaryPart + "i";
	}

	/* 主函式 */
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("請輸入第一個複數的實部和虛部(空格為分隔符)");
		ComplexNumber c1 = new ComplexNumber(scr.nextInt(), scr.nextInt());
		System.out.println("請輸入第二個複數的實部和虛部(空格為分隔符)");
		ComplexNumber c2 = new ComplexNumber(scr.nextInt(), scr.nextInt());
		System.out.println("ComplexNumber a" + c1.add(c1).toString());
		System.out.println("ComplexNumber b" + c2.add(c2).toString());
		System.out.println("(a + b) = " + c1.add(c2).toString());
		System.out.println("(a - b) = " + c1.decrease(c2).toString());
		System.out.println("(a * b) = " + c1.multiply(c2).toString());
	}
}
