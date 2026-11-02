package defpackage;

import j$.time.Month;
import j$.time.YearMonth;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c79 extends g1 {
    public final sc0 a;

    public c79(sc0 sc0Var) {
        this.a = sc0Var;
    }

    @Override // defpackage.g1
    public final sc0 b() {
        return this.a;
    }

    @Override // defpackage.g1
    public final h61 c() {
        return d79.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g1
    public final h61 d(ld4 ld4Var) {
        hb3 hb3Var = new hb3(null, null);
        YearMonth yearMonth = ((w69) ld4Var).X;
        hb3Var.a = Integer.valueOf(yearMonth.getYear());
        Month month = yearMonth.getMonth();
        month.getClass();
        zx4 zx4Var = (zx4) zx4.Y.get(month.getValue() - 1);
        zx4Var.getClass();
        hb3Var.b = Integer.valueOf(zx4Var.ordinal() + 1);
        return hb3Var;
    }

    @Override // defpackage.g1
    public final Object f(h61 h61Var) {
        hb3 hb3Var = (hb3) h61Var;
        hb3Var.getClass();
        Integer num = hb3Var.a;
        d79.a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = hb3Var.b;
        d79.a(num2, "monthNumber");
        return new w69(iIntValue, num2.intValue());
    }
}
