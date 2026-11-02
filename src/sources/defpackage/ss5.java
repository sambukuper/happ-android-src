package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ss5 extends cq2 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final ss5 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile ji5 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ss5 ss5Var = new ss5();
        DEFAULT_INSTANCE = ss5Var;
        cq2.j(ss5.class, ss5Var);
    }

    public static ss5 n() {
        return DEFAULT_INSTANCE;
    }

    public static rs5 v() {
        return (rs5) ((vp2) DEFAULT_INSTANCE.c(5));
    }

    public final void A(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void B(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void C(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void D(qs5 qs5Var) {
        this.value_ = qs5Var;
        this.valueCase_ = 6;
    }

    @Override // defpackage.cq2
    public final Object c(int i) {
        ji5 wp2Var;
        switch (p61.B(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new p66(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", qs5.class});
            case 3:
                return new ss5();
            case 4:
                return new rs5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ji5 ji5Var = PARSER;
                if (ji5Var != null) {
                    return ji5Var;
                }
                synchronized (ss5.class) {
                    try {
                        wp2Var = PARSER;
                        if (wp2Var == null) {
                            wp2Var = new wp2();
                            PARSER = wp2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return wp2Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean l() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final hb0 m() {
        return this.valueCase_ == 8 ? (hb0) this.value_ : hb0.Z;
    }

    public final double o() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float p() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int q() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long r() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String s() {
        return this.valueCase_ == 5 ? (String) this.value_ : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public final qs5 t() {
        return this.valueCase_ == 6 ? (qs5) this.value_ : qs5.m();
    }

    public final int u() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final void w(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final void x(hb0 hb0Var) {
        this.valueCase_ = 8;
        this.value_ = hb0Var;
    }

    public final void y(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void z(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }
}
