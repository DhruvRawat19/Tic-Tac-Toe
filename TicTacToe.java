import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener
{
    Button b1[] = new Button[9];

    int c = 1;   // odd count -> O (blue), even count -> X (red)

    FDemo()
    {
        Font f = new Font("Blackadder ITC", Font.BOLD, 30);
        setFont(f);

        setTitle("TIC TAC TOE GAME");
        setLayout(null);

        int i, j, k = 0;
        int x = 100, y = 100;

        // creating buttons using loop (3 x 3 grid)
        for (i = 1; i <= 3; i++)
        {
            for (j = 1; j <= 3; j++)
            {
                b1[k] = new Button(" ");
                b1[k].setSize(100, 100);
                b1[k].setLocation(x, y);
                add(b1[k]);
                b1[k].addActionListener(this);
                x += 100;
                k++;
            }
            x = 100;
            y += 100;
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        Button b = (Button) e.getSource();

        if (c % 2 == 1)
        {
            b.setLabel("O");
            b.setBackground(Color.blue);
        }
        else
        {
            b.setLabel("X");
            b.setBackground(Color.red);
        }
        c++;

        // click complete hone ke baad is button ka listener remove
        b.removeActionListener(this);

        CheckWinner();
    }

    void CheckWinner()
    {
        // Row 1
        if ((b1[0].getLabel().equals(b1[1].getLabel())) &&
            (b1[1].getLabel().equals(b1[2].getLabel())) &&
            (!b1[0].getLabel().equals(" ")))
        {
            System.out.println("THE WINNER IS " + b1[0].getLabel());
        }
        // Row 2
        else if ((b1[3].getLabel().equals(b1[4].getLabel())) &&
                 (b1[4].getLabel().equals(b1[5].getLabel())) &&
                 (!b1[3].getLabel().equals(" ")))
        {
            System.out.println("THE WINNER IS " + b1[3].getLabel());
        }
        // Row 3
        else if ((b1[6].getLabel().equals(b1[7].getLabel())) &&
                 (b1[7].getLabel().equals(b1[8].getLabel())) &&
                 (!b1[6].getLabel().equals(" ")))
        {
            System.out.println("THE WINNER IS " + b1[6].getLabel());
        }
        // Column 1
        else if ((b1[0].getLabel().equals(b1[3].getLabel())) &&
                 (b1[3].getLabel().equals(b1[6].getLabel())) &&
                 (!b1[0].getLabel().equals(" ")))
        {
            System.out.println("THE WINNER IS " + b1[0].getLabel());
        }
        // Column 2
        else if ((b1[1].getLabel().equals(b1[4].getLabel())) &&
                 (b1[4].getLabel().equals(b1[7].getLabel())) &&
                 (!b1[1].getLabel().equals(" ")))
        {
            System.out.println("THE WINNER IS " + b1[1].getLabel());
        }
        // Column 3
        else if ((b1[2].getLabel().equals(b1[5].getLabel())) &&
                 (b1[5].getLabel().equals(b1[8].getLabel())) &&
                 (!b1[2].getLabel().equals(" ")))
        {
            System.out.println("THE WINNER IS " + b1[2].getLabel());
        }
        // Diagonal 1
        else if ((b1[0].getLabel().equals(b1[4].getLabel())) &&
                 (b1[4].getLabel().equals(b1[8].getLabel())) &&
                 (!b1[0].getLabel().equals(" ")))
        {
            System.out.println("THE WINNER IS " + b1[0].getLabel());
        }
        // Diagonal 2
        else if ((b1[2].getLabel().equals(b1[4].getLabel())) &&
                 (b1[4].getLabel().equals(b1[6].getLabel())) &&
                 (!b1[2].getLabel().equals(" ")))
        {
            System.out.println("THE WINNER IS " + b1[2].getLabel());
        }
    }
}

class TicTacToe
{
    public static void main(String args[])
    {
        FDemo f1 = new FDemo();
        f1.setVisible(true);
        f1.setSize(800, 800);
        f1.setLocation(200, 100);
        f1.setBackground(Color.black);
    }
}
