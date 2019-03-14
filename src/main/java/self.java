import core.consumer.ProxyFactoryUtil;
import service.ClassMateService;

/**
 * @Author:kongyuting
 * @Date:2019/3/14 9:54
 */
public class self {

    public  static  void  exam(){
        System.out.println("开始做题");
        System.out.println("1+1=?这个题不会");

        //求助室友
        ClassMateService classMateService= (ClassMateService) ProxyFactoryUtil.creatProxy(ClassMateService.class);


        //得到结果

        while (true){
            try {
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Integer result = classMateService.add(1, 1);
            System.out.println("得到结果是:"+result);
        }

    }
}
