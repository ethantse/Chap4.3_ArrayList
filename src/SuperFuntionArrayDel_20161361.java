import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SuperFuntionArrayDel_20161361 {
    public static void main(String[] args) {
        String oldar[] =Arryinput();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的内容");
        String n = sc.nextLine();
        ArrayList ar4 = delarry(oldar,n);
        for (int o = 0; o < ar4.size(); o++)
            System.out.print(ar4.get(o) + "\t");
    }
    public static ArrayList delarry(String[] oar,String n) {
        ArrayList ar3 = new ArrayList(Arrays.asList(oar));
        for (int i = 0; i < ar3.size(); i++)
            System.out.print(ar3.get(i) + "\t");
        System.out.println();
        ar3.removeAll(Collections.singleton(n));
        return ar3;
    }
    public static String[] Arryinput() {
        Scanner scar =new Scanner(System.in);
        System.out.println("请输入数组范围");
        int flag = (scar.nextInt()+1);
        String[] arin = new String[flag];
        for(int i = 0;i<flag;i++) {
            if(i>=1) {
                System.out.println("正在输入第" + (i)+ "位" + "请按下回车输入内容");
            }
            arin[i] = scar.nextLine();
        }
        for (String i : arin)
            System.out.println(i);
        return arin;

    }
}
