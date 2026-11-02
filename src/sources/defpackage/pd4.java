package defpackage;

import j$.time.LocalDateTime;
import j$.time.format.DateTimeParseException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pd4 implements ow3 {
    public static final pd4 a = new pd4();
    public static final bu5 b = km4.h("kotlinx.datetime.LocalDateTime");

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        ld4 ld4Var = (ld4) obj;
        ld4Var.getClass();
        ol7Var.t(ld4Var.toString());
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        jd4 jd4Var = ld4.Companion;
        String strS = rd1Var.s();
        nd4 nd4Var = kd4.a;
        jd4Var.getClass();
        strS.getClass();
        nd4Var.getClass();
        try {
            String string = strS.toString();
            string.getClass();
            return new ld4(LocalDateTime.parse(du7.f(12, string)));
        } catch (DateTimeParseException e) {
            throw new dc1(e);
        }
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
