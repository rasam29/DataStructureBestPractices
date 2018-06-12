/**
 * Created by Rasam on 6/11/2018.
 */
public class power {


    public int power(int a, int b) {
        return power(a, b,a ,0);
    }


    private int power(int a, int b, int data,int i) {
        if (i == b) {
            return data;
        }

        return power(a,b,data+addIntrface(a),i+1);



    }


    public int addIntrface(int a){
        return add(a,0,0);
    }

    private int add(int a,int data,int i){
        if (i ==a){
            return data;
        }

        return add(a,data+a,i+1);
    }


}
