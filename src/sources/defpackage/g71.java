package defpackage;

import androidx.work.CoroutineWorker;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g71 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ CoroutineWorker i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g71(CoroutineWorker coroutineWorker, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = coroutineWorker;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                ((g71) n(q51Var, b71Var)).q(dn8Var);
                return dn8Var;
            default:
                return ((g71) n(q51Var, b71Var)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        CoroutineWorker coroutineWorker = this.i0;
        switch (b) {
            case 0:
                return new g71(coroutineWorker, q51Var, (byte) 0);
            default:
                return new g71(coroutineWorker, q51Var, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        switch (this.g0) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    this.h0 = true;
                    bt.i("Not implemented");
                } else {
                    if (z) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                this.h0 = true;
                Object objE = this.i0.e(this);
                c71 c71Var = c71.X;
                return objE == c71Var ? c71Var : objE;
        }
    }
}
