class Solution {
    public boolean lemonadeChange(int[] bills) {
        int bill5=0;
        int bill10=0;
        
        for(int bill:bills){
            if(bill==5){bill5++;}
            if(bill==10){
                if(bill5==0){return false;}
                bill5--;
                bill10++;
            }
            if(bill==20){
                if(bill5>=1&&bill10>=1){
                    bill5-=1;
                    bill10-=1;
                }else if(bill5>=3){
                    bill5-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}