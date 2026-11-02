package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a21 {
    public static final a21 e;
    public static final a21 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        wr0 wr0Var = wr0.r;
        wr0 wr0Var2 = wr0.s;
        wr0 wr0Var3 = wr0.t;
        wr0 wr0Var4 = wr0.l;
        wr0 wr0Var5 = wr0.n;
        wr0 wr0Var6 = wr0.m;
        wr0 wr0Var7 = wr0.o;
        wr0 wr0Var8 = wr0.q;
        wr0 wr0Var9 = wr0.p;
        wr0[] wr0VarArr = {wr0Var, wr0Var2, wr0Var3, wr0Var4, wr0Var5, wr0Var6, wr0Var7, wr0Var8, wr0Var9};
        wr0[] wr0VarArr2 = {wr0Var, wr0Var2, wr0Var3, wr0Var4, wr0Var5, wr0Var6, wr0Var7, wr0Var8, wr0Var9, wr0.j, wr0.k, wr0.h, wr0.i, wr0.f, wr0.g, wr0.e};
        z11 z11Var = new z11();
        z11Var.b((wr0[]) Arrays.copyOf(wr0VarArr, 9));
        db8 db8Var = db8.TLS_1_3;
        db8 db8Var2 = db8.TLS_1_2;
        z11Var.d(db8Var, db8Var2);
        z11Var.b = true;
        z11Var.a();
        z11 z11Var2 = new z11();
        z11Var2.b((wr0[]) Arrays.copyOf(wr0VarArr2, 16));
        z11Var2.d(db8Var, db8Var2);
        z11Var2.b = true;
        e = z11Var2.a();
        z11 z11Var3 = new z11();
        z11Var3.b((wr0[]) Arrays.copyOf(wr0VarArr2, 16));
        z11Var3.d(db8Var, db8Var2, db8.TLS_1_1, db8.TLS_1_0);
        z11Var3.b = true;
        z11Var3.a();
        f = new a21(false, false, null, null);
    }

    public a21(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(wr0.b.h(str));
        }
        return wv0.Y0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !ks8.h(strArr, sSLSocket.getEnabledProtocols(), h25.Y)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || ks8.h(strArr2, sSLSocket.getEnabledCipherSuites(), wr0.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(d28.c(str));
        }
        return wv0.Y0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a21)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a21 a21Var = (a21) obj;
        boolean z = a21Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, a21Var.c) && Arrays.equals(this.d, a21Var.d) && this.b == a21Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
