package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a25 extends c25 implements Serializable {
    public final c25 Y;
    public final c25 Z;

    public a25(c25 c25Var, c25 c25Var2) {
        this.Y = c25Var;
        this.Z = c25Var2;
    }

    @Override // defpackage.c25
    public final String a(String str) {
        return this.Y.a(this.Z.a(str));
    }

    public final String toString() {
        return "[ChainedTransformer(" + this.Y + ", " + this.Z + ")]";
    }
}
