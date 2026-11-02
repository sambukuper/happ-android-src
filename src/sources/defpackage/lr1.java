package defpackage;

import su.happ.proxyutility.dto.AdditionalInfoCode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class lr1 {
    public static final kr1 Companion = new kr1();
    public final AdditionalInfoCode a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lr1(int i, AdditionalInfoCode additionalInfoCode) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = additionalInfoCode;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lr1) && dh3.f(this.a, ((lr1) obj).a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        AdditionalInfoCode additionalInfoCode = this.a;
        if (additionalInfoCode == null) {
            return 0;
        }
        return Integer.hashCode(additionalInfoCode.getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "JwtData(additionalInfoCode=" + this.a + ")";
    }
}
