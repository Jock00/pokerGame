/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergamefinal;

/**
 *
 * @author alexa
 */
import java.awt.*;
import javax.swing.*;
class mine extends JFrame
{
public mine()
{
setTitle( "Video Poker" );
setSize( 1400, 800 );
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
setBackground( Color.gray );
Panel topPanel = new Panel();
topPanel.setLayout( new BorderLayout() );
topPanel.setLocation(100, 100);
getContentPane().add( topPanel );
Label labelHello = new Label( "Hello World!" );
topPanel.add( labelHello, BorderLayout.NORTH );
}

}