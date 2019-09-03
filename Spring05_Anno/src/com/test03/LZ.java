package com.test03;

import org.springframework.stereotype.Component;

@Component("lz")
public class LZ implements TV{
	@Override
	public void powerOn() {
		System.out.println("LZ power on");
	}

	@Override
	public void powerDown() {
		System.out.println("LZ power down");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("LZ volume up");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("LZ volume down");
		
	}
}
