package TaskManagementSystem;

public class TestTaskSystem {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Fix bug", "In Progress"));
        manager.addTask(new Task(3, "Write tests", "Pending"));

        System.out.println("\n📋 All Tasks:");
        manager.displayTasks();

        System.out.println("\n🔍 Searching Task ID 2:");
        Task t = manager.searchTask(2);
        System.out.println(t != null ? t : "Task not found");

        System.out.println("\n🗑️ Deleting Task ID 2:");
        manager.deleteTask(2);

        System.out.println("\n📋 Tasks After Deletion:");
        manager.displayTasks();
    }
}

