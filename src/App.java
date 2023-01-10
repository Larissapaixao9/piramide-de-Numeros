public class App {
    public static void main(String[] args) throws Exception {

        int x = 5;
        String string = "";

        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                string+=i;
            }
            string+="\n";
        }

        System.out.println(string);
    }
}
