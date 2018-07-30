package innossh.jooq.spring.audit.example.config;

import innossh.jooq.spring.audit.example.db.codegen.Auditable;
import org.jooq.RecordContext;
import org.jooq.impl.DefaultRecordListener;

import java.time.LocalDateTime;

public class AuditRecordListener extends DefaultRecordListener {

    @Override
    public void insertStart(RecordContext ctx) {
        if (ctx.record() instanceof Auditable) {
            LocalDateTime now = LocalDateTime.now();
            Auditable record = (Auditable) ctx.record();
            record.setCreatedAt(now);
            record.setUpdatedAt(now);
        }
    }

    @Override
    public void updateStart(RecordContext ctx) {
        if (ctx.record() instanceof Auditable) {
            Auditable record = (Auditable) ctx.record();
            record.setUpdatedAt(LocalDateTime.now());
        }
    }

}
