package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ww7 implements qr6 {
    public final sm2 X;

    public ww7(sm2 sm2Var) {
        sm2Var.getClass();
        this.X = sm2Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    @Override // defpackage.qr6
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final gx7 X0(String str) {
        str.getClass();
        sm2 sm2Var = this.X;
        sm2Var.getClass();
        String string = fm7.R0(str).toString();
        if (string.length() >= 3) {
            String upperCase = string.substring(0, 3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                ex7 ex7Var = new ex7(sm2Var, str);
                ex7Var.f0 = new int[0];
                ex7Var.g0 = new long[0];
                ex7Var.h0 = new double[0];
                ex7Var.i0 = new String[0];
                ex7Var.j0 = new byte[0][];
                return ex7Var;
            }
        }
        return new fx7(sm2Var, str);
    }
}
