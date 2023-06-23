package serverside;

public class SentenceProcessor {
	
	private int size = 65535;
	
	private String sentence;
	
	
	public SentenceProcessor(byte[] byteData) {
		
		this.sentence = new String(byteData);
	}
	
	public String getSentence() {
		
		return sentence;
	}
	
	/**
	 * This method convert value into an array of byte
	 * @param length
	 * @return
	 */
	public byte[] convertToByteArray(int value) {
		
		byte[] outData = new byte[size];
		
		String stringValue = Integer.valueOf(value).toString();
		
        outData = stringValue.getBytes();
        
        return outData;
	}
	
	/**
	 * This method count the number of vowel in a sentence
	 * @return
	 */
	public int countCharacters() {
		
        int index = 0;
        char currentChar = sentence.charAt(index);
        while (currentChar != '\0') {
        	
        	currentChar = sentence.charAt(index++);
        }
        

        return index - 1;
	}
	
	public int countVowel() {
		
        int index = 0;
        int vowel = 0;
       
        while (index < sentence.length()) {
        	char currentChar = sentence.toLowerCase().charAt(index);	
        	if(currentChar == 'a' || currentChar == 'e'|| currentChar == 'i' || currentChar == 'o'||  currentChar == 'u')
        	{
        		vowel++;
        	}
        	
        	index++;
        }
        

        return vowel;
		
	}
	
	public int countConsonant() {
		
        int index = 0;
        int consonant = 0;
        int count = 0; 
        
        while (index < sentence.length()) {
        	char currentChar = sentence.toLowerCase().charAt(index);	
        	if(currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' &&  currentChar != 'u' && currentChar != ' ')
        	{
        		count++;
        	}
        	
        	index++;
        }
        int punctuation = countPunctuation();
        consonant = size - count - punctuation;
        return consonant;
		
	}
	
public int countPunctuation() {
		
        int index = 0;
        int punctuation = 0;
        
        while (index < sentence.length()) {
        	char currentChar = sentence.toLowerCase().charAt(index);	
        	if(currentChar == ',' || currentChar == '.' || currentChar == '!' || currentChar == '?')
        	{
        		punctuation++;
        	}
        	
        	index++;
        }

        return punctuation;
		
	}
}
