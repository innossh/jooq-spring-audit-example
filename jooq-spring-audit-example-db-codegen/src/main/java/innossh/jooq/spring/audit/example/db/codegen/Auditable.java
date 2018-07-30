package innossh.jooq.spring.audit.example.db.codegen;

import java.time.LocalDateTime;

public interface Auditable<T> {

    public LocalDateTime getCreatedAt();

    public T setCreatedAt(LocalDateTime value);

    public LocalDateTime getUpdatedAt();

    public T setUpdatedAt(LocalDateTime value);

}
