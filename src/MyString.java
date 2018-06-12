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


    public String reverseWordsWithWS(String s){
        char array[] = s.toCharArray();
        int startPosition = -1;
        int endPosition = s.length()-1;
        for (int i = 0;i<array.length;i++){
            if (array[i] == 'W' || array[i] == 'w'){
                startPosition = i;
                break;
            }
        }



        for(int j = startPosition;j<s.length();j++){
            if (array[j] == ' ' || array[j] == '.' || array[j] == '?'){
                endPosition = j-1;
            }
        }

        for (int k = startPosition,h = endPosition;k<h;k++,h--){
            char temp = array[h];
            array[h] = array[k];
            array[k] = temp;
        }
        String temp = "";
        for (char c:array){
            temp = temp+c;
        }
        return temp;


    }


    public String reverseWordsWithW(String s)
    {
        char[] str_array = s.toCharArray();
        int word_start_position , word_end_position ;

        for (int i = 0 ; i < s.length() ; i++)
        {
            word_start_position = -1 ;

            // اگر یک کلمه با دبلیو شروع شده باشد محل شروع کلمه را ذخیره میکند
            if (s.toCharArray()[i] == 'W' || s.toCharArray()[i] == 'w')
                word_start_position = i;

            while (i < s.length() && s.toCharArray()[i] != ' ' && s.toCharArray()[i] != '.' && s.toCharArray()[i] != '?') i++ ;

            word_end_position = i - 1;

            if (word_start_position != -1)
            {
                for (int k = word_start_position, j = word_end_position; k < j; k++, j--)
                {
                    char temp = str_array[k];
                    str_array[k] = str_array[j];
                    str_array[j] = temp;
                }
            }
        }

        String return_value = "" ;

        for (int i = 0; i < s.length(); i++)
            return_value += str_array[i];

        return return_value;
    }









//    public String subDelete(int init,int fin) {
//        if (init < 0 || fin > lenght) throw new IndexOutOfBoundsException("your parameters are out of the char array");
//        for (int i = init; i < fin; i++) {
//
//        }
//
//    }

    public int getIndex(String s) {
      int max  = myArray.length - s.length()+1;
      for (int i=0;i<max;i++){
          for (int j=0;j<s.length() && myArray[i+j] == s.toCharArray()[j];j++){
              if (j == s.length()) return i;

          }
      }
      return -1;
    }

}
