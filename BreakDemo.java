public class BreakDemo {
    public static void main(String[] args) {
        int[] arrayOfInts = {37,87,3,58,12,1076,2000,8,62,187};
        int searchFor = 2000;
        boolean foundIt = false;
        int i;
        for(i=0;i<arrayOfInts.length;i++) {
            if(arrayOfInts[i]==searchFor){
                foundIt = true;
                break;
            }
        }
        if(foundIt) {
            System.out.println("Found "+searchFor+" at index of "+i);
        }
        else {
            System.out.println("Not Found");
        }
    }
}
