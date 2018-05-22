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
        return lenght;
    }

    public String subString(int init, int fin) {
        String temp = "";
        if (init < 0 || fin > lenght) throw new IndexOutOfBoundsException("your parameters are out of the char array");

        for (int i = init; i < fin; i++) {
            temp = temp + myArray[i];
        }

        return temp;

    }

    public String subStringBase(int init, int pos) {
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

    public String reverse(){
        char[] temp = new char[lenght];
        for (int i = 0,j = lenght-1;i<lenght;j--,i++){
            temp[i] = myArray[j];
        }
        return getString(temp);
    }








    


    public String subDelete(int init, int fin) {
        if (init < 0 || fin > lenght) throw new IndexOutOfBoundsException("your parameters are out of the char array");
        for (int i = init; i < fin; i++) {

        }

    }

    public int getIndex(String s) {
        for (int i = 0; i < lenght; i++)
            if (myArray[i] == s)
    }

}
