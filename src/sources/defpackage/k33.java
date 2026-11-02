package defpackage;

import java.util.HashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k33 extends m33 {
    @Override // defpackage.al8
    public final String[] o() {
        return u();
    }

    @Override // defpackage.al8
    public final int p() {
        return 8;
    }

    @Override // defpackage.al8
    public final al8 r(int i, al8 al8Var) {
        String string = Integer.toString(i);
        int iH = this.i.h((z33) this.b.h0, i);
        if (iH != -1) {
            return z(string, iH, null, al8Var);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.al8
    public final al8 s(String str, HashMap map, al8 al8Var) {
        int iH = this.i.h((z33) this.b.h0, Integer.parseInt(str));
        if (iH != -1) {
            return z(str, iH, map, al8Var);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.al8
    public final String[] u() {
        z33 z33Var = (z33) this.b.h0;
        int i = this.i.b;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            String strG = z33Var.g(this.i.h(z33Var, i2));
            if (strG == null) {
                throw new bl8(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            strArr[i2] = strG;
        }
        return strArr;
    }
}
