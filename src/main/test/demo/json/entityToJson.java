package demo.json;

import com.alibaba.fastjson.JSON;
import com.cep.entity.json.MyResCopyReq;
import com.cep.entity.json.MyResDelReq;
import com.cep.entity.json.MyResRenameReq;
import com.cep.entity.user.protocol.LoginUserInfo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 2016/12/19.
 */
public class entityToJson {
    @Test
    public void MyResCopyJson(){
        MyResCopyReq req = new MyResCopyReq();
        req.setDesId(1l);
        List<Long> resList = new ArrayList<>();
        resList.add(101l);
        req.setResList(resList);
        System.out.println(JSON.toJSONString(req));
    }
    @Test
    public void MyResDelJson(){
        MyResDelReq req = new MyResDelReq();
        List<Long> listDirId = new ArrayList<>();
        listDirId.add(3l);
        req.setListDirId(listDirId);
        List<Long> listResId = new ArrayList<>();
        listResId.add(5l);
        req.setListResId(listResId);
        System.out.println(JSON.toJSONString(req));
    }
    @Test
    public void MyResRenameReqJson(){
        MyResRenameReq req = new MyResRenameReq();
        req.setId(2l);
        req.setDirName("gaocong");
        System.out.println(JSON.toJSONString(req));

    }
    @Test
    public void loginUserInfoJson(){
        LoginUserInfo loginUserInfo = new LoginUserInfo();

    }
}
