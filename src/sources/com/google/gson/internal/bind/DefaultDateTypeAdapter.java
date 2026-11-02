package com.google.gson.internal.bind;

import defpackage.fr3;
import defpackage.hs3;
import defpackage.n43;
import defpackage.p61;
import defpackage.rq3;
import defpackage.ul3;
import defpackage.vg8;
import defpackage.yi8;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends com.google.gson.b {
    public static final vg8 c = new vg8() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // defpackage.vg8
        public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
            if (yi8Var.a == Date.class) {
                return new DefaultDateTypeAdapter(a.a, 0);
            }
            return null;
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };
    public final a a;
    public final ArrayList b;

    public DefaultDateTypeAdapter(a aVar, int i) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(aVar);
        this.a = aVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (ul3.a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // com.google.gson.b
    public final Object b(rq3 rq3Var) throws IOException {
        Date dateB;
        if (rq3Var.c0() == 9) {
            rq3Var.X();
            return null;
        }
        String strR = rq3Var.r();
        synchronized (this.b) {
            try {
                for (DateFormat dateFormat : this.b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strR);
                            dateFormat.setTimeZone(timeZone);
                        } catch (Throwable th) {
                            dateFormat.setTimeZone(timeZone);
                            throw th;
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    dateB = n43.b(strR, new ParsePosition(0));
                } catch (ParseException e) {
                    StringBuilder sbP = p61.p("Failed parsing '", strR, "' as Date; at path ");
                    sbP.append(rq3Var.C());
                    throw new fr3(sbP.toString(), e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.a.a(dateB);
    }

    @Override // com.google.gson.b
    public final void c(hs3 hs3Var, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            hs3Var.u();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            str = dateFormat.format(date);
        }
        hs3Var.c0(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
