# Spring框架的学习<br>
>名词解释：
> 
> dao层：存放数据访问对象(Data Access Object)，数据访问对象。
> 
> service层：某些操作依赖于dao层，将操作后的结果在返回出去给View层根据结果展现视图效果。
> 
> 
### 一、Spring框架的优点

<ol>
    <li>非侵入式框架，Spring框架的api不会出现在业务逻辑，也就是service层里。</li>
    <li>耦合性降低了，所有对象的创建和依赖都交给了一个Spring容器处理，组件之间分开了，没那么粘合。</li>
    <li>支持aop编程，将一些通用的任务，如安全，事务（数据库）和日志等，一起集中处理，减少通过传统oop方法（Object Oriented Programming面向对象程序设计方法）带来的代码冗余。</li>
    <li>支持声明式事务，通过Spring配置文件的方式管理数据库的事务，减少代码量。</li>
    <li>支持单元测试junit</li>
    <li>能够集成其他的框架，如Struts、MyBatis等等（依赖于Ioc< 控制反转Inversion of control >思想）</li>
    <li>封装好了很多的api无需造轮子，降低了JavaEEApi的使用难度</li>
</ol>  

### 二、控制反转（Inversion of control，简称Ioc）

<img src="src/main/resources/img/noIoc.png" alt="noIoc">

> #### 传统面向对象创建程序图
>> 由应用程序主动去创建，赋值和销毁对象，商品信息类设计setter方法注入信息至商品类

<br>

<img src="src/main/resources/img/Ioc.png" alt="Ioc">

> #### 利用控制反转机制改进后的面向对象创建程序图
>> 1、应用程序变得不是自己去主动操作对象，而是通过IoC容器去获取对象进行业务操作，对象的操作全权由IoC容器处理。<br>
> > 2、这是从IoC的角度来说，IoC容器控制应用程序，由IoC容器反向地向**应用程序**注入**应用程序**所需要的外部资源（外部实例对象、外部文件对象）。

### 三、依赖注入（Dependency Inject）

> 是从应用程序的角度来看，IoC容器在运行的过程中，动态的将某种资源注入对象之中，例如将UserDao注入到UserService的成员变量，后者的成员变量无需实例化，只要声明一个setter方法，就可以对成员变量赋值，并可以使用动态代理过来的类的方法。
>
> 依赖注入的基本思想是：明确地定义各个接口，独立开放每个组件，并根据依赖关系进行组装！

<br>

#### 依赖注入的实现方式
###### 方式一：构造方法注入
> 创建类后，声明一个带参构造方法，在Spring配置文件里通过 `<bean>`标签，声明好他的唯一标识并指向类所在位置后，再通过 `<constructor-arg>`标签进行赋值。
###### 方式二：setter方法注入
> 创建类后，声明成员变量的setter方法，步骤与方式一相同，只不过使用 `<property>`标签进行对成员变量赋值，但是类需要声明setter方法

<br>

<img src="src/main/resources/img/anime.jpg" alt="这是一张好图"/>