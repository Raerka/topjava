# ������ ������� <a href="https://github.com/JavaWebinar/topjava07">Topjava</a>

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) ������ ��������� ������� HW1:

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 1. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFXzByNVF3VV9zM1k">����������� ������ ��� � JSP</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFbUpZQ2ctVlY4UEk">1-HW1.patch</a>**
> ��������� � UserMealsUtil:
  - ������ ��������� `List<UserMeal> MEAL_LIST`
  - ������ ��������������� ����� `getWithExceeded`
> �������������� ���� ������ �� ������ <a href="http://stackoverflow.com/questions/35606551/jstl-localdatetime-format#35607225">JSTL LocalDateTime format</a>

- <a href="http://design-pattern.ru/patterns/mvc.html">MVC - Model View Controller</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 2. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFQndBeWFOa3phRTg">Optional: ���������� CRUD</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFeHI1MTJmMjFvalk">2-HW1-optional.patch</a>**

> ��� repository ����� �������� � ����� "���� ����������"

- <a href="http://stackoverflow.com/questions/246859/http-1-0-vs-1-1">HTTP 1.0 vs 1.1</a>

### ![question](https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png) ������� �� HW1

> ����� � `InMemoryUserMealRepositoryImpl` ��������� map � ������� �������������� ����� �������������, � �� � ������������?

������� ���. ������ ����� ��������� ��� ��� ��� �����������. ��. <a href="https://habrahabr.ru/post/133237/">������������� ����������� Java</a>

> ������ `InMemoryUserMealRepositoryImpl` �� singleton?

�� ��������� ���� Spring �������� ������������ (� ��� ���������). � ��� ���� ������ ����� ���������� ����� ����������� ����� Spring.

## ������� 2:
### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 3. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFVDJZVTktQzRYTWc">���������� vs ���������. ����������� ���������� Apache Commons, Guava</a>
-  <a href="http://commons.apache.org/">Apache Commons</a>, <a href="https://code.google.com/p/guava-libraries/wiki/GuavaExplained">Guava</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 4. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFeWZ1d1cxaUZiUmc">���� ����������. �������� ������� ����������.</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFblpRMVpzVVBudlE">3-app-layers.patch</a>**

> ��� DTO ��� ����� ����� ���������� � ����� ���������� "������� �� �������", ����� �� ������� Hibernate

-  <a href="http://en.wikipedia.org/wiki/Multilayered_architecture">������� "���� ����������"</a>
-  <a href="https://www.genuitec.com/products/myeclipse/learning-center/spring/myeclipse-for-spring-reference-blueprints/">�������������
            ���� ���������� � Spring</a>
-  <a href="https://ru.wikipedia.org/wiki/Data_Access_Object">Data Access Object</a>
-  <a href="http://codehelper.ru/questions/205/new/repository-�-dao-�������-������������-����������">�������� Repository � DAO</a>
-  <a href="http://martinfowler.com/eaaCatalog/dataTransferObject.html">������� DTO</a>
- <a href="http://stackoverflow.com/questions/1612334/difference-between-dto-vo-pojo-javabeans">Value Object � Data Transfer Object</a>
-  <a href="http://stackoverflow.com/questions/21554977/should-services-always-return-dtos-or-can-they-also-return-domain-models">Should services always return DTOs, or can they also return domain models?</a>

����������:
   - <a href="http://habrahabr.ru/post/263033/">�������� � DAO, ����������� Repository</a>
   - <a href="http://stackoverflow.com/questions/6640784/difference-between-active-record-and-dao">Difference between Active Record and DAO</a>

###  ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 5. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFWXA1b0pnMGlvU0U">�����  Spring Framework. Spring Context.</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFam5TZVFYRDlVNEE">4-add-spring-context.patch</a>**

    -  <a href="http://en.wikipedia.org/wiki/Spring_Framework">Spring Framework</a>
    -  <a href="http://spring.io/projects">������� Spring</a>.
    -  <a href=http://docs.spring.io/spring/docs/current/spring-framework-reference/html/overview.html>����� Spring Framework</a>

- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFVkJnMUg5VE1yNnc">5-add-dependency-injection.patch</a>**
    -  <a href="https://ru.wikipedia.org/wiki/��������_����������">�������� ����������.</a>
    -  <a href="http://habrahabr.ru/post/131993/">IoC, DI, IoC-��������� � ������ � �������</a>

- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFRzFwNFkyajFCcG8">6-add-annotation-processing.patch</a>**
   -  <a href="http://stackoverflow.com/questions/6827752/whats-the-difference-between-component-repository-service-annotations-in">Difference
       between @Component, @Repository & @Service annotations in Spring</a>
   -  <a href="http://www.mkyong.com/spring/spring-auto-scanning-components/">Spring Auto Scanning Components</a>
   -  <a href="http://www.seostella.com/ru/article/2012/02/12/ispolzovanie-annotacii-autowired-v-spring-3.html">������������� ��������� @Autowired</a>

-  ����������:
   -  <a href="http://image.slidesharecdn.com/springintroduction-130729220359-phpapp01/95/spring-introduction-3-638.jpg?cb=1375162442">DI/ Service Locator</a>
   -  <a href="http://docs.spring.io/spring/docs/current/spring-framework-reference/html/beans.html">Introduction to the Spring IoC container
       and beans</a>
   -  <a href="http://it.vaclav.kiev.ua/2010/12/25/spring-framework-for-begginers-part-7/">Constructor ������ Setter Injection </a>
   -  <a href="https://spring.io/guides">Getting Started</a>
   -  <a href="http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/">Spring Framework Reference Documentation</a>
   -  <a href="https://github.com/spring-projects">Spring �� GitHub</a>
   -  <a href="https://dzone.com/refcardz/spring-annotations">Spring Annotations</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 6. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFN2N6LS1PVE96SW8">��������� � HW2. ��������� Autowired</a>
  

## ![question](https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png) ���� �������
>  ������ ���� ������� ���������� �� ����?

������������� ������� (�������� ��������) ���������� �� �������:
- �������������� ������� �������������. �������� ���� �� ������ ��� �� � �����������, �� ������ ��� ��������� �� ��������.
- ����������� ������������ (�� ����� ����������� ���� �������� � ������������ ��������)

> DTO ������������ ����� ���� ������������ ��������, ������� �� ���������, ������ ������ �� ������ ����� � ����? ����� DTO ���������� ������������?

(D)TO ����� ���� ��� ������ ������ entity  (����� �����) ��� � ������� ���������� entities.
� ����� ������� ��� ������, ������� ���� �������� ������ � ��� ���������� �� Entiy (�������� ���), �� ����� ������ (Data) Transfer Object � ������ � ��������� ����� to.
�������� `UserMealsWithExceeded` �� ������ ������ � �� �������� Transfer Object, ��� ���� �������� � ����� to.
�� ������ �������� (� ��������������) ���������� ���������� �� ������ maven ������� entity ���� �� ������ � ��������������� ������������ ���� Entity � TO, ���� ���� � ��� �� �� ����� ����.
������� ����� ����� TO ����������� ���� �� <a href="http://stackoverflow.com/questions/21554977/should-services-always-return-dtos-or-can-they-also-return-domain-models#21569720">stackoverflow: When to Use</a>.

> ��� ����� ����� � spring-app.xml xsi:schemaLocation � ����� ��� �����

<a href="https://ru.wikipedia.org/wiki/XML_Schema">XML �����</a> ����� ��� ��������� xml, IDEA ������ �� ��� ��������������.

> ������ ����������� �������� � ����� web, � �� � conrollers?

���� ����� ��� domain/model - ������ ������ ��������. web ����� ���� ���� �������� (�������� � spring petclinic)

> ��� �������� ��� Spring

     <bean class="ru.javawebinar.topjava.service.UserServiceImpl">
         <property name="repository" ref="mockUserRepository"/>
     </bean> ?

����� ������� ���: ������ � ������ � ���� �������� ��� `UserServiceImpl` � ��������� � ��� �������� �� ������ ��������� ��� `mockUserRepository`.

> ��� ������� ���������� ��� `@Autowired`? ��� ���������, ���� � ��� ������ ����� ���������� `UserRepository`?

`@Autowired`  �������� �� ���� (�.�. ������� ����� ������� ��������� `UserRepository`). ������ �� ����. ���� � ��� ��������� ����������, Spring �� ���������� � ���������� - No unique bean. � ���� ������ <a href="http://www.mkyong.com/spring/spring-autowiring-qualifier-example/">����� �������� ��� ���� ����� @Qualifier</a>. `@Qualifier` ������ ��������� ������ � ������ ���������� ����������.

> ����� �� ��������� NotFoundException �� RuntimeException?

��� � ��� ������� ��������. � � ��� ��� ������� �������� �� �������������� ��������� ���������� (no recoverable conditions): <a href="http://stackoverflow.com/questions/6115896/java-checked-vs-unchecked-exception-explanation">checked vs unchecked exception</a>. �� ��������� ������ checked exception ������ depricated.

--------------------

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) �������� ������� HW02

- ����������� ������������:
  - ������������� `MockUserRepositoryImpl` � `InMemoryUserRepositoryImpl` � ���������������� �� �������� � `InMemoryUserMealRepositoryImpl` (������ ������������� ���������� ��������������� �� �����)
  - ������������� `UserMealRepository/InMemoryUserMealRepositoryImpl`:
    - ��� ����������� ������������
    - ������ ��� ���������� ��������������� �� �������, ��������� ������ �������
    - ���� ��� ����������� ��� �����, ���������� `null/false` (��. `UserRepository`)
- `UserMealWithExceed` ��������� � ����� to (transfer objects),
- ������������� `UserMeal extends BaseEntity`
- ������� ���������� ����� ���������� ��� ���������������� "���":
  - API ����������� ������ ������������� ��� ����������� ���� ���������� � ������ ������� (��. <a href="http://topjava.herokuapp.com">����</a>)
  - ����� ����������� (������� �������) ������ �������� � ����������, ������ �������� ����� �������� ������� �� http, �.�. � ������� ����� ������ id ��� ���, �� ������������� ����������������� ������������
                    (id ��������������� ����� ����� �������� � `LoggedUser.id()`, ��. `ProfileRestController`). ������ ��������� ��������������/�������� ����� ���:
    - � ��� ���� ���������� id, �� �������� ����� ���������� �� ����, ��� ���;
    - ���� ��� �� ����������� ����������������� ������������ ��� �����������, �� ������� `NotFoundException`.
- �������� ������ � �������� Spring � ��������� �� `SpringMain` ����� ������ `UserMealRestController`
#### ����������
  - `LoggedUser` �������� ������ �� ���� web (`UserMealService` ����� ����������� ��� ������� ������ �����������)
  - ���� ����� �� ��������� ���� � `UserMeal` (������� �����), ��������� � ������� ������� � ����������� �������� `userId`: id ��������� ���.
  - � `UserMealServiceImpl` ����������� ������� � ������ ������ ������ ���� ������ � `UserMealRepository`
  - �� ���� � ��������� ������� ��������� �������� ������, �������� Meal.

#### Optional

- � `MealServlet` ������� ������������� Spring, ������� `UserMealRestController` �� ��������� � �������� � ���� ����� ���� (��. `SpringMain`. pom.xml �� ������, �������� �� spring-context).
- �������� � `mealList.jsp` � `MealServlet` ��� ��������� ���������� ���: �� ���� � �� ������� (��. ����)
- �������� ����� �������� ������������� ������������ (�������� �����������, ������� Select � ����� ���������� �� ���������� 1 � 2 � `index.html` � `LoggedUser.setId(userId)` � `UserServlet`).

---------------------
### ![error](https://cloud.githubusercontent.com/assets/13649199/13672935/ef09ec1e-e6e7-11e5-9f79-d1641c05cbe6.png) ��������� �� HW02 (��� ��������, ������� �������� ��������������!)

- `InMemoryUserRepositoryImpl.getByEmail` ���������� ������� ����� stream
- `InMemoryUserRepositoryImpl.delete` ���������� ������� �� ���� ��������� � map
- `UserMealRestController` ������ ����� ������������ �������:
    - ������ ���� ��� (��� ����������� � �������, ������ `List<UserMealWithExceed>`), ������ ��� ����������
    - ������ ���� ���, ��������������� �� startDate, startTime, endDate, endTime
    - ������/������� ���� ��� �� id, �������� ������� - id ���. 
                        ���� ��� � ���� id ����� ��� ����������� - `NotFoundException`
    - ���������/�������� ���, �������� ������� - UserMeal. ���� ����������� ��� � ���� id ����� ��� ����������� - `NotFoundException`
- �.�. ���������� ��������� ��������� ������ ����� ����, `userId` ������� �� �������� (��. `ProfileRestController`)
- ���������� �� ����� ���������� �������� �� ������� ����������� �.�. �� ���� ����� ����� ����� ��������������� �� ���� ������. ������� ����� ������ � ��������� ���� �� ���� ��������, ����� ����� ������� ����� ��������.
- ������� �� ������, � ���������� ���������, ������� ���������� `List<UserMealWithExceed>` ���� �� �����������.  �������������� � `UserMealWithExceed`, ���� ��������� ������, ����� ������ � ������� (to ������������ �� �������). �� �������: ��� �� ������ ������������. � ��� �������������� ���������� � util, ������� � �������� � ����������� (��� ���������� ��� �������).
- ��������� springContext � �������� ��������� ����� � `HttpServlet.destroy()`: ���� ���-�� � ��������� Spring ����� ������� �������������, �����-�������, �� ���������-scope, �� �������� ����������� ��� ������ ����������. � ��� ������ ���, �� ������ ���� ��� ��������.
- ��������� ���������� ��������� ������ �������� date � time � �����������
- ���� ������������� ������ � �� ������, ������ ����������� emptyList(). �� ���� ����� ����� ������������� ��� ����� NullPoinException. � java 8 ��������� ����������� ������ null ������������ Optional (�� ����� ���� ����� ��� ���� � ����������� ���� Guava), ��� ������� ��� ������� ����������. � ��������� ��������� �� ����� ��� ���������� ����� � ��������.
