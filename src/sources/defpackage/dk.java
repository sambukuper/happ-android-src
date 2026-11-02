package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dk extends g24 implements sn2 {
    public final /* synthetic */ gn2 Y;
    public final /* synthetic */ ce8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(gn2 gn2Var, ce8 ce8Var) {
        super(3);
        this.Y = gn2Var;
        this.Z = ce8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        long j;
        zr4 zr4Var = (zr4) obj;
        eo5 eo5VarO = ((tr4) obj2).o(((q31) obj3).a);
        if (zr4Var.c0()) {
            if (((Boolean) this.Y.B(this.Z.d.getValue())).booleanValue()) {
                j = (((long) eo5VarO.X) << 32) | (((long) eo5VarO.Y) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) eo5VarO.X) << 32) | (((long) eo5VarO.Y) & 4294967295L);
        }
        return zr4Var.g0((int) (j >> 32), (int) (4294967295L & j), e02.X, new ck(eo5VarO, (byte) 0));
    }
}
