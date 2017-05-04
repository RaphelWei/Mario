/**
 * Created by Administrator on 2017/5/3.
 */
import com.rupeng.game.GameCore;
public class Main1 implements Runnable{
    public static void main(String[] args) {
        GameCore.start(new Main1());
    }
    public void run(){
        String name= GameCore.input("","请输入你的名字");
        String s1=GameCore.input("","请输入游戏的宽度");
        String s2=GameCore.input("","请输入游戏的高度");
        GameCore.setGameTitle(name+"的游戏");
        int i1=Integer.parseInt(s1);
        int i2=Integer.parseInt(s2);
        GameCore.setGameSize(i1,i2);
        GameCore.pause(5000);
    }
}
