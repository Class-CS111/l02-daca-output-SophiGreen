// PARTNER NAME: Sophia Platas
// PARTNER NAME: N/A
// CS111 SECTION #: 2
// DATE: 2/2/2025

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		//complete fields
		String surname, givenName, category, cardNum, birthCountry, termsandConditions;
		char sex;
		

		//parts of fields
		String birthMonth;
		int usciNum1, usciNum2, usciNum3, birthDay, birthYear, validDay, validMonth, validYear, expireMonth, expireDay, expireYear;
	
		surname = "PLATAS";
		givenName = "SOPHIA";
		category = "C09";
		cardNum = "SPG7779075689";
		birthCountry = "Mexico";
		termsandConditions = "None";
		sex = 'F';

		birthMonth = "JAN";
		usciNum1 = 123;
		usciNum2 = 456;
		usciNum3 = 789;
		birthDay = 10;
		birthYear = 2005;
		validDay = 4;
		validMonth = 1;
		validYear = 2025;
		expireMonth = 9;
		expireDay = 2;
		expireYear = 2030;

		
		//INPUT SECTION
		//N/A
		//CALCULATION SECTION
		//N/A

		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName + " ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " + usciNum1 + "-" + usciNum2 + "-" + usciNum3 + "    " + category + "        " + cardNum + " ");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + birthCountry + " ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + termsandConditions + " ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         "+ birthDay + " " + birthMonth + " " + birthYear + "     " + sex + "");
		System.out.println("║                       Valid From:     " + validDay + "/" + validMonth + "/" + validYear + "");
		System.out.println("║                       Card Expires:   " + expireDay + "/" + expireMonth + "/ " + expireYear + "");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}