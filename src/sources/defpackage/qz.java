package defpackage;

import android.util.Base64;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qz {
    public final String a;
    public final byte[] b;
    public final fu5 c;

    public qz(String str, byte[] bArr, fu5 fu5Var) {
        this.a = str;
        this.b = bArr;
        this.c = fu5Var;
    }

    public static lr a() {
        lr lrVar = new lr((byte) 10, false);
        lrVar.f0 = fu5.X;
        return lrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qz) {
            qz qzVar = (qz) obj;
            if (this.a.equals(qzVar.a) && Arrays.equals(this.b, qzVar.b) && this.c.equals(qzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? _UrlKt.FRAGMENT_ENCODE_SET : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return oi0.p(sb, strEncodeToString, ")");
    }
}
