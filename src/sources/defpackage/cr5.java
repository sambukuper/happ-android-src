package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cr5 {
    public static final int a = l46.pooling_container_listener_holder_tag;
    public static final int b = l46.is_pooling_container_tag;

    public static final void a(View view) {
        view.getClass();
        v27 v27VarP = jm4.P(new rd(view, null, (byte) 2));
        while (v27VarP.hasNext()) {
            ArrayList arrayList = b((View) v27VarP.next()).a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((dw8) arrayList.get(size)).a.e();
                }
            }
        }
    }

    public static final dr5 b(View view) {
        int i = a;
        dr5 dr5Var = (dr5) view.getTag(i);
        if (dr5Var != null) {
            return dr5Var;
        }
        dr5 dr5Var2 = new dr5();
        view.setTag(i, dr5Var2);
        return dr5Var2;
    }
}
