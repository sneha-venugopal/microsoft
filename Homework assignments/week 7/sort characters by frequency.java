  class Solution {
    
    public String frequencySort(String s) {
           PriorityQueue<Map.Entry<Character,Integer>>q1=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        Map<Character,Integer> t1=new HashMap();
        for(char c:s.toCharArray())
            t1.put(c,t1.getOrDefault(c,0)+1);
        for(Map.Entry m:t1.entrySet())
             q1.add(m);
        StringBuilder b1=new StringBuilder();
        while(q1.size()>0)
        {
            Map.Entry element=q1.remove();
            for(int i=0;i<(int)element.getValue();i++)
            {
                b1.append(element.getKey());
            }
        }
        return b1.toString();
        
        
    }
}
