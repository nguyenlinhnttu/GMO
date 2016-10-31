package service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import config.MybatisConfig;
import mapper.StudentMapper;
import model.Student;
@Service
public class StudentService implements StudentMapper{

	@Override
	public List<Student> getStudentWithInfo() {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.getStudentWithInfo();
		} catch (Exception ex) {
			sqlSession.rollback();
			sqlSession.close();
		}
		return null;
	}

	@Override
	public boolean insertStudent(Student student) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			studentMapper.insertStudent(student);
			sqlSession.commit();
			return true;
		} catch (PersistenceException ex) {
			System.out.println(ex);
			sqlSession.rollback();
			sqlSession.close();
			return false;
		}
	}

	@Override
	public boolean deleteStudent(int student_Id) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			studentMapper.deleteStudent(student_Id);
			sqlSession.commit();
			return true;
		} catch (Exception ex) {
			sqlSession.rollback();
			sqlSession.close();
			return false;
		}	
	}

	@Override
	public boolean updateStudent(Student student) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			studentMapper.updateStudent(student);
			sqlSession.commit();
			return true;
		} catch (Exception ex) {
			sqlSession.rollback();
			System.out.println(ex);
			sqlSession.close();
			return false;
		}		
	}

	@Override
	public Student searchStudent(String student_Code) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			Student student = studentMapper.searchStudent(student_Code);
			sqlSession.commit();
			return student;
		} catch (Exception ex) {
			System.out.println(ex);
			sqlSession.rollback();
			sqlSession.close();
		}	
		return null;
	}
	
	@Override
	public int countStudent() {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.countStudent();
		} catch (Exception ex) {
			sqlSession.rollback();
			sqlSession.close();
		}		
		return 0;
	}

	@Override
	public List<Student> pageStudent(Map<String, Integer> map) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory	().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.pageStudent(map);	
		} catch (Exception ex) {
			sqlSession.rollback();
			sqlSession.close();
		}
		return null;
	}
}
