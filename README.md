# YlimaF_Web
简单易用的家庭多媒体视频服务

## 项目简介：
本项目旨在搭建一套简单易用的家庭多媒体服务，具体包括以下功能：
1. 视频播放服务器：可在手机、平板、PC、TV等任何接入家庭网络的终端上播放；后续实现AirPlay和DLNA推送播放功能。
2. 爬虫：自动爬取电影、电视剧、动漫等多媒体资源，数据存入数据库中。
3. 智能下载：根据用户输入的关键字查询资源，如视频播放服务器上不存在资源，则从多媒体资源数据库中查询下载地址下载至视频播放服务器上，下载完成后消息推送。

## 功能设计：
一. 实体表设计：

- 资源表（resource）
    
       CREATE TABLE `resource` (
         `ID` bigint(10) NOT NULL AUTO_INCREMENT,
         `Name` varchar(255) NOT NULL,
         `Type` varchar(10) NOT NULL,
         PRIMARY KEY (`ID`)
       ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
- 电影表（movie）

- 电视剧表

- 动漫表

- 小说表

- 数据字典表（dict)

        CREATE TABLE `dict` (
          `ID` int(11) NOT NULL AUTO_INCREMENT,
          `DICT_ID` varchar(255) NOT NULL,
          `DICT_DESC` varchar(255) DEFAULT NULL,
          PRIMARY KEY (`ID`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

- 数据字典项表（dict_item）

        CREATE TABLE `dict_item` (
          `ID` int(11) NOT NULL AUTO_INCREMENT,
          `DICT_ID` varchar(255) NOT NULL,
          `DICT_ITEM` varchar(255) NOT NULL,
          `DICT_ITEM_VALUE` varchar(255) NOT NULL,
          `DICT_ITEM_DESC` varchar(255) DEFAULT NULL,
          PRIMARY KEY (`ID`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

二. 模块设计

- 视频播放服务器

- 爬虫

- 智能搜索下载

- 微信公众号