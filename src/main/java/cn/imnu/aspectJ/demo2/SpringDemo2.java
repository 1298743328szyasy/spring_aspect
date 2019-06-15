package cn.imnu.aspectJ.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext2.xml")
public class SpringDemo2 {
    @Resource(name = "customerDao")
    public CustomerDao customerDao;
    @Test
    public void demo(){
        customerDao.delete();
        customerDao.findall();
        customerDao.findone();
        customerDao.save();
        customerDao.update();
    }
}
