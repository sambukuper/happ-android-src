package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oc8 {
    public static WeakReference b;
    public f63 a;

    public final synchronized nc8 a() {
        String str;
        nc8 nc8Var;
        f63 f63Var = this.a;
        synchronized (((ArrayDeque) f63Var.Z)) {
            str = (String) ((ArrayDeque) f63Var.Z).peek();
        }
        Pattern pattern = nc8.d;
        nc8Var = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                nc8Var = new nc8(strArrSplit[0], strArrSplit[1]);
            }
        }
        return nc8Var;
    }
}
