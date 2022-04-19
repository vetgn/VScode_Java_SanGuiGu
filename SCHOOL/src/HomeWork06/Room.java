package src.HomeWork06;

/**
 * @author 朱军军
 * #Description 1、
 * <p>
 * 定义房间类Room，要求如下：
 * (1)私有成员变量包括房间编号id，面积area，户型type，单价price（元/平米），销售状态state等；
 * (2)定义一个空构造方法；定义第二个构造方法能够根据房间编号，面积，单价创建Room对象；定义第三个构造方法能够根据所有成员变量创建Room对象；
 * (3)定义针对成员变量state和price的setter和getter方法，定义getArea()方法返回房间面积；
 * (4)功能方法包括：showRoom()方法输出Room对象所有成员变量；getMoney()获得房间总价。
 * 楼盘river房间Room对象信息如表1中所示。定义测试类，对表1完成如下操作：
 * (1)统计3个房间的总面积；
 * (2)统计3个房间的总价；
 * (3)把3-2-502房间的销售状态修改为true；
 * (4)显示3个房间的详细信息。
 * #Date: 2022/4/14 20:17
 */
public class Room {
    //(1)
    private String id;//房间编号
    private double area;//面积
    private String type;//户型
    private int price;//单价
    private String state;//销售状态

    //(2)

    public Room() {
    }

    public Room(String id, double area, int price) {
        this.id = id;
        this.area = area;
        this.price = price;
    }

    public Room(String id, double area, String type, int price, String state) {
        this.id = id;
        this.area = area;
        this.type = type;
        this.price = price;
        this.state = state;
    }

    //(3)

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //(4)

    /**
     * 输出Room对象所有成员变量
     */
    public void showRoom() {
        System.out.println("房间编号:" + id + "\t" + "面积:" + area + "\t"
                + "户型:" + type + "\t" + "单价:" + price + "\t" + "销售状态" + state);
    }

    /**
     * 获得房间总价
     * @return
     */
    public double getMoney() {
        return price * area;
    }

    public static void main(String[] args) {
        Room room1 = new Room("3-2-502",113.5,"三室一厅",15000,"false") ;
        Room room2 = new Room("4-5-1108",156.9,"四室二厅",17500,"true") ;
        Room room3 = new Room("4-3-1501",45.9,"二室一厅",16200,"true") ;

        //(1)统计3个房间的总面积
        System.out.println("3个房间的总面积:" + (room1.getArea()+room2.getArea() + room3.getArea()));

        //(2)统计3个房间的总价
        System.out.println("3个房间的总价:" + (room1.getMoney()+ room2.getMoney() + room3.getMoney()));

        //(3)把3-2-502房间的销售状态修改为true
        room1.setState("true");

        //(4)显示3个房间的详细信息
        room1.showRoom();
        room2.showRoom();
        room3.showRoom();
    }
}
