import java.util.*;

class SavingAmount{
    private int saving;
    public void setInitialSaving(int amt){
        this.saving=amt;
    }
    public int getCurrentSaving(){
        return this.saving;
    }
    public void decrementSaving(){
        this.saving-=100;
        System.out.println(getCurrentSaving());
    }
    public void incrementSaving(){
        this.saving+=1000;
        System.out.println(getCurrentSaving());
    }
    public void checkSaving(){
        if(getCurrentSaving()>=1000) System.out.println("Congratulations! You have saved a good amount");
        else if(getCurrentSaving()>=0 && getCurrentSaving()<1000) System.out.println("Insufficient saving!");
        else System.out.println("You are in debt");
    }
}

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        SavingAmount obj = new SavingAmount();
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs "+obj.getCurrentSaving());
    }
}
