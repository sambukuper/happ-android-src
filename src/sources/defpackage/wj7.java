package defpackage;

import com.tencent.mmkv.MMKV;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wj7 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ xj7 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj7(xj7 xj7Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = xj7Var;
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
        return ((wj7) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        xj7 xj7Var = this.i0;
        switch (b) {
            case 0:
                return new wj7(xj7Var, q51Var, (byte) 0);
            default:
                return new wj7(xj7Var, q51Var, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        xj7 xj7Var = this.i0;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    ((mn6) xj7Var.b.getValue()).c();
                    qc2 qc2Var = (qc2) xj7Var.a.getValue();
                    this.h0 = true;
                    if (qc2Var.b(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                ((kf4) xj7Var.c.getValue()).i();
                kw4 kw4Var = kw4.a;
                kw4.l().clearAll();
                return dn8Var;
            default:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    ((mn6) xj7Var.b.getValue()).c();
                    qc2 qc2Var2 = (qc2) xj7Var.a.getValue();
                    this.h0 = true;
                    if (qc2Var2.b(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                ((kf4) xj7Var.c.getValue()).i();
                da2.R((File) xj7Var.d.getValue());
                kw4 kw4Var2 = kw4.a;
                kw4.h().clearAll();
                kw4.m().clearAll();
                kw4.j().clearAll();
                ((MMKV) kw4.d.getValue()).clearAll();
                kw4.i().clearAll();
                kw4.l().clearAll();
                Object value = kw4.h.getValue();
                value.getClass();
                ((MMKV) value).clearAll();
                return dn8Var;
        }
    }
}
