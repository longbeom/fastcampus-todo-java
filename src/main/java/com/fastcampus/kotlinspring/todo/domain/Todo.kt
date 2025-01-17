package com.fastcampus.kotlinspring.todo.domain

import java.time.LocalDateTime
import javax.persistence.*

@Table(name = "todos")
@Entity
class Todo (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = 0,

    @Column(name = "title")
    var title: String,

    @Column(name = "description")
    var description: String,

    @Column(name = "done")
    var done: Boolean,

    @Column(name = "createdAt")
    var createdAt: LocalDateTime,

    @Column(name = "updatedAt")
    var updatedAt: LocalDateTime? = null,
) {
    fun update(
        title: String,
        description: String,
        done: Boolean,
    ) {
        this.title = title
        this.description = description
        this.done = done
        this.updatedAt = LocalDateTime.now()
    }
}