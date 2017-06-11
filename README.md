# DecoratorPattern
## 装饰者模式
### 定义
```
装饰者与代理模式很像，但装饰模式更主要的是用类的组合来解决类的多层继承带来的问题，对原有的类进行扩展但不修改原有的类，
做到开闭原则。而且还可以利用多层装饰来达到添加更多的新业务。
```
### 优点
##
装饰类和被装饰类可以独立发展，而不会相互耦合。
装饰模式是继承关系的一个替代方案。不管装饰多少层，实现的还是is-a的关系
装饰模式可以动态的扩展一个实现类的功能。
##
### 缺点
多层的装饰是比较复杂的。因此要尽量减少装饰类的层数，以降低复杂度。
### 使用场景
需要扩展一个类的功能，或给一个类增加附加功能。
需要动态地给一个对象增加功能，这些功能可以再动态的撤销。
需要为一批的兄弟类进行改装或加装功能。
