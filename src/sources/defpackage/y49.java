package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y49 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ a59 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y49(a59 a59Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = a59Var;
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
        }
        return ((y49) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        a59 a59Var = this.i0;
        switch (b) {
            case 0:
                return new y49(a59Var, q51Var, (byte) 0);
            default:
                return new y49(a59Var, q51Var, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        Object w49Var;
        byte b = this.g0;
        c71 c71Var = c71.X;
        a59 a59Var = this.i0;
        q51 q51Var = null;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    this.h0 = true;
                    Object objD = a59Var.d(this);
                    return objD == c71Var ? c71Var : objD;
                }
                if (z) {
                    w39.n0(obj);
                    return obj;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.h0;
                byte b2 = 0;
                try {
                    if (!z2) {
                        w39.n0(obj);
                        dm3 dm3Var = a59Var.l;
                        y49 y49Var = new y49(a59Var, q51Var, b2);
                        this.h0 = true;
                        obj = w51.W(dm3Var, y49Var, this);
                        if (obj == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (!z2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    w49Var = (x49) obj;
                    break;
                } catch (r49 e) {
                    w49Var = new v49(e.X);
                } catch (CancellationException unused) {
                    w49Var = new t49();
                } catch (Throwable unused2) {
                    int i = b59.a;
                    lh4.P0().getClass();
                    w49Var = new w49(false);
                }
                aa6 aa6Var = new aa6();
                a59Var.h.o(new j0(w49Var, (Object) aa6Var, (Object) a59Var, (byte) 18));
                return Boolean.valueOf(aa6Var.X);
        }
    }
}
