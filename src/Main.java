import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String scrambleWord(String w){
        String front,back,a,sub="";
        for(int x=0;x<w.length()-2;){
            if(w.substring(x,x+2).equals("aa")){
                x++;
            }
            else{
                if(w.substring(x,x+1).equals("a")) {
                    a = "a";
                    sub = w.substring(x + 1, x + 2);
                    front = w.substring(0, x);
                    back = w.substring(x + 2);
                    w = front + sub + a + back;
                    x += 2;
                }
                else{
                    x++;
                }
            }
        }
        return w;
    }

    public static void scrambleOrRemove(List<String> wordList){
        String swap="";
        for (int a=0; a<wordList.size();) {
            swap=scrambleWord(wordList.get(a));
            if(swap==wordList.get(a)){
                wordList.remove(a);
            }
            else{
                wordList.remove(a);
                wordList.add(a,swap);
                a++;
            }
        }
    }
    public static void main(String[] args){
        System.out.println(scrambleWord("abracadra"));
        List<String> ran= new ArrayList<String>();
        ran.add("candace");
        ran.add("alan");
        ran.add("abracadra");
        ran.add("look");
        ran.add("baishakicaades");
        System.out.println(ran);
        scrambleOrRemove(ran);
        System.out.println(ran);
    }
}
