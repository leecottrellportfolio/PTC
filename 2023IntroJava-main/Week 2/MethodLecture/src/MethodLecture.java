public class MethodLecture {

    //return type methodName([parameters]){

    //}

    /*
     * methods
     * put logic of program into methods
     * each method does one thing
     * try to make each method independent of others
     * think how to make the function reusable
     */

    public static void myAddress(){
        System.out.println("1434 Justine Street");
        System.out.println("Pittsburgh, PA 15204");
    }

    public static double calcAvg(int a, int b, int c){
        double avg = 0;
        avg = (a + b+ c) / 3.0;
        return avg;
    }
    public static void main(String[] args) throws Exception {
        myAddress();
        myAddress();
        myAddress();

        double ans;
        ans = calcAvg(5, 10, 32);
        System.out.println("Avg is " + ans);
        System.out.println("Avg is " + calcAvg(3, 5, 15));
        
        Math.sqrt(calcAvg(4, 15, 32));

        /*double number = 9;
        double ans;

        ans = Math.sqrt(number);
        System.out.println("answer is " + ans);

        String fname="Lee", lname="Cottrell";
        String username;
        //fname.ch
        username = fname.charAt(0) + lname.toLowerCase();
        username = username.toLowerCase();
        System.out.println(username);

        String uncleBen = "with great power comes great responsibility";

        String deadPool = uncleBen.replaceAll("great","no");
        System.out.println(deadPool);
        */
    }
}
