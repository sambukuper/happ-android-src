package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qn {
    public final int a;
    public final dq b;
    public final bn c;
    public final String d;

    public qn(dq dqVar, bn bnVar, String str) {
        this.b = dqVar;
        this.c = bnVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{dqVar, bnVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qn)) {
            return false;
        }
        qn qnVar = (qn) obj;
        return zc1.F(this.b, qnVar.b) && zc1.F(this.c, qnVar.c) && zc1.F(this.d, qnVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
