package com.edu;
/*   THINGS:
 - Be able to call book list by genre
    - or all if possible
 - Get array of branch names and locations, be able to call based on that list
    - funny user input go weeeee
 - Add and remove books from libraries
    - (check in and out)
    - Maybe duplicates?
 */

// so if i throw an edit here does it work? (yes)
public class Main {

    public static void main(String[] args) {
        Libraries.Missouri.StLouis myInnerObj = new Libraries.Missouri.StLouis();
        myInnerObj.hello();
        System.out.println(myInnerObj.getClass().getName());
    }
}
