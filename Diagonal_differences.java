public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int n=arr.size();
    int p=0,s=0,j=n-1;
    for(int i=0;i<n;i++)
    {
        p+=arr.get(i).get(i);
        s=s+arr.get(j).get(i);
        j--;
    }
    int r=Math.abs(p-s);
    return r;
    }
