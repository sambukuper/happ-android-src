package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a22 extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ gn2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a22(gn2 gn2Var, byte b) {
        super(1);
        this.Y = b;
        this.Z = gn2Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.Y;
        gn2 gn2Var = this.Z;
        switch (b) {
            case 0:
                long j = ((pf3) obj).a;
                int i = (int) (j & 4294967295L);
                return new pf3((((long) i) & 4294967295L) | (((long) ((Number) gn2Var.B(Integer.valueOf((int) (j >> 32)))).intValue()) << 32));
            case 1:
                long j2 = ((pf3) obj).a;
                int i2 = (int) (j2 >> 32);
                return new pf3((((long) ((Number) gn2Var.B(Integer.valueOf((int) (j2 & 4294967295L)))).intValue()) & 4294967295L) | (((long) i2) << 32));
            case 2:
                long j3 = ((pf3) obj).a;
                int i3 = (int) (j3 & 4294967295L);
                return new pf3((((long) i3) & 4294967295L) | (((long) ((Number) gn2Var.B(Integer.valueOf((int) (j3 >> 32)))).intValue()) << 32));
            case 3:
                long j4 = ((pf3) obj).a;
                int i4 = (int) (j4 >> 32);
                return new pf3((((long) ((Number) gn2Var.B(Integer.valueOf((int) (j4 & 4294967295L)))).intValue()) & 4294967295L) | (((long) i4) << 32));
            case 4:
                return new hf3(((long) ((Number) gn2Var.B(Integer.valueOf((int) (((pf3) obj).a & 4294967295L)))).intValue()) & 4294967295L);
            default:
                return new hf3(((long) ((Number) gn2Var.B(Integer.valueOf((int) (((pf3) obj).a & 4294967295L)))).intValue()) & 4294967295L);
        }
    }
}
