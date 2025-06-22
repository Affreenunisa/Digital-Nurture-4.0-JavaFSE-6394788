package TaskManagementSystem;

public class TaskManager {
    private Task head;

    public void addTask(Task newTask) {
        newTask.next = head;
        head = newTask;
    }

    public void deleteTask(int id) {
        Task temp = head, prev = null;
        while (temp != null && temp.taskId != id) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("❌ Task not found.");
            return;
        }

        if (prev == null) head = temp.next;
        else prev.next = temp.next;

        System.out.println("🗑️ Task deleted.");
    }

    public Task searchTask(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) return current;
            current = current.next;
        }
        return null;
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("📭 No tasks available.");
            return;
        }
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
