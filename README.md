# YlimaF_Web
简单易用的家庭多媒体视频服务

## 项目简介：
本项目旨在搭建一套简单易用的家庭多媒体服务，具体包括以下功能：
1. 视频播放服务器：可在手机、平板、PC、TV等任何接入家庭网络的终端上播放；后续实现AirPlay和DLNA推送播放功能。
2. 爬虫：自动爬取电影、电视剧、动漫等多媒体资源，数据存入数据库中。
3. 智能下载：根据用户输入的关键字查询资源，如视频播放服务器上不存在资源，则从多媒体资源数据库中查询下载地址下载至视频播放服务器上，下载完成后消息推送。

## 功能设计：
一、实体表设计：
1. 资源表（Resource）

`CREATE TABLE `Resource` (

 `ID`  bigint(10) NOT NULL AUTO_INCREMENT , 
 
 `Name`  varchar(255) NOT NULL , 
 
 `Type`  int(2) NOT NULL , 
 
 PRIMARY KEY (`ID`) 
 
 ) 
 
 DEFAULT CHARACTER SET=utf8;`
2. 电影表（Movie）
