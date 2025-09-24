import java.util.*;
class Game{
    private int number;
    private int numberofgusses=0;
    private int inputnumber;

    public int getnumberofgusses(){
        return numberofgusses;
    }
    public void setnumberofgusses(int numberofgusses){
       this.numberofgusses=numberofgusses;
    }
    
     Game(){
        Random random=new Random();
        this.number=random.nextInt(100);
    }
    void userinput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber=sc.nextInt();
            }

    boolean correctInput(){
        numberofgusses++;
           if(inputnumber==number){
            System.out.print("yes you guess it right : "+numberofgusses);
            
            // return true;
           }else if(number>inputnumber){
            System.out.println("too less..");
           }
           else if(number<inputnumber){
            System.out.println("too high...");
           }
           return false;
    }
}
 class game{
    public static void main(String[] args){
       Game g=new Game();
       boolean b=false;
       while(!b){
      g.userinput();
       b=g.correctInput();
      System.out.println(b);
    }
    }
}
