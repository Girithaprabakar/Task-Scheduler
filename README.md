Here is the `README.md` file content for your `TaskScheduler` program. This README includes an overview of the program, installation instructions, usage, and placeholders for screenshots of the executed program.

---

# Task Scheduler

## Description
The **Task Scheduler** is a simple Java application that allows users to manage tasks by adding, deleting, and marking them as completed. The application uses a graphical user interface (GUI) created with Swing components. It enables users to input task descriptions, set due times, and manage task statuses.

### Features:
- **Add Tasks**: Allows users to input task descriptions and due times.
- **Delete Tasks**: Enables users to remove tasks from the list.
- **Mark Tasks as Completed**: Users can mark tasks as completed, which updates the task status.

## Screenshots
Here are some screenshots of the Task Scheduler program in action:

1. ![Screenshot 1](screenshots/screenshot1.png)  
   *Main window showing task list with a few tasks.*

2. ![Screenshot 2](screenshots/screenshot2.png)  
   *Add Task dialog window for entering task details.*

3. ![Screenshot 3](screenshots/screenshot3.png)  
   *Task marked as completed in the task list.*

4. ![Screenshot 4](screenshots/screenshot4.png)  
   *Delete Task confirmation message.*

5. ![Screenshot 5](screenshots/screenshot5.png)  
   *Updated task list after deletion.*

## Installation

### Prerequisites
Before running this program, ensure that you have the following installed:
- **Java Development Kit (JDK)** 8 or higher: [Download JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)

### Step-by-Step Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/task-scheduler.git
   ```

2. **Navigate to the project directory:**
   ```bash
   cd task-scheduler
   ```

3. **Compile the Java files:**
   ```bash
   javac TaskScheduler.java
   ```

4. **Run the program:**
   ```bash
   java TaskScheduler
   ```

## Usage

1. **Adding a Task:**
   - Click the **"Add Task"** button to enter a task description and due time.
   
2. **Deleting a Task:**
   - Select a task from the list and click the **"Delete Task"** button to remove it.

3. **Marking a Task as Completed:**
   - Select a task from the list and click the **"Mark Completed"** button to mark the task as completed. The task's status will be updated in the list.

## Code Explanation

### Main Class: `TaskScheduler`

The `TaskScheduler` class extends `JFrame` and serves as the main window for the program. It contains:
- A list to display tasks (`taskList`).
- Buttons for adding, deleting, and marking tasks as completed.
- Methods for handling button actions, such as `addTask()`, `deleteTask()`, and `markTaskCompleted()`.

### Helper Class: `Task`

The `Task` class represents a task with the following attributes:
- **description**: The task's description.
- **dueTime**: The due time of the task.
- **isCompleted**: A boolean indicating whether the task is completed.

It includes methods for marking a task as completed and formatting the task as a string for display.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Implement your changes.
4. Commit your changes (`git commit -am 'Added new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

### Instructions for Screenshots:
- Save your screenshots in a folder named `screenshots` within the project directory.
- Replace the placeholders (`screenshot1.png`, `screenshot2.png`, etc.) with the actual filenames for the screenshots.
- Upload the `screenshots` folder to your repository.

Let me know if you need further adjustments!
