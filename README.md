# short url server
- spring boot 2.6
- spring cloud 2021
- jdk 11

## 环境
- 本地启动redis`docker run -p 6379:6379 -d --name redis --restart unless-stopped redis`

## 验证
- 生成短链接id
```
curl --location --request POST 'localhost:8080/url' \
--header 'Content-Type: application/json' \
--data-raw '{"originUrl":"baidu.com"}'
```
