CREATE TABLE ROOM(
  ROOM_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(16) NOT NULL,
  ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
  ROOM_INFO CHAR(2) NOT NULL
);

CREATE TABLE ROOM_INFO(
  ROOM_INFO_ID CHAR(2) PRIMARY KEY,
  NAME VARCHAR(16) NOT NULL,
  PRICE decimal(15,2) NOT NULL
);

CREATE TABLE INCLUSIONS (
  INCLUSION_ID BIGINT PRIMARY KEY,
  NAME VARCHAR(64) NOT NULL
);

CREATE TABLE ROOM_INCLUSIONS (
  ROOM_INFO_ID CHAR(2),
  INCLUSION_ID BIGINT
);

ALTER TABLE ROOM ADD FOREIGN KEY (ROOM_INFO) REFERENCES ROOM_INFO(ROOM_INFO_ID);
/*ALTER TABLE ROOM_INFO ADD FOREIGN KEY (ROOM_INFO_ID) REFERENCES ROOM_INCLUSIONS(ROOM_INFO_ID);*/


