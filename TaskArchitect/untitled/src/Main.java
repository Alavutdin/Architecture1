public class Main {
    public static final String Even="Yes";
    public static final String Den="No";
    public static final String []arrayStr=new String[5];

    public static void main(String[] args) {
        arrayStr[0]=Even;
        arrayStr[1]=Den;
        arrayStr[2]=Even;
        arrayStr[3]=Den;
        arrayStr[4]=Even;
        for (int i = 0; i < arrayStr.length; i++) {
            if((i%2)==0){
                System.out.println(arrayStr[i]);
            }else {
                System.out.println(arrayStr[i]);
            }
        }


    }
}