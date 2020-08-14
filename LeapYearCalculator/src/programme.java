/* ---

** Please read this entire page before attempting to solve this coding exercise.  Additional help is available by watching the video mentioned at the bottom of the page **
---

Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Examples of input/output:

isLeapYear(-1600); should return false since parameter is not in the range (1-9999)
isLeapYear(1600); should return true since 1600 is leap year
isLeapYear(2017); should return false since 2017 is not a leap year
isLeapYear(2000); should return true because 2000 is a leap year
NOTE: The isLeapYear method needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.

--

NEED HELP?  If you have not already watched video "Introduction To Coding Exercises", make sure you do that before you attempt this or any other challenge.  I show you how to go about solving a challenge, but also COMMON ERRORS you may get when attempting it.

Remember:  You need to solve this coding exercise EXACTLY as stated. Using a different method name, or returning a different data type, even adding an extra space to  information being printed out, or returned from a method will likely cause your solution to fail!

--- */
public class programme {

    public static boolean isLeapYear(int year) {
        if((year>= 1582)&&(year<= 9999)) {
            int divBy4Is = year% 4;
            int divBy100IsNot = year% 100;
            int divBy400Is = year% 400;

            if(((divBy4Is==0)&&(divBy100IsNot!=0))||(divBy400Is==0)) {
                System.out.println(year + " is Leap Year");
            }else {
                System.out.println(year + " is not a Leap Year");
            }return true;
        }else {
            System.out.println("Need to more than 1581");
            return false;
        }
    }

    public static void main(String[] args) {
        isLeapYear(1000);
    }
}
