/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergamefinal;

import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 *
 * @author alexa
 */
public class jock extends javax.swing.JFrame {

    private boolean state;
    private int credit;
   ArrayList<Integer> cards;
   ArrayList<Integer>pos;
   private int card1,card2,card3,card4,card5;
    /**
     * Creates new form jock
     */
   private void setList()
   {
       for(int i = 0 ;i<52;i++)
       {
           cards.add(i, i);
           
       }
   }
   public void shufle()
   {
       Collections.shuffle(cards);
        String img = Integer.toString(cards.get(0))+".jpg";
        jLabel8.setIcon(new ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\"+img));
        img = Integer.toString(cards.get(1))+".jpg";
        jLabel4.setIcon(new ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\"+img));
        img = Integer.toString(cards.get(2))+".jpg";
        jLabel9.setIcon(new ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\"+img));
        img = Integer.toString(cards.get(3))+".jpg";
        jLabel10.setIcon(new ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\"+img));
        img = Integer.toString(cards.get(4))+".jpg";
        jLabel6.setIcon(new ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\"+img));
        card1 = cards.get(0);
        card2 = cards.get(1);
        card3 = cards.get(2);
        card4 = cards.get(3);
        card5 = cards.get(4);
     
   }
    public jock() {
        initComponents();
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel21.setVisible(false);
        setLocationRelativeTo(null);
        credit = 50;
        cards = new ArrayList<>();
        pos = new ArrayList<>();
        setList();
        shufle();
        
        
        state = false;//play again
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        flush = new javax.swing.JLabel();
        fourOfOkind = new javax.swing.JLabel();
        fullHouse = new javax.swing.JLabel();
        straightFlush = new javax.swing.JLabel();
        onePair = new javax.swing.JLabel();
        twoPair = new javax.swing.JLabel();
        threeOfKind = new javax.swing.JLabel();
        straight = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setText("BET");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 51), null, null));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(680, 450, 100, 40);

        jLabel2.setBackground(new java.awt.Color(8, 133, 5));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 21)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("50");
        jLabel2.setToolTipText("");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 440, 100, 40);
        jLabel2.getAccessibleContext().setAccessibleName("credit");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel13.setText("30%");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(60, 140, 50, 30);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel14.setText("30%");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(60, 20, 50, 30);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel15.setText("30%");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(60, 60, 50, 30);

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel20.setText("30%");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(60, 100, 50, 30);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        flush.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        flush.setText("FLUSH.....................................................................6");
        flush.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(flush);
        flush.setBounds(10, 120, 290, 34);

        fourOfOkind.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        fourOfOkind.setText("FOUR OF A KIND.............................................25");
        fourOfOkind.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(fourOfOkind);
        fourOfOkind.setBounds(10, 40, 290, 34);

        fullHouse.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        fullHouse.setText("FULL HOUSE.......................................................9");
        fullHouse.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(fullHouse);
        fullHouse.setBounds(10, 80, 290, 34);

        straightFlush.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        straightFlush.setText("STRAIGHT FLUSH.........................................50");
        straightFlush.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(straightFlush);
        straightFlush.setBounds(10, 0, 290, 34);

        onePair.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        onePair.setText("ONE PAIR.....................................................................1");
        onePair.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(onePair);
        onePair.setBounds(310, 120, 290, 34);

        twoPair.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        twoPair.setText("TWO PAIR...................................................................2");
        twoPair.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(twoPair);
        twoPair.setBounds(310, 80, 290, 34);

        threeOfKind.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        threeOfKind.setText("THREE OF A KIND................................................3");
        threeOfKind.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(threeOfKind);
        threeOfKind.setBounds(310, 40, 290, 34);

        straight.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        straight.setText("STRAIGHT.................................................................4");
        straight.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 2));
        jPanel2.add(straight);
        straight.setBounds(310, 0, 290, 34);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("10%");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(610, 0, 60, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setText("15%");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(610, 40, 70, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setText("20%");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(610, 80, 70, 30);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setText("25%");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(610, 120, 70, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 20, 690, 180);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\0.jpg")); // NOI18N
        jLabel4.setText("jLabel2");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setPreferredSize(new java.awt.Dimension(130, 189));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(208, 78, 130, 189);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\0.jpg")); // NOI18N
        jLabel8.setText("jLabel2");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setPreferredSize(new java.awt.Dimension(130, 189));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(48, 78, 130, 189);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\0.jpg")); // NOI18N
        jLabel9.setText("jLabel2");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setPreferredSize(new java.awt.Dimension(130, 189));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(368, 78, 130, 189);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\0.jpg")); // NOI18N
        jLabel10.setText("jLabel2");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setPreferredSize(new java.awt.Dimension(130, 189));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(528, 78, 130, 189);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\0.jpg")); // NOI18N
        jLabel6.setText("jLabel2");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setPreferredSize(new java.awt.Dimension(130, 189));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(690, 80, 130, 189);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.red);
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("KEEP");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(50, 40, 130, 30);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel17.setForeground(java.awt.Color.red);
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("KEEP");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(210, 40, 120, 30);

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel18.setForeground(java.awt.Color.red);
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("KEEP");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(370, 40, 120, 30);

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel19.setForeground(java.awt.Color.red);
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("KEEP");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(530, 40, 120, 30);

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel21.setForeground(java.awt.Color.red);
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("KEEP");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(690, 40, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 160, 840, 280);

        jLabel11.setBackground(new java.awt.Color(8, 133, 5));
        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 21)); // NOI18N
        jLabel11.setForeground(java.awt.Color.red);
        jLabel11.setText("CREDIT");
        jLabel11.setToolTipText("");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 440, 100, 40);

        jLabel1.setBackground(new java.awt.Color(10, 133, 8));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean checkOnePair(int a,int b,int c,int x,int y)
{
    ArrayList<Integer> help = new ArrayList<>();
    help.add(a);
    help.add(b);
    help.add(c);
    help.add(x);
    help.add(y);
    Collections.sort(help);
    if(help.get(0) == help.get(1) ||
            help.get(1) == help.get(2) ||
                help.get(2) == help.get(3) ||
                    help.get(3) == help.get(4) 
            )
        return true;
    return false;
}
private boolean checkTwoPair(int a,int b,int c,int x,int y)
{
    ArrayList<Integer> helper= new ArrayList<Integer>();
    helper.add(a);
    helper.add(b);
    helper.add(c);
    helper.add(x);
    helper.add(y);
    Collections.sort(helper);
    if( helper.get(0) == helper.get(1) && helper.get(3) == helper.get(4) ||   helper.get(1) == helper.get(2) && helper.get(3) == helper.get(4)   ||  helper.get(0) == helper.get(1) && helper.get(2) == helper.get(3)   )
        return true;
    return false;
}
private boolean checkThreeKind(int a,int b,int c,int x,int y)
{
    ArrayList<Integer> helper= new ArrayList<Integer>();
    helper.add(a);
    helper.add(b);
    helper.add(c);
    helper.add(x);
    helper.add(y);
    Collections.sort(helper);
    if( helper.get(0) ==  helper.get(1) &&  helper.get(0) ==  helper.get(2) || 
            helper.get(1) ==  helper.get(2) &&  helper.get(3) ==  helper.get(2)  ||
            helper.get(2) ==  helper.get(3) &&  helper.get(3) ==  helper.get(4)    )
        return true;
    return false;
}
private boolean checkStraight(int a,int b,int c,int x,int y)
{
    ArrayList<Integer> helper= new ArrayList<Integer>();
    helper.add(a);
    helper.add(b);
    helper.add(c);
    helper.add(x);
    helper.add(y);
    Collections.sort(helper);
    for(int i = 0 ; i < 4 ; i++)
        if( helper.get(i)  !=  helper.get(i+1) - 1 )
        return false;
    return true;
}
private boolean checkFlush(int a,int b,int c,int x,int y)
{
    ArrayList<Integer> helper= new ArrayList<Integer>();
    helper.add(a);
    helper.add(b);
    helper.add(c);
    helper.add(x);
    helper.add(y);
    if( Collections.frequency(helper, helper.get(0)) == 5 )
            return true;
      return false;
}
private boolean checkFull(int a,int b,int c,int x,int y)
{
        ArrayList<Integer> helper= new ArrayList<Integer>();
    helper.add(a);
    helper.add(b);
    helper.add(c);
    helper.add(x);
    helper.add(y);
    Collections.sort(helper);
    if(helper.get(0) == helper.get(1) && helper.get(2) == helper.get(3) && helper.get(3) == helper.get(4)  || 
            helper.get(0) == helper.get(1) && helper.get(2) == helper.get(1) && helper.get(3) == helper.get(4)
            )
        return true;
    return false;
}
private boolean checkFourKind(int a,int b,int c,int x,int y)
{
     ArrayList<Integer> helper= new ArrayList<Integer>();
    helper.add(a);
    helper.add(b);
    helper.add(c);
    helper.add(x);
    helper.add(y);
    Collections.sort(helper);
    if(helper.get(0) == helper.get(1) && helper.get(1) == helper.get(2) && helper.get(2) == helper.get(3) ||
            helper.get(4) == helper.get(3) && helper.get(1) == helper.get(2) && helper.get(2) == helper.get(3) 
            )
        return true;
    return false;
}
private boolean checkStraightFlush(int a,int b,int c,int x,int y)
{
    return checkStraight(a/4, b/4, c/4, x/4, y/4) && checkFlush(a%4, b%4, c%4, x%4, y%4);
}
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
       
        if(!state)
        {
            if(jLabel16.isVisible())
            {
                jLabel16.setVisible(false);
                pos.remove(new Integer(1));
            }
            else {
                jLabel16.setVisible(true);
                pos.add(1);
            }
        }
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(jButton1.getText()=="BET")
{
    jButton1.setText("PLAY AGAIN");
    int nr = 5;
    
    String png;
   
       if(!pos.contains(1))
       {
           
          
           png = Integer.toString(cards.get(nr))+".jpg";
        jLabel8.setIcon(new ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\"+png));
        card1 = cards.get(nr);
        nr++;
       }
       if(!pos.contains(2))
       {
           
           png = Integer.toString(cards.get(nr))+".jpg";
        jLabel4.setIcon(new ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\"+png));
        card2 = cards.get(nr);
        nr++;
       }
       if(!pos.contains(3))
       {
           
           png = Integer.toString(cards.get(nr))+".jpg";
        jLabel9.setIcon(new ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\"+png));
        card3 = cards.get(nr);
        nr++;
       }
        if(!pos.contains(4))
       {
           
           png = Integer.toString(cards.get(nr))+".jpg";
        jLabel10.setIcon(new ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\"+png));
        card4 = cards.get(nr);
        nr++;
         
       }
         if(!pos.contains(5))
       {
            
           png = Integer.toString(cards.get(nr))+".jpg";
        jLabel6.setIcon(new ImageIcon("C:\\Users\\alexa\\Desktop\\imags\\"+png));
        card5 = cards.get(nr);
        nr++;
       }
         System.out.println("Dupa :    " +card1+" "+card2+" "+card3+ " "+card4+ " "+card5  );
         if(checkStraightFlush(card1, card2, card3, card4,card5))
         {
             credit += 50;
             straightFlush.setBorder(BorderFactory.createLineBorder(Color.red,2));
         }
            else
         if(checkFourKind(card1/4, card2/4, card3/4, card4/4,card5/4))
         {
             credit += 25;
             fourOfOkind.setBorder(BorderFactory.createLineBorder(Color.red,2));
         }
             else
         if(checkFull(card1/4, card2/4, card3/4, card4/4,card5/4))
         {
             credit += 9;
             fullHouse.setBorder(BorderFactory.createLineBorder(Color.red,2));
         }
            else
         if(checkFlush(card1%4, card2%4, card3%4, card4%4,card5%4))
         {
             credit += 6;
             flush.setBorder(BorderFactory.createLineBorder(Color.red,2));
         }
            else
         if(checkStraight(card1/4, card2/4, card3/4, card4/4,card5/4))
         {
             credit += 4;
             straight.setBorder(BorderFactory.createLineBorder(Color.red,2));
         }
            else
        if(checkThreeKind(card1/4, card2/4, card3/4, card4/4,card5/4))
        {
            credit += 3;
            threeOfKind.setBorder(BorderFactory.createLineBorder(Color.red,2));
        }
                else
         if(checkTwoPair(card1/4, card2/4, card3/4, card4/4,card5/4))
         {
             credit += 2;
             twoPair.setBorder(BorderFactory.createLineBorder(Color.red,2));
         }
                else
         if(checkOnePair(card1/4, card2/4, card3/4, card4/4,card5/4))
         {
             credit += 1;
             onePair.setBorder(BorderFactory.createLineBorder(Color.red,2));
           
         }
         credit-=5;
}
else
{
    
    
    straightFlush.setBorder(BorderFactory.createLineBorder(Color.yellow,2));
         fourOfOkind.setBorder(BorderFactory.createLineBorder(Color.yellow,2));
         fullHouse.setBorder(BorderFactory.createLineBorder(Color.yellow,2));
         flush.setBorder(BorderFactory.createLineBorder(Color.yellow,2));
         straight.setBorder(BorderFactory.createLineBorder(Color.yellow,2));
         threeOfKind.setBorder(BorderFactory.createLineBorder(Color.yellow,2));
         twoPair.setBorder(BorderFactory.createLineBorder(Color.yellow,2));
         onePair.setBorder(BorderFactory.createLineBorder(Color.yellow,2));
    jButton1.setText("BET");
    
     jLabel16.setVisible(false);
     jLabel17.setVisible(false);
     jLabel18.setVisible(false);
     jLabel19.setVisible(false);
     jLabel21.setVisible(false);
     

     pos.clear();
      shufle();
       System.out.println("Initial : " +card1+" "+card2+" "+card3+ " "+card4+ " "+card5  );
     
}
        
state =!state;
String str1 = Integer.toString(credit); 
jLabel2.setText(str1);
System.out.flush();  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
if(!state)
        {
            if(jLabel17.isVisible())
            {
                jLabel17.setVisible(false);
                pos.remove(new Integer(2));
            }
            else {
                jLabel17.setVisible(true);
                pos.add(2);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
if(!state)
        {
            if(jLabel18.isVisible())
            {
                jLabel18.setVisible(false);
                pos.remove(new Integer(3));
            }
            else {
                jLabel18.setVisible(true);
                pos.add(3);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
if(!state)
        {
            if(jLabel19.isVisible())
            {
                jLabel19.setVisible(false);
                 pos.remove(new Integer(4));
            }
            else {
                jLabel19.setVisible(true);
                pos.add(4);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
if(!state)
        {
            if(jLabel21.isVisible())
            {
                jLabel21.setVisible(false);
                 pos.remove(new Integer(5));
            }
            else {
                jLabel21.setVisible(true);
                pos.add(5);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel flush;
    private javax.swing.JLabel fourOfOkind;
    private javax.swing.JLabel fullHouse;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel onePair;
    private javax.swing.JLabel straight;
    private javax.swing.JLabel straightFlush;
    private javax.swing.JLabel threeOfKind;
    private javax.swing.JLabel twoPair;
    // End of variables declaration//GEN-END:variables
}
