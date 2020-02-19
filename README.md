# A simple spring rest api example

## Run

```bash
mvn spring-boot:run
``` 

## test

### test get

```python
import requests
r = requests.get(url=url)
print(r.status_code)
print(r.text)
```

### test post

```python
import requests

url = 'http://localhost:8080/'
data = {'name': 'fang', 'id': '001'}
r = requests.post(url=url, json=data)
print(r.status_code)
print(r.text)
```