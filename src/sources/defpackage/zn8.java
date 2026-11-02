package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zn8 extends cw0 {
    public final /* synthetic */ byte f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn8(Unsafe unsafe, byte b) {
        super(unsafe);
        this.f0 = b;
    }

    @Override // defpackage.cw0
    public final void A0(Object obj, long j, float f) {
        switch (this.f0) {
            case 0:
                ((Unsafe) this.X).putInt(obj, j, Float.floatToIntBits(f));
                break;
            case 1:
                ((Unsafe) this.X).putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                ((Unsafe) this.X).putFloat(obj, j, f);
                break;
        }
    }

    @Override // defpackage.cw0
    public boolean D0() {
        switch (this.f0) {
            case 2:
                if (!super.D0()) {
                    return false;
                }
                try {
                    Class<?> cls = ((Unsafe) this.X).getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    ao8.i(th);
                    return false;
                }
            default:
                return super.D0();
        }
    }

    @Override // defpackage.cw0
    public final boolean E0() {
        switch (this.f0) {
            case 0:
            case 1:
                return false;
            default:
                Unsafe unsafe = (Unsafe) this.X;
                if (unsafe == null) {
                    return false;
                }
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (ao8.c() == null) {
                        return false;
                    }
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        ao8.i(th);
                        return false;
                    }
                } catch (Throwable th2) {
                    ao8.i(th2);
                    return false;
                }
        }
    }

    @Override // defpackage.cw0
    public final boolean s0(long j, Object obj) {
        switch (this.f0) {
            case 0:
                if (ao8.g) {
                    return ao8.e(j, obj);
                }
                return ((byte) ((ao8.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            case 1:
                if (ao8.g) {
                    return ao8.e(j, obj);
                }
                return ((byte) ((ao8.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            default:
                return ((Unsafe) this.X).getBoolean(obj, j);
        }
    }

    @Override // defpackage.cw0
    public final double t0(long j, Object obj) {
        switch (this.f0) {
            case 0:
                return Double.longBitsToDouble(((Unsafe) this.X).getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(((Unsafe) this.X).getLong(obj, j));
            default:
                return ((Unsafe) this.X).getDouble(obj, j);
        }
    }

    @Override // defpackage.cw0
    public final float u0(long j, Object obj) {
        switch (this.f0) {
            case 0:
                return Float.intBitsToFloat(((Unsafe) this.X).getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(((Unsafe) this.X).getInt(obj, j));
            default:
                return ((Unsafe) this.X).getFloat(obj, j);
        }
    }

    @Override // defpackage.cw0
    public final void x0(Object obj, long j, boolean z) {
        switch (this.f0) {
            case 0:
                if (!ao8.g) {
                    ao8.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    ao8.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            case 1:
                if (!ao8.g) {
                    ao8.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    ao8.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                ((Unsafe) this.X).putBoolean(obj, j, z);
                break;
        }
    }

    @Override // defpackage.cw0
    public final void y0(Object obj, long j, byte b) {
        switch (this.f0) {
            case 0:
                if (!ao8.g) {
                    ao8.l(obj, j, b);
                } else {
                    ao8.k(obj, j, b);
                }
                break;
            case 1:
                if (!ao8.g) {
                    ao8.l(obj, j, b);
                } else {
                    ao8.k(obj, j, b);
                }
                break;
            default:
                ((Unsafe) this.X).putByte(obj, j, b);
                break;
        }
    }

    @Override // defpackage.cw0
    public final void z0(Object obj, long j, double d) {
        switch (this.f0) {
            case 0:
                ((Unsafe) this.X).putLong(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                ((Unsafe) this.X).putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                ((Unsafe) this.X).putDouble(obj, j, d);
                break;
        }
    }
}
