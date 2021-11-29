package jp.techacademy.akihiro.l2_kadai

abstract class Animal {
    // property
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()
}