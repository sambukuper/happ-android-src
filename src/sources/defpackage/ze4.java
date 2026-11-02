package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ze4 {
    public static final z31 e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = iu.a;
        f = unsafe.objectFieldOffset(ze4.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(ze4.class.getDeclaredField("_state$volatile"));
        e = new z31("REMOVE_FROZEN", (byte) 3);
    }

    public ze4(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            bt.i("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        bt.i("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        ze4 ze4Var = this;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(ze4Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = ze4Var.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = ze4Var.b;
            AtomicReferenceArray atomicReferenceArray = ze4Var.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(ze4Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    ze4 ze4VarC = this;
                    while ((iu.a.getLongVolatile(ze4VarC, j) & 1152921504606846976L) != 0) {
                        ze4VarC = ze4VarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = ze4VarC.d;
                        int i4 = ze4VarC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof ye4) && ((ye4) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            ze4VarC = null;
                        }
                        if (ze4VarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                ze4Var = this;
            } else {
                int i5 = ze4Var.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = iu.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            ze4 ze4Var = this;
            if (iu.a.compareAndSwapLong(ze4Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = ze4Var;
        }
    }

    public final ze4 c() {
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Unsafe unsafe2;
        do {
            unsafe = iu.a;
            j = g;
            longVolatile = unsafe.getLongVolatile(this, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j2 = longVolatile;
                break;
            }
            j2 = 1152921504606846976L | longVolatile;
        } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        while (true) {
            Unsafe unsafe3 = iu.a;
            long j3 = f;
            ze4 ze4Var = (ze4) unsafe3.getObjectVolatile(this, j3);
            if (ze4Var != null) {
                return ze4Var;
            }
            ze4 ze4Var2 = new ze4(this.a * 2, this.b);
            int i = (int) (1073741823 & j2);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object ye4Var = this.d.get(i4);
                if (ye4Var == null) {
                    ye4Var = new ye4(i);
                }
                ze4Var2.d.set(ze4Var2.c & i, ye4Var);
                i++;
            }
            iu.a.putLongVolatile(ze4Var2, g, j2 & (-1152921504606846977L));
            do {
                unsafe2 = iu.a;
                if (unsafe2.compareAndSwapObject(this, f, (Object) null, ze4Var2)) {
                    break;
                }
            } while (unsafe2.getObjectVolatile(this, j3) == null);
        }
    }

    public final Object d() {
        ze4 ze4VarC = this;
        while (true) {
            Unsafe unsafe = iu.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(ze4VarC, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return e;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = ze4VarC.c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = ze4VarC.d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = ze4VarC.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof ye4)) {
                    long j2 = (i + 1) & 1073741823;
                    if (unsafe.compareAndSwapLong(ze4VarC, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    ze4VarC = this;
                    if (z) {
                        while (true) {
                            Unsafe unsafe2 = iu.a;
                            long j3 = g;
                            long longVolatile2 = unsafe2.getLongVolatile(ze4VarC, j3);
                            int i5 = (int) (longVolatile2 & 1073741823);
                            if ((longVolatile2 & 1152921504606846976L) != 0) {
                                ze4VarC = ze4VarC.c();
                            } else {
                                if (unsafe2.compareAndSwapLong(ze4VarC, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                    ze4VarC.d.set(ze4VarC.c & i5, null);
                                    ze4VarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (ze4VarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
