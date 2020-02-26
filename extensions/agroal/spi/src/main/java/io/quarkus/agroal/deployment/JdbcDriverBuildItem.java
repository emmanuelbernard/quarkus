package io.quarkus.agroal.deployment;

import java.util.Optional;

import io.quarkus.builder.item.MultiBuildItem;

public final class JdbcDriverBuildItem extends MultiBuildItem {

    private final String name;

    private final String driverClass;

    private final Optional<String> xaDriverClass;

    public JdbcDriverBuildItem(String name, String driverClass, Optional<String> xaDriverClass) {
        this.name = name;
        this.driverClass = driverClass;
        this.xaDriverClass = xaDriverClass;
    }

    public String getName() {
        return name;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public Optional<String> getDriverXAClass() {
        return xaDriverClass;
    }
}
