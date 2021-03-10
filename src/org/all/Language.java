package org.all;

import org.telugu.Telugu;

public class Language extends Telugu {
	public void allLanguage() {
		System.out.println("Languages");
	}

	public static void main(String[] args) {
		Language lang=new Language();
		lang.allLanguage();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.teluguLanguage();

	}

}
