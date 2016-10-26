package config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {
	private static SqlSessionFactory sessionFactory;
	private static final String conf = "mybatis-config.xml";

	public MybatisConfig() {
		// TODO Auto-generated constructor stub
	}

	static {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(conf);
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
		sessionFactory = new SqlSessionFactoryBuilder().build(reader);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sessionFactory;
	}
}
