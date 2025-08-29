public class iphone extends ios
public void makecall(){
System.out.println("makecall");
}
public void applysendsms(){
System.out.println("add sms");
}
public static void main(String[] args){
iphone ip=new iphone;
ip.applystartApp();
ip.applyincreasevolume();
ip.makecall();
ip.applysendsms();
}
}