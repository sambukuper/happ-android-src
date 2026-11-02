package defpackage;

import j$.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class es8 implements ow3 {
    public static final es8 a = new es8();
    public static final bu5 b = km4.h("kotlinx.datetime.UtcOffset");

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        vr8 vr8Var = (vr8) obj;
        vr8Var.getClass();
        ol7Var.t(vr8Var.toString());
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        ur8 ur8Var = vr8.Companion;
        String strS = rd1Var.s();
        vz7 vz7Var = zr8.a;
        xr8 xr8Var = (xr8) vz7Var.getValue();
        ur8Var.getClass();
        strS.getClass();
        xr8Var.getClass();
        if (xr8Var == ((xr8) vz7Var.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) bs8.a.getValue();
            dateTimeFormatter.getClass();
            return bs8.a(strS, dateTimeFormatter);
        }
        if (xr8Var == ((xr8) zr8.b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) bs8.b.getValue();
            dateTimeFormatter2.getClass();
            return bs8.a(strS, dateTimeFormatter2);
        }
        if (xr8Var != ((xr8) zr8.c.getValue())) {
            return (vr8) xr8Var.e(strS);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) bs8.c.getValue();
        dateTimeFormatter3.getClass();
        return bs8.a(strS, dateTimeFormatter3);
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
