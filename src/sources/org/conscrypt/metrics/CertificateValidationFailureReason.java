package org.conscrypt.metrics;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum CertificateValidationFailureReason {
    UNKNOWN(0),
    NO_TRUST_ANCHOR(1);

    final int id;

    CertificateValidationFailureReason(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }
}
