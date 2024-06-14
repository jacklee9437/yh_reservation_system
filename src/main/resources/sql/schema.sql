CREATE TABLE reservation (
    id bigint NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    phone_number char(13) NOT NULL,
    password varchar(255) NOT NULL,
    reserved_at datetime NOT NULL,
    status char(1) NOT NULL,
    created_at timestamp NOT NULL,
    PRIMARY KEY (id)
);