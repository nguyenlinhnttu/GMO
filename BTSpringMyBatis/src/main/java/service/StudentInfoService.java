package service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import config.MybatisConfig;
import mapper.StudentInfoMapper;
import model.StudentInfo;

@Service
public class StudentInfoService implements StudentInfoMapper{
	
	@Override
	public void insertStudentInfo(StudentInfo studentInfo) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentInfoMapper studentMapper = sqlSession.getMapper(StudentInfoMapper.class);
			studentMapper.insertStudentInfo(studentInfo);
			sqlSession.commit();
		} catch (Exception ex) {
			sqlSession.rollback();
			sqlSession.close();
		}	
	}

	@Override
	public void updateStudentInfo(StudentInfo studentInfo ) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentInfoMapper studentMapper = sqlSession.getMapper(StudentInfoMapper.class);
			studentMapper.updateStudentInfo(studentInfo);
			sqlSession.commit();
		} catch (Exception ex) {
			System.out.println(ex);
			sqlSession.rollback();
			sqlSession.close();
		}
	}

	@Override
	public StudentInfo getInfoByID(int student_id) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentInfoMapper studentMapper = sqlSession.getMapper(StudentInfoMapper.class);
			sqlSession.commit();
			return studentMapper.getInfoByID(student_id);
		} catch (Exception ex) {
			sqlSession.rollback();
			sqlSession.close();
		}
		return null;
	}

	@Override
	public boolean deleteInfoStudent(int student_id) {
		SqlSession sqlSession = MybatisConfig.getSqlSessionFactory().openSession();
		try {
			StudentInfoMapper studentMapper = sqlSession.getMapper(StudentInfoMapper.class);
			studentMapper.deleteInfoStudent(student_id);
			sqlSession.commit();
			return true;
		} catch (Exception ex) {
			System.out.println(ex);
			sqlSession.rollback();
			sqlSession.close();
		}
		return false;
	}
}
