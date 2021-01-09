package domain;

import net.bytebuddy.asm.Advice;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {
    @Column(name = "CREATE_DT")
    private LocalDateTime createDt;
    @Column(name = "UPDATE_DT")
    private LocalDateTime updateDt;
}
