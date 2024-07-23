create table if not exists supervised_learning(
image_classification_indicator Integer not null,
market_perdiction_name varchar(255) null,
market_perdiction_type varchar(255) null,
market_perdiction_owner varchar(255) null,
models varchar(255) null,
features varchar(255) null,
target_label bigint null,
trainings varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint supervised_learning_pk primary key(image_classification_indicator));