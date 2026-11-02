package org.conscrypt.metrics;

import org.conscrypt.CertBlocklistEntry;
import org.conscrypt.ct.LogStore;
import org.conscrypt.ct.PolicyCompliance;
import org.conscrypt.ct.VerificationResult;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class NoopStatsLog implements StatsLog {
    private static final StatsLog INSTANCE = new NoopStatsLog();

    public static StatsLog getInstance() {
        return INSTANCE;
    }

    @Override // org.conscrypt.metrics.StatsLog
    public void reportBlocklistHit(CertBlocklistEntry certBlocklistEntry) {
    }

    @Override // org.conscrypt.metrics.StatsLog
    public void reportTlsEchHandshake(TlsEncryptedClientHelloHandshake tlsEncryptedClientHelloHandshake) {
    }

    @Override // org.conscrypt.metrics.StatsLog
    public void updateCTLogListStatusChanged(LogStore logStore) {
    }

    @Override // org.conscrypt.metrics.StatsLog
    public void reportCertificationValidationFailure(CertificateValidationFailureReason certificateValidationFailureReason, int i) {
    }

    @Override // org.conscrypt.metrics.StatsLog
    public void countTlsHandshake(boolean z, String str, String str2, long j) {
    }

    @Override // org.conscrypt.metrics.StatsLog
    public void reportCTVerificationResult(LogStore logStore, VerificationResult verificationResult, PolicyCompliance policyCompliance, CertificateTransparencyVerificationReason certificateTransparencyVerificationReason) {
    }
}
