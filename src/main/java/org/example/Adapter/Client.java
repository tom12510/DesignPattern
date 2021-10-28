package org.example.Adapter;

import org.example.Adapter.Case.Adapter;
import org.example.Adapter.Case.ConcreateTarget;
import org.example.Adapter.Case.Target;
import org.example.Adapter.Case1.*;

public class Client {
    public static void main(String[] args) {
        Target target = new ConcreateTarget();
        target.request();
        //适配器
        Target adapte = new Adapter();
        adapte.request();

        //外系统的人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        //传递三个对象
        IUserInfo youngGirl = new OuterUserInfo(baseInfo,homeInfo,officeInfo);
        //从数据库中查到101个
        for(int i=0;i<101;i++){
            youngGirl.getMobileNumber();
        }
    }
}
