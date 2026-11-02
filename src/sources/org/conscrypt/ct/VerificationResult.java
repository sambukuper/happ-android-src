package org.conscrypt.ct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class VerificationResult {
    private final List<VerifiedSCT> validSCTs = new ArrayList();
    private final List<VerifiedSCT> invalidSCTs = new ArrayList();
    private final EnumMap<SignedCertificateTimestamp.Origin, Integer> count = new EnumMap<>(SignedCertificateTimestamp.Origin.class);

    public void add(VerifiedSCT verifiedSCT) {
        if (verifiedSCT.isValid()) {
            this.validSCTs.add(verifiedSCT);
        } else {
            this.invalidSCTs.add(verifiedSCT);
        }
        SignedCertificateTimestamp.Origin origin = verifiedSCT.getSct().getOrigin();
        Integer num = this.count.get(origin);
        EnumMap<SignedCertificateTimestamp.Origin, Integer> enumMap = this.count;
        if (num == null) {
            enumMap.put(origin, 1);
        } else {
            enumMap.put(origin, Integer.valueOf(num.intValue() + 1));
        }
    }

    public List<VerifiedSCT> getInvalidSCTs() {
        return Collections.unmodifiableList(this.invalidSCTs);
    }

    public List<VerifiedSCT> getValidSCTs() {
        return Collections.unmodifiableList(this.validSCTs);
    }

    public int numCertSCTs() {
        Integer num = this.count.get(SignedCertificateTimestamp.Origin.EMBEDDED);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int numOCSPSCTs() {
        Integer num = this.count.get(SignedCertificateTimestamp.Origin.OCSP_RESPONSE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int numTlsSCTs() {
        Integer num = this.count.get(SignedCertificateTimestamp.Origin.TLS_EXTENSION);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
