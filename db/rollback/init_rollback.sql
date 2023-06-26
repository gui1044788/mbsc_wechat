--回滚脚本

-- 用户表
drop table sys_user;
drop sequence sys_user_seq;

-- 角色表
drop table sys_role;
drop sequence sys_role_seq;

-- 权限表
drop table sys_auth;
drop sequence sys_auth_seq;

--用户角色关系表
drop table sys_user_role;
drop sequence sys_user_role_seq;

--角色权限关系表
drop table sys_role_auth;
drop sequence sys_role_auth_seq;

-- 系统字典表
drop table sys_dic;
drop sequence sys_dic_seq;

--设备表
drop table hpad_client_device;
drop sequence hpad_client_device_seq;

--科室表
drop table hpad_department;
drop sequence hpad_department_seq;

--设备科室关联表
drop table hpad_depart_device;
drop sequence hpad_depart_device_seq;

--文章列表 article
drop table hpad_article;
drop sequence hpad_article_seq;

--文章状态表
drop table hpad_article_buff;

--文章定制表
drop table hpad_article_custom;

--设备视频表
drop table hpad_video;
drop sequence hpad_video_seq;
