CREATE TABLE sample (
  ID number,
  NAME varchar(50),
  DESCRIPTION varchar(100),
  USE_YN char(1),
  REG_USER varchar(10)  
);

alter table sample
add constraint pk_sample primary key(ID);

CREATE SEQUENCE sample_seq
    INCREMENT BY 2
    START WITH   1
    NOMAXVALUE
    NOCYCLE
    NOCACHE;