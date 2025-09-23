import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
      int passagerare[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      String placenumber [] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
      String names [] = {"","","","","","","","","","","","","","","","","","","",""};
      String name ="";
      final double placePrice = 299.90;
      final double placePriceChild = 149.90;
      float sum = 0;
      Scanner tb = new Scanner(System.in);
      int choice = 0;
      int bookingChoice = 0;
      int takenSeats = 0;
      int bookingNumber = 0;
      String windowChoice;
      int window = 0;
      

    
      while (true) {
      
        System.out.println("1.Book place");
        System.out.println("2.Press to see how many onoccupied seats");
        System.out.println("3.Press to see how much money has been earned");
        System.out.println("4.Turn of program");
        System.out.println("5.Find booked seat");
        System.out.println("6.Remove booked seat");

        choice = choice(choice, tb);

        
    
    
        if (choice == 1){
          System.out.println("""


          """);

          tb.nextLine();
          while(true)
          {
            try
            {
              System.out.println("Would you like a window seat");
              windowChoice = tb.nextLine();
              if (windowChoice.equalsIgnoreCase("yes")) 
              {
                break;
              }
              else if(windowChoice.equalsIgnoreCase("no"))
              {
                break;
              }
              else
              {
                System.out.println("yes or no");
                tb.nextLine();
                continue;
              }
              
            }
            catch(Exception e)
            {
              System.out.println("No numbers");
              tb.nextLine();
              continue;
            }
          }


          if (windowChoice.equalsIgnoreCase("no"))
          {
            bookingChoice = bus(bookingChoice, tb) - 1;
          }
          else if(windowChoice.equalsIgnoreCase("yes"))
          {
            window = windowSeats(bookingChoice, passagerare, window);
            window -= 1;

            if(passagerare[window] == 0)
            {
              while(true){
                try{
                  System.out.print("Write your birthinformation, YYYYMMDD:");
                  passagerare[window] = tb.nextInt();
                  if (passagerare[window] > 20251231 || passagerare[window] < 19250000 ) {
                      System.out.println("Wrong date order");
                      continue;
                  }
                  else
                  {
                    tb.nextLine();
                    break;
                  }
                  
                }
                catch(Exception e){
                  System.out.println("No characthers");
                  tb.nextLine();
                  continue;
                }
              }
      
              while (true) {
                try
                {
                  System.out.print("What is your name:");
                  name = tb.nextLine();
                  break;
                }
                catch(Exception e)
                {
                  System.out.println("No numbers");
                  tb.nextLine();
                  continue;
                }
              }
              names[window] = name;
      
      
              if (passagerare[window] > 20071231) 
              {
                  System.out.println("You pay " + placePriceChild + " crowns for a bus ticket. ");
                  sum += placePriceChild;
                  if( passagerare[window] > 0){
                    placenumber[window] = Integer.toString(passagerare[bookingChoice]);
                  }
                  Thread.sleep(3000);
              }
              else if(passagerare[window] < 20071231 )
              {
                System.out.println("You spend " + placePrice +" dollars on the bus ticket.");
                sum += placePrice;
                if( passagerare[window] > 0){
                  placenumber[window] = Integer.toString(passagerare[window]);
                }
              }

              continue;
            }
                else if( window == 0){
                  System.out.println("No window seats.");
                  Thread.sleep(3000);
                }
                System.out.println("""
      
      
                """);
                continue;
            }
            
          


      if (passagerare[bookingChoice] == 0){

        while(true){
          try{
            System.out.print("Write your birthinformation, YYYYMMDD:");
            passagerare[bookingChoice] = tb.nextInt();
            if (passagerare[bookingChoice] > 20251231 || passagerare[bookingChoice] < 19250000 ) {
                System.out.println("Wrong date order");
                continue;
            }
            else
            {
              tb.nextLine();
              break;
            }
            
          }
          catch(Exception e){
            System.out.println("No characthers");
            tb.nextLine();
            continue;
          }
        }

        while (true) {
          try
          {
            System.out.print("What is your name:");
            name = tb.nextLine();
            break;
          }
          catch(Exception e)
          {
            System.out.println("No numbers");
            tb.nextLine();
            continue;
          }
        }
        names[bookingChoice] = name;


        if (passagerare[bookingChoice] > 20071231) 
        {
            System.out.println("You pay " + placePriceChild + " crowns for a bus ticket. ");
            sum += placePriceChild;
            if( passagerare[bookingChoice] > 0){
              placenumber[bookingChoice] = Integer.toString(passagerare[bookingChoice]);
            }
            Thread.sleep(3000);
        }
        else if(passagerare[bookingChoice] < 20071231 )
        {
          System.out.println("You spend " + placePrice +" dollars on the bus ticket.");
          sum += placePrice;
          if( passagerare[bookingChoice] > 0){
            placenumber[bookingChoice] = Integer.toString(passagerare[bookingChoice]);
          }
        }


      }
          else if( passagerare[bookingChoice] > 0)
          {
            System.out.println("Place is taken.");
            Thread.sleep(3000);
          }
          System.out.println("""


          """);

        }
      
        else if (choice == 2)
        {
          System.out.println("""


          """);

          takenSeats = occupiedSeats(takenSeats, passagerare);

          System.out.println("Number of occupied seats:" + takenSeats);

          Thread.sleep(3000);

          System.out.println("""


          """);

        }

        else if (choice == 3)
        {
          System.out.println("""


              """);

          System.out.println("The sum of all the ticketscosts:" + sum);
          Thread.sleep(3000);


          System.out.println("""


          """);
        }

        else if (choice == 4)
        {
          System.out.println("""


          """);

          System.out.println("You chose to close the program.");
          Thread.sleep(3000);
          

          System.out.println("""


          """);
          break;
        }
        
        else if (choice == 5)
        {

          while (true) {
            
          
            try {
              System.out.print("To find your booking we need your bookingnumber:");
              bookingNumber = tb.nextInt();
              if (bookingNumber > 20251231 || bookingNumber < 00010101) {
                  System.out.println("Too much or too little");
                  tb.nextLine();
                  continue;
              }
            
              
              else
              {
                break;
                
              }
          
            } 
            catch (Exception e) 
            {
              System.out.println("Not charachters");
              tb.nextLine();
              Thread.sleep(3000);
            }

          }
          for (int index = 0; index < passagerare.length; index++) 
          {
            if (bookingNumber == passagerare[index]) 
            {
              index +=1;
              System.out.println("Your place is " + index);
              index -=1;
              tb.nextLine();
              break;
            }
            else if(index == 19)
            {
              System.out.println("Place does not exist");
            }
          }
          Thread.sleep(3000);
      }

        else if (choice == 6)
        {
          while (true) {
            
          
            try {
              System.out.print("To find your booking we need your bookingnumber:");
              bookingNumber = tb.nextInt();
              if (bookingNumber > 20251231 || bookingNumber < 00010101) {
                  System.out.println("Too much or too little");
                  tb.nextLine();
                  continue;
              }
            
              
              else
              {
                break;
              }
          
            } 
            catch (Exception e) 
            {
              System.out.println("Not charachters");
              tb.nextLine();
              Thread.sleep(3000);
            }

          }
          for (int index = 0; index < passagerare.length; index++) 
          {
            if (bookingNumber == passagerare[index]) 
            {
              index += 1;
              System.out.println("Removing place " + index);
              index -= 1;
              passagerare[index] = 0;
              tb.nextLine();
              break;
            }
            else if(index == 19)
            {
              System.out.println("Place does not exist");
            }
          }
          

          Thread.sleep(3000);
        }

      }
      tb.close();  




  }





    public static int choice (int choice, Scanner tb){

      while(true){
        try{
          System.out.print("What will be your choice:");
          choice = tb.nextInt();
          if(choice < 1 || choice > 6){
            System.out.println("between 1 and 6");
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

    public static int windowSeats (int bookingChoice, int[]passagerare, int window)
    {
      for (int index = 0; index < 16; index += 4) 
      {
        if(passagerare[index] == 0)
        {
          index ++;
          System.out.println("\nWindow seat " + index + " chosen");
          window = index;
          return window;
        }
      }
      for (int index = 3; index < 19; index += 4) 
      {
        if(passagerare[index] == 0)
        {
          index ++;
          System.out.println("\nWindow seat " + index + " chosen");
          window = index;
          return window;
        }
      }
      return 0;
      
    }

    
}

