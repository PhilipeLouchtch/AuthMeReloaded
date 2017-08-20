package fr.xephi.authme.datasource;

import com.zaxxer.hikari.HikariDataSource;
import fr.xephi.authme.data.auth.PlayerAuth;
import fr.xephi.authme.datasource.mysqlextensions.MySqlExtensionsFactory;
import fr.xephi.authme.security.crypts.HashedPassword;
import fr.xephi.authme.settings.Settings;

import java.sql.SQLException;
import java.util.Collection;

public class ReadOnlyMySQL extends MySQL {

    private final static boolean FAILURE = false;

    public ReadOnlyMySQL(Settings settings, MySqlExtensionsFactory extensionsFactory) throws SQLException {
        super(settings, extensionsFactory);
    }

    public ReadOnlyMySQL(Settings settings, HikariDataSource hikariDataSource, MySqlExtensionsFactory extensionsFactory) {
        super(settings, hikariDataSource, extensionsFactory);
    }

    @Override
    public boolean saveAuth(PlayerAuth auth) {
        return FAILURE;
    }

    @Override
    public boolean updatePassword(PlayerAuth auth) {
        return FAILURE;
    }

    @Override
    public boolean updatePassword(String user, HashedPassword password) {
        return FAILURE;
    }

    @Override
    public boolean updateSession(PlayerAuth auth) {
        return FAILURE;
    }

    @Override
    public boolean removeAuth(String user) {
        return FAILURE;
    }

    @Override
    public boolean updateQuitLoc(PlayerAuth auth) {
        return FAILURE;
    }

    @Override
    public boolean updateEmail(PlayerAuth auth) {
        return FAILURE;
    }

    @Override
    public void purgeRecords(Collection<String> toPurge) {
        super.purgeRecords(toPurge);
    }

    @Override
    public void setLogged(String user) {
        // Can't write, do nothing
    }

    @Override
    public void setUnlogged(String user) {
        // Can't write, do nothing
    }

    @Override
    public void purgeLogged() {
        // Can't write, do nothing
    }

    @Override
    public boolean updateRealName(String user, String realName) {
        return FAILURE;
    }

    @Override
    protected void checkTablesAndColumns() throws SQLException {
        // Quick and Dirty: simply override function and skip checks & table creation.
    }
}
