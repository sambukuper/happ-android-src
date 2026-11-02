package defpackage;

import j$.time.YearMonth;
import j$.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f79 implements ow3 {
    public static final f79 a = new f79();
    public static final bu5 b = km4.h("kotlinx.datetime.YearMonth");

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        w69 w69Var = (w69) obj;
        w69Var.getClass();
        ol7Var.t(w69Var.toString());
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        v69 v69Var = w69.Companion;
        String strS = rd1Var.s();
        vz7 vz7Var = d79.b;
        g1 g1Var = (g1) vz7Var.getValue();
        v69Var.getClass();
        strS.getClass();
        g1Var.getClass();
        if (g1Var != ((g1) vz7Var.getValue())) {
            return (w69) g1Var.e(strS);
        }
        try {
            String string = strS.toString();
            string.getClass();
            return new w69(YearMonth.parse(du7.f(3, string)));
        } catch (DateTimeParseException e) {
            throw new dc1(e);
        }
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
