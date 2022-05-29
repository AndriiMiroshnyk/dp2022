create database student16;
create user andrii_miroshnyk with password '111';
grant all on database student16 to andrii_miroshnyk;

CREATE TABLE "laptops" (
  "id" serial PRIMARY KEY,
  "title" varchar,
  "img" varchar,
  "description" varchar
);
