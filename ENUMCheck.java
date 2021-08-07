import java.util.*;

enum ENUMCheck {
    RED("STOP", "CITY"), GREEN("GO", "Village"), ORANGE("SLOW DOWN", "construction work ");
    private String action;
    private String name;

    public String getName() {
        return name;
    }

    public String getAction() {
        return this.action;
    }

    private ENUMCheck(String action, String name) {
        this.action = action;
        this.name = name;
    }

    public static void main(String[] args) {
       System.out.println(ENUMCheck.ORANGE.getName());
        System.out.println(ENUMCheck.ORANGE.getAction());




        //sencond max
   /*     int[] r = {1, 2, 3, 6, 23, 12};
        int secondmax = 0;
        int firstmax = 0;
        // for (int i = 0; i < r.length; i++) {
//         for(int i:r){
//               if(i>firstmax){
//                   secondmax=firstmax;
//                   firstmax=i;
//               }else if (i>secondmax){
//                   i=secondmax;
//               }
//         }
        for (int i = 0; i < r.length; i++) {

            if (r[i] > firstmax) {
                secondmax = firstmax;
                firstmax = r[i];

            } else if (r[i] > secondmax) {
                secondmax = r[i];

            }
        }     System.out.println(secondmax);
*/
}}