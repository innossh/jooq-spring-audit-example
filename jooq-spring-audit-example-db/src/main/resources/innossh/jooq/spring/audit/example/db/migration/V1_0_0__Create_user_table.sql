CREATE TABLE "user" (
    id bigserial PRIMARY KEY,
    name character varying(100) NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);
