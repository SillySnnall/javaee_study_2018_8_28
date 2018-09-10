package mybatis.test;

import java.util.List;

import mybatis.bean.Users;
import mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestCRUDByXmlMapper {

    @Test
    public void testAdd() {
        //SqlSession sqlSession = MyBatisUtil.getSqlSession(false);
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * addUser是insert标签的id属性值，通过insert标签的id属性值就可以找到要执行的SQL
         */
        String statement = "mybatis.mapping.usersMapper.addUser";//映射sql的标识字符串
        Users user = new Users();
        user.setName("用户孤傲苍狼");
        user.setPassword("1325646464");
        //执行插入操作
        int retResult = sqlSession.insert(statement, user);
        //手动提交事务
        //sqlSession.commit();
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(retResult);
    }

    @Test
    public void testUpdate() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * updateUser是update标签的id属性值，通过update标签的id属性值就可以找到要执行的SQL
         */
        String statement = "mybatis.mapping.usersMapper.updateUser";//映射sql的标识字符串
        Users user = new Users();
        user.setId(3);
        user.setName("孤傲苍狼");
        user.setPassword("11111111111111");
        //执行修改操作
        int retResult = sqlSession.update(statement, user);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(retResult);
    }

    @Test
    public void testDelete() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * deleteUser是delete标签的id属性值，通过delete标签的id属性值就可以找到要执行的SQL
         */
        String statement = "mybatis.mapping.usersMapper.deleteUser";//映射sql的标识字符串
        //执行删除操作
        int retResult = sqlSession.delete(statement, 2);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(retResult);
    }

    @Test
    public void testGetAll() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getAllUsers是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "mybatis.mapping.usersMapper.getAllUsers";//映射sql的标识字符串
        //执行查询操作，将查询结果自动封装成List<User>返回
        List<Users> lstUsers = sqlSession.selectList(statement);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(lstUsers);
    }
}
