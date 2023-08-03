package factory;

public class Calculation {

    public static int findMax1(int[] arr){
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }

    public static int findMax2(int[] arr){
        int max=arr[0];//arr[0] instead of 0
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }

    public static boolean findMax3(int var1){
        boolean flag=false;
        int var2=3;
        if(var1==var2){
            flag=true;
        }
        return flag;
    }
}
