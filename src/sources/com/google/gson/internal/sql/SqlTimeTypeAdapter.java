package com.google.gson.internal.sql;

import com.google.gson.b;
import defpackage.fr3;
import defpackage.hs3;
import defpackage.rq3;
import defpackage.vg8;
import defpackage.yi8;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
final class SqlTimeTypeAdapter extends b {
    public static final vg8 b = new vg8() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // defpackage.vg8
        public final b a(com.google.gson.a aVar, yi8 yi8Var) {
            if (yi8Var.a == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };
    public final SimpleDateFormat a;

    private SqlTimeTypeAdapter() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.b
    public final Object b(rq3 rq3Var) throws IOException {
        Time time;
        if (rq3Var.c0() == 9) {
            rq3Var.X();
            return null;
        }
        String strR = rq3Var.r();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    time = new Time(this.a.parse(strR).getTime());
                    this.a.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new fr3("Failed parsing '" + strR + "' as SQL Time; at path " + rq3Var.C(), e);
                }
            } catch (Throwable th) {
                this.a.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }

    @Override // com.google.gson.b
    public final void c(hs3 hs3Var, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            hs3Var.u();
            return;
        }
        synchronized (this) {
            str = this.a.format((Date) time);
        }
        hs3Var.c0(str);
    }

    public /* synthetic */ SqlTimeTypeAdapter(int i) {
        this();
    }
}
