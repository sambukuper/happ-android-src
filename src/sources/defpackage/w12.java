package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w12 extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w12(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.Y = b;
        this.Z = obj;
        this.f0 = obj2;
        this.g0 = obj3;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.Y;
        float f = 1.0f;
        Object obj2 = this.g0;
        Object obj3 = this.f0;
        Object obj4 = this.Z;
        switch (b) {
            case 0:
                int iOrdinal = ((r12) obj).ordinal();
                if (iOrdinal == 0) {
                    u72 u72Var = ((g22) obj4).a.a;
                    if (u72Var != null) {
                        f = u72Var.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        b61.c();
                        return null;
                    }
                    u72 u72Var2 = ((h62) obj3).a.a;
                    f = u72Var2 != null ? u72Var2.a : ((x77) obj2).f;
                }
                return Float.valueOf(f);
            case 1:
                int iOrdinal2 = ((r12) obj).ordinal();
                if (iOrdinal2 == 0) {
                    qw6 qw6Var = ((g22) obj4).a.d;
                    if (qw6Var != null) {
                        f = qw6Var.a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        b61.c();
                        return null;
                    }
                    qw6 qw6Var2 = ((h62) obj3).a.d;
                    f = qw6Var2 != null ? qw6Var2.a : ((x77) obj2).g;
                }
                return Float.valueOf(f);
            default:
                return new yi((vd7) obj4, obj3, (lj) obj2, (byte) 0);
        }
    }
}
