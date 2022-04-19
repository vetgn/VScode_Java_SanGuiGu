/*方法的重载

1.定义:在同一个类中，允许存在一个以上的同名方法，只要它们的参数方法个数或者参数类型不同即可。
    “两同一不同”：同一个类、相同方法名
                    参数列表不同：参数个数不同，参数类型不同
2.判断是否是重载：
    跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系！
*/
public class one {

    // 以下举例
    public void sum(int i, int j) {

    }

    public void sum(double i, double j) {

    }

    public void sum(int i, String j) {

    }

    public void sum(int[] i, int j) {

    }

    // 以下是错的
    /*
     * public void sum(int m,int n){
     * 
     * }
     * private void sum(int i ,int j){
     * 
     * }
     * 
     * pubilc int sum(int i,int j){
     *  return;
     * }
     */

    // **********************************

}
