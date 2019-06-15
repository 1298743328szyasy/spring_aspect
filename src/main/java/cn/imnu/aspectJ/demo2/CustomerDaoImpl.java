package cn.imnu.aspectJ.demo2;

public class CustomerDaoImpl implements CustomerDao{

    public void save() {
        System.out.println("保存客户");
    }

    public void update() {
        System.out.println("修改客户");
    }

    public String delete() {
        System.out.println("删除客户");
        return "iloveyou";
    }

    public void findone() {
        System.out.println("查询一个客户");
    }

    public void findall() {
        System.out.println("查询多个客户");
    }
}
