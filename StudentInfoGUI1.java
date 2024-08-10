import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;

class StudentInfoGUI1 extends JFrame {
    private JComboBox<String> batchComboBox; // Use a JComboBox for batch selection
    private JTextField rollNoField;
    private JTextField nameField;
    private JTextField departmentField;
    private ArrayList<Student2> studentList = new ArrayList<>();

    public StudentInfoGUI1() {
        setTitle("OOP FINAL");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        JLabel batchLabel = new JLabel("Batch:");
        String[] batchOptions = {"2019","2020","2021","2022","2023"};
        batchComboBox = new JComboBox<>(batchOptions);

        JLabel rollNoLabel = new JLabel("Roll No:");
        rollNoField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel departmentLabel = new JLabel("Department:");
        departmentField = new JTextField();

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });
        panel.add(batchLabel);
        panel.add(batchComboBox); // Add the JComboBox to the panel
        panel.add(rollNoLabel);
        panel.add(rollNoField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(departmentLabel);
        panel.add(departmentField);
        panel.add(addButton);
        add(panel, BorderLayout.CENTER);
        JButton saveButton = new JButton("Save to File");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveToFile();}
        });
        JButton loadButton = new JButton("Load from File");
        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadFromFile();}
        });
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    private void addStudent() {
        String batch = (String) batchComboBox.getSelectedItem(); // Get selected batch
        String rollNo = rollNoField.getText();
        String name = nameField.getText();
        String department = departmentField.getText();

        Student2 student = new Student2(batch, rollNo, name, department);
        studentList.add(student);

        batchComboBox.setSelectedIndex(0); // Reset the JComboBox to the first item
        rollNoField.setText("");
        nameField.setText("");
        departmentField.setText("");}
    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Data.txt"))) {
            Date currentDate = new Date();
            String dateTime = currentDate.toString();
            String header = "Saved on: " + dateTime + "\n";
            oos.writeObject(header); // Write the date and time as a header
            oos.writeObject(studentList); // Write the student information
            oos.close();
            System.out.println("Student information saved to Data.txt");
        } catch (IOException e) {
            e.printStackTrace();}
    }
    private void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Data.txt"))) {
            studentList = (ArrayList<Student2>) ois.readObject();
            System.out.println("Student information loaded from Data.txt");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                StudentInfoGUI1 studentInfoGUI = new StudentInfoGUI1();
                studentInfoGUI.setVisible(true);
            }
        });
    }
}
class Student2 implements Serializable {
    private String batch;
    private String rollNo;
    private String name;
    private String department;

    public Student2(String batch, String rollNo, String name, String department) {
        this.batch = batch;
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }
}
