package taskString;

public class RemovalOfCharacters {
    
    public void removeCharacters(String str1,String str2)
    {
        char compare;
        String remaining1 = str1,remaining2 = str2,search,replace="";
        for (int count1 =0;count1 < str1.length();count1++)
        {
            compare = str1.charAt(count1);
            search = Character.toString(compare);
            
            for (int count2 = 0; count2 < str2.length();count2++)
            {
                if (compare == str2.charAt(count2))
                {
                    remaining1 = remaining1.replace(search,replace);
                    remaining2 = remaining2.replace(search, replace);
                }
            }
            
        }
        System.out.println("After removing String2 in String1 :"+remaining1);
        System.out.println("After removing String1 in String2:"+ remaining2);
        
    }

}
