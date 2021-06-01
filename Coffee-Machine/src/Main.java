import java.util.*;
public class Main {
  static long water = 400 , milk = 540 , coffeebeans = 120 , dispcups = 9 , money = 550;
    public static void main(String[] args) {
      while(true) {
      String action = menu();
      switch (action) {
        case "remaining": {
          System.out.println("The coffee machine has:");
          System.out.println( water + " of water");
          System.out.println( milk + " of milk");
          System.out.println( coffeebeans + " of coffee beans");
          System.out.println(dispcups + " of disposable cups");
          System.out.println( money + " of money");
          break ;
        }
        case "buy": {
          String ch = purchase();
          switch (ch) {
          case "1": {
            long min = Math.min( ( water / 250 ), Math.min( milk , ( coffeebeans / 16 ) ) ) ;
            if (min >= 1 && dispcups != 0) {
              System.out.println("I have enough resources, making you a coffee!");
              water -= 250 ; coffeebeans -= 16 ; money += 4 ; dispcups -= 1;
            } 
            else {
              if (water < 250 ) {
                System.out.println("Sorry, not enough water!");
              }
              else 
              if (coffeebeans < 16) {
                System.out.println("Sorry, not enough coffee beans!");
              }
              else {
                System.out.println("Sorry, not enough disposable cups!");
              }
            }
            break ;
          }
          case "2": {
            long min = Math.min( ( water / 350 ), Math.min( ( milk / 75 ) , ( coffeebeans / 20 ) ) ) ;
            if (min >= 1 && dispcups != 0) {
              System.out.println("I have enough resources, making you a coffee!");
              water -= 350 ; coffeebeans -= 20 ; milk -= 75 ;  money += 7 ; dispcups -= 1;
            } 
            else {
              if (water < 350 ) {
                System.out.println("Sorry, not enough water!");
              }
              else 
              if (coffeebeans < 20) {
                System.out.println("Sorry, not enough coffee beans!");
              }
              else {
                System.out.println("Sorry, not enough milk!");
              }
            }
            break ;
          }
          case "3": {
            long min = Math.min( ( water / 200 ), Math.min( ( milk / 100 ) , ( coffeebeans / 12 ) ) ) ;
            if (min >= 1 && dispcups != 0) {
              System.out.println("I have enough resources, making you a coffee!");
              water -= 200 ; coffeebeans -= 12 ; money += 6 ; milk -= 100 ; dispcups -= 1;
            } 
            else {
              if (water < 200 ) {
                System.out.println("Sorry, not enough water!");
              }
              else 
              if (coffeebeans < 12) {
                System.out.println("Sorry, not enough coffee beans!");
              }
              else {
                System.out.println("Sorry, not enough milk!");
              }
            }
            break ;
          }
          case "back": {
            ;
          }
          }
          break;
        }
          case "fill": {
            fillup();
            break;
          }
          case "take": {
          System.out.println("I gave you " + money);
          money = 0 ;
          break ;
        }
        case "exit": {
          System.exit(0);
        }
      }
      }
      }
    public static String menu() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Write action (buy, fill, take, remaining, exit):");
      String action = sc.next();
      sc.close();
      return action;
    }
    public static String purchase() {
      Scanner sc = new Scanner(System.in);
      System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
          String ch = sc.next();
          sc.close();
          return ch;
    }
    public static void fillup() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Write how many ml of water do you want to add: ");
          water += sc.nextLong();
          System.out.println("Write how many ml of milk do you want to add: ");
          milk += sc.nextLong();
          System.out.println("Write how many grams of coffee beans do you want to add: ");
          coffeebeans += sc.nextLong();
          System.out.println("Write how many disposable cups of coffee do you want to add: ");
          dispcups += sc.nextLong();
          sc.close();
    }
}