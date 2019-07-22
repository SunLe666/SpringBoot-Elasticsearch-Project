# SpringBoot-Elasticsearch-Project
# SpringBoot、Elasticsearch

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
  PUT /db/user/2
  {
    "username": "sun",
    "password": "123456",
    "age": "22"
  }
  
  查询
  GET /db/user/2


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


