import java.util.*;

public class toword {
    long l;
    List<Integer> anum = new ArrayList<Integer>();
    String [] w1 = {"mahashankh","shankh","padma","nil","kharab","arab","crore","lakh","thousand","hundred","and"};
    int [] n1 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,25,16,17,18,19,20};
    String [] w2 = {"zero","one", "two", "three","four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen","twenty"};
    String [] w3 = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
    Dictionary nums = new Hashtable();
    Dictionary nums2 = new Hashtable();

    toword(long l) {
        this.l = l;
        anum = toarr(l);
    // System.out.println(anum);
        int n = 0;
        for (String x : w2){
            nums.put(n1[n] , x);
            n += 1;
        }
        n = 2;
        for (String x : w3){
            nums2.put(n1[n] , x);
            n += 1;
        }
    }
    public String convert(){
        if (l==0) return "Zero";
        int size,u,lenw1=w1.length,n=4,flag=0,flag2 =0,f=1,skip=0;
        List<String> words = new ArrayList<String>();
        size = anum.size();
        System.out.println(anum);
        if (size==2) flag = 1;
        if (flag==1 && anum.get(1)!=0) {u = anum.get(size-1); if (u<100) flag2 = 1;}
        while(anum.size() != 0) {
            size = anum.size();
            u = anum.get(size-1);
            if (u==0) {anum.remove(size-1);skip=1; n+=1;continue;}
            if (skip==1) {words.add(0,w1[lenw1-n]);n+=1;skip=0;}
            if(f==1){
                f=0;
                int k = u%100;
                if (k<20){
                    words.add(0, (String) nums.get(k));
                }
                else {
                    if(u%10!=0)  words.add(0, (String) nums.get(k%10));
                    words.add(0, (String) nums2.get(k/10));
                }
                words.add(0,w1[lenw1-1]);
                words.add(0,w1[lenw1-2]);
                words.add(0, (String) nums.get(u/100));
                if (flag== 1) break;
                try {
                    if (anum.get(size - 2) != 0)
                        words.add(0, w1[lenw1 - 3]);
                } catch (Exception e) {
                    words.add(0, w1[lenw1 - 3]);
                }
                anum.remove(size-1);
                continue;
            }
            else if (u<20){
                words.add(0, (String) nums.get(u));
                if(flag2 ==1 ) break;
            }
            else {
                if(u%10!=0)  words.add(0, (String) nums.get(u%10));
                words.add(0, (String) nums2.get(u/10));
                if(flag2 ==1 ) break;
            }

            anum.remove(size-1);
            if (anum.size()!=0)
            {words.add(0,w1[lenw1-n]);n+=1;}

        }
    //    System.out.println(words);
        StringBuilder strbul=new StringBuilder();
        for(String str : words)
        {
            strbul.append(str);
            strbul.append(" ");
        }
        return strbul.toString();
    }
    public List<Integer> toarr(Long l){
        List<Integer> list = new ArrayList<Integer>();
        int n;
        while (l != 0){
            if (list.size()==0) {
                n = (int) (l%1000);
                list.add(0, n);
                l = l/1000;}
            n = (int) (l%100);
            list.add(0, n);
            l = l/100;
        }
        return list;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        toword t1 = new toword(sc.nextLong());
        System.out.println("conversion to word is:\n"+t1.convert()+"!"+"\nThank you");
    }
}