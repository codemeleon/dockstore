/*
 *    Copyright 2016 OICR
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Describes a class (type) of tool allowing us to categorize workflows, tools, and maybe even other entities (such as services) separately
 **/

@ApiModel(description = "Describes a class (type) of tool allowing us to categorize workflows, tools, and maybe even other entities (such as services) separately") @javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-29T19:58:43.367Z") public class ToolClass {

    private String id = null;
    private String name = null;
    private String description = null;

    /**
     * The unique identifier for the class
     **/
    public ToolClass id(String id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(value = "The unique identifier for the class") @JsonProperty("id") public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A short friendly name for the class
     **/
    public ToolClass name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "A short friendly name for the class") @JsonProperty("name") public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A longer explanation of what this class is and what it can accomplish
     **/
    public ToolClass description(String description) {
        this.description = description;
        return this;
    }

    @ApiModelProperty(value = "A longer explanation of what this class is and what it can accomplish") @JsonProperty("description") public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ToolClass toolClass = (ToolClass) o;
        return Objects.equals(id, toolClass.id) && Objects.equals(name, toolClass.name) && Objects
                .equals(description, toolClass.description);
    }

    @Override public int hashCode() {
        return Objects.hash(id, name, description);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ToolClass {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

