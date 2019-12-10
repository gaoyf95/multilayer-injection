# 备注信息
### spring高级注入功能，
* 一次性注入一个接口的所有实现类
* 可以通过map或者list注入

### spring event事件驱动
* @TransactionalEventListener和@EventListener都可以监听事件， 但前者可以对发布事件和监听事件进行一些事务上的隔离。
* @TransactionalEventListenerr指不和发布事件的方法在同一个事务内，发布事件的方法事务结束后才会执行本监听方法， 监听逻辑内发生异常不会回滚发布事件方法的事务。
* @TransactionalEventListener有一个属性为fallbackExecution，默认为false，指发布事件的方法没有事务控制时， 监听器不进行监听事件，此为默认情况！
* fallbackExecution=true，则指发布事件的方法没有事务控制时，监听方法仍可以监听事件进行处理。
* 刚才我们说到使用@TransactionalEventListener会在发布事件的方法事务结束后执行监听方法，
* 但其实我们还可以进行细化的控制。它有一个属性为TransactionPhase，默认为TransactionPhase.AFTER_COMMIT，
* 即事务提交后。还可以根据需要选择AFTER_COMPLETION、BEFORE_COMMIT、AFTER_ROLLBACK。
* 但仍需注意，如果fallbackExecution=false，且发布事件的方法没有事务控制时，监听器根本不会监听到事件，此处的TransactionPhase也就没有意义了。

>> 事件写完之后，不要忘了添加@Configuration# multilayer-injection
