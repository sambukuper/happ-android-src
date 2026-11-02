package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class os5 extends cq2 {
    private static final os5 DEFAULT_INSTANCE;
    private static volatile ji5 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private pp4 preferences_ = pp4.Y;

    static {
        os5 os5Var = new os5();
        DEFAULT_INSTANCE = os5Var;
        cq2.j(os5.class, os5Var);
    }

    public static ms5 n() {
        return (ms5) ((vp2) DEFAULT_INSTANCE.c(5));
    }

    public static os5 o(FileInputStream fileInputStream) {
        os5 os5Var = DEFAULT_INSTANCE;
        hv0 hv0Var = new hv0(fileInputStream);
        s62 s62VarA = s62.a();
        cq2 cq2VarI = os5Var.i();
        try {
            l06 l06Var = l06.c;
            l06Var.getClass();
            bx6 bx6VarA = l06Var.a(cq2VarI.getClass());
            kv0 kv0Var = (kv0) hv0Var.Y;
            if (kv0Var == null) {
                kv0Var = new kv0(hv0Var);
            }
            bx6VarA.e(cq2VarI, kv0Var, s62VarA);
            bx6VarA.b(cq2VarI);
            if (cq2.f(cq2VarI, true)) {
                return (os5) cq2VarI;
            }
            throw new qh3(new ym8().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof qh3) {
                throw ((qh3) e.getCause());
            }
            throw new qh3(e.getMessage(), e);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof qh3) {
                throw ((qh3) e2.getCause());
            }
            throw e2;
        } catch (qh3 e3) {
            if (e3.X) {
                throw new qh3(e3.getMessage(), e3);
            }
            throw e3;
        } catch (ym8 e4) {
            throw new qh3(e4.getMessage());
        }
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
                return new p66(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", ns5.a});
            case 3:
                return new os5();
            case 4:
                return new ms5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ji5 ji5Var = PARSER;
                if (ji5Var != null) {
                    return ji5Var;
                }
                synchronized (os5.class) {
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

    public final Map l() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public final pp4 m() {
        pp4 pp4Var = this.preferences_;
        if (pp4Var.X) {
            return pp4Var;
        }
        pp4 pp4VarB = pp4Var.b();
        this.preferences_ = pp4VarB;
        return pp4VarB;
    }
}
