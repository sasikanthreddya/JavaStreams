public class PalindramCheck {
    public   int checkPlaindram(int num){
        int reverseno=0;
        while (num !=0){
            reverseno=reverseno*10+(num%10);
            num=num/10;
        }return  reverseno;
    }

    public static void main(String[] args) {
        //PalindramCheck.checkPlaindram(212);
        for(int i=1;i<=2;i++){
            for(int j=1;i<=j;j++){
                System.out.println(j);
            }

        }

    }
}
