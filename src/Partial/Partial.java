package Partial;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Partial {
	public static ArrayList<String> readWords() throws FileNotFoundException {
		ArrayList<String> allWords = new ArrayList<String>();
        Scanner input = new Scanner(new File("words.txt"));
        while (input.hasNext()) {
            String word = input.next();
            allWords.add(word);
        }	
        return allWords;
	}
	public static ArrayList<String> readWordsReverse() throws Exception {
		ArrayList<String> allWords = new ArrayList<String>();
		allWords = readWords();
		ArrayList<String> reverseWords = new ArrayList<String>();
		Collections.reverse(allWords);
		reverseWords = allWords;
		return reverseWords;
	}
	public static ArrayList<String> capitalizePluralWords() throws Exception {
		ArrayList<String> allWords = new ArrayList<String>();
		ArrayList<String> capitalizePluralWords = new ArrayList<String>();
		allWords = readWords();
		for (int i=0; i<allWords.size(); i++) {
			capitalizePluralWords.add(null);
		};
		for (int i=0; i<allWords.size(); i++) {
			String word = allWords.get(i);
			if (word.endsWith("s")) {
				String wordCap = word.substring(0, 1).toUpperCase() + word.substring(1);
				capitalizePluralWords.set(i, wordCap);
			}else {
				capitalizePluralWords.set(i, word);
			}
		}
		return capitalizePluralWords;
	} 
	public static ArrayList<String> withOutPluralWords() throws Exception {
		ArrayList<String> allWords = new ArrayList<String>();
		ArrayList<String> withOutPluralWords = new ArrayList<String>();
		allWords = readWords();
		for (int i=0; i<allWords.size(); i++) {
			withOutPluralWords.add(null);
		};
		int count = 0;
		for (int i=0; i<allWords.size(); i++) {
			String word = allWords.get(i);
			if (!word.endsWith("s")) {
				withOutPluralWords.set(count, word);
				count++;
			}
		}
		return withOutPluralWords;
	}
	public static void main(String[] args) throws Exception {
		String cadena = "";
	    ArrayList<String> words = readWords();
	    ArrayList<String> reverseWords = readWordsReverse();
	    ArrayList<String> capitalizePluralWords = capitalizePluralWords();
	    ArrayList<String> withOutPluralWords = withOutPluralWords();
	    System.out.println("Palabras normales: ");
	    for (int i=0; i<words.size(); i++) {
	    	cadena += " " + words.get(i);
	    }
	    System.out.println(cadena);
	    cadena = "";
	    System.out.println("\n Palabras de revés: ");
	    for (int i=0; i<reverseWords.size(); i++) {
	    	cadena += " " + reverseWords.get(i);
	    }
	    System.out.println(cadena);
	    cadena = "";
	    System.out.println("\n Palabras con plurales capitalizadas: ");
	    for (int i=0; i<capitalizePluralWords.size(); i++) {
	    	cadena += " " + capitalizePluralWords.get(i);
	    }
	    System.out.println(cadena);
	    cadena = "";
	    System.out.println("\n Palabras sin plurales: ");
	    for (int i=0; i<withOutPluralWords.size(); i++) {
	    	cadena += " " + withOutPluralWords.get(i);
	    }
	    System.out.println(cadena);
	}
}

