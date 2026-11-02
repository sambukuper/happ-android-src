package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s02 {
    public final y02 a;
    public final byte[] b;

    public s02(y02 y02Var, byte[] bArr) {
        if (y02Var == null) {
            b61.i("encoding is null");
            throw null;
        }
        if (bArr == null) {
            b61.i("bytes is null");
            throw null;
        }
        this.a = y02Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s02)) {
            return false;
        }
        s02 s02Var = (s02) obj;
        if (this.a.equals(s02Var.a)) {
            return Arrays.equals(this.b, s02Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
