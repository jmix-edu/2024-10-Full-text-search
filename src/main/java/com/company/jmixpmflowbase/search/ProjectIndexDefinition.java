package com.company.jmixpmflowbase.search;

import com.company.jmixpmflowbase.entity.Project;
import io.jmix.search.index.annotation.AutoMappedField;
import io.jmix.search.index.annotation.JmixEntitySearchIndex;

@JmixEntitySearchIndex(entity = Project.class)
public interface ProjectIndexDefinition {

    @AutoMappedField(includeProperties = {"name", "manager.username", "tasks.name"})
    @AutoMappedField(includeProperties = {"attachement"}, analyzer = "english")
    void mapping();

}
