class Solution {
    //time complexity == nk
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null)
            return new ArrayList<>();
        //create a map
        Map<String, List<String>> map = new HashMap<>();
        //run a loop for each string of String Array
        for(String s : strs) {
            //create a char array of size 26
            char[] ch = new char[26];
            //iterate over the char array(String converted), and increase each character's value by 1
            for(char c : s.toCharArray()) {
                ch[c - 'a']++;
            }
            //convert char array, back to String
            String temp = String.valueOf(ch);
            
            //if map doesnt contains that string as key, then put it with a new ArrayList object
            if(!map.containsKey(temp))
                map.put(temp, new ArrayList<>());
            //otherwise put value into the existing key
            map.get(temp).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
///////time complexity= NKlogK
//Using Sorting
// public List<List<String>> groupAnagrams(String[] strs) {
//         if(strs.length == 0 || strs == null)
//             return new ArrayList<>();
//         //create a map
//         Map<String, List<String>> map = new HashMap<>();
//         //run a loop for each string of String Array
//         for(String s : strs) {
//             //convert string to char Array and Sort it
//             char[] ch = s.toCharArray();
//             Arrays.sort(ch);
//             //convert char array, backto String
//             String temp = String.valueOf(ch);
//             //if map doesnt contains that string as key, then put it with a new ArrayList object
//             if(!map.containsKey(temp))
//                 map.put(temp, new ArrayList<>());
//             //otherwise put value into the existing key
//             map.get(temp).add(s);
//         }
//         return new ArrayList<>(map.values());
//     }