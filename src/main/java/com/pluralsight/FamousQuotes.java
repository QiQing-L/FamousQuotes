package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] famousQuotes = { "'The only thing we have to fear is fear itself.' — Franklin D. Roosevelt",
            "'In the middle of every difficulty lies opportunity.' — Albert Einstein",
            "'Be the change that you wish to see in the world.' — Mahatma Gandhi",
            "'The future belongs to those who believe in the beauty of their dreams.' — Eleanor Roosevelt",
            "'Success is not final, failure is not fatal: it is the courage to continue that counts.' — Winston Churchill",
            "'Do not go where the path may lead, go instead where there is no path and leave a trail.' — Ralph Waldo Emerson",
            "'It always seems impossible until it’s done.' — Nelson Mandela",
            "'The greatest glory in living lies not in never falling, but in rising every time we fall.' — Nelson Mandela",
            "'Happiness depends upon ourselves.' — Aristotle",
            "'Your time is limited, so don’t waste it living someone else’s life.' — Steve Jobs"
        };
       try {
           System.out.print("select a number (1-10) to display a quote: ");
           int input = scanner.nextInt();

           System.out.println(famousQuotes[input - 1]);
       }catch (Exception e){
           System.out.println("Error, please enter only number 1-10." );
           scanner.nextLine();
       }


    }
}
