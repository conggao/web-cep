package demo.json;

import com.alibaba.fastjson.JSON;
import com.cep.entity.kc.Kecheng;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by pc on 2017/3/24.
 */
public class CouseDemo {
    @Test
    public void testKc(){
        Kecheng kecheng = new Kecheng();
        Kecheng.KC kc = new Kecheng.KC();
        kc.setDay(1);
        kc.setName("语文");
        Date date = new Date();
        kc.setEndTime(new Timestamp(date.getTime()));
        kc.setStartTime(new Timestamp(date.getTime()));
        Kecheng.KC kc1 = new Kecheng.KC();
        kc1.setDay(1);
        kc1.setName("数学");
        kc1.setEndTime(new Timestamp(date.getTime()));
        kc1.setStartTime(new Timestamp(date.getTime()));
        List<Kecheng.KC> listKc = new ArrayList<>();
        listKc.add(kc);
        listKc.add(kc1);
        kecheng.setKecheng(listKc);
        System.out.println(JSON.toJSONString(kecheng));
    }
}
