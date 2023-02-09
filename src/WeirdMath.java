import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class WeirdMath {
    public List<Integer> Math_Weird(int num) {
            List<Integer> list = new ArrayList<>();
            list.add(num);
            boolean pos = (num >= 0);
            if (pos)
            {
                while (num != 1)
                {
                    if (num % 2 != 0)
                    {
                        num = (3 * num) + 1;
                    }
                    else{
                        num = num / 2;
                    }
                    list.add(num);
                }
            }
            else{
                ImageIcon icon = new ImageIcon("src/error.jpg");
                JOptionPane.showMessageDialog(null, "You entered a number that is negative. Please enter only positive whole numbers.", "Error!", JOptionPane.ERROR_MESSAGE, icon);
            }
        return list;
    }
    public void print(List<Integer> num)
    {
        if(num.get(0)>=0)
        {
            ImageIcon icon = new ImageIcon("src/success.jpg");
            JOptionPane.showMessageDialog(null, "The number " + num.get(0) + " has " + num.size() + " elements using this conjecture and they are: \n" + num, "Success!", JOptionPane.PLAIN_MESSAGE,icon);
        }
        }
    public void normal(WeirdMath x)
    {
        try{
        ImageIcon icon = new ImageIcon("src/pic.png");
        String StrNum = (String) JOptionPane.showInputDialog(null,"Enter your number: ","Yo",JOptionPane.INFORMATION_MESSAGE,icon,null,"");
        int num = Integer.parseInt(StrNum);
        x.print(x.Math_Weird(num));
        ImageIcon Icon = new ImageIcon("src/thinking.jpg");
        int answer = JOptionPane.showConfirmDialog(null, "Do you want to try another number?\n", "Another?", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,Icon);
        if(answer==0)
        {
            normal(x);
        }
        else
        {
            ImageIcon smile_icon = new ImageIcon("src/smile.jpg");
            JOptionPane.showMessageDialog(null,"Thank you for using my math java project \nHave a nice rest of your day!","Bye", JOptionPane.PLAIN_MESSAGE,smile_icon);
            System.exit(0);
        }
        }
        catch(NumberFormatException e)
        {
            ImageIcon icon = new ImageIcon("src/error.jpg");
            JOptionPane.showMessageDialog(null,"You did not enter a positive integer.\nPlease try again","error",JOptionPane.ERROR_MESSAGE,icon);
            normal(x);
        }
    }
    public static void main(String[] args)
    {
        WeirdMath x = new WeirdMath();
        x.normal(x);
    }
}
