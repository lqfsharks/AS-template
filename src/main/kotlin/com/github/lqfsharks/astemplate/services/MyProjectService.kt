package com.github.lqfsharks.astemplate.services

import com.intellij.openapi.project.Project
import com.github.lqfsharks.astemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
