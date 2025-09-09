import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
      int passagerare[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      String placenumber [] = {"","","","","","","","","","","","","","","","","","","",""};
      int birthdate = 0;
      double placePrice = 299.90;
      float sum = 0;
      Scanner tb = new Scanner(System.in);
      int choice = 0;
      int bookingChoice = 0;
      int takenSeats = 0;

    
      while (true) {
      
        System.out.println("1.Book place");
        System.out.println("2.Press to see how many onoccupied seats");
        System.out.println("3.Press to see how much money has been earned");
        System.out.println("4.Turn of program");

        choice = choice(choice, tb);

    
    
    
        if(choice == 1){
          System.out.println("""


          """);

          bookingChoice = bus(bookingChoice, tb) - 1;

          if (passagerare[bookingChoice] == 0){

        while(true){
          try{
            System.out.print("Write your birthinformation, YYYYMMDD:");
            passagerare[bookingChoice] = tb.nextInt();
            if (passagerare[bookingChoice] > 20251231 || passagerare[bookingChoice] < 00010101 ) {
                System.out.println("Wrong date order");
                continue;
            }
            else{
                System.out.println("You spend " + placePrice +" dollars on the bus ticket.");
                sum += placePrice;
                if( passagerare[bookingChoice] > 0){
                  placenumber[bookingChoice] = Integer.toString(passagerare[bookingChoice]);
                }
                break;
            }
            
          }
          catch(Exception e){
            System.out.println("No characthers");
            tb.nextLine();
            continue;
          }
        }



        }
          else if( passagerare[bookingChoice] > 0){
            System.out.println("Place is taken.");
            Thread.sleep(3000);
          }
          System.out.println("""


          """);

        }

        else if(choice == 2){
          System.out.println("""


          """);

          takenSeats = occupiedSeats(takenSeats, passagerare);

          System.out.println("Number of occupied seats:" + takenSeats);

          Thread.sleep(3000);

          System.out.println("""


          """);

        }

        else if(choice == 3){
          System.out.println("""


              """);

          System.out.println("The sum of all the ticketscosts:" + sum);
          Thread.sleep(3000);


          System.out.println("""


          """);
        }

        else if(choice == 4){
          System.out.println("""


          """);

          System.out.println("You chose to close the program.");
          Thread.sleep(3000);
          System.exit(0);

          System.out.println("""


          """);

        }

        

      }
        




  }




    public static int choice (int choice, Scanner tb){

      while(true){
        try{
          System.out.print("What will be your choice:");
          choice = tb.nextInt();
          if(choice < 1 || choice > 4){
            System.out.println("between 1 and 4");
            tb.nextLine();
            continue;
          }
          break;
        }
          catch(Exception e){
            System.out.println("Not charachters");
            tb.nextLine();
            continue;
          }
    
      }
          return choice;
}

    public static int bus (int bookingChoice, Scanner tb){


      System.out.println("You chose to book a seat.");
      
      while (true) {
        
    
        try{
          System.out.print("Which spot do you want, 1 to 20:");  
          bookingChoice = tb.nextInt();
          if(bookingChoice < 1 || bookingChoice > 20){
            System.out.println("too much or to little.");
            tb.nextLine();
            continue;
          }
          else{
            break;
          }
        }
      
        catch(Exception e){
          System.out.println("No charachters.");
          tb.nextLine();
          continue;
        }



      }
        return bookingChoice;
    }

    public static int occupiedSeats (int takenSeats, int passagerare []) {

      for (int index = 0; index < passagerare.length; index++) {
        
        if(passagerare[index] > 0){
          takenSeats ++ ;
        }

      }

      return takenSeats;

    }



    
}

