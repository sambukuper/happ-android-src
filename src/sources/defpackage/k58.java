package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class k58 implements rn2 {
    public final /* synthetic */ long X;
    public final /* synthetic */ o88 Y;
    public final /* synthetic */ rn2 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k58(long j, o88 o88Var, rn2 rn2Var) {
        this.X = j;
        this.Y = o88Var;
        this.Z = rn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            pn7.b(this.X, this.Y, this.Z, lp2Var, 0);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
