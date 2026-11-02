package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rf0 extends uy7 implements gn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf0(Object obj, q51 q51Var, byte b) {
        super(1, q51Var);
        this.g0 = b;
        this.i0 = obj;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        q51 q51Var = (q51) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((rf0) m(q51Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        byte b = this.g0;
        Object obj = this.i0;
        switch (b) {
            case 0:
                return new rf0((qf0) obj, q51Var, (byte) 0);
            case 1:
                return new rf0((b87) obj, q51Var, (byte) 1);
            case 2:
                return new rf0((fb1) obj, q51Var, (byte) 2);
            case 3:
                return new rf0((jc8) obj, q51Var, (byte) 3);
            default:
                return new rf0((wq8) obj, q51Var, (byte) 4);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.i0;
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
                this.h0 = true;
                Object objH = ((qf0) obj2).l.h(this);
                if (objH != c71Var) {
                    objH = dn8Var;
                }
                return objH == c71Var ? c71Var : dn8Var;
            case 1:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    b87 b87Var = (b87) obj2;
                    this.h0 = true;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) b87Var.e.getValue()).edit();
                    Set set = b87Var.f;
                    if (set == null) {
                        editorEdit.clear();
                    } else {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                    }
                    if (editorEdit.commit()) {
                        if (((SharedPreferences) b87Var.e.getValue()).getAll().isEmpty()) {
                            b87Var.c.deleteSharedPreferences(b87Var.d);
                        }
                        if (set != null) {
                            set.clear();
                        }
                        return dn8Var == c71Var ? c71Var : dn8Var;
                    }
                    u52.s("Unable to delete migrated keys from SharedPreferences.");
                } else {
                    if (z2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 2:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    this.h0 = true;
                    Object objB = ((fb1) obj2).B(this);
                    return objB == c71Var ? c71Var : objB;
                }
                if (z3) {
                    w39.n0(obj);
                    return obj;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
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
                jc8 jc8Var = (jc8) obj2;
                this.h0 = true;
                mm0 mm0Var = new mm0(1, mb6.H(this));
                mm0Var.s();
                jc8Var.c.c.setValue(Boolean.TRUE);
                jc8Var.d = mm0Var;
                return mm0Var.q() == c71Var ? c71Var : dn8Var;
            default:
                boolean z5 = this.h0;
                try {
                    if (!z5) {
                        w39.n0(obj);
                        hi5.i0("CXCP");
                        qi0 qi0VarA = ((wq8) obj2).c.a();
                        this.h0 = true;
                        obj = qi0VarA.k(this);
                        if (obj == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (!z5) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w39.n0(obj);
                    }
                    AutoCloseable autoCloseable = (AutoCloseable) obj;
                    try {
                        ux0 ux0VarK = ((ti0) autoCloseable).k();
                        u15.h(autoCloseable, null);
                        return ux0VarK;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u15.h(autoCloseable, th);
                            throw th2;
                        }
                    }
                } catch (CancellationException unused) {
                    hi5.i0("CXCP");
                    return wq8.l;
                }
        }
    }
}
