package midterm;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout.Constraints;

public class Painter2Panel extends JPanel implements ActionListener, ItemListener{

	private DrawPanel drawPanel;
	private JPanel bottomPanel;
	
	GridBagConstraints gbc;
	
	private JPanel topPanel;
	
	private JButton randgen;
	private JButton square;
	private JButton square2;
	private JButton circle;
	private JButton circle2;
	private JButton target;
	private JButton randgenVtri;
	private JButton flag;
	private JButton line;
	private JButton picture;
	private JButton ooxxBoard;
	private JButton ooxx;
	private JButton chessBoard;
	private JButton chess;
	
	private JButton colorBtn;
	private JButton color2Btn;

	private JCheckBox gradient;
    private JCheckBox filled;
    
	private Color color;
	private Color color2;

	private JPanel actionPanel;
	private JButton clear;
	private JButton undo;
	private JButton redo;
	
	private final int RECT = 1;
	private final int OVAL = 2;
	private final int SQUARE = 3;
	private final int CIRCLE = 4;
	private final int TARGET = 5;
	private final int CIRCLE2 = 6;
	private final int SQUARE2 = 7;
	private final int FLAG = 8;
	private final int LINE = 9;
	private final int PICTURE = 10;
	private final int OOXXBOARD = 11;
	private final int OOXX = 12;
	private final int CHESSBOARD = 13;
	private final int CHESS = 14;
	
    private JTextField text;
    private JButton btn;
    
	public Painter2Panel(){
		super();
		this.setLayout(new BorderLayout());
		drawPanel = new DrawPanel();
		add(drawPanel, BorderLayout.CENTER);
		bottomPanel = new JPanel();
		actionPanel = new JPanel(new GridBagLayout());
		gbc = new GridBagConstraints();
		clear = new JButton("Clear");
		clear.addActionListener(this);
		setGridBagConstraints(0,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		actionPanel.add(clear,gbc);
		undo = new JButton("Undo");
		undo.addActionListener(this);
		setGridBagConstraints(1,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		actionPanel.add(undo,gbc);
		redo = new JButton("Redo");
		redo.addActionListener(this);
		setGridBagConstraints(2,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		actionPanel.add(redo,gbc);
		
		topPanel = new JPanel(new GridBagLayout());
		randgen = new JButton("Randgen");
		randgen.addActionListener(this);
		setGridBagConstraints(0,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(randgen,gbc);
		
		target = new JButton("Target");
		target.addActionListener(this);
		setGridBagConstraints(0,1,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(target,gbc);
		
		square = new JButton("Square");
		square.addActionListener(this);
		setGridBagConstraints(1,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(square,gbc);
		
		circle = new JButton("Circle");
		circle.addActionListener(this);
		setGridBagConstraints(1,1,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(circle,gbc);
		
		square2 = new JButton("Square2");
		square2.addActionListener(this);
		setGridBagConstraints(2,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(square2,gbc);
		
		circle2 = new JButton("Circle2");
		circle2.addActionListener(this);
		setGridBagConstraints(2,1,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(circle2,gbc);
		
	    Icon colorIcon = new ImageIcon( getClass().getResource( "color.png" ) );
	    colorBtn = new JButton("C1", colorIcon);
	    colorBtn.addActionListener(this);
	    setGridBagConstraints(3,0,2,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(colorBtn,gbc);
		
	    color2Btn = new JButton("C2", colorIcon);
	    color2Btn.addActionListener(this);
	    setGridBagConstraints(4,0,2,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(color2Btn,gbc);
	    
        filled = new JCheckBox("Filled");
        filled.addItemListener(this);
        setGridBagConstraints(5,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
        topPanel.add(filled,gbc);
        
        gradient = new JCheckBox("Gradient");
        gradient.addItemListener(this);
        setGridBagConstraints(5,1,1,1);
		gbc.fill=GridBagConstraints.BOTH;
        topPanel.add(gradient,gbc);
        
        randgenVtri = new JButton("randgenVtri");
        randgenVtri.addActionListener(this);
		setGridBagConstraints(6,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(randgenVtri,gbc);
		
		flag = new JButton("flag");
        flag.addActionListener(this);
		setGridBagConstraints(6,1,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(flag,gbc);
		
		line = new JButton("line");
        line.addActionListener(this);
		setGridBagConstraints(7,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(line,gbc);
		
		picture = new JButton("picture");
        picture.addActionListener(this);
		setGridBagConstraints(7,1,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(picture,gbc);
		
		ooxxBoard = new JButton("ooxxBoard");
        ooxxBoard.addActionListener(this);
		setGridBagConstraints(8,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(ooxxBoard,gbc);
		
		ooxx = new JButton("ooxx");
        ooxx.addActionListener(this);
		setGridBagConstraints(8,1,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(ooxx,gbc);
		
		chessBoard = new JButton("chessBoard");
        chessBoard.addActionListener(this);
		setGridBagConstraints(9,0,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(chessBoard,gbc);
		
		chess = new JButton("chess");
        chess.addActionListener(this);
		setGridBagConstraints(9,1,1,1);
		gbc.fill=GridBagConstraints.BOTH;
		topPanel.add(chess,gbc);
		
		add(actionPanel, BorderLayout.SOUTH);
	    add(topPanel, BorderLayout.NORTH);
	}

	void setGridBagConstraints(int gridx,int gridy,int gridheight,int gridwidth){
		gbc.gridx=gridx;
		gbc.gridy=gridy;
		gbc.gridheight=gridheight;
		gbc.gridwidth=gridwidth;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==randgen){
			JOptionPane.showMessageDialog(null, "你點選了:randgen", "訊息",     JOptionPane.INFORMATION_MESSAGE);
			drawPanel.randgen(10);
		}else if(e.getSource()==colorBtn){
			color = JColorChooser.showDialog(Painter2Panel.this, "Choose a color", color);
			drawPanel.setColor(color);
			colorBtn.setBackground(color);
		}else if(e.getSource()==color2Btn){
			color2 = JColorChooser.showDialog(Painter2Panel.this, "Choose a color", color2);
			drawPanel.setColor2(color2);
			color2Btn.setBackground(color2);
		}else if(e.getSource()==clear){
			drawPanel.clear();
		}else if(e.getSource()==undo){
			drawPanel.clear();
		}else if(e.getSource()==redo){
			drawPanel.clear();
		}else if(e.getSource()==square){
			JOptionPane.showMessageDialog(null, "你點選了: square", "訊息",     JOptionPane.INFORMATION_MESSAGE);
			drawPanel.setShape(SQUARE);
		}else if(e.getSource()==circle){
			JOptionPane.showMessageDialog(null, "你點選了: circle", "訊息",     JOptionPane.INFORMATION_MESSAGE);
			drawPanel.setShape(CIRCLE);
		}else if(e.getSource()==target){
			JOptionPane.showMessageDialog(null, "你點選了: target", "訊息",     JOptionPane.INFORMATION_MESSAGE);
			drawPanel.setShape(TARGET);
		}else if(e.getSource()==randgenVtri){
			JOptionPane.showMessageDialog(null, "你點選了: randgenVtri", "訊息",     JOptionPane.INFORMATION_MESSAGE);
			drawPanel.randgenVtri(10);
		}else if(e.getSource()==circle2){
			JOptionPane.showMessageDialog(null, "你點選了: circle2", "訊息",     JOptionPane.INFORMATION_MESSAGE);
			drawPanel.setShape(CIRCLE2);
		}else if(e.getSource()==square2){
			JOptionPane.showMessageDialog(null, "你點選了: square2", "訊息",     JOptionPane.INFORMATION_MESSAGE);
			drawPanel.setShape(SQUARE2);
		}else if(e.getSource()==flag){
			JOptionPane.showMessageDialog(null, "你點選了: flag", "訊息",     JOptionPane.INFORMATION_MESSAGE);
			drawPanel.setShape(FLAG);
		}else if(e.getSource()==line){
			JOptionPane.showMessageDialog(null, "你點選了: line", "訊息",     JOptionPane.INFORMATION_MESSAGE);
			drawPanel.setShape(LINE);
		}else if(e.getSource()==picture){
			JOptionPane.showMessageDialog(null, "你點選了: picture", "訊息",     JOptionPane.INFORMATION_MESSAGE);
			drawPanel.setShape(PICTURE);
		}else if(e.getSource()==ooxxBoard){
			drawPanel.setShape(OOXXBOARD);
		}else if(e.getSource()==ooxx){
			drawPanel.setShape(OOXX);
		}else if(e.getSource()==chessBoard){
			drawPanel.setShape(CHESSBOARD);
		}else if(e.getSource()==chess){
			drawPanel.setShape(CHESS);
		}
		
	}
	
	public void itemStateChanged(ItemEvent e) 
    {
        // TODO Auto-generated method stub
        if (gradient.isSelected())
        {
            drawPanel.setGradient(true);
        } else
        {
            drawPanel.setGradient(false);
        }
        
        if (filled.isSelected()){
            drawPanel.setFilled(true);
            System.out.println("checkbox -- filled set true");
        } else
        {
            drawPanel.setFilled(false);
            System.out.println("checkbox -- filled set false");
        }
    }
	
	public static void main( String[] args )
	   { 
		JFrame painter2 = new JFrame(); 
		painter2.add(new Painter2Panel(),BorderLayout.CENTER);
		painter2.setSize( 900, 700 ); // set frame size
		painter2.setVisible( true ); // display frame
	   } 
}
