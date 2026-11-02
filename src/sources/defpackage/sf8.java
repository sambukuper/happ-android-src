package defpackage;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sf8 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public byte h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ xf8 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sf8(xf8 xf8Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = xf8Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        ed8 ed8Var = (ed8) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((sf8) n(q51Var, ed8Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        xf8 xf8Var = this.j0;
        switch (b) {
            case 0:
                sf8 sf8Var = new sf8(xf8Var, q51Var, (byte) 0);
                sf8Var.i0 = obj;
                return sf8Var;
            default:
                sf8 sf8Var2 = new sf8(xf8Var, q51Var, (byte) 1);
                sf8Var2.i0 = obj;
                return sf8Var2;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        ed8 ed8Var;
        Object objC;
        Object objA;
        ed8 ed8Var2;
        Object objC2;
        s85[] s85VarArr;
        s85 s85Var;
        byte b = this.g0;
        dd8 dd8Var = dd8.Y;
        c71 c71Var = c71.X;
        boolean z = true;
        xf8 xf8Var = this.j0;
        q51 q51Var = null;
        switch (b) {
            case 0:
                byte b2 = this.h0;
                try {
                    if (b2 != 0) {
                        if (b2 == 1) {
                            ed8Var = (ed8) this.i0;
                            w39.n0(obj);
                            objC = obj;
                        } else {
                            if (b2 != 2) {
                                bt.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            w39.n0(obj);
                            objA = obj;
                        }
                        return (Set) objA;
                    }
                    w39.n0(obj);
                    ed8Var = (ed8) this.i0;
                    this.i0 = ed8Var;
                    this.h0 = (byte) 1;
                    objC = ed8Var.c(this);
                    if (objC == c71Var) {
                        return c71Var;
                    }
                    if (!((Boolean) objC).booleanValue()) {
                        t17 t17Var = new t17(xf8Var, q51Var, (byte) 15);
                        this.i0 = null;
                        this.h0 = (byte) 2;
                        objA = ed8Var.a(dd8Var, t17Var, this);
                        if (objA == c71Var) {
                            return c71Var;
                        }
                        return (Set) objA;
                    }
                } catch (SQLException unused) {
                }
                return m02.X;
            default:
                byte b3 = this.h0;
                dn8 dn8Var = dn8.a;
                if (b3 != 0) {
                    if (b3 == 1) {
                        ed8Var2 = (ed8) this.i0;
                        w39.n0(obj);
                        objC2 = obj;
                    } else {
                        if (b3 != 2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    return dn8Var;
                }
                w39.n0(obj);
                ed8Var2 = (ed8) this.i0;
                this.i0 = ed8Var2;
                this.h0 = (byte) 1;
                objC2 = ed8Var2.c(this);
                if (objC2 == c71Var) {
                    return c71Var;
                }
                if (!((Boolean) objC2).booleanValue()) {
                    sa2 sa2Var = xf8Var.h;
                    long[] jArr = (long[]) sa2Var.c;
                    ReentrantLock reentrantLock = (ReentrantLock) sa2Var.a;
                    reentrantLock.lock();
                    try {
                        if (sa2Var.b) {
                            boolean z2 = false;
                            sa2Var.b = false;
                            int length = jArr.length;
                            s85VarArr = new s85[length];
                            int i = 0;
                            boolean z3 = false;
                            while (i < length) {
                                if (jArr[i] > 0) {
                                    z2 = z;
                                }
                                boolean[] zArr = (boolean[]) sa2Var.d;
                                if (z2 != zArr[i]) {
                                    zArr[i] = z2;
                                    s85Var = z2 ? s85.Y : s85.Z;
                                    z3 = true;
                                } else {
                                    s85Var = s85.X;
                                }
                                s85VarArr[i] = s85Var;
                                i++;
                                z = true;
                                z2 = false;
                            }
                            if (!z3) {
                                s85VarArr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            s85VarArr = null;
                        }
                        if (s85VarArr != null) {
                            wf8 wf8Var = new wf8(s85VarArr, xf8Var, ed8Var2, null);
                            this.i0 = null;
                            this.h0 = (byte) 2;
                            if (ed8Var2.a(dd8Var, wf8Var, this) == c71Var) {
                                return c71Var;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return dn8Var;
        }
    }
}
