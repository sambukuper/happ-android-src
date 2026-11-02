package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rl8 {
    public static final List a = wv0.E0(xv0.a0(i21.L(new bq0('0', '9'), new bq0('A', 'Z'))), eu.L0(new Character[]{'0', '1', '2', '5', '8', 'O', 'I', 'L', 'Z', 'S', 'B'}));

    public static String a() {
        Object rj6Var;
        try {
            String string = UUID.randomUUID().toString();
            string.getClass();
            rj6Var = mm7.W(string, "-", _UrlKt.FRAGMENT_ENCODE_SET, false);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) != null) {
            rj6Var = b(32);
        }
        return (String) rj6Var;
    }

    public static String b(int i) {
        int iC;
        kf3 kf3VarA0 = x97.a0(0, i);
        ArrayList arrayList = new ArrayList(xv0.Z(kf3VarA0, 10));
        Iterator it = kf3VarA0.iterator();
        while (true) {
            jf3 jf3Var = (jf3) it;
            if (!jf3Var.Z) {
                return wv0.y0(arrayList, _UrlKt.FRAGMENT_ENCODE_SET, null, null, null, 62);
            }
            jf3Var.nextInt();
            l66 l66Var = m66.X;
            List list = a;
            kf3 kf3VarC = i21.C(list);
            if (kf3VarC.isEmpty()) {
                u52.j(kf3VarC, "Cannot get random in empty range: ");
                return null;
            }
            int i2 = kf3VarC.Y;
            if (i2 < Integer.MAX_VALUE) {
                iC = m66.Y.c(0, i2 + 1);
            } else {
                iC = m66.Y.c(-1, i2) + 1;
            }
            Character ch = (Character) list.get(iC);
            ch.getClass();
            arrayList.add(ch);
        }
    }
}
