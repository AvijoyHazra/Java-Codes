public class ASS5B{
    public static void main(String[] args)
    {
        System.out.println("The automorphic numbers are");
        for(int i=11;i<=40;i++)
        {
            if((i*i-i)%100==0 && (i*i)%100!=0)
            {
                System.out.print(i+" ");
            }

        }
    }
}