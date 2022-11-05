# Compiler 2022

## 1.1 Semantics
- [x] g4 files
- [x] AST Builder
- [x] Symbol Collector
- [x] Semantics Check
- [x] OJ passed
### 1.2 Some tips
* 记得考虑数组的dim如何维护的问题
* 默认类型可以直接作为class放入全局空间
* Symbol collector 用于维护全局命名空间以及支持前向引用的元素，需要依次收集class name，global function name， class内部的function以及var。
## 2.1 Codegen
