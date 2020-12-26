/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vasallofinalproject;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 *
 * @author Jonathan
 */
public class GUIDemo extends JFrame{
JPanel LoginPanel,createAccPanel,homeScreen,cards;
JTextField userName, pass;
JLabel typeU, typeP;
JButton confirm, makeAcc;
private final String homeScreenText = "Home";
private final String loginText = "Login";
private final String createText = "Create Account";

public GUIDemo(){   
super("CasinoVille"); 

setLayout(new FlowLayout());


userName = new JTextField("",10);
userName.setBackground(Color.GRAY);
userName.setHorizontalAlignment(SwingConstants.CENTER);
userName.setForeground(Color.WHITE);


pass = new JTextField("",10);
pass.setBackground(Color.GRAY);
pass.setHorizontalAlignment(SwingConstants.CENTER);
pass.setForeground(Color.WHITE);
typeU = new JLabel("Username: ", SwingConstants.CENTER);
typeP = new JLabel("Password: ",SwingConstants.CENTER);
confirm = new JButton("Click to Login");
makeAcc = new JButton("Create An Account");

LoginPanel = new JPanel(); // main panel user sees if choosing to log in
createAccPanel = new JPanel(); // main panel user sees if choosing to log in
homeScreen = new JPanel(new GridLayout(3,2)); // What user starts off seeing (log in or create account) 
Font myFont = new Font("Cracked", Font.BOLD, 15);
typeU.setFont(myFont);
typeU.setForeground(Color.WHITE);
typeU.setBackground(Color.BLUE);

typeP.setFont(myFont);
typeP.setForeground(Color.WHITE);
typeP.setBackground(Color.BLUE);


homeScreen.setBackground(Color.GRAY);
homeScreen.add(typeU);
homeScreen.add(userName);
homeScreen.add(typeP);
homeScreen.add(pass);
homeScreen.add(confirm);
homeScreen.add(makeAcc);


cards = new JPanel(new CardLayout());

cards.add(createAccPanel,createText);  
cards.add(LoginPanel,loginText);
cards.add(homeScreen,homeScreenText);

CardLayout c1 = (CardLayout)(cards.getLayout());
c1.show(cards, homeScreenText);


this.add(cards);






}
}
