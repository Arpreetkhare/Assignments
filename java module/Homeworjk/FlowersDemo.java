
import java.util.Scanner;

class Flower{

    public String name ;
    public String color;
    public String hasFragrance;

   

    Flower( String name , String color , String hasFragrance){
        this.name = name ;
        this.color = color ;
        this.hasFragrance = hasFragrance ;

    }

    public void display(){
        System.out.println("Flower Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Has Fragranc: " + this.hasFragrance);

    }
}

class Rose extends Flower{
    public String hasThorns;

   

    Rose( String name , String color , String hasFragrance ,String hasThorns){
        super(name, color, hasFragrance);
        this.hasThorns =hasThorns ;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Has Thorns: "+ this.hasThorns);
    }


}


class  Lily extends Flower{
    public String isWaterPlant;

   

    Lily( String name , String color , String hasFragrance ,String isWaterPlant){
        super(name, color, hasFragrance);
        this.isWaterPlant = isWaterPlant ;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Grows in Water: " + this.isWaterPlant);
    }



}

class FlowersDemo{
    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of flower (Rose/Lily): ");
        String flowerType = sc.nextLine();

        System.out.println("Enter the name of the flower: ");
        String name = sc.nextLine();

        System.out.println("Enter the color of the flower: ");
        String color = sc.nextLine();

        System.out.println("it has fragrance of the flower: ");
        String hasFragrance = sc.nextLine();

        
       if ( flowerType.equalsIgnoreCase("Rose")){
        System.out.println("Does the rose have thorns? (Yes/No): ");
        String hasThorns = sc.nextLine();
        Rose r = new Rose(name, color, hasFragrance, hasThorns);
        System.out.println("---- Rose Details ----");
        r.display();


       }
       else if (flowerType.equalsIgnoreCase("Lily")){
        System.out.println("Is the lily a water plant? (Yes/No): ");
        String isWaterPlant = sc.nextLine();
        Lily l = new Lily(name, color, hasFragrance, isWaterPlant);
        System.out.println("\n---- Lily Details ----");
        l.display();

       }

       else{
        Flower f= new Flower(name, color, hasFragrance);
        System.out.println("\n---- Flower Details ----");
        f.display();

       }



        


        


        // Rose r = new Rose();

    }

}    