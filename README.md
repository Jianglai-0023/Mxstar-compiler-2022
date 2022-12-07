# 📟 Compiler 2022 📟

## 1.1 Semantics 👾

- [x] g4 files
- [x] Semantic.AST Builder
- [x] Symbol Collector
- [x] Semantics Check
- [x] OJ passed

### 1.2 Some tips

* 记得考虑数组的dim如何维护的问题

* 默认类型可以直接作为class放入全局空间

* Symbol collector 用于维护全局命名空间以及支持前向引用的元素，需要依次收集class name，global function name， class内部的function以及var。

* 究极大坑：在gScope里拿出cls的时候用了拷贝构造，其中dim 拷贝了原有的int，而其他的array则直接拷贝指针，所以即便所有cls的处理都变成了`new ClsType(ClsType c)` 也可以直接对Array修改，而且不影响后续每个变量各自有一个dim，正确性没问题



## 2.1 Codegen 🧐

- [ ] llvm-ir中间表示
- [ ] llvm-backend

- [ ] 处理global elements
  block 中存储顺序执行的所有inst

- [ ] functions
- [ ] if-else
- [ ] while
- [ ] class

### llvm-ir

* 若干顺序执行节点会被放在同一个block内
* constant如何设计

##### IRCollector

* IRType设计
  * string  = `i8*`  IRptr
  * Array = `ix*` IRarray
  * 函数返回时为IRptr
* 函数

```javascript
define i32 @_Z1fic(i32 %0, i8 signext %1) #0 {
  %3 = alloca i32, align 4
  %4 = alloca i8, align 1
  %5 = alloca i32, align 4
  %6 = alloca i8, align 1
  store i32 %0, i32* %3, align 4
  store i8 %1, i8* %4, align 1
  store i32 0, i32* %5, align 4
  %7 = load i32, i32* %5, align 4
  %8 = add nsw i32 %7, 1
  store i32 %8, i32* %5, align 4
  %9 = load i32, i32* %5, align 4
  %10 = add nsw i32 %9, 2
  ret i32 %10
}
```

参数列表 Entity: register

#### 文件结构

* Entity

  IR中的对象，包含对象名以及对象类型

  `getValue()`：输出变量名
  `toString()`:输出变量类型 + 变量名

  ```
  Entity-|globalentity
         |Label
         |constant
         |register
  ```

* Inst
  Instructions表示一个block中的各种llvm ir指令，顺序打印

* tools

IRbuilder中用于生成IRBlocks的辅助函数

```
tools-|Class
      |Function
      |IRBlock
      |IRModule
```

* Type

IR中的类型

```
IRType-|base---|Void
       |class  |Lable
       |ptr    |I
       |array
```

