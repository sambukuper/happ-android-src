package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m7 {
    public final s6 a;

    public m7(s6 s6Var) {
        this.a = s6Var;
    }

    public final b4 a(io.sentry.internal.debugmeta.c cVar) {
        Double d = (Double) cVar.Z;
        n7 n7Var = (n7) cVar.Y;
        b4 b4Var = n7Var.f0;
        if (b4Var != null) {
            return io.sentry.util.b.b(b4Var);
        }
        s6 s6Var = this.a;
        s6Var.getProfilesSampler();
        Double profilesSampleRate = s6Var.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d.doubleValue());
        s6Var.getTracesSampler();
        b4 b4Var2 = n7Var.t0;
        if (b4Var2 != null) {
            return io.sentry.util.b.b(b4Var2);
        }
        Double tracesSampleRate = s6Var.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, s6Var.getBackpressureMonitor().a()));
        if (dValueOf != null) {
            return new b4(Boolean.valueOf(dValueOf.doubleValue() >= d.doubleValue()), dValueOf, d, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new b4(bool, (Double) null, d, bool, (Double) null);
    }

    public final boolean b(double d) {
        Double profileSessionSampleRate = this.a.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= d;
    }
}
