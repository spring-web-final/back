package com.dgut;
import com.dgut.domain.Worker;
import com.dgut.mapper.WorkerMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void test() throws IOException {
        String resource = "del/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        WorkerMapper mapper = sqlSession.getMapper(WorkerMapper.class);
        List<Worker> all = mapper.findAllWorker();
        for (Worker worker : all) {
            System.out.println(worker);
        }
        sqlSession.close();
        inputStream.close();
    }


}
