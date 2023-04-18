class Solution {
    public String mergeAlternately(String word1, String word2) {
        //merge string
        // String str = "";
        // Stack<Character> s1 = new Stack<>();
        //    Stack<Character> s2 = new Stack<>();
        // char[] character1 = word1.toCharArray();
        // char[] character2 = word2.toCharArray();
        // //Character[] ch1 = Character.valueOf(character1);
        // //Character[] ch2 = Character.valueOf(character2);
        // for( char i = 0 ; i < character1.length ; i++){
        //      s1.push((Character)character1);  
        // }
        //  for( char i = 0 ; i < character2.length ; i++){
        //      s2.push(ch2);  
        // }
        // while( !s1.isEmpty() && !s2.isEmpty()){
        //     str = s1.pop();
        //     str = s2.pop();
        // }
        // if( !s1.isEmpty()){
        //      str = s1.pop();
        // }else if(!s2.isEmpty()){
        //       str = s2.pop();
        // }
        // return str;
        //using stringbuilder
        StringBuilder res = new StringBuilder();
        int i=0 , j =0;
        while( i < word1.length() || j < word2.length() ){
            if(  i < word1.length() )
            res.append(word1.charAt(i++));
            //i++;
            if( j < word2.length() )
             res.append(word2.charAt(j++));
            //j++;
           // 
        }
        return res.toString();   
    }
}