package calculator;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Container panel1;

    public void main(String[] args) {
        //Main main = new Main();
        //main.setVisible(true);
        panel1.add(button1);
        JFrame jf = new JFrame("Form1");
        jf.setContentPane(new Main().panel1);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }
    /*public Main(){
        super("Calculator");
        setBounds(100, 100, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Main app = new Main(); // Создание основного окна
        app.setPreferredSize(new Dimension(300, 120)); // Установка размеров окна
        app.setResizable(false); // Запрет на масштабирование

        JPanel panel = new JPanel(); // Создание объекта JPanel для позиционирования
        JTextField inputNumber = new JTextField(); // Создание формы JTextField для ввода
        JButton plus = new JButton("+"); // Создание кнопки для суммы
        JButton minus = new JButton("-"); // Создание кнопки для вычитания
        JButton div = new JButton("/"); // Создание кнопки для деления
        JButton multiply = new JButton("*"); // Создание кнопки для умножения
        JRadioButton roman = new JRadioButton("Римские цифры", false); // Радио кнопка для вкл/выкл Римских цифр

        //plus.addActionListener(); // Действия кнопки сложения
        //minus.addActionListener(); // Действия кнопки вычитания
        //div.addActionListener(); // Действия кнопки деления
        //multiply.addActionListener(); // Действия кнопки умножения

        // Позиционирование для JTextField
        inputNumber.setHorizontalAlignment(JTextField.RIGHT);
        app.add(inputNumber, BorderLayout.NORTH);

        // Позиционирование для JRadioButton roman
        roman.setHorizontalAlignment(roman.CENTER);
        app.add(roman, BorderLayout.SOUTH);

        panel.add(plus); // Добавление кнопки суммы на панель
        panel.add(minus); // Добавление кнопки вычитания на панель
        panel.add(div); // Добавление кнопки деления на панель
        panel.add(multiply); // Добавление кнопки умножения на панель
        app.add(panel); // Добавление JPanel в программу
        app.pack(); // Упаковка всех элементов в app :)
        app.setVisible(true); // Отображение всех элементов
    }*/
}