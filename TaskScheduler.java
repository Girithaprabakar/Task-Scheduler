import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class TaskScheduler extends JFrame {
    private ArrayList<Task> tasks = new ArrayList<>();
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> taskList;

    public TaskScheduler() {
        setTitle("Task Scheduler");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel
        JPanel panel = new JPanel(new BorderLayout());

        // Task list
        taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        JButton addButton = new JButton("Add Task");
        JButton deleteButton = new JButton("Delete Task");
        JButton markButton = new JButton("Mark Completed");
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(markButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);

        // Button actions
        addButton.addActionListener(e -> addTask());
        deleteButton.addActionListener(e -> deleteTask());
        markButton.addActionListener(e -> markTaskCompleted());

        setVisible(true);
    }

    private void addTask() {
        String description = JOptionPane.showInputDialog(this, "Enter task description:");
        String dueTime = JOptionPane.showInputDialog(this, "Enter due time:");
        if (description != null && dueTime != null) {
            Task task = new Task(description, dueTime);
            tasks.add(task);
            listModel.addElement(task.toString());
        }
    }

    private void deleteTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            tasks.remove(selectedIndex);
            listModel.remove(selectedIndex);
        }
    }

    private void markTaskCompleted() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            Task task = tasks.get(selectedIndex);
            task.markAsCompleted();
            listModel.set(selectedIndex, task.toString());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TaskScheduler::new);
    }
}

class Task {
    private String description;
    private String dueTime;
    private boolean isCompleted;

    public Task(String description, String dueTime) {
        this.description = description;
        this.dueTime = dueTime;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public String getDueTime() {
        return dueTime;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return description + " (Due: " + dueTime + ") " + (isCompleted ? "[Completed]" : "");
    }
}