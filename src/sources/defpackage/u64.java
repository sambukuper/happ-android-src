package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u64 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ w64 Y;

    public /* synthetic */ u64(w64 w64Var, byte b) {
        this.X = b;
        this.Y = w64Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        w64 w64Var = this.Y;
        switch (b) {
            case 0:
                z64 z64Var = (z64) w64Var.q0.invoke();
                int iC = z64Var.c();
                int i = 0;
                while (i < iC) {
                    if (z64Var.d(i).equals(obj)) {
                        return Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return Integer.valueOf(i);
            default:
                int iIntValue = ((Integer) obj).intValue();
                z64 z64Var2 = (z64) w64Var.q0.invoke();
                if (iIntValue < 0 || iIntValue >= z64Var2.c()) {
                    zc3.a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + z64Var2.c() + ")");
                }
                w51.G(w64Var.M0(), null, null, new fh1(w64Var, iIntValue, (q51) null), 3);
                return Boolean.TRUE;
        }
    }
}
