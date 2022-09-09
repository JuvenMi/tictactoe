import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame{
    private JPanel panel1;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn5;
    private JButton btn7;
    private JButton btn6;
    private JButton btn9;
    private JButton btn8;
    private JButton btn4;
    private JLabel lblWhoWin;
    private JButton btnReset;
    private JLabel lblXwins;
    private JLabel lblYwins;
    private JLabel lblXScoreNum;
    private JLabel lblOScoreNum;

    String xPlayer = "X";
    String oPlayer = "O";
    String startGame = "X";

    int xScore = 0;
    int oScore = 0;

    int b1 = 100;
    int b2 = 100;
    int b3 = 100;
    int b4 = 100;
    int b5 = 100;
    int b6 = 100;
    int b7 = 100;
    int b8 = 100;
    int b9 = 100;

    public TicTacToe(){
        add(panel1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Tic Tac Toe Game");
        setSize(400,400);
        setDefaultLookAndFeelDecorated(true);


        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn1.setBackground(Color.BLUE);
                    b1 = 1;
                }else{
                    btn1.setBackground(Color.RED);
                    b1 = 0;
                }
                choosePlayer();
                winningGame();

            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn2.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn2.setBackground(Color.BLUE);
                    b2 = 1;
                }else{
                    btn2.setBackground(Color.RED);
                    b2 = 0;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn3.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn3.setBackground(Color.BLUE);
                    b3 = 1;
                }else{
                    btn3.setBackground(Color.RED);
                    b3 = 0;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn4.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn4.setBackground(Color.BLUE);
                    b4 = 1;
                }else{
                    btn4.setBackground(Color.RED);
                    b4 = 0;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn5.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn5.setBackground(Color.BLUE);
                    b5 = 1;
                }else{
                    btn5.setBackground(Color.RED);
                    b5 = 0;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn6.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn6.setBackground(Color.BLUE);
                    b6 = 1;
                }else{
                    btn6.setBackground(Color.RED);
                    b6 = 0;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn7.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn7.setBackground(Color.BLUE);
                    b7 = 1;
                }else{
                    btn7.setBackground(Color.RED);
                    b7 = 0;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn8.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn8.setBackground(Color.BLUE);
                    b8 = 1;
                }else{
                    btn8.setBackground(Color.RED);
                    b8 = 0;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn9.setText(startGame);
                if (startGame.equalsIgnoreCase("X")){
                    btn9.setBackground(Color.BLUE);
                    b9 = 1;
                }else{
                    btn9.setBackground(Color.RED);
                    b9 = 0;
                }
                choosePlayer();
                winningGame();
            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               btn1.setText(null);
               btn1.setBackground(null);
               btn2.setText(null);
               btn2.setBackground(null);
               btn3.setText(null);
               btn3.setBackground(null);
               btn4.setText(null);
               btn4.setBackground(null);
               btn5.setText(null);
               btn5.setBackground(null);
               btn6.setText(null);
               btn6.setBackground(null);
               btn7.setText(null);
               btn7.setBackground(null);
               btn8.setText(null);
               btn8.setBackground(null);
               btn9.setText(null);
               btn9.setBackground(null);
               xScore = 0;
               oScore = 0;
               lblOScoreNum.setText(null);
               lblXScoreNum.setText(null);
               b1 = 100;
               b2 = 100;
               b3 = 100;
               b4 = 100;
               b5 = 100;
               b6 = 100;
               b7 = 100;
               b8 = 100;
               b9 = 100;
               lblWhoWin.setText(null);
            }
        });
    }

    private void choosePlayer(){
        if (startGame.equalsIgnoreCase("x")){
            startGame = "O";
        }else {
            startGame = "X";
        }
    }

    private void winningGame(){
        if((b1 == 1 && b2 == 1 && b3 == 1)){
            xScore++;
            lblXScoreNum.setText(Integer.toString(xScore));
            JOptionPane.showMessageDialog(panel1, "x Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b4 == 1 && b5 == 1 && b6 == 1)){
            xScore++;
            lblXScoreNum.setText(Integer.toString(xScore));
            JOptionPane.showMessageDialog(panel1, "x Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b7 == 1 && b8 == 1 && b9 == 1)){
            xScore++;
            lblXScoreNum.setText(Integer.toString(xScore));
            JOptionPane.showMessageDialog(panel1, "x Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b1 == 1 && b4 == 1 && b7 == 1)){
            xScore++;
            lblXScoreNum.setText(Integer.toString(xScore));
            JOptionPane.showMessageDialog(panel1, "x Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b2 == 1 && b5 == 1 && b8 == 1)){
            xScore++;
            lblXScoreNum.setText(Integer.toString(xScore));
            JOptionPane.showMessageDialog(panel1, "x Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if((b3 == 1 && b6 == 1 && b9 == 1)){
            xScore++;
            lblXScoreNum.setText(Integer.toString(xScore));
            JOptionPane.showMessageDialog(panel1, "x Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b1 == 1 && b5 == 1 && b9 == 1)){
            xScore++;
            lblXScoreNum.setText(Integer.toString(xScore));
            JOptionPane.showMessageDialog(panel1, "x Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b3 == 1 && b5 == 1 && b7 == 1)){
            xScore++;
            lblXScoreNum.setText(Integer.toString(xScore));
            JOptionPane.showMessageDialog(panel1, "x Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        //
        if((b1 == 0 && b2 == 0 && b3 == 0)){
            oScore++;
            lblOScoreNum.setText(Integer.toString(oScore));
            JOptionPane.showMessageDialog(panel1, "o Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b4 == 0 && b5 == 0 && b6 == 0)){
            oScore++;
            lblOScoreNum.setText(Integer.toString(oScore));
            JOptionPane.showMessageDialog(panel1, "o Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b7 == 0 && b8 == 0 && b9 == 0)){
            oScore++;
            lblOScoreNum.setText(Integer.toString(oScore));
            JOptionPane.showMessageDialog(panel1, "o Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b1 == 0 && b4 == 0 && b7 == 0)){
            oScore++;
            lblOScoreNum.setText(Integer.toString(oScore));
            JOptionPane.showMessageDialog(panel1, "o Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b2 == 0 && b5 == 0 && b8 == 0)){
            oScore++;
            lblOScoreNum.setText(Integer.toString(oScore));
            JOptionPane.showMessageDialog(panel1, "o Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if((b3 == 0 && b6 == 0 && b9 == 0)){
            oScore++;
            lblOScoreNum.setText(Integer.toString(oScore));
            JOptionPane.showMessageDialog(panel1, "o Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b1 == 0 && b5 == 0 && b9 == 0)){
            oScore++;
            lblOScoreNum.setText(Integer.toString(oScore));
            JOptionPane.showMessageDialog(panel1, "o Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
        if ((b3 == 0 && b5 == 0 && b7 == 0)){
            xScore++;
            lblXScoreNum.setText(Integer.toString(xScore));
            JOptionPane.showMessageDialog(panel1, "o Kazandı", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
    }
    public void reset(){
        btn1.setText(null);
        btn1.setBackground(null);
        btn2.setText(null);
        btn2.setBackground(null);
        btn3.setText(null);
        btn3.setBackground(null);
        btn4.setText(null);
        btn4.setBackground(null);
        btn5.setText(null);
        btn5.setBackground(null);
        btn6.setText(null);
        btn6.setBackground(null);
        btn7.setText(null);
        btn7.setBackground(null);
        btn8.setText(null);
        btn8.setBackground(null);
        btn9.setText(null);
        btn9.setBackground(null);
        b1 = 100;
        b2 = 100;
        b3 = 100;
        b4 = 100;
        b5 = 100;
        b6 = 100;
        b7 = 100;
        b8 = 100;
        b9 = 100;
        startGame = "X";
    }
}
