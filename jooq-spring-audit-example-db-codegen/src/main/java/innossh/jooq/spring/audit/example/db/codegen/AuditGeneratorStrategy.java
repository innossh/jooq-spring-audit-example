package innossh.jooq.spring.audit.example.db.codegen;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

import java.util.Arrays;
import java.util.List;

public class AuditGeneratorStrategy extends DefaultGeneratorStrategy {

    @Override
    public List<String> getJavaClassImplements(Definition definition, Mode mode) {
        return Arrays.asList(Auditable.class.getName());
    }

}
