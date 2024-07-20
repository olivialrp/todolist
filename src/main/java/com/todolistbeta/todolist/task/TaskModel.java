import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {
    @Id
    @GeneratedValue(generator = "UUID")

    private UUID id;
    private String description;

    @Column(length = 50)
    private String title;
    private LocalDateTime StartAt;
    private LocalDateTime EndAt;
    private String priority;
    private UUID userId;

    @CreationTimestamp
    private LocalDateTime createdAt;
}