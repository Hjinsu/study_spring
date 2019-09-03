package com.test07;

public class Samsong implements TV {
	public Samsong() {
		System.out.println("Samsong TV 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("Samsong TV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsong TV powerDown");
	}

	@Override
	public void volumeUp() {
		System.out.println("Samsong TV volumeUp");
	}

	@Override
	public void volumeDown() {
		System.out.println("Samsong TV volumeDown");
	}

}
