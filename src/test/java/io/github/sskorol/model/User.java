package io.github.sskorol.model;

import io.github.sskorol.csv.Source;
import io.github.sskorol.csv.FieldName;
import lombok.Data;

@Data
@Source(path = "users.csv")
public class User {

    @FieldName("username")
    private final String name;
    private final String password;
}
