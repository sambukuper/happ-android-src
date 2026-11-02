package defpackage;

import su.happ.proxyutility.domain.sub.SubId;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w81 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ gn2 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w81(q51 q51Var, gn2 gn2Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = gn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((w81) n((q51) obj2, (vq5) obj)).q(dn8Var);
            case 1:
                return ((w81) n((q51) obj2, (vq5) obj)).q(dn8Var);
            case 2:
                ((w81) n((q51) obj2, (o05) obj)).q(dn8Var);
                return dn8Var;
            default:
                ((w81) n((q51) obj2, (lq6) obj)).q(dn8Var);
                return dn8Var;
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        gn2 gn2Var = this.i0;
        switch (b) {
            case 0:
                w81 w81Var = new w81(q51Var, gn2Var, (byte) 0);
                w81Var.h0 = obj;
                return w81Var;
            case 1:
                w81 w81Var2 = new w81(q51Var, gn2Var, (byte) 1);
                w81Var2.h0 = obj;
                return w81Var2;
            case 2:
                w81 w81Var3 = new w81(gn2Var, q51Var, (byte) 2);
                w81Var3.h0 = obj;
                return w81Var3;
            default:
                w81 w81Var4 = new w81(gn2Var, q51Var, (byte) 3);
                w81Var4.h0 = obj;
                return w81Var4;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        gn2 gn2Var = this.i0;
        switch (b) {
            case 0:
                w39.n0(obj);
                vq5 vq5Var = (vq5) this.h0;
                vq5Var.getClass();
                return gn2Var.B(vq5Var.b());
            case 1:
                w39.n0(obj);
                vq5 vq5Var2 = (vq5) this.h0;
                vq5Var2.getClass();
                return gn2Var.B(vq5Var2.b());
            case 2:
                w39.n0(obj);
                gn2Var.B((o05) this.h0);
                return dn8Var;
            default:
                lq6 lq6Var = (lq6) this.h0;
                w39.n0(obj);
                if (lq6Var != null) {
                    gn2Var.B(new SubId(lq6Var.a));
                    return dn8Var;
                }
                b61.c();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w81(gn2 gn2Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = gn2Var;
    }
}
