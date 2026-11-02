package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {
    public final String a(ld4 ld4Var) {
        StringBuilder sb = new StringBuilder();
        b().b.a(d(ld4Var), sb, false);
        return sb.toString();
    }

    public abstract sc0 b();

    public h61 c() {
        return gd4.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h61 d(ld4 ld4Var) {
        cb3 cb3Var = new cb3();
        cb3Var.b((dd4) ld4Var);
        return cb3Var;
    }

    public final Object e(String str) {
        String str2;
        try {
            li5 li5Var = b().c;
            li5Var.getClass();
            try {
                return f(oc.w(li5Var, str, c()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str2 = "The value parsed from '" + ((Object) str) + "' is invalid";
                } else {
                    str2 = message + " (when parsing '" + ((Object) str) + "')";
                }
                throw new dc1(str2, e);
            }
        } catch (gi5 e2) {
            throw new dc1("Failed to parse value from '" + ((Object) str) + '\'', e2);
        }
    }

    public Object f(h61 h61Var) {
        cb3 cb3Var = (cb3) h61Var;
        cb3Var.getClass();
        return cb3Var.c();
    }
}
