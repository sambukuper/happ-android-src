package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n7 extends f7 {
    public static final io.sentry.protocol.h0 u0 = io.sentry.protocol.h0.CUSTOM;
    public String r0;
    public io.sentry.protocol.h0 s0;
    public final b4 t0;

    public n7(String str, io.sentry.protocol.h0 h0Var, String str2, b4 b4Var) {
        super(new io.sentry.protocol.w(), new h7(), str2, null);
        this.r0 = str;
        this.s0 = h0Var;
        a(b4Var);
        this.o0 = io.sentry.util.b.h(null, b4Var == null ? null : (Boolean) b4Var.a, b4Var == null ? null : (Double) b4Var.b, b4Var == null ? null : (Double) b4Var.c);
    }

    public static n7 b(b4 b4Var) {
        b4 b4Var2;
        Boolean bool = (Boolean) b4Var.a;
        c cVar = (c) b4Var.e;
        Double d = cVar.c;
        if (bool == null) {
            b4Var2 = null;
        } else {
            Double d2 = cVar.d;
            b4Var2 = new b4(bool, d, Double.valueOf(d2 == null ? 0.0d : d2.doubleValue()));
        }
        return new n7((io.sentry.protocol.w) b4Var.b, (h7) b4Var.c, (h7) b4Var.d, b4Var2, cVar);
    }

    public n7(io.sentry.protocol.w wVar, h7 h7Var, h7 h7Var2, b4 b4Var, c cVar) {
        super(wVar, h7Var, "default", h7Var2);
        this.r0 = "<unlabeled transaction>";
        this.t0 = b4Var;
        this.s0 = u0;
        this.o0 = io.sentry.util.b.h(cVar, b4Var == null ? null : (Boolean) b4Var.a, b4Var == null ? null : (Double) b4Var.b, b4Var != null ? (Double) b4Var.c : null);
    }
}
