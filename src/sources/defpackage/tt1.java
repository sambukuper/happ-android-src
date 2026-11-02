package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tt1 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ xz4 i0;
    public final /* synthetic */ y05 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt1(xz4 xz4Var, y05 y05Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = xz4Var;
        this.j0 = y05Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((tt1) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new tt1(this.i0, this.j0, q51Var, (byte) 0);
            case 1:
                return new tt1(this.i0, this.j0, q51Var, (byte) 1);
            case 2:
                return new tt1(this.i0, this.j0, q51Var, (byte) 2);
            default:
                return new tt1(this.i0, this.j0, q51Var, (byte) 3);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        byte b = this.g0;
        y05 y05Var = this.j0;
        xz4 xz4Var = this.i0;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ArrayList arrayList = new ArrayList();
                u77 u77Var = xz4Var.a;
                st1 st1Var = new st1(arrayList, y05Var, (byte) 0);
                this.h0 = true;
                u77Var.a(st1Var, this);
                return c71Var;
            case 1:
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ArrayList arrayList2 = new ArrayList();
                u77 u77Var2 = xz4Var.a;
                st1 st1Var2 = new st1(arrayList2, y05Var, (byte) 1);
                this.h0 = true;
                u77Var2.a(st1Var2, this);
                return c71Var;
            case 2:
                boolean z3 = this.h0;
                if (z3) {
                    if (z3) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ArrayList arrayList3 = new ArrayList();
                u77 u77Var3 = xz4Var.a;
                st1 st1Var3 = new st1(arrayList3, y05Var, (byte) 2);
                this.h0 = true;
                u77Var3.a(st1Var3, this);
                return c71Var;
            default:
                boolean z4 = this.h0;
                if (z4) {
                    if (z4) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                ArrayList arrayList4 = new ArrayList();
                u77 u77Var4 = xz4Var.a;
                st1 st1Var4 = new st1(arrayList4, y05Var, (byte) 3);
                this.h0 = true;
                u77Var4.a(st1Var4, this);
                return c71Var;
        }
    }
}
