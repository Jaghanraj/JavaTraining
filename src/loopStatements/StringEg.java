package loopStatements;

public class StringEg {
    public static void main(String[] args) {
            // TODO Auto-generated method stub
String Sentence="A cloudless plain blue sky is ike a flowerless garden";
String Sentence2="A cloudless plain blue sky is ike a flowerless garden";
String Text="Hi\nEveryone";
String Word="Love";
String Word1="Hate";
System.out.println("Convert to uppercase:"+Sentence.toUpperCase());
System.out.println("Convert to uppercase:"+Sentence.toLowerCase());
System.out.println(Sentence.indexOf("blue"));
System.out.println("Print the total number of strings present: "+Sentence.length());
System.out.println(Text);
System.out.println(Word.concat(Word1));
System.out.println(Sentence.charAt(5));
System.out.println(Sentence.contains("is"));
System.out.println(Sentence.contains("are"));
System.out.println(Sentence.replace("is","was"));
System.out.println(Sentence.compareTo(Sentence2));
    }
}