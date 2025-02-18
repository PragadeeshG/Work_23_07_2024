create table if not exists supervised_learning_classification(
image_classification_indicator Integer not null,
problem_definition varchar(255) null,
data_exploration varchar(255) null,
pre_process varchar(255) null,
processing varchar(255) null,
data_split_id Integer null,
is_splitted char null,
model_selection char null,
model_id Integer null,
model_train varchar(255) null,
evaluation varchar(255) null,
deploy_stage varchar(255) null,
monitor_stage varchar(255) null,
constraint supervised_learning_classification_pk primary key(image_classification_indicator));