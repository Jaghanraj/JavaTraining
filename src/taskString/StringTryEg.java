package taskString;

public class StringTryEg {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String Sentence = "Live and let live";
        String Sentence2 = "Live and let live";
        String Text = "Hi\nEveryone";
        System.out.println("Convert to uppercase: " + Sentence.toUpperCase());
        System.out.println("Convert to lowercase: " + Sentence.toLowerCase());
        System.out.println(Sentence.indexOf("let"));
        System.out.println("Print the total number of strings present: " + Sentence.length());
        System.out.println(Text);
        System.out.println(Sentence.concat(Sentence2));
        System.out.println(Sentence + " " + Sentence2);
        System.out.println(Sentence.charAt(5));
        System.out.println(Sentence.contains("and"));
        System.out.println(Sentence.contains("are"));
        System.out.println(Sentence.replace("and", "to"));
        
    }
}