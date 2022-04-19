package src.Book5.One;

abstract public class Electrical {
    public abstract void work();
}

class TV extends Electrical {

    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.print("电视机在播放节目");
    }

}

class Washer extends Electrical {

    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.print("洗衣机在洗衣服");
    }

}

class fridge extends Electrical {

    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.print("电冰箱在制冷");
    }

}

class micro_wave_oven extends Electrical {

    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.print("微波炉在加热食物");
    }

}
class ElectricalTest{
    public static void main(String[] args) {
        TV electrical = new TV();
        electrical.work();
    }
}
