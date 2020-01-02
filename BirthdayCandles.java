public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int lar=ar[0],c=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>lar)
            {
                lar=ar[i];
                c=0;
            }
            if(ar[i]==lar)
            c++;
        }
      return c;
    }
