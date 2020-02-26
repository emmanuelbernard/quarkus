package io.quarkus.jdbc.mariadb.deployment;

import java.util.Optional;

import io.quarkus.agroal.deployment.JdbcDriverBuildItem;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.arc.processor.BuiltinScope;
import io.quarkus.datasource.common.runtime.DatabaseKind;
import io.quarkus.deployment.Capabilities;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.SslNativeConfigBuildItem;
import io.quarkus.jdbc.mariadb.runtime.MariaDBAgroalConnectionConfigurer;

public class JDBCMariaDBProcessor {

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FeatureBuildItem.JDBC_MARIADB);
    }

    @BuildStep
    void registerDriver(BuildProducer<JdbcDriverBuildItem> jdbcDriver,
            SslNativeConfigBuildItem sslNativeConfigBuildItem) {
        jdbcDriver.produce(new JdbcDriverBuildItem(DatabaseKind.MARIADB, "org.mariadb.jdbc.Driver",
                Optional.of("org.mariadb.jdbc.MySQLDataSource")));
    }

    @BuildStep
    void configureAgroalConnection(BuildProducer<AdditionalBeanBuildItem> additionalBeans,
            Capabilities capabilities) {
        if (capabilities.isCapabilityPresent(Capabilities.AGROAL)) {
            additionalBeans.produce(new AdditionalBeanBuildItem.Builder().addBeanClass(MariaDBAgroalConnectionConfigurer.class)
                    .setDefaultScope(BuiltinScope.APPLICATION.getName())
                    .build());
        }
    }
}
