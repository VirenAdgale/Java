public class MAximunwealthlinearsearch {
    public static void main(String[] args) {
        //int[][] accounts=new int[3][4];
        int[][] jaggedArr = {
            {1, 2}, 
            {3, 4, 5}, 
            {6, 7, 8, 9}
        };
        System.out.println(maxwealth(jaggedArr));
        

    }
    public static int maxwealth(int[][] accounts)
    {
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++)
        {
            int sum=0;
            for(int account=0;account<accounts[person].length;account++)
            {
                sum+=accounts[person][account];
            }
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
       
    }
}
