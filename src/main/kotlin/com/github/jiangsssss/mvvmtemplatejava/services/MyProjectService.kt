package com.github.jiangsssss.mvvmtemplatejava.services

import com.github.jiangsssss.mvvmtemplatejava.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
