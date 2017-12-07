```java
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;

//import org.hibernate.criterion.CriteriaSpecification;
//import org.hibernate.SQLQuery;

@PersistenceContext
private EntityManager entityManager;

String sql = "SELECT id,name FROM table where id > ? and name <> :name";
Query query = entityManager.createNativeQuery(sql);
SQLQuery nativeQuery = query.unwrap(SQLQuery.class);

// 设置查询参数
nativeQuery.setParameter(0,2);
nativeQuery.setParameter("name","A");

// 指定结果集类型
nativeQuery.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP);
List<Map<String, Object>> result = nativeQuery.list();
