模拟实现一个基于文本界面的《开发团队调度软件》
熟悉Java面向对象的高级特性，进一步掌握编程技巧的调试技巧
主要涉及以下知识点：
    > 类的继承性和多态性
    > 对象的值传递、接口
    > static和final修饰符
    > 特殊类的使用：包装类、抽象类、内部类
    > 异常处理


                    需求说明
该软件实现以下功能:
    >软件启动时,根据给定的数据创建公司部分成员列表(数组)
    >根据菜单提示,基于现有的公司成员,组建一个开发团队以开发一个新的项目
    >组建过程包括将成员插入到团队中,或从团队中删除某成员,还可以列出团队中现有成员的列表
    >开发团队成员包括架构师、设计师和程序员 


                            需求说明
本软件采用单级菜单方式工作。当软件运行时,主界面显示公司成员的列表,如下:

-----------------------------开发团队调度软件--------------------------------
ID 姓名   年龄   工资        职位     状态    奖金     股票     领用设备
1  马云    22    3000.0
2  马化腾  32    18000.0    架构师   FREE    15000.0  2000     联想T4(6000.0)
3  李彦宏  23    7000.0     程序员   FREE                      戴尔(NEC17寸)
4  刘强东  24    7300.0     程序员   FREE                      戴尔(三星17寸)
5  雷军    28    10000.0    设计师   FREE    5000.0            佳能2900(激光)
----------------------------------------------------------------------------

1-团队列表  2-添加团队成员  3-删除团队成员  4-退出 请选择(1-4): 


                            需求说明
当选择“添加团队成员”菜单时,将执行从列表中添加指定(通过ID)成员到开发团队的功能:

1-团队列表2-添加团队成员3-删除团队成员4-退出 请选择(1-4):2

------------------添加成员------------------
请输入要添加的员工ID:2
添加成功
按回车键继续...

添加成功后,按回车键将重新显示主界面。
开发团队人员组成要求:
    最多一名架构师
    最多两名设计师
    最多三名程序员

                            需求说明
如果添加操作因某种原因失败,将显示类似以下信息(失败原因视具体原因而不同):
1-团队列表2-添加团队成员3-删除团队成员4-退出 请选择(1-4):2

--------------------添加成员----------------------
请输入要添加的员工ID:2
添加失败,原因:该员工已是某团队成员
按回车键继续...

失败信息包含以下几种:
    成员已满,无法添加
    该成员不是开发人员,无法添加
    该员工已在本开发团队中
    该员工已是某团队成员
    该员正在休假,无法添加
    团队中至多只能有一名架构师
    团队中至多只能有两名设计师
    团队中至多只能有三名程序员