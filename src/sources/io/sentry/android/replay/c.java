package io.sentry.android.replay;

import defpackage.dn8;
import defpackage.fm7;
import defpackage.fq4;
import defpackage.g24;
import defpackage.gn2;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g24 implements gn2 {
    public static final c Z;
    public static final c f0;
    public static final c g0;
    public final /* synthetic */ byte Y;

    static {
        int i = 1;
        Z = new c((byte) 0, i);
        f0 = new c((byte) 1, i);
        g0 = new c((byte) 2, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(byte b, int i) {
        super(i);
        this.Y = b;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        switch (this.Y) {
            case 0:
                fq4 fq4Var = (fq4) obj;
                fq4Var.getClass();
                String strGroup = fq4Var.a.group();
                strGroup.getClass();
                String upperCase = String.valueOf(fm7.p0(strGroup)).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return upperCase;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
            default:
                ((Date) obj).getClass();
                return dn8.a;
        }
    }
}
