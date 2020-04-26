# spring-boot-data-rest-mongotemplate
Spring boot data rest mongodb crud example using mongotemplate


![JPA Queries](https://github.com/rahul-ghadge/spring-boot-data-rest-mongodb/blob/master/src/main/resources/JPA%20Queries.PNG?raw=true)




### --------------------------------------------------------------------------------------
### Search by default property
### --------------------------------------------------------------------------------------

**GET**  - `http://localhost:8080/employees?sort=lastName,firstName,desc`
# 
**GET**  - `http://localhost:8080/employees{?page,size,sort}` >Optional parameters
# 
**POST** - `http://localhost:8080/employees` >(with request body)
#
**PUT**  - `http://localhost:8080/employees/5e86a29961c3c61e809cc986`	>(with request body)
#
**DELETE**  - `http://localhost:8080/employees/5e86a29961c3c61e809cc986`
#
**GET**  - `http://localhost:8080/profile/employees`
#
**GET**  - `http://localhost:8080/employees?page=1&size=5`



### --------------------------------------------------------------------------------------
### Search by custom property
### --------------------------------------------------------------------------------------
**GET**  - `http://localhost:8080/employees/search/find-by-name?firstName=Rahul`
#
**GET**  - `http://localhost:8080/employees/search/nameStartsWith?name=Ran`
#
**GET**  - `http://localhost:8080/employees/search/find-by-name?firstName=Rahul&sort=lastName,desc`

