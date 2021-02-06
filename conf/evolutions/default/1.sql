# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table names (
  id                            integer auto_increment not null,
  name                          varchar(255),
  create_date                   datetime(6),
  modified_date                 datetime(6),
  constraint pk_names primary key (id)
);


# --- !Downs

drop table if exists names;

