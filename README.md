# scala-learn

## scala基础知识
### 类:      
	构造函数中参数如果用var修饰表示公开且可修改；如果使用val修饰表示公开但是不可修改；无修饰符表示私有不可被直接访问；     
### 高阶函数:   
	使用其他函数作为参数、或返回一个函数作为结果的函数   
### 函数嵌套:   
	
### 柯里化:   
	函数有多个参数列表；只提供一个参数的时候会使用当前剩余参数生成一个新的函数   
### 样例类:   
	样例类(case class)默认有一个apply方法来负责对象创建，不使用关键字new     
	样例类的构造函数参数是公开的val     
	使用sealed 修饰符描述的抽象类，所有子类必须和它的定义位于相同的文件内     
### 模式匹配:   
	match {    
		case     
	}     
	对应于 case class等    
### 单例对象:    
	使用object 定义的对象     
	伴生对象、伴生类 与class 同名的object；object 主要作用放置与实例无关的方法和属性；伴生类和伴生对象必须在相同的文件内     
### right-ignoring序列模式:
	可以使用.r将任意字符串转化为一个正则表达式   
### for 表达式:
	for (enumerators) yield e      
	enumerators 指一组以分号分割的枚举器。一个enumerator要么是一个产生新变量的生产器，要么是一个过滤器     
	```
	case class User(name: String, age: Int)
	val userBase = List(User("Travis", 28),
  		User("Kelly", 33),
  		User("Jennifer", 44),
  		User("Dennis", 23))

	val twentySomethings = for (user <- userBase if (user.age >=20 && user.age < 30))
  		yield user.name  // i.e. add this to a list

	twentySomethings.foreach(name => println(name))
	```
	user <- userBase 是生成器      
	if(user.age>=20&&user.age<30)是过滤器  

### 型变
#### 协变
    对于某些类 class List[+A],使A成为协变意味着对于两种类型A和B，如果A是B的子类型，那么List[A]就是List[B]的子类型。
#### 逆变
    对于某些类 class Writer[-A],使A逆变意味着对于两种类型A和B，如果A是B的子类型，那么Writer[B]是Writer[A]的子类型。
#### 上界、下界（未理解，源文档链接如下）
    https://docs.scala-lang.org/zh-cn/tour/upper-type-bounds.html     
    https://docs.scala-lang.org/zh-cn/tour/lower-type-bounds.html    

### 内部类
    scala的内部类绑定到外部类的对象上；通过不同的外部类对象创建的内部类对象属于不同的类别       
    参考：innerclass.Graph





