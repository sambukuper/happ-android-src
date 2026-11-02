package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i65 extends zh1 {
    public final /* synthetic */ byte Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i65(aa7 aa7Var, byte b) {
        super(aa7Var);
        this.Z = b;
    }

    @Override // defpackage.yh1, defpackage.t14
    public final boolean o0() {
        switch (this.Z) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.yh1
    public final yh1 y0(aa7 aa7Var) {
        switch (this.Z) {
            case 0:
                return new i65(aa7Var, (byte) 0);
            default:
                return new i65(aa7Var, (byte) 1);
        }
    }
}
