# ������ ������� <a href="https://github.com/JavaWebinar/topjava07">Topjava</a>

## ��������� mealEdit
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFS21oTW5FTkxzblE">0-correction.patch</a>**
> � JSP ������������ �������� ������� `param.action`, �� �� �������� � ���������.

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) ������ ��������� ������� HW2

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 1. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFdDhnNHFMU2dKQzQ">HW2</a>
> ��������� � �������:
  - � ������������ �� ������� �������������� �����������
  - ������ ��������� ������ ���  � `UserMealRestController.getBetween()`
  - ������������ `<T extends Comparable<? super T>> TimeUtil.isBetween(T value, T start, T end)`. ��������� ��������, ��� �� ��������� ���������� ������, ������� ����������� ����������, ������� ����� ���������� T ��� ����������� �� T
  
  - **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFS195Wm9aNi1uWjQ">1-HW2-repository.patch</a>**

**��������: ��� �������� ������ �� �������� ���������������� � ��� � target (� classpath). � ���� ������ (��� ������ ���� ��������� ������ ������ ������) �������� � maven clean.**

- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFQXY5R1BURU04MW8">2-HW2-meal-layers.patch</a>**
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFT1gtZVZWbW1wSU0">3-HW2-optional-MealServlet.patch</a>**
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFN0VPc1Zzbi0zemc">4-HW2-optional-filter.patch</a>**
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFWFdPRmhmemh6dlk">5-HW2-optional-select-user.patch</a>**

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 2. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFMGRVM0QyblJtNGc">������� �� API � ����� ����������</a>
- <a href="http://stackoverflow.com/questions/21554977/should-services-always-return-dtos-or-can-they-also-return-domain-models">Should services always return DTOs, or can they also return domain models?</a>
- <a href="http://stackoverflow.com/questions/31644131/spring-dto-dao-resource-entity-mapping-goes-in-which-application-layer-cont/35798539#35798539">Mapping Entity->DTO goes in which application layer: Controller or Service?</a>

## ������� 3:
### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 3. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFOU8wWlpPVE05STA">������� � ��������� ����� Spring ���������.</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFakQ2R3A1amR4RzQ">6-bean-life-cycle.patch</a>**
-  <a href="http://habrahabr.ru/post/222579/">Spring �������. ����� ������������� ���������.</a>
-  �������:
   -  <a href="http://vk.com/javawebinar?z=video-58538268_169373158%2Fvideos-58538268">������� �������. Spring, ����� 1</a>
   -  <a href="http://vk.com/javawebinar?z=video-58538268_169373162%2Fvideos-58538268">������� �������. Spring, ����� 2</a>
   -  <a href="http://www.slideshare.net/taemonz/spring-framework-core-23721778">����������� Spring framework core</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png)  4. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFODlkU1B0QnNnSGs">������������ ����� JUnit.</a>
> **��������: ����� �������� ����� �������� ������� test (�� ����� ������� ���� `\src\test`), ����� ����� ������ ������� � `src\main`.**

-  **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFdk5sUGF2aDJ1aVk">7-add-junit.patch</a>**
-  ������� mock ���������� � test.
-  <a href="http://junit.org/">JUnit 4</a>
-  <a href="http://habrahabr.ru/post/120101/">������������ � Java. JUnit</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 5. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFai1veG9qaFZlZ2s">Spring Test</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFTmZOQ0ZMdDFIdXc">8-add-spring-test.patch</a>**
-  ���������� Spring � JUnit.
-  <a href="http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#testing">Spring Testing</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 6. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFVlNYczhnSU9JdXc">���� ������. ����� NoSQL � Java persistence solution ��� ORM.</a>
-  <a href="https://ru.wikipedia.org/wiki/PostgreSQL">PostgreSQL</a>.
-  <a href="http://java-course.ru/begin/postgresql/">��������� PostgreSQL</a>.
-  <a href="http://alexander.holbreich.org/2013/03/nosql-or-rdbms/">NoSQL or RDBMS.</a><a href="http://habrahabr.ru/post/77909/">����� NoSQL ������</a>. <a href="http://blog.nahurst.com/visual-guide-to-nosql-systems">CAP</a>
-  <a href="http://ru.wikipedia.org/wiki/Java_Database_Connectivity">JDBC</a>
-  ����� Java persistence solution ��� ORM: <a href="http://commons.apache.org/proper/commons-dbutils/">commons-dbutils</a>,
            <a href="http://docs.spring.io/spring/docs/current/spring-framework-reference/html/jdbc.html">Spring JdbcTemplate</a>,
            <a href="http://en.wikipedia.org/wiki/MyBatis">MyBatis</a>, <a href="http://www.jdbi.org/">JDBI</a>, <a href="http://www.jooq.org/">jOOQ</a>
- ������:
  - <a href="https://ru.wikipedia.org/wiki/�����������_����">����������� ����</a>
  - <a href="http://habrahabr.ru/post/103021/">����������� ����</a>
  - <a href="https://www.youtube.com/playlist?list=PLIU76b8Cjem5qdMQLXiIwGLTLyUHkTqi2">����� �� JDBC</a>
  - <a href="http://postgresguide.com/">Postgres Guide</a>
  - <a href="http://www.postgresqltutorial.com">PostgreSQL Tutorial</a>
  - <a href="http://campus.codeschool.com/courses/try-sql">Try SQL</a>
  - <a href="http://java-course.ru/begin/database01/">���� ������ �� Java</a>
  - <a href="http://java-course.ru/begin/database02/">����������� JDBC � ������ ����</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 7. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFQWtHYU1qTDlMWVE">��������� Database � IDEA.</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFRWlOeWVDMFhUeTQ">9-add-postgresql.patch</a>**
-  <a href="http://habrahabr.ru/company/JetBrains/blog/204064/">��������� Database � IDEA</a> � ������ SQL.

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 8. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFMGNWUXhaVzdlU0k">������� ������������� ����. Spring Jdbc Template.</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFdTRzUkx3b0hhd2M">10-populate-and-init-db.patch</a>**
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFVjdOdXJJY2VhQ00">11-impl-JdbcUserRepository.patch</a>**
-  ����������� <a href="http://docs.spring.io/spring/docs/current/spring-framework-reference/html/jdbc.html">Spring Jdbc</a>.
-  ���������������� DataSource. <a href="http://www.mkyong.com/spring/spring-propertyplaceholderconfigurer-example/">Property Placeholder</a>

>  **���������, ��� � <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFYThYOFNHbnNzd0E">�������� Spring ������� �������� ��� ����� ������������</a>**.

-  ������������� UserRepository ����� Spring Jdbc Template.

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 9. <a href="https://drive.google.com/open?id=0B4dIHS3wRAhhQUJMMFU0VnRrUUE">���������� �������� ������ � ������������ UserService.</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFajFEeGdNZUVoeVk">12-test-UserService.patch</a>**
-  ���������� �������� ������ � UserServiceTest. ���������� TestUser � ModelMatcher
-  ������������ UserService.

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 10. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFVmZaSm9UMktXUnc">����������� ������.</a>
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFRXFuV0g5emlzYnM">13-test-logging.patch</a>**
- **<a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFUnNIZHRsdXVlSUE">14-fix-servlet.patch</a>**
 
### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 11. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFNDlOQVpOWF82OTA">������ �� ���� �������</a>
-  ��� ����� REST?
-  ����� ����� ���������� ���?
-  ����� �� �������� ��� `MapSqlParameterSource`?
-  ��� ���������� ������ � DB � ������?
-  ��� ������������� RowMapper?
-  ��� �����������: ������� ������� �������������.
-  ����� �� ������������ JavaScript?

## ![question](https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png) ���� �������
> ����� ������� ����� @BeforeClass and @Before? 

`@BeforeClass` ����������� ���� ��� ����� �������� ������ (������� ����� ����� ���� ������ �����������), `@Before` ����� ������ ������. �� �������� ������� � ��������� �� Ctrl+Enter � �������� javadoc.

����������: ��� ������� ��������� ��������� ������ ������������� ����� ������ ������: http://stackoverflow.com/questions/6094081/junit-using-constructor-instead-of-before

> ����� � ������ � �����-�� ������������ ������� ����������� ("������ ����" ��������)?

������� �� ��������� �����������, ������ ���� ������ ���� ��������� � �� �������� �� ������. ��. ����� http://stackoverflow.com/questions/3693626/how-to-run-test-methods-in-specific-order-in-junit4 

> ������������ �� ������������� postgreSQL?

����������: ������� � �������� DB:) ���� ������ �� ������� - ����� �������� �� ����� ������� RDBMS (��������� `initDB.sql`) ��� �������� c heroku (���������� � ���� ���� � `postgres.properties`). �� ��������� ����� ������� HSQLDB, ��� �� ������� ���������.

> ����� ������ ���������� � 100000?

��� ��� ��� "��� �������". ��� ������ ��������� � ���� (���� ����� �����������)  ������ �� ����� ��������.

> ����� �� ������ ���� � ������ ���� ������� ��� id � ����� ��� user_id ?

��������� user <-> roles ������ �� ������, �������� ��� ����� �������-������ USER_ROLES. �� ��������� ������� ROLES � ��� ���,  �� ������ �������� ���� ����� � �������-������ USER_ROLES. "������� ���" ��� �� �����. ���� ��� �������� ������������ ��� enum � Postgres ��� ������� ��� `INTEGER` ��� `Roles.ordinal()`. ��� ���� ������ ����� ������ ������� � enum Role � ��������� ����� ���� ����� ����� ������ � �����: http://stackoverflow.com/questions/6789342/jpa-enum-ordinal-vs-string

> �� 5-�� ����� - "������ � ���� - ������� ���". ����� ���� ����������� �� ����?

- ���� �������� ������� � ������� � ����. �� ��� ������������.
- ������ � ���� - ��� ��������� � ��������. ��� �������� ���, ���������������� ��� ���������� ������, �������� ������������, ������ �� ���� � ������ ������ IDE. ������ ������ ������ ���� ���� �����������, �������� � ����� - ��� ��� ��� ������ �� ������� java. �������� json ����� �������� ������ � ��������� � ��� ������� � ��������� � ������� ��� �������� - �������� �� ������ � ����������.
� ����� ����������� ��������� ������ �� ������� ���������� � ��� ����� �������� ���� json ������������� ������������ � java.
� �� ����� ������� ����� ����������� ��������, ����� ��������� ����������� �� ��� sql �������, � ������ ��������� ������� ��� ����� � �������� ���������. ���� ������: �������� � ������� ��������� ������-������, ������� �� ������� ����������������� ���� ���
������ ��������� ��� ���������, ����� ������ ���������� ����� ������ ������������.

> � JUnit ���� ������� � � ������� ����. ����� �� �������� ��� JUnit?

����������� � JUnit-����� ���������� ������ ����. ���� ������� �� �������.

> � ��� ����� VARCHAR �������, ��� TEXT, ����� �� �������� � ���������� ��������. ���� ������ ����� ���������� (255). ������ �� ������� ������� ������� �� TEXT?

� ������� �� MySql � Postgres  VARCHAR � TEXT - ���� �����: http://stackoverflow.com/questions/4848964/postgresql-difference-between-text-and-varchar-character-varying

> ����� ��� �������� ������� �� ������� `CREATE UNIQUE INDEX` � `CREATE INDEX`. ��� ����� �������� �� ����� ��������������?

UNIQUE ������ ����� ��� ���c������� ������������, DB �� ���� ������� ���������� ������. ������� ������������ ��� �������� ���������� ��������. ������ ��� �������������, ����� � ������� ���� �������, �� ������� ������ ������. ������ �� ����������� ������� �����  �������� ���� �������: ��. <a href="https://habrahabr.ru/post/203320">����������� ��������. ������ EXPLAIN � PostgreSQL</a>

> � ��� ���������, ��� � ��� � ���� � meals ���� userId, � � ������ - ���?

��� ������ - "���������"?  ���������� ��������. �����������, ����� � ���������� ���� "������" ���, ������� �� ������������. ��� ORM �� ��� �����������- �� ������ �� User �������.

> ������ �� ���������� 1 �� sequence �� ������ ��������?

�� ����� ������������ Hibernate, �� ��������� �� ������ ���������� sequence �� ��� �������. � ���� ������� ���� <a href="http://stackoverflow.com/questions/1536479/asking-for-opinions-one-sequence-for-all-tables">��� �����, ��� � ������</a>, �� ������ - ������ ������ ������ � ���� � � �������� �� ��� ������������ � ���� � ����. � ����������: <a href="http://stackoverflow.com/questions/6633384/can-i-configure-hibernate-to-create-separate-sequence-for-each-table-by-default">Configure Hibernate to create separate sequence for each table by default</a>.

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) �������� ������� HW03
- ������, ������ ��������� �������� `SpringMain/InMemoryAdminRestControllerTest/ InMemoryAdminRestControllerSpringTest`
- ��������� ������� �������� � ������������� ���� �������� MEALS. ��������� ������� �� ���� ���� (����� Run). ������� ������ ��� DROP � DELETE �����, ���� ��� ������� fk. ���������, ��� ���� ������� ��������
- ����������� ����� Spring JDBC Template `JdbcUserMealRepositoryImpl`
  - ������� ������ ����� �� ���� SQL ������
  - `userId` � ����� `UserMeal` ��������� �� ���� (��� UI � REST ��� ������ ������, userId ��� id ������������� ������������)
  - `JbdcTemplate` �������� ����� �������. ����� �� �������� � `UserMeal`
  - C����� ��� ������ ���� ������������ (����� �� ��� ������ ���������� � ��������� �������). ����� ���� ��� ��������� ��� UI � API: ��������� ��� �������.
- ��������� ������ MealServelt, �������� ����������

#### Optional

- ������� �������� ������ `MealTestData`, ����������� ����������������� � `populateDB.sql`. �������� �����-������� � `UserMeal` �� ���������, ���������� ������ ����� ������� MATCHER (toString)
- ������� `UserMealServiceTest` �� `UserMealService` (Ctrl+Shift+T � ������� JUnit4) � ����������� �����.
- ������� ����� �� ����� ������ (delete, get, update) � ��� ����� �������� `NotFoundException` � ����� �� `update` ����� ���.
- ���������� �������, ��� ��������� `SpringMain/ InMemory*Test`. `InMemory*Test` ������������ ������������ ���� ���������� ����������� � ������
- �������� ������ � ������� `Meals`.
- <a href="http://stackoverflow.com/questions/970562/postgres-and-indexes-on-foreign-keys-and-primary-keys">Postgres and Indexes on Foreign Keys and Primary Keys</a>
- <a href="http://postgresguide.com/performance/indexes.html">Postgres Guide: Indexes</a>
