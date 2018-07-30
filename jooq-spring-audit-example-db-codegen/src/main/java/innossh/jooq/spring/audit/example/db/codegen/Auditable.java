package innossh.jooq.spring.audit.example.db.codegen;

import java.time.LocalDateTime;

public interface Auditable {

    public LocalDateTime getCreatedAt();

    public LocalDateTime getUpdatedAt();

}
