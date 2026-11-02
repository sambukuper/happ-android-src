package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oh7 extends a3 implements xe2, wo2, mh7, w05 {
    public static final /* synthetic */ long h0 = iu.a.objectFieldOffset(oh7.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int g0;

    public oh7(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d9 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006d, B:30:0x0077, B:33:0x007e, B:34:0x0082, B:36:0x0085, B:46:0x00a6, B:49:0x00b6, B:50:0x00d2, B:56:0x00e2, B:53:0x00d9, B:55:0x00df, B:38:0x008b, B:42:0x0092, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00d2->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b5 -> B:28:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.xe2
    public final java.lang.Object a(defpackage.ze2 r14, defpackage.q51 r15) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh7.a(ze2, q51):java.lang.Object");
    }

    @Override // defpackage.wo2
    public final xe2 b(s61 s61Var, int i, l90 l90Var) {
        return (((i < 0 || i >= 2) && i != -2) || l90Var != l90.Y) ? v77.c(this, s61Var, i, l90Var) : this;
    }

    @Override // defpackage.w05
    public final void e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.a3
    public final b3 f() {
        return new qh7();
    }

    @Override // defpackage.w05
    public final boolean g(Object obj) {
        m(obj);
        return true;
    }

    @Override // defpackage.mh7
    public final Object getValue() {
        Object objectVolatile = iu.a.getObjectVolatile(this, h0);
        if (objectVolatile == d75.a) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.a3
    public final b3[] h() {
        return new qh7[2];
    }

    public final boolean k(Object obj, Object obj2) {
        z31 z31Var = d75.a;
        if (obj == null) {
            obj = z31Var;
        }
        if (obj2 == null) {
            obj2 = z31Var;
        }
        return n(obj, obj2);
    }

    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        m(obj);
        return dn8.a;
    }

    public final void m(Object obj) {
        if (obj == null) {
            obj = d75.a;
        }
        n(null, obj);
    }

    public final boolean n(Object obj, Object obj2) {
        int i;
        b3[] b3VarArr;
        z31 z31Var;
        synchronized (this) {
            Unsafe unsafe = iu.a;
            long j = h0;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !dh3.f(objectVolatile, obj)) {
                return false;
            }
            if (dh3.f(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.g0;
            if ((i2 & 1) != 0) {
                this.g0 = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.g0 = i3;
            b3[] b3VarArr2 = this.X;
            while (true) {
                qh7[] qh7VarArr = (qh7[]) b3VarArr2;
                if (qh7VarArr != null) {
                    for (qh7 qh7Var : qh7VarArr) {
                        if (qh7Var != null) {
                            AtomicReference atomicReference = qh7Var.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 == null || obj3 == (z31Var = ph7.b)) {
                                    break;
                                }
                                z31 z31Var2 = ph7.a;
                                if (obj3 != z31Var2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, z31Var2)) {
                                            ((mm0) obj3).f(dn8.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj3, z31Var)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj3);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.g0;
                    if (i == i3) {
                        this.g0 = i3 + 1;
                        return true;
                    }
                    b3VarArr = this.X;
                }
                b3VarArr2 = b3VarArr;
                i3 = i;
            }
        }
    }
}
