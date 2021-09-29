package com.github.9laksy.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.9laksy.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
