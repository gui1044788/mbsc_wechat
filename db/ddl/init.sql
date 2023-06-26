--设备表
create sequence hpad_client_device_seq start with 1 increment by 1 maxvalue 9999999999999999999999 cache 1000 cycle order;

CREATE TABLE hpad_client_device
(
    seq decimal(22,0) PRIMARY KEY NOT NULL default hpad_client_device_seq.nextval ,
    device_id VARCHAR(100) NOT NULL,
    device_name VARCHAR(100) NOT NULL,
    device_ip VARCHAR(100) NOT NULL,
    device_mac VARCHAR(100) NOT NULL,
    status VARCHAR(5) NOT NULL default '0',
    remark VARCHAR(300),
    create_user VARCHAR(30) NOT NULL default 'admin',
    create_time VARCHAR(20) NOT NULL default to_char(sysdate,'yyyy-MM-dd hh24:mm:ss'),
    update_user VARCHAR(30),
    update_time VARCHAR(20)
);

CREATE INDEX INDEX_hpad_client_device_id ON hpad_client_device(device_id )  ;
CREATE INDEX INDEX_hpad_client_device_ip ON hpad_client_device(device_ip )  ;
CREATE INDEX INDEX_hpad_client_device_mac ON hpad_client_device(device_mac )  ;


COMMENT ON TABLE hpad_client_device IS '客户端设备表';
COMMENT ON COLUMN hpad_client_device.seq IS '设备序号';
COMMENT ON COLUMN hpad_client_device.device_id IS '设备ID';
COMMENT ON COLUMN hpad_client_device.device_name IS '设备名称';
COMMENT ON COLUMN hpad_client_device.device_ip IS '设备IP';
COMMENT ON COLUMN hpad_client_device.device_mac IS '设备物理地址';
COMMENT ON COLUMN hpad_client_device.status IS '设备使用状态:0:正常,1:停用,2:注销';
COMMENT ON COLUMN hpad_client_device.remark IS '备注';
COMMENT ON COLUMN hpad_client_device.create_user IS '创建人';
COMMENT ON COLUMN hpad_client_device.create_time IS '创建时间';
COMMENT ON COLUMN hpad_client_device.update_user IS '更新人';
COMMENT ON COLUMN hpad_client_device.update_time IS '更新时间';


--科室表
create sequence hpad_department_seq start with 1 increment by 1 maxvalue 9999999999999999999999 cache 1000 cycle order;

CREATE TABLE hpad_department
(
    seq decimal(22,0) NOT NULL PRIMARY KEY default hpad_department_seq.nextval ,
    depart_id VARCHAR(100) NOT NULL,
    depart_name_cn VARCHAR(100) NOT NULL,
    depart_name_en VARCHAR(100) ,
    depart_name_cde VARCHAR(50) NOT NULL,
    depart_parent_id VARCHAR(100) ,
    depart_type VARCHAR(10) ,
    status VARCHAR(5) NOT NULL  default '2',
    remark VARCHAR(300) NOT NULL,
    create_user VARCHAR(30) NOT NULL default 'admin',
    create_time VARCHAR(20) NOT NULL default to_char(sysdate,'yyyy-MM-dd hh24:mm:ss'),
    update_user VARCHAR(30),
    update_time VARCHAR(20)
);

CREATE INDEX INDEX_hpad_department_id ON hpad_department(depart_id )  ;
CREATE INDEX INDEX_hpad_department_name_cn ON hpad_department(depart_name_cn )  ;
CREATE INDEX INDEX_hpad_department_name_cde ON hpad_department(depart_name_cde )  ;
CREATE INDEX INDEX_hpad_department_parent_id ON hpad_department(depart_parent_id )  ;
CREATE INDEX INDEX_hpad_department_depart_type ON hpad_department(depart_type )  ;


COMMENT ON TABLE hpad_department IS '科室表';
COMMENT ON COLUMN hpad_department.seq IS '科室序号';
COMMENT ON COLUMN hpad_department.depart_id IS '科室ID';
COMMENT ON COLUMN hpad_department.depart_name_cn IS '科室名称';
COMMENT ON COLUMN hpad_department.depart_name_en IS '科室名称(英文)';
COMMENT ON COLUMN hpad_department.depart_name_cde IS '科室名称简拼';
COMMENT ON COLUMN hpad_department.depart_parent_id IS '上级科室ID';
COMMENT ON COLUMN hpad_department.depart_type IS '科室类型:0:门诊,1:急诊,2:住院,3:ICU,4:医技';
COMMENT ON COLUMN hpad_department.status IS '设备使用状态:0:生效,1:失效';
COMMENT ON COLUMN hpad_department.remark IS '备注';
COMMENT ON COLUMN hpad_department.create_user IS '创建人';
COMMENT ON COLUMN hpad_department.create_time IS '创建时间';
COMMENT ON COLUMN hpad_department.update_user IS '更新人';
COMMENT ON COLUMN hpad_department.update_time IS '更新时间';

--设备科室关联表
create sequence hpad_depart_device_seq start with 1 increment by 1 maxvalue 9999999999999999999999 cache 1000 cycle order;

CREATE TABLE hpad_depart_device
(
    seq decimal(22,0) PRIMARY KEY NOT NULL default hpad_depart_device_seq.nextval ,
    device_seq decimal(22,0) NOT NULL,
    depart_seq decimal(22,0) NOT NULL,
    status VARCHAR(5) NOT NULL  default '0',
    create_user VARCHAR(30) NOT NULL default 'admin',
    create_time VARCHAR(20) NOT NULL default to_char(sysdate,'yyyy-MM-dd hh24:mm:ss'),
    update_user VARCHAR(30),
    update_time VARCHAR(20)
);

CREATE INDEX INDEX_hpad_depart_device_eseq ON hpad_depart_device(device_seq )  ;
CREATE INDEX INDEX_hpad_depart_device_tseq ON hpad_depart_device(depart_seq )  ;

COMMENT ON TABLE hpad_depart_device IS '设备科室关联表';
COMMENT ON COLUMN hpad_depart_device.device_seq IS '设备编号';
COMMENT ON COLUMN hpad_depart_device.depart_seq IS '科室编号';
COMMENT ON COLUMN hpad_depart_device.status IS '状态:0:生效,1:失效';
COMMENT ON COLUMN hpad_depart_device.create_user IS '创建人';
COMMENT ON COLUMN hpad_depart_device.create_time IS '创建时间';
COMMENT ON COLUMN hpad_depart_device.update_user IS '更新人';
COMMENT ON COLUMN hpad_depart_device.update_time IS '更新时间';

-- 用户表
create sequence sys_user_seq start with 1 increment by 1 maxvalue 9999999999999999999999 cache 1000 cycle order;

CREATE TABLE sys_user
(
    user_id decimal(22,0) PRIMARY KEY NOT NULL default sys_user_seq.nextval ,
    user_name VARCHAR(30) NOT NULL,
    user_password VARCHAR(100) NOT NULL,
    user_real_name VARCHAR(60) NOT NULL,
    user_sex VARCHAR(5) NOT NULL default '9',
    status VARCHAR(5) NOT NULL,
    create_user VARCHAR(30) NOT NULL default 'admin',
    create_time VARCHAR(20) NOT NULL default to_char(sysdate,'yyyy-MM-dd hh24:mm:ss'),
    update_user VARCHAR(30),
    update_time VARCHAR(20)
);

CREATE INDEX INDEX_sys_user_userId ON sys_user(user_id )  ;

COMMENT ON TABLE sys_user IS '后台系统用户表';
COMMENT ON COLUMN sys_user.user_id IS '用户ID';
COMMENT ON COLUMN sys_user.user_name IS '登录账号';
COMMENT ON COLUMN sys_user.user_password IS '登录密码';
COMMENT ON COLUMN sys_user.user_real_name IS '用户姓名';
COMMENT ON COLUMN sys_user.user_sex IS '用户性别:1:男,2:女,9:未知';
COMMENT ON COLUMN sys_user.status IS '状态:0:生效,1:失效';
COMMENT ON COLUMN sys_user.create_user IS '创建人';
COMMENT ON COLUMN sys_user.create_time IS '创建时间';
COMMENT ON COLUMN sys_user.update_user IS '更新人';
COMMENT ON COLUMN sys_user.update_time IS '更新时间';

-- 角色表
create sequence sys_role_seq start with 1 increment by 1 maxvalue 9999999999999999999999 cache 1000 cycle order;

CREATE TABLE sys_role
(
    id decimal(22,0) PRIMARY KEY NOT NULL default sys_role_seq.nextval ,
    role_name VARCHAR(50) NOT NULL
);

COMMENT ON TABLE sys_role IS '后台系统角色表';
COMMENT ON COLUMN sys_role.id IS '角色ID';
COMMENT ON COLUMN sys_role.role_name IS '角色名';


-- 权限表
create sequence sys_auth_seq start with 1 increment by 1 maxvalue 9999999999999999999999 cache 1000 cycle order;

CREATE TABLE sys_auth
(
    id decimal(22,0) PRIMARY KEY NOT NULL default sys_auth_seq.nextval ,
    name VARCHAR(50) NOT NULL,
    permission VARCHAR(200) NOT NULL
);
CREATE INDEX INDEX_sys_auth_name ON sys_auth(name )  ;

COMMENT ON TABLE sys_auth IS '后台系统权限表';
COMMENT ON COLUMN sys_auth.id IS '角色ID';
COMMENT ON COLUMN sys_auth.name IS '权限名称';
COMMENT ON COLUMN sys_auth.permission IS '权限标识';

--用户角色关系表
create sequence sys_user_role_seq start with 1 increment by 1 maxvalue 9999999999999999999999 cache 1000 cycle order;

CREATE TABLE sys_user_role
(
    id decimal(22,0) PRIMARY KEY NOT NULL default sys_user_role_seq.nextval ,
    user_id decimal(22,0) NOT NULL,
    role_id decimal(22,0) NOT NULL
);

CREATE INDEX INDEX_sys_user_role_user_id ON sys_user_role(user_id )  ;
CREATE INDEX INDEX_sys_user_role_role_id ON sys_user_role(role_id )  ;

COMMENT ON TABLE sys_user_role IS '用户角色关系表';
COMMENT ON COLUMN sys_user_role.id IS '序列号';
COMMENT ON COLUMN sys_user_role.user_id IS '用户ID';
COMMENT ON COLUMN sys_user_role.role_id IS '角色ID';

--角色权限关系表
create sequence sys_role_auth_seq start with 1 increment by 1 maxvalue 9999999999999999999999 cache 1000 cycle order;

CREATE TABLE sys_role_auth
(
    id decimal(22,0) PRIMARY KEY NOT NULL default sys_role_auth_seq.nextval ,
    role_id decimal(22,0) NOT NULL,
    auth_id decimal(22,0) NOT NULL
);

CREATE INDEX INDEX_sys_role_auth_auth_id ON sys_role_auth(auth_id )  ;
CREATE INDEX INDEX_sys_role_auth_role_id ON sys_role_auth(role_id )  ;

COMMENT ON TABLE sys_role_auth IS '角色权限关系表';
COMMENT ON COLUMN sys_role_auth.id IS '序列号';
COMMENT ON COLUMN sys_role_auth.auth_id IS '权限ID';
COMMENT ON COLUMN sys_role_auth.role_id IS '角色ID';


-- 系统字典表
create sequence sys_dic_seq start with 1 increment by 1 maxvalue 9999999999999999999999 cache 1000 cycle order;

CREATE TABLE sys_dic
(
    id decimal(22,0) PRIMARY KEY NOT NULL default sys_dic_seq.nextval ,
    dic_node VARCHAR(50) NOT NULL,
    dic_node_desc VARCHAR(200) NOT NULL,
    dic_code VARCHAR(50) NOT NULL,
    dic_code_desc VARCHAR(200) NOT NULL,
    dic_order VARCHAR(5) NOT NULL,
    create_user VARCHAR(30) NOT NULL default 'admin',
    create_time VARCHAR(20) NOT NULL default to_char(sysdate,'yyyy-MM-dd hh24:mm:ss'),
    update_user VARCHAR(30),
    update_time VARCHAR(20)
);

CREATE INDEX INDEX_sys_dic_dic_node ON sys_dic(dic_node )  ;
CREATE INDEX INDEX_sys_dic_dic_code ON sys_dic(dic_code )  ;

COMMENT ON TABLE sys_dic IS '系统字典表';
COMMENT ON COLUMN sys_dic.id IS '字典序号';
COMMENT ON COLUMN sys_dic.dic_node IS '字典节点';
COMMENT ON COLUMN sys_dic.dic_node_desc IS '字典节点描述';
COMMENT ON COLUMN sys_dic.dic_code IS '字典编码';
COMMENT ON COLUMN sys_dic.dic_code_desc IS '字典描述';
COMMENT ON COLUMN sys_dic.dic_order IS '排序字段';
COMMENT ON COLUMN sys_dic.create_user IS '创建人';
COMMENT ON COLUMN sys_dic.create_time IS '创建时间';
COMMENT ON COLUMN sys_dic.update_user IS '更新人';
COMMENT ON COLUMN sys_dic.update_time IS '更新时间';


--文章列表 article
create sequence hpad_article_seq start with 1 increment by 1 maxvalue 9999999999999999999999 cache 1000 cycle order;

CREATE TABLE hpad_article
(
    id decimal(22,0) PRIMARY KEY NOT NULL default hpad_article_seq.nextval ,
    site_id VARCHAR(10),
    org_id VARCHAR(10),
    channel_id VARCHAR(10) NOT NULL,
    content_type VARCHAR(10) ,
    repeal_quartz  VARCHAR(5) NOT NULL default 'N'  ,
    article_type VARCHAR(10) NOT NULL ,
    article_sub_type VARCHAR(10) NOT NULL ,
    state VARCHAR(10) NOT NULL default '10' ,
    department VARCHAR(10),
    sticky VARCHAR(5) NOT NULL default 'N' ,
    create_user VARCHAR(30) NOT NULL default 'admin',
    create_time VARCHAR(20) NOT NULL default to_char(sysdate,'yyyy-MM-dd hh24:mm:ss'),
    update_user VARCHAR(30),
    update_time VARCHAR(20)
);

CREATE INDEX INDEX_hpad_article_site_id ON hpad_article(site_id)  ;
CREATE INDEX INDEX_hpad_article_org_id ON hpad_article(org_id)  ;
CREATE INDEX INDEX_hpad_article_channel_id ON hpad_article(channel_id)  ;
CREATE INDEX INDEX_hpad_article_article_type ON hpad_article(article_type)  ;
CREATE INDEX INDEX_hpad_article_article_subtype ON hpad_article(article_sub_type)  ;
CREATE INDEX INDEX_hpad_article_state ON hpad_article(state)  ;

COMMENT ON TABLE hpad_article IS '推送文章表';
COMMENT ON COLUMN hpad_article.id IS '序列号';
COMMENT ON COLUMN hpad_article.site_id IS '站点id';
COMMENT ON COLUMN hpad_article.org_id IS '机构ID';
COMMENT ON COLUMN hpad_article.channel_id IS '栏目ID';
COMMENT ON COLUMN hpad_article.content_type IS '内容类型';
COMMENT ON COLUMN hpad_article.repeal_quartz IS '定时下线:Y:是,N:否';
COMMENT ON COLUMN hpad_article.article_type IS '文章类型';
COMMENT ON COLUMN hpad_article.article_sub_type IS '文章子类型';
COMMENT ON COLUMN hpad_article.state IS '文章状态(0:已发布,1:已归档,5:待发布,10:草稿,11:待审核,12:审核中,20:已删除,21:已下线,22:已退回)';
COMMENT ON COLUMN hpad_article.department IS '所属科室';
COMMENT ON COLUMN hpad_article.sticky IS '置顶:Y:是,N:否';
COMMENT ON COLUMN hpad_article.create_user IS '创建人';
COMMENT ON COLUMN hpad_article.create_time IS '创建时间';
COMMENT ON COLUMN hpad_article.update_user IS '更新人';
COMMENT ON COLUMN hpad_article.update_time IS '更新时间';


--文章状态表
CREATE TABLE hpad_article_buff
(
    article_id decimal(22,0) NOT NULL,
    views VARCHAR(20) NOT NULL default '0' ,
    day_views VARCHAR(10) NOT NULL default '0' ,
    week_views VARCHAR(10) NOT NULL default '0' ,
    month_views VARCHAR(10) NOT NULL default '0',
    online_date VARCHAR(20),
    offline_date VARCHAR(20),
    sticky_date VARCHAR(20)
);

CREATE INDEX INDEX_hpad_article_buff_article_id ON hpad_article_buff(article_id)  ;

COMMENT ON TABLE hpad_article_buff IS '推送文章状态表';
COMMENT ON COLUMN hpad_article_buff.article_id IS '文章表id';
COMMENT ON COLUMN hpad_article_buff.views IS '阅读次数';
COMMENT ON COLUMN hpad_article_buff.day_views IS '阅读次数(天)';
COMMENT ON COLUMN hpad_article_buff.week_views IS '阅读次数(周)';
COMMENT ON COLUMN hpad_article_buff.month_views IS '阅读次数(月)';
COMMENT ON COLUMN hpad_article_buff.online_date IS '发布时间';
COMMENT ON COLUMN hpad_article_buff.offline_date IS '下线时间';
COMMENT ON COLUMN hpad_article_buff.sticky_date IS '置顶时间';



--文章定制表
CREATE TABLE hpad_article_custom
(
    article_id decimal(22,0) NOT NULL,
    title VARCHAR(200)NOT NULL,
    sub_title VARCHAR(200),
    full_title VARCHAR(200) ,
    alias VARCHAR(200),
    seo_keywords VARCHAR(200),
    seo_description VARCHAR(1000),
    author VARCHAR(50),
    editor VARCHAR(50),
    source VARCHAR(200),
    image_url VARCHAR(255),
    video_url VARCHAR(255),
    video_duration VARCHAR(20),
    image_list  VARCHAR(2000),
    text_content  text
);

CREATE INDEX INDEX_hpad_article_custom_article_id ON hpad_article_custom(article_id)  ;
CREATE INDEX INDEX_hpad_article_custom_seo_keywords ON hpad_article_custom(seo_keywords)  ;
CREATE INDEX INDEX_hpad_article_custom_author ON hpad_article_custom(author)  ;
CREATE INDEX INDEX_hpad_article_custom_source ON hpad_article_custom(source)  ;


COMMENT ON TABLE hpad_article_custom IS '文章定制表';
COMMENT ON COLUMN hpad_article_custom.article_id IS '文章表id';
COMMENT ON COLUMN hpad_article_custom.title IS '文章标题';
COMMENT ON COLUMN hpad_article_custom.sub_title IS '文章副标题';
COMMENT ON COLUMN hpad_article_custom.full_title IS '文章全标题';
COMMENT ON COLUMN hpad_article_custom.alias IS '文章别称';
COMMENT ON COLUMN hpad_article_custom.seo_keywords IS '关键字';
COMMENT ON COLUMN hpad_article_custom.seo_description IS '摘要';
COMMENT ON COLUMN hpad_article_custom.author IS '作者';
COMMENT ON COLUMN hpad_article_custom.editor IS '编辑';
COMMENT ON COLUMN hpad_article_custom.source IS '来源';
COMMENT ON COLUMN hpad_article_custom.image_url IS '封面图片';
COMMENT ON COLUMN hpad_article_custom.video_url IS '视频地址';
COMMENT ON COLUMN hpad_article_custom.video_duration IS '视频时长';
COMMENT ON COLUMN hpad_article_custom.image_list IS '图片集';
COMMENT ON COLUMN hpad_article_custom.text_content IS '正文';


--设备视频表 video
create sequence hpad_video_seq start with 1 increment by 1 maxvalue 9999999999999999999999 cache 1000 cycle order;

CREATE TABLE hpad_video
(
    video_id decimal(22,0) PRIMARY KEY NOT NULL default hpad_video_seq.nextval ,
    title VARCHAR(200)NOT NULL,
    sub_title VARCHAR(200),
    full_title VARCHAR(200),
    alias VARCHAR(200),
    keywords VARCHAR(200),
    synopsis VARCHAR(1000),
    director VARCHAR(50),
    actor VARCHAR(50),
    source VARCHAR(200),
    image_url VARCHAR(255),
    video_url VARCHAR(255),
    video_duration VARCHAR(20)
);

CREATE INDEX INDEX_hpad_video_keywords ON hpad_video(keywords)  ;
CREATE INDEX INDEX_hpad_video_alias ON hpad_video(alias)  ;
CREATE INDEX INDEX_hpad_video_director ON hpad_video(director)  ;
CREATE INDEX INDEX_hpad_video_source ON hpad_video(source)  ;
CREATE INDEX INDEX_hpad_video_title ON hpad_video(title)  ;


COMMENT ON TABLE hpad_video IS '设备视频表';
COMMENT ON COLUMN hpad_video.video_id IS '视频编号';
COMMENT ON COLUMN hpad_video.title IS '视频标题';
COMMENT ON COLUMN hpad_video.sub_title IS '视频子标题';
COMMENT ON COLUMN hpad_video.full_title IS '视频全标题';
COMMENT ON COLUMN hpad_video.alias IS '视频别称';
COMMENT ON COLUMN hpad_video.keywords IS '关键词';
COMMENT ON COLUMN hpad_video.synopsis IS '视频简介';
COMMENT ON COLUMN hpad_video.director IS '导演';
COMMENT ON COLUMN hpad_video.actor IS '演员';
COMMENT ON COLUMN hpad_video.source IS '来源';
COMMENT ON COLUMN hpad_video.image_url IS '视频封片';
COMMENT ON COLUMN hpad_video.video_url IS '视频地址';
COMMENT ON COLUMN hpad_video.video_duration IS '视频时长';