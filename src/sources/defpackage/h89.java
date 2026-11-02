package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h89 implements v00 {
    public final /* synthetic */ rs2 a;

    public h89(rs2 rs2Var) {
        this.a = rs2Var;
    }

    @Override // defpackage.v00
    public final void a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        f99 f99Var = this.a.m;
        f99Var.sendMessage(f99Var.obtainMessage(1, boolValueOf));
    }
}
