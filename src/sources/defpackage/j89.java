package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j89 {
    public final qn a;
    public final k82 b;

    public /* synthetic */ j89(qn qnVar, k82 k82Var) {
        this.a = qnVar;
        this.b = k82Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j89)) {
            return false;
        }
        j89 j89Var = (j89) obj;
        return zc1.F(this.a, j89Var.a) && zc1.F(this.b, j89Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        e93 e93Var = new e93(this);
        e93Var.a(this.a, "key");
        e93Var.a(this.b, "feature");
        return e93Var.toString();
    }
}
