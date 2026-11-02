package org.conscrypt.ct;

import defpackage.bt;
import defpackage.u52;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class LogInfo {
    public static final int STATE_PENDING = 1;
    public static final int STATE_QUALIFIED = 2;
    public static final int STATE_READONLY = 4;
    public static final int STATE_REJECTED = 6;
    public static final int STATE_RETIRED = 5;
    public static final int STATE_UNKNOWN = 0;
    public static final int STATE_USABLE = 3;
    public static final int TYPE_RFC6962 = 1;
    public static final int TYPE_STATIC_CT_API = 2;
    public static final int TYPE_UNKNOWN = 0;
    private final byte[] logId;
    private final String operator;
    private final PublicKey publicKey;
    private final int state;
    private final long stateTimestamp;
    private final int type;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Builder {
        private byte[] logId;
        private String operator;
        private PublicKey publicKey;
        private int state;
        private long stateTimestamp;
        private int type;

        public LogInfo build() {
            return new LogInfo(this);
        }

        public Builder setOperator(String str) {
            Objects.requireNonNull(str);
            this.operator = str;
            return this;
        }

        public Builder setPublicKey(PublicKey publicKey) {
            Objects.requireNonNull(publicKey);
            this.publicKey = publicKey;
            try {
                this.logId = MessageDigest.getInstance("SHA-256").digest(publicKey.getEncoded());
                return this;
            } catch (NoSuchAlgorithmException e) {
                u52.q(e);
                return null;
            }
        }

        public Builder setState(int i, long j) {
            if (i < 0 || i > 6) {
                bt.q("invalid state value");
                return null;
            }
            this.state = i;
            this.stateTimestamp = j;
            return this;
        }

        public Builder setType(int i) {
            if (i < 0 || i > 2) {
                bt.q("invalid type value");
                return null;
            }
            this.type = i;
            return this;
        }
    }

    private LogInfo(Builder builder) {
        Objects.requireNonNull(builder.logId);
        Objects.requireNonNull(builder.publicKey);
        Objects.requireNonNull(builder.operator);
        this.logId = builder.logId;
        this.publicKey = builder.publicKey;
        this.state = builder.state;
        this.stateTimestamp = builder.stateTimestamp;
        this.operator = builder.operator;
        this.type = builder.type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogInfo)) {
            return false;
        }
        LogInfo logInfo = (LogInfo) obj;
        return this.state == logInfo.state && this.operator.equals(logInfo.operator) && this.stateTimestamp == logInfo.stateTimestamp && this.type == logInfo.type && Arrays.equals(this.logId, logInfo.logId);
    }

    public byte[] getID() {
        return this.logId;
    }

    public String getOperator() {
        return this.operator;
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    public int getState() {
        return this.state;
    }

    public int getStateAt(long j) {
        if (j >= this.stateTimestamp) {
            return this.state;
        }
        return 0;
    }

    public long getStateTimestamp() {
        return this.stateTimestamp;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.logId)), Integer.valueOf(this.state), Long.valueOf(this.stateTimestamp), this.operator, Integer.valueOf(this.type));
    }

    public VerifiedSCT.Status verifySingleSCT(SignedCertificateTimestamp signedCertificateTimestamp, CertificateEntry certificateEntry) {
        if (!Arrays.equals(signedCertificateTimestamp.getLogID(), getID())) {
            return VerifiedSCT.Status.UNKNOWN_LOG;
        }
        try {
            byte[] bArrEncodeTBS = signedCertificateTimestamp.encodeTBS(certificateEntry);
            try {
                Signature signature = Signature.getInstance(signedCertificateTimestamp.getSignature().getAlgorithm());
                try {
                    signature.initVerify(this.publicKey);
                    try {
                        signature.update(bArrEncodeTBS);
                        return !signature.verify(signedCertificateTimestamp.getSignature().getSignature()) ? VerifiedSCT.Status.INVALID_SIGNATURE : VerifiedSCT.Status.VALID;
                    } catch (SignatureException e) {
                        u52.q(e);
                        return null;
                    }
                } catch (InvalidKeyException unused) {
                    return VerifiedSCT.Status.INVALID_SCT;
                }
            } catch (NoSuchAlgorithmException unused2) {
                return VerifiedSCT.Status.INVALID_SCT;
            }
        } catch (SerializationException unused3) {
            return VerifiedSCT.Status.INVALID_SCT;
        }
    }
}
