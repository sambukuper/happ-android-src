package defpackage;

import io.sentry.c2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qs5 extends cq2 {
    private static final qs5 DEFAULT_INSTANCE;
    private static volatile ji5 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private cg3 strings_ = m06.f0;

    static {
        qs5 qs5Var = new qs5();
        DEFAULT_INSTANCE = qs5Var;
        cq2.j(qs5.class, qs5Var);
    }

    public static qs5 m() {
        return DEFAULT_INSTANCE;
    }

    public static ps5 o() {
        return (ps5) ((vp2) DEFAULT_INSTANCE.c(5));
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
                return new p66(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new qs5();
            case 4:
                return new ps5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ji5 ji5Var = PARSER;
                if (ji5Var != null) {
                    return ji5Var;
                }
                synchronized (qs5.class) {
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

    public final void l(Iterable iterable) {
        cg3 cg3VarC = this.strings_;
        if (!((m06) cg3VarC).X) {
            m06 m06Var = (m06) cg3VarC;
            int i = m06Var.Z;
            cg3VarC = m06Var.c(i == 0 ? 10 : i * 2);
            this.strings_ = cg3VarC;
        }
        Charset charset = eg3.a;
        if (iterable instanceof u74) {
            ((u74) iterable).g();
            c2.m();
            return;
        }
        if (iterable instanceof au5) {
            ((m06) cg3VarC).addAll((Collection) iterable);
            return;
        }
        if ((cg3VarC instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) cg3VarC).ensureCapacity(((Collection) iterable).size() + ((m06) cg3VarC).Z);
        }
        m06 m06Var2 = (m06) cg3VarC;
        int i2 = m06Var2.Z;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (m06Var2.Z - i2) + " is null.";
                for (int i3 = m06Var2.Z - 1; i3 >= i2; i3--) {
                    m06Var2.remove(i3);
                }
                b61.i(str);
                return;
            }
            m06Var2.add(obj);
        }
    }

    public final cg3 n() {
        return this.strings_;
    }
}
