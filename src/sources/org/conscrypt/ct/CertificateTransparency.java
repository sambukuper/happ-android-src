package org.conscrypt.ct;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import org.conscrypt.NetworkSecurityPolicy;
import org.conscrypt.metrics.CertificateTransparencyVerificationReason;
import org.conscrypt.metrics.StatsLog;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class CertificateTransparency {
    private LogStore logStore;
    private Policy policy;
    private Supplier<NetworkSecurityPolicy> policySupplier;
    private StatsLog statsLog;
    private Verifier verifier;

    public CertificateTransparency(LogStore logStore, Policy policy, Verifier verifier, StatsLog statsLog, Supplier<NetworkSecurityPolicy> supplier) {
        Objects.requireNonNull(logStore);
        Objects.requireNonNull(policy);
        Objects.requireNonNull(verifier);
        Objects.requireNonNull(statsLog);
        this.logStore = logStore;
        this.policy = policy;
        this.verifier = verifier;
        this.statsLog = statsLog;
        this.policySupplier = supplier;
    }

    public void checkCT(List<X509Certificate> list, byte[] bArr, byte[] bArr2, String str) throws CertificateException {
        if (this.logStore.getState() != LogStore.State.COMPLIANT) {
            this.statsLog.reportCTVerificationResult(this.logStore, null, null, getVerificationReason(str));
            return;
        }
        try {
            VerificationResult verificationResultVerifySignedCertificateTimestamps = this.verifier.verifySignedCertificateTimestamps(list, bArr2, bArr);
            PolicyCompliance policyComplianceDoesResultConformToPolicy = this.policy.doesResultConformToPolicy(verificationResultVerifySignedCertificateTimestamps, list.get(0));
            this.statsLog.reportCTVerificationResult(this.logStore, verificationResultVerifySignedCertificateTimestamps, policyComplianceDoesResultConformToPolicy, getVerificationReason(str));
            if (policyComplianceDoesResultConformToPolicy == PolicyCompliance.COMPLY) {
                return;
            }
            throw new CertificateException("Certificate chain does not conform to required transparency policy: " + policyComplianceDoesResultConformToPolicy.name());
        } catch (LogStore.InvalidLogException unused) {
            this.statsLog.reportCTVerificationResult(this.logStore, null, null, getVerificationReason(str));
        }
    }

    public CertificateTransparencyVerificationReason getVerificationReason(String str) {
        return this.policySupplier.get().getCertificateTransparencyVerificationReason(str);
    }
}
