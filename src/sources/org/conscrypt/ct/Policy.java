package org.conscrypt.ct;

import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface Policy {
    PolicyCompliance doesResultConformToPolicy(VerificationResult verificationResult, X509Certificate x509Certificate);

    boolean isLogStoreCompliant(LogStore logStore);
}
