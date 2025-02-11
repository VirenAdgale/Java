public class Evennumberlinearsearch {
    public static void main(String[] args) {
        int[] nums={123,33,4567,8769,23};
        System.out.println(Finddigits(nums));
        
    }
    static int Finddigits(int[] nums)
    {
        
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num)
    {
        int noofdigits=digits(num);
        return noofdigits % 2==0;
    }
    static int digits(int num)
    {
        if(num < 0)
        {
            num=num * -1;
        }
        if(num ==0)
        {
            return 1;
        }
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;

        }
        return count;
    }

}