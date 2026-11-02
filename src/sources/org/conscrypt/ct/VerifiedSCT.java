package org.conscrypt.ct;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class VerifiedSCT {
    private final LogInfo logInfo;
    private final SignedCertificateTimestamp sct;
    private final Status status;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Builder {
        private LogInfo logInfo;
        private SignedCertificateTimestamp sct;
        private Status status;

        public Builder(SignedCertificateTimestamp signedCertificateTimestamp) {
            this.sct = signedCertificateTimestamp;
        }

        public VerifiedSCT build() {
            return new VerifiedSCT(this);
        }

        public Builder setLogInfo(LogInfo logInfo) {
            Objects.requireNonNull(logInfo);
            this.logInfo = logInfo;
            return this;
        }

        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public enum Status {
        VALID,
        INVALID_SIGNATURE,
        UNKNOWN_LOG,
        INVALID_SCT
    }

    private VerifiedSCT(Builder builder) {
        Objects.requireNonNull(builder.sct);
        Objects.requireNonNull(builder.status);
        if (builder.status == Status.VALID) {
            Objects.requireNonNull(builder.logInfo);
        }
        this.sct = builder.sct;
        this.status = builder.status;
        this.logInfo = builder.logInfo;
    }

    public LogInfo getLogInfo() {
        return this.logInfo;
    }

    public SignedCertificateTimestamp getSct() {
        return this.sct;
    }

    public Status getStatus() {
        return this.status;
    }

    public boolean isValid() {
        return this.status == Status.VALID;
    }
}
