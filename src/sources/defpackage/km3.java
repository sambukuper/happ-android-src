package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class km3 implements bb3 {
    public static final /* synthetic */ long Y;
    public static final /* synthetic */ long Z;
    public static final /* synthetic */ long f0;
    public final k55 X;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    static {
        Unsafe unsafe = iu.a;
        Z = unsafe.objectFieldOffset(km3.class.getDeclaredField("_isCompleting$volatile"));
        f0 = unsafe.objectFieldOffset(km3.class.getDeclaredField("_rootCause$volatile"));
        Y = unsafe.objectFieldOffset(km3.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public km3(k55 k55Var, Throwable th) {
        this.X = k55Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thB = b();
        if (thB == null) {
            iu.a.putObjectVolatile(this, f0, th);
            return;
        }
        if (th == thB) {
            return;
        }
        Unsafe unsafe = iu.a;
        long j = Y;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                b61.o(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    public final Throwable b() {
        return (Throwable) iu.a.getObjectVolatile(this, f0);
    }

    public final boolean c() {
        return b() != null;
    }

    public final boolean d() {
        return iu.a.getIntVolatile(this, Z) == 1;
    }

    public final ArrayList e(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = iu.a;
        long j = Y;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                b61.o(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable thB = b();
        if (thB != null) {
            arrayList.add(0, thB);
        }
        if (th != null && !th.equals(thB)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, sm3.e);
        return arrayList;
    }

    @Override // defpackage.bb3
    public final boolean k() {
        return b() == null;
    }

    @Override // defpackage.bb3
    public final k55 l() {
        return this.X;
    }

    public final String toString() {
        return "Finishing[cancelling=" + c() + ", completing=" + d() + ", rootCause=" + b() + ", exceptions=" + iu.a.getObjectVolatile(this, Y) + ", list=" + this.X + ']';
    }
}
