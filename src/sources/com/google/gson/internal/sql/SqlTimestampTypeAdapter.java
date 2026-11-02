package com.google.gson.internal.sql;

import com.google.gson.b;
import defpackage.hs3;
import defpackage.rq3;
import defpackage.vg8;
import defpackage.yi8;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class SqlTimestampTypeAdapter extends b {
    public static final vg8 b = new vg8() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // defpackage.vg8
        public final b a(com.google.gson.a aVar, yi8 yi8Var) {
            if (yi8Var.a != Timestamp.class) {
                return null;
            }
            aVar.getClass();
            return new SqlTimestampTypeAdapter(aVar.e(new yi8(Date.class)));
        }
    };
    public final b a;

    public SqlTimestampTypeAdapter(b bVar) {
        this.a = bVar;
    }

    @Override // com.google.gson.b
    public final Object b(rq3 rq3Var) {
        Date date = (Date) this.a.b(rq3Var);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.b
    public final void c(hs3 hs3Var, Object obj) {
        this.a.c(hs3Var, (Timestamp) obj);
    }
}
