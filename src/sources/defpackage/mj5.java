package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mj5 {
    public final r01 a;
    public final m01 b;
    public final lp2 c;
    public final rn2 d;
    public final boolean e;
    public final ml8 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(oj5.Z);
    public long i = ry7.f();
    public t05 j;
    public final p91 k;
    public final q86 l;

    public mj5(r01 r01Var, m01 m01Var, lp2 lp2Var, v05 v05Var, rn2 rn2Var, boolean z, ml8 ml8Var, Object obj) {
        this.a = r01Var;
        this.b = m01Var;
        this.c = lp2Var;
        this.d = rn2Var;
        this.e = z;
        this.f = ml8Var;
        this.g = obj;
        t05 t05Var = vw6.a;
        t05Var.getClass();
        this.j = t05Var;
        p91 p91Var = new p91((byte) 2);
        p91Var.l(v05Var, lp2Var.y());
        this.k = p91Var;
        this.l = new q86(ml8Var.Z);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((oj5) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    oj5 oj5Var = oj5.h0;
                    oj5 oj5Var2 = oj5.i0;
                    while (!atomicReference.compareAndSet(oj5Var, oj5Var2)) {
                        if (atomicReference.get() != oj5Var) {
                            wr5.b("Unexpected state change from: " + oj5Var + " to: " + oj5Var2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new b55();
            }
        } catch (Exception e) {
            atomicReference.set(oj5.X);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.d();
                    this.k.e();
                    this.k.c();
                    this.a.s0 = null;
                } catch (Throwable th) {
                    this.k.c();
                    this.a.s0 = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((oj5) this.h.get()).compareTo(oj5.h0) >= 0;
    }

    public final void d() {
        AtomicReference atomicReference;
        oj5 oj5Var;
        oj5 oj5Var2;
        do {
            atomicReference = this.h;
            oj5Var = oj5.f0;
            oj5Var2 = oj5.h0;
            if (atomicReference.compareAndSet(oj5Var, oj5Var2)) {
                return;
            }
        } while (atomicReference.get() == oj5Var);
        wr5.b("Unexpected state change from: " + oj5Var + " to: " + oj5Var2 + ".");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:1: B:25:0x007b->B:85:?, LOOP_END, SYNTHETIC] */
    public final boolean e(u87 u87Var) throws Exception {
        long j;
        oj5 oj5Var = oj5.g0;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((oj5) atomicReference.get()).ordinal();
            oj5 oj5Var2 = oj5.f0;
            r01 r01Var = this.a;
            m01 m01Var = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    lp2 lp2Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        lp2Var.z = 0;
                        lp2Var.y = true;
                    }
                    this.j = m01Var.b(r01Var, u87Var, this.d);
                    if (z) {
                        if (lp2Var.F || lp2Var.z != 0) {
                            wr5.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        lp2Var.z = -1;
                        lp2Var.y = false;
                    }
                    oj5 oj5Var3 = oj5.Z;
                    while (!atomicReference.compareAndSet(oj5Var3, oj5Var2)) {
                        if (atomicReference.get() != oj5Var3) {
                            wr5.b("Unexpected state change from: " + oj5Var3 + " to: " + oj5Var2 + ".");
                            if (this.j.g()) {
                                d();
                            }
                            return c();
                        }
                    }
                    if (this.j.g()) {
                        d();
                    }
                    return c();
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(oj5Var2, oj5Var)) {
                            if (atomicReference.get() != oj5Var2) {
                                wr5.b("Unexpected state change from: " + oj5Var2 + " to: " + oj5Var + ".");
                                j = this.i;
                                this.i = ry7.f();
                                this.j = m01Var.n(r01Var, u87Var, this.j);
                                this.i = j;
                                while (!atomicReference.compareAndSet(oj5Var, oj5Var2)) {
                                    if (atomicReference.get() != oj5Var) {
                                        wr5.b("Unexpected state change from: " + oj5Var + " to: " + oj5Var2 + ".");
                                        if (this.j.g()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = ry7.f();
                        this.j = m01Var.n(r01Var, u87Var, this.j);
                        this.i = j;
                        while (!atomicReference.compareAndSet(oj5Var, oj5Var2)) {
                            if (atomicReference.get() != oj5Var) {
                                wr5.b("Unexpected state change from: " + oj5Var + " to: " + oj5Var2 + ".");
                                if (this.j.g()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (!atomicReference.compareAndSet(oj5Var, oj5Var2)) {
                            if (atomicReference.get() != oj5Var) {
                                wr5.b("Unexpected state change from: " + oj5Var + " to: " + oj5Var2 + ".");
                                throw th;
                            }
                        }
                        throw th;
                    }
                    j = this.i;
                case 4:
                    d01.b("Recursive call to resume()");
                    throw new o14();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new b55();
            }
        } catch (Exception e) {
            atomicReference.set(oj5.X);
            throw e;
        }
    }
}
