/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizapplication;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

        
public class Quiz extends JFrame implements ActionListener
{
    JLabel label;
    JRadioButton RadioButtons[]=new JRadioButton[5];
    JButton btnNext,btnResult;
    ButtonGroup bg;
    int count=0, currentQ=0;
    int Qns[]=new int[10];
    
    Quiz(String s)
    {
        super(s);
        label=new JLabel();
        add(label);
        bg=new ButtonGroup();
        setSize(1000,500);
        setLocation(200,150);
        setVisible(true);
        for(int i=0;i<5;i++)
        {
            RadioButtons[i]=new JRadioButton();
            add(RadioButtons[i]);
            bg.add(RadioButtons[i]);
            
        }
        btnNext=new JButton("Next");
        btnResult=new JButton("Result");
        btnResult.setVisible(false);
        btnResult.addActionListener(this);
        btnNext.addActionListener(this);
        add(btnNext);
        add(btnResult);
        
        setData();
        
        label.setBounds(30,40,450,20);
        
        RadioButtons[0].setBounds(50,80,450,20);
        RadioButtons[1].setBounds(50,110,200,20);
        RadioButtons[2].setBounds(50,140,200,20);
        RadioButtons[3].setBounds(50,170,200,20);
        
        btnNext.setBounds(100,240,100,30);
        btnResult.setBounds(270,240,100,30);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
    }
    
    void setData()
    {
        RadioButtons[4].setSelected(true);
        
        if(currentQ==0)
        {
            label.setText("Q1 : Which country won the ICC Men's Cricket World Cup 2023? ");
            RadioButtons[0].setText("England");
            RadioButtons[1].setText("Australia");
            RadioButtons[2].setText("India");
            RadioButtons[3].setText("New Zealand");  
        }
        if(currentQ==1)
        {
            label.setText("Q2 : Which of the following is the state flower of karnataka? ");
            RadioButtons[0].setText("Lotus");
            RadioButtons[1].setText("Jasmine");
            RadioButtons[2].setText("Marigold");
            RadioButtons[3].setText("Tulip");
        }
        if(currentQ==2)
        {
            label.setText("Q3 : What is the name of the lander of Chandrayaan-2? ");
            RadioButtons[0].setText("Pragyan");
            RadioButtons[1].setText("Vikram");
            RadioButtons[2].setText("Jeevan");
            RadioButtons[3].setText("Aditya");
        }
        if(currentQ==3)
        {
            label.setText("Q4 : Which one of the following was the first mineral acid discovered? ");
            RadioButtons[0].setText("Acetic acid");
            RadioButtons[1].setText("Sulphuric acid");
            RadioButtons[2].setText("Hydrochloric acid");
            RadioButtons[3].setText("Nitric acid");
        }
        if(currentQ==4)
        {
            label.setText("Q5 : In the context of Internet, what is the expansion of URL? ");
            RadioButtons[0].setText("Uniform Reserved Location");
            RadioButtons[1].setText("Universal Resources Location");
            RadioButtons[2].setText("Universal Resource Locator");
            RadioButtons[3].setText("Uniform Resource Locator");   
        }
        if(currentQ==5)
        {
            label.setText("Q6 : Which was the capital of Kadamba dynasty? ");
            RadioButtons[0].setText("Badami");
            RadioButtons[1].setText("Pataliputra");
            RadioButtons[2].setText("Banavasi");
            RadioButtons[3].setText("Thanjavur");
        }
        if(currentQ==6)
        {
            label.setText("Q7 : Entomology is the science that studies ");
            RadioButtons[0].setText("Insects");
            RadioButtons[1].setText("Fossils");
            RadioButtons[2].setText("Reptiles");
            RadioButtons[3].setText("Animals");  
        }
        if(currentQ==7)
        {
            label.setText("Q8 : Who is known as the Father of Artificial Artilligence? ");
            RadioButtons[0].setText("Kane Thomson");
            RadioButtons[1].setText("John Tukey");
            RadioButtons[2].setText("John McCarthy");
            RadioButtons[3].setText("Vint Cerf"); 
        }
        if(currentQ==8)
        {
            label.setText("Q9 : Which country has the World's largest railway network? ");
            RadioButtons[0].setText("China");
            RadioButtons[1].setText("United States");
            RadioButtons[2].setText("Japan");
            RadioButtons[3].setText("United Arab Emirates");
        }
        if(currentQ==9)
        {
            label.setText("Q10 : Which is most visied monument in the world? ");
            RadioButtons[0].setText("Great Wall of China");
            RadioButtons[1].setText("Opera House of Australia");
            RadioButtons[2].setText("Eiffel Tower");
            RadioButtons[3].setText("Forbidden City in Beijing");  
        }
        label.setBounds(30,40,450,20);
        for(int i=0,j=0; i<=90; i+=30, j++)
        {
            RadioButtons[j].setBounds(50,80+i,200,20);
        }
    }
    
    boolean checkAns()
    {
        if(currentQ==0)
        {
            return(RadioButtons[1].isSelected());
        }
        if(currentQ==1)
        {
            return(RadioButtons[0].isSelected());
        }
        if(currentQ==2)
        {
            return(RadioButtons[1].isSelected());
        }
        if(currentQ==3)
        {
            return(RadioButtons[1].isSelected());
        }
        if(currentQ==4)
        {
            return(RadioButtons[3].isSelected());
        }
        if(currentQ==5)
        {
            return(RadioButtons[2].isSelected());
        }
        if(currentQ==6)
        {
            return(RadioButtons[0].isSelected());
        }
        if(currentQ==7)
        {
            return(RadioButtons[2].isSelected());
        }
        if(currentQ==8)
        {
            return(RadioButtons[1].isSelected());
        }
        if(currentQ==9)
        {
            return(RadioButtons[3].isSelected());
        }
        return false;
    }
    public static void main(String[]args)
    {
        new Quiz("Simple Quiz Application");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnNext)
        {
            if(checkAns())
                count=count+1;
            currentQ=currentQ+1;
            setData();
            if(currentQ==9)
            {
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
                btnResult.setText("Result");
            }
        }
    
        if(e.getActionCommand().equals("Result"))
        {
            if(checkAns())
                count=count+1;
            currentQ=currentQ+1;
            JOptionPane.showMessageDialog(this,"Correct Answers are "+count);
            System.exit(0);
                
        }
}

}
