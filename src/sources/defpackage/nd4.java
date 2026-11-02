package defpackage;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nd4 extends g1 {
    public final sc0 a;

    public nd4(sc0 sc0Var) {
        this.a = sc0Var;
    }

    @Override // defpackage.g1
    public final sc0 b() {
        return this.a;
    }

    @Override // defpackage.g1
    public final h61 c() {
        return od4.b;
    }

    @Override // defpackage.g1
    public final h61 d(ld4 ld4Var) {
        db3 db3Var = new db3();
        LocalDateTime localDateTime = ld4Var.X;
        LocalDate localDateM = localDateTime.m();
        localDateM.getClass();
        db3Var.a.b(new dd4(localDateM));
        LocalTime localTime = localDateTime.toLocalTime();
        localTime.getClass();
        db3Var.b.f(new xd4(localTime));
        return db3Var;
    }

    @Override // defpackage.g1
    public final Object f(h61 h61Var) {
        db3 db3Var = (db3) h61Var;
        db3Var.getClass();
        return new ld4(db3Var.a.c(), db3Var.b.i());
    }
}
