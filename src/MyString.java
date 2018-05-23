/**
 * Created by Rasam on 5/20/2018.
 */
public class MyString {
    char[] myArray;
    int lenght;


    public MyString(int lenght) {
        this.lenght = lenght;
        myArray = new char[lenght];
    }


    public String getString() {
        String tmp = "";
        for (char character : myArray) {
            tmp = tmp + character;
        }
        return tmp;
    }

    private String getString(char[] chars) {
        String tmp = "";
        for (char character : chars) {
            tmp = tmp + character;
        }
        return tmp;
    }

    public int getLenght() {

        lenght = myArray.length;
        return myArray.length;
    }

    public String subString(int init, int fin) {
        String temp = "";
        if (init < 0 || fin > lenght) throw new IndexOutOfBoundsException("your parameters are out of the char array");

        for (int i = init; i < fin; i++) {
            temp = temp + myArray[i];
        }

        return temp;

    }

    public String subStringBase(int pos,int init) {
        String temp = "";
        if (init + pos > lenght) throw new IndexOutOfBoundsException("your parameters are out of the char array");

        for (int i = pos; i < (pos + init); i++) {
            temp = temp + myArray[i];
        }
        return temp;

    }

    public void strCat(String s) {
        if (myArray.length < s.length() + lenght) {
            char[] newArray = new char[s.length() + lenght];
            for (int i = 0; i < lenght; i++) {
                newArray[i] = myArray[i];
            }
            myArray = newArray;
        }

        for (int i = 0; i < s.length(); i++) {
            myArray[lenght++] = s.toCharArray()[i];
        }

    }

    public void reverse() {

        char tempNumber;
        for (int i = 0, j = lenght - 1; i < j; j--, i++) {
            tempNumber = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = tempNumber;

        }

    }

    public void strIns(int pos, String s) {
        if (myArray.length < lenght + s.length()) {
            char[] tempChar = new char[lenght + s.length()];
            for (int i = 0; i < lenght; i++) {
                tempChar[i] = myArray[i];
            }
            myArray = tempChar;
        }
        if (pos < 0 || pos > myArray.length)
            throw new IndexOutOfBoundsException("Number is out of range of your array");

        for (int i = lenght - 1; i >= pos; i--) {
            int cuurent = (i + s.length());
            myArray[cuurent] = myArray[i];
        }

        for (int i = 0; i < s.length(); i++) {
            myArray[i + pos] = s.toCharArray()[i];
        }


    }


//    public String subDelete(int init, int fin) {
//        if (init < 0 || fin > lenght) throw new IndexOutOfBoundsException("your parameters are out of the char array");
//        for (int i = init; i < fin; i++) {
//
//        }
//
//    }

//    public int getIndex(String s) {
//        for (int i = 0; i < lenght; i++)
//            if (myArray[i] == s)
//    }

}
