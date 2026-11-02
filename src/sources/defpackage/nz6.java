package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import okhttp3.dnsoverhttps.DnsOverHttps;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nz6 extends i11 implements b65 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g0 = AtomicIntegerFieldUpdater.newUpdater(nz6.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long h0 = iu.a.objectFieldOffset(nz6.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long f0;

    public nz6(long j, nz6 nz6Var, int i) {
        super(nz6Var);
        this.f0 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.i11
    public final boolean d() {
        return iu.a.getIntVolatile(this, h0) == g() && c() != null;
    }

    public final boolean f() {
        return g0.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, s61 s61Var);

    public final void i() {
        if (g0.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = iu.a;
            long j = h0;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            nz6 nz6Var = this;
            if (unsafe.compareAndSwapInt(nz6Var, j, intVolatile, intVolatile + DnsOverHttps.MAX_RESPONSE_SIZE)) {
                return true;
            }
            this = nz6Var;
        }
    }
}
