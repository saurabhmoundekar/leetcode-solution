class Solution 
{
    public boolean wordPattern(String pattern, String s)
    {
        String[] words=s.split(" ");
        if(words.length!=pattern.length())
            return false;
        Map<Character,Integer> chartoindex=new HashMap<>();
        Map<String,Integer> stringtoindex=new HashMap<>();
        for(int i=0;i<pattern.length();++i)
        {
            if(chartoindex.put(pattern.charAt(i),i)!=stringtoindex.put(words[i],i))
                return false;
            
        }
    return true;
    }
}
