class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] wordsArray = s.split("\\s+");
        String[] res=new String[wordsArray.length];
        int j=0;
        for(int i=wordsArray.length-1;i>=0;i--)
        {
            res[j]=wordsArray[i];
            j++;
        }
        return String.join(" ",res);
    }
}
// class Solution {
//     public String reverseWords(String s) {
//         String[] arr = s.trim().split("\\s+");
//         int i=0,j=arr.length-1;
//         while(i<j) {
//             String t = arr[i];
//             arr[i] = arr[j];
//             arr[j] = t;
//             i++;
//             j--;
//         }
//         return String.join(" ", arr);
//     }
// }