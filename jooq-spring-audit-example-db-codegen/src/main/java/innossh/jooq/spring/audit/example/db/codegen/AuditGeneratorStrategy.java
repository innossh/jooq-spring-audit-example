package innossh.jooq.spring.audit.example.db.codegen;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.jooq.codegen.GeneratorStrategy.Mode.RECORD;

public class AuditGeneratorStrategy extends DefaultGeneratorStrategy {

    @Override
    public List<String> getJavaClassImplements(Definition definition, Mode mode) {
        if (RECORD.equals(mode)) {
            return Arrays.asList(Auditable.class.getName());
        }
        return new ArrayList<>();
    }

}
