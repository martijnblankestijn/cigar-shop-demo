drop table CIGAR;
create table CIGAR (
  ID INT NOT NULL CONSTRAINT CIGAR_PK PRIMARY KEY,
  NAME VARCHAR(40) NOT NULL,
  PRICE NUMERIC (5,2) NOT NULL
);
