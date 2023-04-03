package Programming_Practice;

public class Triangle_Star_PAttern {

    /*
    to print star in triangle pattern
       *
     * * *
    * * * *
   * * * * *
  * * * * * *

  number of rows 5
  build relation now
  i Space and star
  i and space is
     */

    public static void main(String[] args) {

        for (int i=1; i<=5; i++){

            for (int s=1; s<= 5-i; s++){

                System.out.print(" ");
            }

            for (int j=1; j< i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
