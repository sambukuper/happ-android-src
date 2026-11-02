package io.sentry;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 {
    public final Serializable a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public b4(Boolean bool, Double d, Double d2, Boolean bool2, Double d3) {
        this.a = bool;
        this.b = d;
        this.c = d2;
        this.d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.e = d3;
    }

    public static b4 a(y6 y6Var, c cVar, s6 s6Var) {
        if (s6Var != null) {
            String effectiveOrgId = s6Var.getEffectiveOrgId();
            String strB = cVar.b("sentry-org_id");
            String strTrim = (strB == null || strB.trim().isEmpty()) ? null : strB.trim();
            if ((effectiveOrgId != null && strTrim != null && !effectiveOrgId.equals(strTrim)) || (s6Var.isStrictTraceContinuation() && ((effectiveOrgId != null || strTrim != null) && (effectiveOrgId == null || !effectiveOrgId.equals(strTrim))))) {
                s6Var.getLogger().h(s5.DEBUG, "Not continuing trace due to strict org ID validation failure.", new Object[0]);
                return new b4();
            }
        }
        return new b4(y6Var.a, new h7(), y6Var.b, cVar, y6Var.c);
    }

    public b4(Boolean bool, Double d, Double d2) {
        this(bool, d, d2, Boolean.FALSE, (Double) null);
    }

    public b4(Boolean bool, Double d) {
        this(bool, d, (Double) null, Boolean.FALSE, (Double) null);
    }

    public b4() {
        this(new io.sentry.protocol.w(), new h7(), (h7) null, (c) null, (Boolean) null);
    }

    public b4(io.sentry.protocol.w wVar, h7 h7Var, h7 h7Var2, c cVar, Boolean bool) {
        this.b = wVar;
        this.c = h7Var;
        this.d = h7Var2;
        this.e = io.sentry.util.b.h(cVar, bool, null, null);
        this.a = bool;
    }

    public b4(b4 b4Var) {
        this((io.sentry.protocol.w) b4Var.b, (h7) b4Var.c, (h7) b4Var.d, (c) b4Var.e, (Boolean) b4Var.a);
    }

    public b4(io.sentry.android.core.b0 b0Var) {
        this.b = b0Var;
        this.c = null;
        this.d = null;
        this.a = null;
        this.e = null;
    }

    public b4(io.sentry.android.core.b0 b0Var, byte[] bArr) {
        this.b = b0Var;
        this.c = bArr;
        this.d = null;
        this.a = null;
        this.e = null;
    }

    public b4(io.sentry.android.core.b0 b0Var, byte[] bArr, ArrayList arrayList, ArrayList arrayList2, io.sentry.protocol.c cVar) {
        this.b = b0Var;
        this.c = bArr;
        this.d = arrayList;
        this.a = arrayList2;
        this.e = cVar;
    }
}
