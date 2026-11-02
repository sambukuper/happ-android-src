package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ud3 implements InputFilter {
    public final tb2 a;
    public final tb2 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ud3(Integer num, Integer num2) {
        tb2 tb2Var = new tb2(num, (byte) 13);
        tb2 tb2Var2 = new tb2(num2, (byte) 13);
        this.a = tb2Var;
        this.b = tb2Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        rj6 rj6Var;
        charSequence.getClass();
        spanned.getClass();
        try {
            String string = spanned.toString();
            String strConcat = fm7.Q0(i3, string).concat(string.substring(i4, string.length()));
            rj6Var = fm7.Q0(i3, strConcat) + ((Object) charSequence) + fm7.f0(i3, strConcat);
            Integer num = (Integer) this.a.Y;
            Integer num2 = (Integer) this.b.Y;
            if (!rj6Var.equals("-")) {
                Integer numB0 = mm7.b0(rj6Var);
                if (numB0 != null) {
                    int iIntValue = num.intValue();
                    int iIntValue2 = num2.intValue();
                    int iIntValue3 = numB0.intValue();
                    if (iIntValue <= iIntValue3 && iIntValue3 <= iIntValue2) {
                        rj6Var = null;
                    }
                }
                rj6Var = "";
            } else if (i2 == 0) {
                rj6Var = "";
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return (String) (rj6Var instanceof rj6 ? "" : rj6Var);
    }
}
