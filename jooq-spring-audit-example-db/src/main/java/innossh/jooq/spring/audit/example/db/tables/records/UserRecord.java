/*
 * This file is generated by jOOQ.
 */
package innossh.jooq.spring.audit.example.db.tables.records;


import innossh.jooq.spring.audit.example.db.codegen.Auditable;
import innossh.jooq.spring.audit.example.db.tables.User;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Auditable, Record4<Long, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -1051869541;

    /**
     * Setter for <code>public.user.id</code>.
     */
    public UserRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.user.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.user.name</code>.
     */
    public UserRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.user.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.user.created_at</code>.
     */
    public UserRecord setCreatedAt(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.user.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.user.updated_at</code>.
     */
    public UserRecord setUpdatedAt(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.user.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return User.USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return User.USER.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return User.USER.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component3() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component4() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(Long value1, String value2, LocalDateTime value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Long id, String name, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(User.USER);

        set(0, id);
        set(1, name);
        set(2, createdAt);
        set(3, updatedAt);
    }
}