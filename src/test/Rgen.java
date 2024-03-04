package test;

import java.util.Random;

public class Rgen {

    private static final String[] Quotes = {
            "The greatest leader is not necessarily the one who does the greatest things. He is the one that gets the people to do the greatest things. - Ronald Reagan",
            "Life is what happens when you're busy making other plans. - John Lennon",
            "In the end, it's not the years in your life that count. It's the life in your years. - Abraham Lincoln",
            "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
            "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
            "Believe you can and you're halfway there. - Theodore Roosevelt",
            "You miss 100% of the shots you don't take. - Wayne Gretzky",
            "Strive not to be a success, but rather to be of value. - Albert Einstein",
            "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt",
            "The best time to plant a tree was 20 years ago. The second best time is now. - Chinese Proverb"
    };

    public static void main(String[] args) 
    {  
    	Random r = new Random();
        System.out.println("Welcome to the Random Quote Generator!");
        System.out.println("--------------------------------------\n");
        int a = r.nextInt(Quotes.length);
        String Selected = Quotes[a];
        System.out.println("Here's your quote for today:");
        System.out.println(Selected);
    }
}
