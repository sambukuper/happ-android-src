package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bj extends g24 implements rn2 {
    public static final bj Z;
    public static final bj f0;
    public final /* synthetic */ byte Y;

    static {
        int i = 2;
        Z = new bj((byte) 0, i);
        f0 = new bj((byte) 1, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj(byte b, int i) {
        super(i);
        this.Y = b;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        switch (this.Y) {
            case 0:
                long j = ((pf3) obj).a;
                long j2 = ((pf3) obj2).a;
                Map map = iz8.a;
                return wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1);
            default:
                r12 r12Var = (r12) obj2;
                return Boolean.valueOf(((r12) obj) == r12Var && r12Var == r12.Z);
        }
    }
}
