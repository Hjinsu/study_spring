package com.test07;

public class LZ implements TV {

	public LZ() {
		System.out.println("LZ TV 생성");
		
	}

	@Override
	public void powerOn() {
		System.out.println("LZ TV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("LZ TV powerOff");
	}

	@Override
	public void volumeUp() {
		System.out.println("LZ TV volumeUp");

	}

	@Override
	public void volumeDown() {
		System.out.println("LZ TV volumeDown");

	}

}
