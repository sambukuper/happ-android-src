package org.conscrypt;

import org.conscrypt.metrics.CertificateTransparencyVerificationReason;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ConscryptNetworkSecurityPolicy implements NetworkSecurityPolicy {
    public static ConscryptNetworkSecurityPolicy getDefault() {
        return new ConscryptNetworkSecurityPolicy();
    }

    @Override // org.conscrypt.NetworkSecurityPolicy
    public CertificateTransparencyVerificationReason getCertificateTransparencyVerificationReason(String str) {
        return CertificateTransparencyVerificationReason.UNKNOWN;
    }

    @Override // org.conscrypt.NetworkSecurityPolicy
    public DomainEncryptionMode getDomainEncryptionMode(String str) {
        return DomainEncryptionMode.UNKNOWN;
    }

    @Override // org.conscrypt.NetworkSecurityPolicy
    public boolean isCertificateTransparencyVerificationRequired(String str) {
        return false;
    }
}
