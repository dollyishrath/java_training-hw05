package com.trimindtech.training.home05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.exit;

public class DvdRunner {
    public static void main(String[] args) {
        Dvd dvd1 = new Dvd("Iron Man", 3.5);
        Dvd dvd2 = new Dvd("Death Note", 3.0);
        Dvd dvd3 = new Dvd("Shrek 2", 2.5);
        Dvd dvd4 = new Dvd("Transformers", 3.25);
        Dvd dvd5 = new Dvd("The Eye", 3);
        Dvd dvd6 = new Dvd("Fantastic 4", 4);

        Map<String, Dvd> dvdMap = new HashMap<>();
        dvdMap.put("Iron Man", dvd1);
        dvdMap.put("Death Note", dvd2);
        dvdMap.put("Shrek 2", dvd3);
        dvdMap.put("Transformers", dvd4);
        dvdMap.put("The Eye", dvd5);
        dvdMap.put("Fantastic 4", dvd6);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name");
        String movieName = sc.nextLine();
        if(!dvdMap.containsKey(movieName)){
            System.out.println("Movie is not available");
            return;
        }
        Dvd dvd = dvdMap.get(movieName);
        System.out.println("a:Renting a DVD\n b:Returning a DVD\n" +
                " c:Print out information for all the DVDs.\n d:Exit Program");


        char choice = sc.next().charAt(0);

        switch (choice){
            case 'a':
                if(dvd.getMovieStatus() == MovieStatus.IN){
                    System.out.println("renting the dvd"+dvd.toString());
                    dvd.setMovieStatus(MovieStatus.OUT);
                }else{
                    System.out.println("it is not available, already rented");
                }
                break;
            case 'b':
                dvd.setMovieStatus(MovieStatus.IN);
                System.out.println("Added to Inventory" +dvd.toString());
                break;
            case 'c':
                for(String movieTitle : dvdMap.keySet()){
                    System.out.println(dvdMap.get(movieTitle).toString());
                }
                break;
            case 'd':
                exit(0);
                break;

        }
        System.out.println("Thank you for coming");
        System.out.println("Visit again");

    }
}
