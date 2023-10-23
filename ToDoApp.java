import java.awt.*;
import javax.swing.*;

public class ToDoApp extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel mainPanel;
    private JTextField taskNameField;
    private JTextField taskDescriptionField;
    private JTextField dueDateField;
    private JTextField statusField;
    private JButton addTaskButton;
    private JButton deleteTaskButton;
    private JButton updateTaskButton;
    private JButton setDueDateButton;

    public ToDoApp() {
        super("Task Master");

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(10, 5));

        taskNameField = new JTextField();
        mainPanel.add(new JLabel("Task Name:"));
        mainPanel.add(taskNameField);

        taskDescriptionField = new JTextField();
        mainPanel.add(new JLabel("Task Description:"));
        mainPanel.add(taskDescriptionField);

        dueDateField = new JTextField();
        mainPanel.add(new JLabel("Due Date:"));
        mainPanel.add(dueDateField);

        statusField = new JTextField();
        mainPanel.add(new JLabel("Status:"));
        mainPanel.add(statusField);

        addTaskButton = new JButton("Add Task");
        mainPanel.add(addTaskButton);

        deleteTaskButton = new JButton("Delete Task");
        mainPanel.add(deleteTaskButton);

        updateTaskButton = new JButton("Update Task");
        mainPanel.add(updateTaskButton);

        setDueDateButton = new JButton("Set Due Date");
        mainPanel.add(setDueDateButton);

        add(mainPanel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setSize(350, 450);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToDoApp();
            }
        });
    
    }
}

       
    