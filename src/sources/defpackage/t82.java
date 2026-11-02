package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class t82 {
    public final byte[] a;
    public final String b;
    public final Integer c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t82(byte[] bArr, String str, Integer num) {
        this.a = bArr;
        this.b = str;
        this.c = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t82)) {
            return false;
        }
        byte[] bArr = this.a;
        if (bArr != null) {
            zEquals = Arrays.equals(bArr, ((t82) obj).a);
        } else {
            zEquals = ((t82) obj).a == null;
        }
        if (zEquals) {
            if (dh3.f(this.b, ((t82) obj).b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        byte[] bArr = this.a;
        int iHashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbT = oi0.t("FetchReport(data=", Arrays.toString(this.a), ", resolverUsed=", this.b, ", errorCode=");
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
