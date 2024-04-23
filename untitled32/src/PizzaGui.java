import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class PizzaGui {

    private JPanel rootPanel;
    private JCheckBox box1;
    private JCheckBox box2;
    private JCheckBox box3;
    private JCheckBox box4;
    private JCheckBox box5;
    private JCheckBox box6;
    private JCheckBox box7;
    private JCheckBox box8;
    private JButton infoButton1;
    private JButton infoButton;
    private JButton infoButton2;
    private JButton infoButton3;
    private JButton infoButton4;
    private JButton infoButton5;
    private JButton infoButton6;
    private JButton infoButton7;
    private JButton buyButton;

    private void createUIComponents() {
        Pizza Hawai = new Pizza("Hawaii", "Tomātu mērce, Mocarellas siers, Cepta vistas gaļa, Ananāss, Oregano, Olīveļļa", false, 9.90);
        infoButton1 = new JButton();
        infoButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, Hawai);
            }
        });
        Pizza Margarita = new Pizza("Margarita", "Saldētā picas mīkla, Pipari, tomāti, Olīveļļas", false, 7.90);
        infoButton = new JButton();
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, Margarita);
            }
        });
        Pizza Seasons = new Pizza("4 Seasons", "Picas mīkla, Artišoki, Olīvas, Sēnes, Šķiņķis vai Salami", false, 6.90);
        infoButton2 = new JButton();
        infoButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, Seasons);
            }
        });
        Pizza Farmagio = new Pizza("4 formaggi", "Picas mīkla, Mocarella, Gorgonzola, Fontina, Parmezāns", false, 8.90);
        infoButton3 = new JButton();
        infoButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, Farmagio);
            }
        });
        Pizza American = new Pizza("American pizza", "Picas mīkla, Mocarella, Sēnes, Sīpoli, Olīvas, Pepperoni", false, 5.90);
        infoButton4 = new JButton();
        infoButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, American);
            }
        });
        Pizza Student = new Pizza("Studentu", "Picas mīkla, Cisiņas, Šķiņķis, Mērce", false, 4.90);
        infoButton5 = new JButton();
        infoButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, Student);
            }
        });
        Pizza Kalifornija = new Pizza("Kalifornija", "Picas mīkla, BBQ mērce, Mocarella, Kupināts siers, bekons", true, 7.90);
        infoButton6 = new JButton();
        infoButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, Kalifornija);
            }
        });
        Pizza Ferrara = new Pizza("Ferrara", "Picas mīkla, Cīsini, Asā mērce, Bekons, Pētersīļi, mocarella", true, 7.90);
        infoButton7 = new JButton();
        infoButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, Ferrara);
            }
        });


        buyButton = new JButton();
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double amount = 0;
                String order = "";
                JFrame buyFrame = new JFrame();
                if (box1.isSelected()) {
                    amount += Hawai.getCena();
                    order += (Hawai.getName() + " "+ Hawai.getCena()+ "€\n");
                }
                if (box2.isSelected()) {
                    amount += Margarita.getCena();
                    order += (Margarita.getName() + " "+ Margarita.getCena()+ "€\n");
                }
                if (box3.isSelected()) {
                    amount += Seasons.getCena();
                    order += (Seasons.getName() + " "+ Seasons.getCena()+ "€\n");
                }
                if (box4.isSelected()) {
                    amount += Farmagio.getCena();
                    order += (Farmagio.getName() + " "+ Farmagio.getCena()+ "€\n");
                }
                if (box5.isSelected()) {
                    amount += American.getCena();
                    order += (American.getName() + " "+ American.getCena()+ "€\n");
                }
                if (box6.isSelected()) {
                    amount += Student.getCena();
                    order += (Student.getName() + " "+ Student.getCena()+ "€\n");
                }
                if (box7.isSelected()) {
                    amount += Kalifornija.getCena();
                    order += (Kalifornija.getName() + " "+ Kalifornija.getCena()+ "€\n");
                }
                if (box8.isSelected()) {
                    amount += Ferrara.getCena();
                    order += (Ferrara.getName() + " "+ Ferrara.getCena()+ "€\n");
                }
                if (order == "") JOptionPane.showMessageDialog(buyFrame, "Pasutījums ir tukšs", "Pasutījums", JOptionPane.WARNING_MESSAGE);
                else {
                    order += "-----------\n";
                    String result = String.format("%.2f", amount);
                    order += ("Summa: " + result + "€\n");

                    int a = JOptionPane.showConfirmDialog(buyFrame, "Jūsu pasutījums:\n" + order );
                    if (a == JOptionPane.YES_OPTION) {
                        JFrame fAdress = new JFrame();
                        JFrame fName = new JFrame();

                        String adress = JOptionPane.showInputDialog(fAdress, "Ievadiet Jūsu adresi");
                        if (adress == null) System.exit(0);
                        else {
                            while (adress.isEmpty()) {
                                JOptionPane.showMessageDialog(buyFrame, "Adress ir tukšs", "Pasutījums", JOptionPane.WARNING_MESSAGE);
                                adress = JOptionPane.showInputDialog(fAdress, "Ievadiet Jūsu adresi");
                            }
                        }

                        String name = JOptionPane.showInputDialog(fName, "Ievadiet Jūsu vārdu");
                        if (name == null) System.exit(0);
                        else {
                            while (name.isEmpty()) {
                                JOptionPane.showMessageDialog(buyFrame, "Vards ir tukšs", "Pasutījums", JOptionPane.WARNING_MESSAGE);
                                name = JOptionPane.showInputDialog(fName, "Ievadiet Jūsu vārdu");
                            }
                            try {
                                FileWriter fw = new FileWriter("orders.txt", true);
                                String file1 = "Name: " + name + " \nAdress: " + adress + "\nOrder:\n" + order;
                                fw.write(file1 + "----------------\n");
                                fw.close();
                                JFrame conf = new JFrame();
                                JOptionPane.showMessageDialog(conf, "Pasutījums ir izveidots!!!");
                                System.exit(0);

                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        }

                    }
                }
            }
        });

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Piccas pasutījums");
        frame.setContentPane(new PizzaGui().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,580);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);


    }
}



