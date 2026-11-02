package defpackage;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ec1 extends kb8 implements p51 {
    public final Boolean f0;
    public final DateFormat g0;
    public final AtomicReference h0;

    public ec1(Class cls, Boolean bool, DateFormat dateFormat) {
        super(cls, (byte) 2);
        this.f0 = bool;
        this.g0 = dateFormat;
        this.h0 = dateFormat == null ? null : new AtomicReference();
    }

    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        Class cls = this.X;
        no3 no3VarK = lj7.k(t37Var, d50Var, cls);
        l37 l37Var = t37Var.X;
        if (no3VarK != null) {
            String str = no3VarK.f0;
            Locale locale = no3VarK.Z;
            String str2 = no3VarK.X;
            mo3 mo3Var = no3VarK.Y;
            TimeZone timeZone = null;
            if (mo3Var.a()) {
                return t(Boolean.TRUE, null);
            }
            if (str2 != null && str2.length() > 0) {
                if (locale == null) {
                    locale = l37Var.Y.h0;
                }
                DateFormat simpleDateFormat = new SimpleDateFormat(str2, locale);
                if (no3VarK.b()) {
                    TimeZone timeZone2 = no3VarK.j0;
                    if (timeZone2 != null) {
                        timeZone = timeZone2;
                    } else if (str != null) {
                        timeZone = DesugarTimeZone.getTimeZone(str);
                        no3VarK.j0 = timeZone;
                    }
                } else {
                    l20 l20Var = l37Var.Y;
                    timeZone = l20.j0;
                }
                simpleDateFormat.setTimeZone(timeZone);
                return t(Boolean.FALSE, simpleDateFormat);
            }
            boolean z = locale != null;
            boolean zB = no3VarK.b();
            boolean z2 = mo3Var == mo3.g0;
            if (z || zB || z2) {
                DateFormat dateFormat = l37Var.Y.g0;
                if (dateFormat instanceof ej7) {
                    ej7 ej7Var = (ej7) dateFormat;
                    if (locale != null && !locale.equals(ej7Var.Y)) {
                        ej7Var = new ej7(ej7Var.X, locale, ej7Var.Z);
                    }
                    if (no3VarK.b()) {
                        TimeZone timeZone3 = no3VarK.j0;
                        if (timeZone3 != null) {
                            timeZone = timeZone3;
                        } else if (str != null) {
                            timeZone = DesugarTimeZone.getTimeZone(str);
                            no3VarK.j0 = timeZone;
                        }
                        if (timeZone == null) {
                            timeZone = ej7.k0;
                        }
                        TimeZone timeZone4 = ej7Var.X;
                        if (timeZone != timeZone4 && !timeZone.equals(timeZone4)) {
                            ej7Var = new ej7(timeZone, ej7Var.Y, ej7Var.Z);
                        }
                    }
                    return t(Boolean.FALSE, ej7Var);
                }
                if (!(dateFormat instanceof SimpleDateFormat)) {
                    t37Var.z(cls, "Configured `DateFormat` (" + dateFormat.getClass().getName() + ") not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`");
                    throw null;
                }
                SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
                DateFormat simpleDateFormat3 = z ? new SimpleDateFormat(simpleDateFormat2.toPattern(), locale) : (SimpleDateFormat) simpleDateFormat2.clone();
                TimeZone timeZone5 = no3VarK.j0;
                if (timeZone5 != null) {
                    timeZone = timeZone5;
                } else if (str != null) {
                    timeZone = DesugarTimeZone.getTimeZone(str);
                    no3VarK.j0 = timeZone;
                }
                if (timeZone != null && !timeZone.equals(simpleDateFormat3.getTimeZone())) {
                    simpleDateFormat3.setTimeZone(timeZone);
                }
                return t(Boolean.FALSE, simpleDateFormat3);
            }
        }
        return this;
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        return false;
    }

    public final boolean r(t37 t37Var) {
        Boolean bool = this.f0;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.g0 == null) {
            if (t37Var != null) {
                return t37Var.X.j(n37.n0);
            }
            bt.q("Null SerializerProvider passed for ".concat(this.X.getName()));
        }
        return false;
    }

    public final void s(Date date, ro3 ro3Var, t37 t37Var) {
        DateFormat dateFormat = this.g0;
        if (dateFormat == null) {
            t37Var.getClass();
            if (t37Var.X.j(n37.n0)) {
                ro3Var.u0(date.getTime());
                return;
            } else {
                ro3Var.c1(t37Var.d().format(date));
                return;
            }
        }
        AtomicReference atomicReference = this.h0;
        DateFormat dateFormat2 = (DateFormat) atomicReference.getAndSet(null);
        if (dateFormat2 == null) {
            dateFormat2 = (DateFormat) dateFormat.clone();
        }
        ro3Var.c1(dateFormat2.format(date));
        while (!atomicReference.compareAndSet(null, dateFormat2) && atomicReference.get() == null) {
        }
    }

    public ec1 t(Boolean bool, DateFormat dateFormat) {
        return new cd0(bool, dateFormat);
    }
}
