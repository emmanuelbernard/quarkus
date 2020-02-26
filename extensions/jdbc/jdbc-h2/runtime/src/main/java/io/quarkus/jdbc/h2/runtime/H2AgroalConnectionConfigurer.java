package io.quarkus.jdbc.h2.runtime;

import io.quarkus.agroal.JdbcDriver;
import io.quarkus.agroal.runtime.AgroalConnectionConfigurer;
import io.quarkus.datasource.common.runtime.DatabaseKind;

@JdbcDriver(name = DatabaseKind.H2)
public class H2AgroalConnectionConfigurer implements AgroalConnectionConfigurer {

}
