package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a00 implements em0 {
    public final zz[] X;

    public a00(zz[] zzVarArr) {
        this.X = zzVarArr;
    }

    public final void a() {
        for (zz zzVar : this.X) {
            gq1 gq1Var = zzVar.h0;
            if (gq1Var == null) {
                dh3.T("handle");
                throw null;
            }
            gq1Var.a();
        }
    }

    @Override // defpackage.em0
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.X + ']';
    }
}
