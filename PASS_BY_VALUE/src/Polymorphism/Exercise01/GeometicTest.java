package src.Polymorphism.Exercise01;

/**
 * 编写equalsArea方法测试两个对象的面积是否相同(注意方法的参数类型，利用动态绑定技术)
 * 编写displayGeomertriObject方法显示对象的面积(注意方法的参数类型，利用动态绑定技术)
 */
public class GeometicTest {
    public static void main(String[] args) {
        GeometicTest test = new GeometicTest();

        Circle c1 = new Circle(3.3, "white", 1.0);
        test.displayGeomertriObject(c1);
        Circle c2 = new Circle(2.3, "white", 1.0);
        test.displayGeomertriObject(c2);

        boolean isEquals = test.equalsArea(c1, c2);
        System.out.println("c1和c2的面积是否相同?" + isEquals);

    }

    // 定义以下两种方法，使得我们不用再去Circle或GeometricObject一些方法，可以运用多态性进行调用

    /**
     * 判断两个面积是否相同
     * 
     * @param o1
     * @param o2
     * @return
     */
    public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
        return o1 == o2;
    }

    /**
     * 输出面积
     * 
     * @param o
     */
    public void displayGeomertriObject(GeometricObject o) {
        System.out.println("面积为" + o.findArea());
    }
}
