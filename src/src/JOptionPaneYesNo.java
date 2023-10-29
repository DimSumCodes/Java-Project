package src;

import javax.swing.JOptionPane;

public class JOptionPaneYesNo
{
    









    
    public static void main(String args[])
    {
        int result = JOptionPane.showConfirmDialog(null, "Are you ready to take the Questionaire?", "Dog or Cat Person?", JOptionPane.YES_NO_OPTION);
        int d = 0;
        int c = 0;
        
        for (int counter=5;counter > 0;counter--)
        {
            
            if (result == JOptionPane.YES_OPTION)
            {
                JOptionPane.showConfirmDialog(null, "Do you like cats?", "Dog or Cat Person?", JOptionPane.YES_NO_OPTION);
                int cat = c++;
            }    
            
            if (result == JOptionPane.NO_OPTION)
            {
            JOptionPane.showConfirmDialog(null, "Do you like dogs?");
            int dog = d++;
            }

            else if (result == JOptionPane.YES_OPTION)
            {
                JOptionPane.showConfirmDialog(null, "Do you like the outdoors?", "Dog or Cat Person?", JOptionPane.YES_NO_OPTION);
                int dog = d++;
            }
            else if (result == JOptionPane.NO_OPTION)
            {
            JOptionPane.showConfirmDialog(null, "Do you live to run?");
            int dog = d++;
            }

            else if (result == JOptionPane.YES_OPTION)
            {
                JOptionPane.showConfirmDialog(null, "Do you like to watch anime?", "Dog or Cat Person?", JOptionPane.YES_NO_OPTION);
                int cat = c++;
            }
            else if (result == JOptionPane.NO_OPTION)
            {
            JOptionPane.showConfirmDialog(null, "Do you like to plan things out?");
            int dog = d++;
            }
















        
        }
  








    }





}