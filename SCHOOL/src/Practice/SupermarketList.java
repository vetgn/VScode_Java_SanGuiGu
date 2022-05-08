/*
 * @Author: vetgn
 * @Date: 2022-05-05 08:54:08
 * @LastEditors: vetgn
 * @LastEditTime: 2022-05-05 09:29:46
 * @FilePath: \vscode_Java_SanGuiGu\SCHOOL\src\Practice\SupermarketList.java
 * @Description: 
 * 使之能提供以下功能：
 * 1、商品信息录入功能0
 * 2、商品信息文件读取功能 ----
 * 3、商品信息文件保存功能 ----
 * 4、商品信息浏览功能0
 * 5、查询功能：
 *       1）按商品名称查询
 *       2）按类别名称查询
 * 6、修改功能：0
 *     根据商品ID修改相应信息；
 * 7、删除商品功能：0
 *     删除指定ID的商品。
 * 8、排序功能（由用户指定按照名称或ＩＤ；指定升序或降序）
 * 
 */
package src.Practice;

public class SupermarketList {
    private Commodity[] commodities;
    private int total;// 记录商品的数量

    /**
     * 初始化商品信息
     * 
     * @param totalcommodity
     */
    public SupermarketList(int totalcommodity) {
        commodities = new Commodity[totalcommodity];
    }

    /**
     * 商品信息录入功能
     */
    public boolean addCommodity(Commodity commodity) {
        if (total >= commodities.length) {
            return false;
        }

        commodities[total++] = commodity;
        return true;
    }

    /**
     * 查看指定的商品信息
     */
    public void lookCommodity(int ID) {
        if (ID <= 0 || ID >= total) {
            System.out.print("ID输入错误,无此商品，请重新输入：");
        }
        System.out.println("商品名称:" + commodities[ID].getName()
                + "\t商品ID:" + commodities[ID].getID() + "\t商品价格:" +
                commodities[ID].getPrice() + "\t商品类别:" +
                commodities[ID].getCategory() + "\t商品份数:" +
                commodities[ID].getNumber() + "\t商品天数:" +
                commodities[ID].getDays());
    }

    /**
     * 修改指定商品的信息
     */
    public void reaveCommodity(int ID, Commodity commodity) {
        commodities[ID] = commodity;
    }

    /**
     * 删除指定商品
     * 
     * @param ID
     * @param commodity
     */
    public void deleteCommodity(int ID, Commodity commodity) {
        for (int i = ID; i < commodities.length; i++) {
            commodities[i] = commodities[i++];
        }
        commodities[--total] = null;
    }
}