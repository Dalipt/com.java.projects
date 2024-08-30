package com.org.OOPS;
import java.util.*;
class guesser
{
	int guessNumber;
	
	int guesingNumber()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Guiser please guess da number");
		guessNumber=sc.nextInt();
		return guessNumber;
	}

}
class Player
{
	int guessNumber;
	int guesingnumber()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Player please guess da number");
	guessNumber=sc.nextInt();
	return guessNumber;
	}
}
class Umpire
{
	int numFromGueser;
	int numFromPlayer;
	int numFromPlayer1;
	int numFromPlayer2;

	void collectNumberFromGuesser()
	{
		guesser gc= new guesser();
		numFromGueser=gc.guesingNumber();
	}
	void collectNumberFromPlayer()
	{
		Player pr= new Player();
		numFromPlayer=pr.guesingnumber();
		Player pr1= new Player();
		numFromPlayer1=pr1.guesingnumber();
		Player pr2= new Player();
		numFromPlayer2=pr2.guesingnumber();
	}
	void compare()
	{
		if(numFromGueser==numFromPlayer)
		{
			if(numFromGueser==numFromPlayer1 && numFromGueser==numFromPlayer2 )
			{
			System.out.println("First Player Player1 and Player2 guessed correctly and game ties");
			}
			else if(numFromGueser==numFromPlayer1)
			{
			System.out.println("Player and Player1 guessed correctly");
			}	
			else if(numFromGueser==numFromPlayer2)
			{
			System.out.println("Player and Player2 guessed correctly");
			}
			else 
			{
				System.out.println("Player2 won the game");
			}
		}
		else if(numFromGueser==numFromPlayer1)
		{
			System.out.println("Second Player won the game");
		}
		else if(numFromGueser==numFromPlayer2)
		{
			System.out.println("Third Player won the game");
		}
		else
		{
			System.out.println("None won the game");
		}
	}
}


public class LaunchGame {

	public static void main(String[] args)
	{
		Umpire um= new Umpire();
		um.collectNumberFromGuesser();
		um.collectNumberFromPlayer();
		um.compare();

	}

}
