import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Augusto", "Pizza");
        logininfo.put("Pass","PASSWORD");
        logininfo.put("BroCode", "pizza");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
// Hi, my name is Augusto (the creator)
