package fr.xephi.authme.datasource;

/**
 * DataSource type.
 */
public enum DataSourceType {

    MYSQL,
    MYSQL_READONLY,

    SQLITE,

    @Deprecated
    FILE

}
