package com.test02;

import java.util.Locale;

public class LocaleTest {
	public static void main(String[] args) {
		
		Locale l = Locale.getDefault();
		System.out.println(l);
		
		Locale[] le = Locale.getAvailableLocales();
		
		for(Locale e : le) {
			System.out.println(e.toString() + "\t" + e.getCountry()+ "\t" +e.getLanguage()+ "\t" +e.getDisplayName());
		}
		
		Locale.setDefault(new Locale("fr", "FRANCE", "MAC"));
		
		Locale a = Locale.getDefault();
		System.out.println(a);
		System.out.println(a.getDisplayName());
	}
}
