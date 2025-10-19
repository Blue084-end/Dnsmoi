package dnsfilter.remote;

import dnsfilter.ConfigurationAccess;
import util.TimeoutListener;

import java.io.IOException;
import java.util.Properties;

public class RemoteAccessClient extends ConfigurationAccess implements TimeoutListener {

    public RemoteAccessClient() {
        // Vô hiệu hóa hoàn toàn chức năng remote
    }

    @Override
    public Properties getDefaultConfig() throws IOException {
        return ConfigurationAccess.getLocal().getDefaultConfig();
    }

    @Override
    public byte[] readConfig() throws IOException {
        return ConfigurationAccess.getLocal().readConfig();
    }

    @Override
    public void updateConfig(byte[] config) throws IOException {
        ConfigurationAccess.getLocal().updateConfig(config);
    }

    @Override
    public void updateConfigMergeDefaults(byte[] config) throws IOException {
        ConfigurationAccess.getLocal().updateConfigMergeDefaults(config);
    }

    @Override
    public byte[] getAdditionalHosts(int limit) throws IOException {
        return ConfigurationAccess.getLocal().getAdditionalHosts(limit);
    }

    @Override
    public void updateAdditionalHosts(byte[] bytes) throws IOException {
        ConfigurationAccess.getLocal().updateAdditionalHosts(bytes);
    }

    @Override
    public void updateFilter(String entries, boolean filter) throws IOException {
        ConfigurationAccess.getLocal().updateFilter(entries, filter);
    }

    @Override
    public String getVersion() throws IOException {
        return ConfigurationAccess.getLocal().getVersion();
    }

    @Override
    public int openConnectionsCount() {
        return ConfigurationAccess.getLocal().openConnectionsCount();
    }

    @Override
    public String getLastDNSAddress() {
        return ConfigurationAccess.getLocal().getLastDNSAddress();
    }

    @Override
    public void restart() throws IOException {
        ConfigurationAccess.getLocal().restart();
    }

    @Override
    public void stop() throws IOException {
        ConfigurationAccess.getLocal().stop();
    }

    @Override
    public long[] getFilterStatistics() throws IOException {
        return ConfigurationAccess.getLocal().getFilterStatistics();
    }

    @Override
    public void triggerUpdateFilter() throws IOException {
        ConfigurationAccess.getLocal().triggerUpdateFilter();
    }

    @Override
    public void doBackup(java.io.OutputStream backupout) throws IOException {
        ConfigurationAccess.getLocal().doBackup(backupout);
    }

    @Override
    public void doRestoreDefaults() throws IOException {
        ConfigurationAccess.getLocal().doRestoreDefaults();
    }

    @Override
    public void doRestore(java.io.InputStream backup) throws IOException {
        ConfigurationAccess.getLocal().doRestore(backup);
    }

    @Override
    public void wakeLock() throws IOException {
        ConfigurationAccess.getLocal().wakeLock();
    }

    @Override
    public void releaseWakeLock() throws IOException {
        ConfigurationAccess.getLocal().releaseWakeLock();
    }

    @Override
    public void timeoutNotification() {
        // Không làm gì cả
    }

    @Override
    public long getTimoutTime() {
        return Long.MAX_VALUE;
    }
}
