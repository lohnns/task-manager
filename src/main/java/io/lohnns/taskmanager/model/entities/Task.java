package io.lohnns.taskmanager.model.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime dueDate;
    @ManyToOne
    @JoinColumn(name = "task_list_id")
    private TaskList taskList;
}
