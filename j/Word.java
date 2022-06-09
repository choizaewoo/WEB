package com.survivalcoding;
public class Word {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word word = new Word("Hello World");
		System.out.println(word.isVowel(0)); //성공
		System.out.println(word.isVowel(1)); //성공
		System.out.println(word.isVowel2(1)); //실패
		System.out.println(word.isVowel2(1)); //실패
	

	}

	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}

	// i번째 글자가 모음인지 // a, i, u, e, o
	public boolean isVowel(int i) {
		return letters.substring(i, i + 1).equals("a") || letters.substring(i, i + 1).equals("i")
				|| letters.substring(i, i + 1).equals("e") || letters.substring(i, i + 1).equals("o")
				|| letters.substring(i, i + 1).equals("u");
	}
	
	public boolean isVowel2(int i) {
		String vowel = "aieou";
		return letters.substring(i, i + 1).contains(vowel);
	}
	
	//i 번째 글자가 자음인지 /a,e,i,o,u 제외한 나머지 
	public boolean isConsonant(int i) {
		String consonant ="zxcvbnmlkjhgfdspytrewq";
		return letters.substring(i, i + 1).contains(consonant);
			
			
	}

}