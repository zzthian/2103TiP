package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.exception.DukeException;
import duke.exception.InvalidInputException;
import duke.task.Task;

/**
 * Class to encapsulate a command that marks a Task as completed.
 */
public class MarkCommand extends Command {
    private String index;

    /**
     * Constructor for MarkCommand.
     *
     * @param index The index of the task to be marked, in String.
     */
    public MarkCommand(String index) {
        this.index = index;
    }

    /**
     * Mark the task at this index as completed.
     * Throw an Exception if index is invalid.
     *
     * @param ui The user interface.
     * @param tasks The list of tasks.
     * @param storage The local storage file.
     *
     * @throws DukeException If index < 0 or index > number of tasks in tasklist.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage, TaskList newTasks) throws DukeException {
        try {
            int i = Integer.parseInt(this.index);
            Task task = tasks.get(i - 1);
            task.complete();
            return "Okay, I have marked this task as done:\n" + task + "\n";
        } catch (IndexOutOfBoundsException e) {

            throw new InvalidInputException(this.index, "mark");
        }
    }
}
