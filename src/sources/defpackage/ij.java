package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ij extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ kj Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij(kj kjVar, byte b) {
        super(1);
        this.Y = b;
        this.Z = kjVar;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.Y;
        dn8 dn8Var = dn8.a;
        kj kjVar = this.Z;
        switch (b) {
            case 0:
                eo5 eo5Var = kjVar.v0;
                eo5Var.getClass();
                long j = kjVar.x0;
                long j2 = (((long) eo5Var.X) << 32) | (((long) eo5Var.Y) & 4294967295L);
                do5.g((do5) obj, eo5Var, (((long) Math.round((1.0f - 1.0f) * ((((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f))) << 32) | (4294967295L & ((long) Math.round((1.0f - 1.0f) * ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f)))));
                break;
            default:
                eo5 eo5Var2 = kjVar.u0;
                eo5Var2.getClass();
                long j3 = kjVar.w0;
                long j4 = (((long) eo5Var2.Y) & 4294967295L) | (((long) eo5Var2.X) << 32);
                do5.g((do5) obj, eo5Var2, (((long) Math.round((1.0f - 1.0f) * ((((int) (j3 >> 32)) - ((int) (j4 >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f - 1.0f) * ((((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L))) / 2.0f))) & 4294967295L));
                break;
        }
        return dn8Var;
    }
}
