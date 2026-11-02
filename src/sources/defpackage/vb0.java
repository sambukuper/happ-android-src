package defpackage;

import java.util.Iterator;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vb0 implements ub0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public vb0(String str, int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[RETURN] */
    @Override // defpackage.ub0
    public final boolean a(et6 et6Var) {
        int i;
        int i2;
        boolean z = this.d;
        String strO = this.e;
        if (z && strO == null) {
            strO = et6Var.o();
        }
        ct6 ct6Var = et6Var.b;
        if (ct6Var != null) {
            Iterator it = ct6Var.g().iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                et6 et6Var2 = (et6) ((gt6) it.next());
                if (et6Var2 == et6Var) {
                    i = i2;
                }
                if (strO == null || et6Var2.o().equals(strO)) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 1;
        }
        int i3 = this.c ? i + 1 : i2 - i;
        int i4 = this.b;
        int i5 = this.a;
        if (i5 == 0) {
            if (i3 == i4) {
                return true;
            }
            return false;
        }
        int i6 = i3 - i4;
        if (i6 % i5 == 0 && (Integer.signum(i6) == 0 || Integer.signum(i6) == Integer.signum(i5))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str = this.c ? _UrlKt.FRAGMENT_ENCODE_SET : "last-";
        int i = this.b;
        boolean z = this.d;
        int i2 = this.a;
        return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
