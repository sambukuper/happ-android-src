package defpackage;

import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l20 implements Serializable {
    public static final TimeZone j0 = DesugarTimeZone.getTimeZone("UTC");
    public final uh8 X;
    public final hi5 Y;
    public final fj3 Z;
    public final md0 f0;
    public final DateFormat g0;
    public final Locale h0;
    public final l10 i0;

    public l20(b30 b30Var, fj3 fj3Var, uh8 uh8Var, DateFormat dateFormat, Locale locale, l10 l10Var, md0 md0Var) {
        this.Y = b30Var;
        this.Z = fj3Var;
        this.X = uh8Var;
        this.g0 = dateFormat;
        this.h0 = locale;
        this.i0 = l10Var;
        this.f0 = md0Var;
    }
}
