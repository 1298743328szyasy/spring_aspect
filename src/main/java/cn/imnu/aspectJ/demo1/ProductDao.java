package cn.imnu.aspectJ.demo1;

public class ProductDao {
    public void save(){
        System.out.println("保存商品");
    }
    public void delete(){
        System.out.println("删除商品");
    }
    public void update(){
        System.out.println("修改商品");
//        int i=1/0;
    }
    public void findAll(){
        System.out.println("查询所有商品");
//        int i=1/0;
    }
    public String findOne(){
        System.out.println("查询一个商品");
        return "iloveyou";
    }
}
