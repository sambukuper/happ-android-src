package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nu8 {
    public final qe2 a;
    public wk b;
    public wk c;
    public wk d;
    public final float e;

    public nu8(qe2 qe2Var) {
        this.a = qe2Var;
        this.e = qe2Var.z();
    }

    public final wk a(long j, wk wkVar, wk wkVar2) {
        wk wkVarC = this.c;
        if (wkVarC == null) {
            wkVarC = wkVar.c();
            this.c = wkVarC;
        }
        int iB = wkVarC.b();
        int i = 0;
        while (true) {
            wk wkVar3 = this.c;
            if (i >= iB) {
                if (wkVar3 != null) {
                    return wkVar3;
                }
                dh3.T("velocityVector");
                throw null;
            }
            if (wkVar3 == null) {
                dh3.T("velocityVector");
                throw null;
            }
            wkVar.getClass();
            wkVar3.e(i, this.a.N(wkVar2.a(i), j));
            i++;
        }
    }
}
