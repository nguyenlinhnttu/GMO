package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import config.MybatisConfig;
import mapper.StudentMapper;
import model.Student;
@Service
public class StudentService implements StudentMapper{

	@Override
	public List<Student> getAllStudent() {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.getAllStudent();
		} catch (Exception ex) {
			sqlSession.rollback();
			sqlSession.close();
		}
		return null;
	}

	@Override
	public void insertStudent(Student student) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			studentMapper.insertStudent(student);
			sqlSession.commit();
		} catch (Exception ex) {
			sqlSession.rollback();
			sqlSession.close();
		}
	}

	@Override
	public void deleteStudent(int student_Id) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			studentMapper.deleteStudent(student_Id);
			sqlSession.commit();
		} catch (Exception ex) {
			sqlSession.rollback();
			sqlSession.close();
		}	
	}

	@Override
	public void updateStudent(Student student) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			studentMapper.updateStudent(student);
			sqlSession.commit();
		} catch (Exception ex) {
			sqlSession.rollback();
			sqlSession.close();
		}		
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
	public List<Student> getListStudent(int firstResult, int maxResult) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.getListStudent(firstResult,maxResult);
		} catch (Exception ex) {
			sqlSession.rollback();
			sqlSession.close();
		}
		return null;
	}

}
