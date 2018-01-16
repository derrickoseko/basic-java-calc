import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class newmain extends JFrame{
    private JTextField answerfield;
    private JButton one, two, three,four, five, six, seven, eight, nine, zero, add, sub, multiply, div, equals,off,del,reset;
    private String stempl, stemp2, sanswer;
    private double answer = 0.0;
    private JPanel contentPanel;
    private boolean equalsClicked = false, opChosen = false;
    char operation = ' ';
    public newmain(){
        super("Calculator");
        answerfield = new JTextField(null, 20);
        answerfield.setEditable(false);
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five= new JButton("5");
        six= new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        add = new JButton("+");
        sub = new JButton("-");
        multiply = new JButton("*");
        div = new JButton("/");
        equals = new JButton("=");
        off = new JButton("off/on");
        reset=new JButton("reset");
        del=new JButton("delete");
        Dimension dim = new Dimension(75,25);
        one.setPreferredSize(dim);
         two.setPreferredSize(dim);
         three.setPreferredSize(dim);
         four.setPreferredSize(dim);
         five.setPreferredSize(dim);
         six.setPreferredSize(dim);
         seven.setPreferredSize(dim);
         eight.setPreferredSize(dim);
         nine.setPreferredSize(dim);
         zero.setPreferredSize(new Dimension(225,25));
         add.setPreferredSize(new Dimension(115,25));
         sub.setPreferredSize(new Dimension(115,25));
         multiply.setPreferredSize(dim);
         div.setPreferredSize(dim);
         equals.setPreferredSize(dim);
         off.setPreferredSize(dim);
         reset.setPreferredSize(dim);
         del.setPreferredSize(dim);
         Numbers n = new Numbers();
         Calc c   = new Calc();  
         one.addActionListener(n); two.addActionListener(n); three.addActionListener(n); four.addActionListener(n);
         five.addActionListener(n); six.addActionListener(n); seven.addActionListener(n); eight.addActionListener(n);
           nine.addActionListener(n);zero.addActionListener(n);
            
         add.addActionListener(c);sub.addActionListener(c);multiply.addActionListener(c);div.addActionListener(c);
         equals.addActionListener(c);off.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              System.exit(0);
            }
        });
       
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.ORANGE);
        contentPanel.setLayout(new FlowLayout()); 
        contentPanel.add(answerfield,BorderLayout.NORTH);
        contentPanel.add(one);contentPanel.add(two);contentPanel.add(three);contentPanel.add(four);
        contentPanel.add(five);contentPanel.add(six);contentPanel.add(seven);contentPanel.add(eight);
        contentPanel.add(nine);contentPanel.add(zero);contentPanel.add(add);contentPanel.add(sub);
        contentPanel.add(multiply);contentPanel.add(div);contentPanel.add(equals); 
        contentPanel.add(off);
        this.setContentPane(contentPanel);
} 
    private class Numbers implements ActionListener{
        public void actionPerformed(ActionEvent event){
        JButton src = (JButton) event.getSource();
        if(src.equals(one)){
            if(opChosen==false){
            if(stempl==null){
                stempl="1";
            }else{
                stempl = stempl + "1";
            }
        }else{
                if(stemp2 ==null){
                    stemp2 = "1";
                }else{
                    stemp2 = stemp2 + "1";
                }
            }
        }
        if(src.equals(two)){
            if(opChosen==false){
            if(stempl==null){
                stempl="2";
            }else{
                stempl = stempl + "2";
            }
        }else{
                if(stemp2 ==null){
                    stemp2 = "2";
                }else{
                    stemp2 = stemp2 + "2";
                }
            }
        }
        if(src.equals(three)){
            if(opChosen==false){
            if(stempl==null){
                stempl="3";
            }else{
                stempl = stempl + "3";
            }
        }else{
                if(stemp2 ==null){
                    stemp2 = "3";
                }else{
                    stemp2 = stemp2 + "3";
                }
            }
        }
        if(src.equals(four)){
            if(opChosen==false){
            if(stempl==null){
                stempl="4";
            }else{
                stempl = stempl + "4";
            }
        }else{
                if(stemp2 ==null){
                    stemp2 = "4";
                }else{
                    stemp2 = stemp2 + "4";
                }
            }
        }
        if(src.equals(five)){
            if(opChosen==false){
            if(stempl==null){
                stempl="5";
            }else{
                stempl = stempl + "5";
            }
        }else{
                if(stemp2 ==null){
                    stemp2 = "5";
                }else{
                    stemp2 = stemp2 + "5";
                }
            }
        }
        if(src.equals(six)){
            if(opChosen==false){
            if(stempl==null){
                stempl="6";
            }else{
                stempl = stempl + "6";
            }
        }else{
                if(stemp2 ==null){
                    stemp2 = "6";
                }else{
                    stemp2 = stemp2 + "6";
                }
            }
        }
        if(src.equals(seven)){
            if(opChosen==false){
            if(stempl==null){
                stempl="7";
            }else{
                stempl = stempl + "7";
            }
        }else{
                if(stemp2 ==null){
                    stemp2 = "7";
                }else{
                    stemp2 = stemp2 + "7";
                }
            }
        }
        if(src.equals(eight)){
            if(opChosen==false){
            if(stempl==null){
                stempl="8";
            }else{
                stempl = stempl + "8";
            }
        }else{
                if(stemp2 ==null){
                    stemp2 = "8";
                }else{
                    
                    stemp2 = stemp2 + "8";
                }
            }
        }
        if(src.equals(nine)){
            if(opChosen==false){
            if(stempl==null){
                stempl="9"; 
            }else{
                stempl = stempl + "9";
            }
        }else{
                if(stemp2 ==null){
                    stemp2 = "9";
                }else{
                    stemp2 = stemp2 + "9";
                }
            }
        }
        if(src.equals(zero)){
            if(opChosen==false){
            if(stempl==null){
                stempl="0";
            }else{
                stempl = stempl + "0";
            }
        }else{
                if(stemp2 ==null){
                    stemp2 = "0";
                }else{
                    stemp2 = stemp2 + "0";
                }
            }
        }
        if(equalsClicked==false){
           if(opChosen==false){
               answerfield.setText(stempl);
           
        }else{
            answerfield.setText(stemp2);
        }
        }
    }
}
    private class Calc implements ActionListener{
        public void actionPerformed(ActionEvent event){
        JButton src = (JButton) event.getSource();
        if(src.equals(add)){
            if(stempl==null){
                System.out.println("choose your numbers first");
            }else
        if(stempl !=null && stemp2 == null ){
            opChosen = true;
            operation = '+';
        }else
            if(stempl != null && stemp2 != null){
                System.out.println("two operations only");
            }
            }
        if(src.equals(sub)){
            if(stempl==null){
                System.out.println("choose your numbers first");
            }else
        if(stempl !=null && stemp2 == null ){
            opChosen = true;
            operation = '-';
        }else
            if(stempl != null && stemp2 != null){
                System.out.println("two operations only");
        }
    }
        if(src.equals(multiply)){
            if(stempl==null){
                System.out.println("choose your numbers first");
            }else
        if(stempl !=null && stemp2 == null ){
            opChosen = true;
            operation = '*';
        }else
            if(stempl != null && stemp2 != null){
                System.out.println("two operations only");
}
        }
 if(src.equals(div)){
            if(stempl==null){
                System.out.println("choose your numbers first");
            }else
        if(stempl !=null && stemp2 == null ){
            opChosen = true;
            operation = '/';
        }else
            if(stempl != null && stemp2 != null){
                System.out.println("two operations only");
            }
 }
 if(src.equals(equals)){
     if(stempl==null){
         System.out.println("choose your numbers first");
     }else
         if(stempl !=null && stemp2 ==null){
     System.out.println("choose BOTH numbers first!");
 }
         if(stempl !=null && stemp2 !=null){
             double d1=0.0,d2=0.0;
             d1=Double.parseDouble(stempl);
             d2=Double.parseDouble(stemp2);
             switch(operation){
                 case'+':
                     answer=d1+d2;
                     break;
                     case'-':
                         answer=d1-d2;
                         break;
                         case'*':
                             answer=d1*d2;
                             break;
                             case'/':
                                 answer=d1/d2;
                                 break;
             }
            sanswer=Double.toString(answer);
            answerfield.setText(sanswer);
            if(operation == '/' && d2 ==0.0){
                answerfield.setText("DIVIDE BY 0 ERROR");
            }
         }
 
        }
    }
}
}
