# SpringBoot-Elasticsearch-Project
# SpringBoot、Elasticsearch

ElasticSearch 是分布式数据库，允许多台服务器协同工作，每台服务器可以运行多个实例。单个实例称为一个节点（node），一组节点构成一个集群（cluster）。分片是底层的工作单元，文档保存在分片内，分片又被分配到集群内的各个节点里，每个分片仅保存全部数据的一部分。

简单语法：
  
  新增
  POST /db/user/1
  {
    "username":"sunle",
    "password":"1234",
    "age":"25"
  }
  
  删除
  DELETE /db/user/1

  修改
  PUT /db/user/1
  {
    "username": "sun",
    "password": "123456",
    "age": "22"
  }
  
  查询
  GET /db/user/1


  过滤查询
  GET db/user/_search
  {
    "query": {
      "match": {
        "username": "sun"
      }
    },
    "_source":["username","password"]
  }


