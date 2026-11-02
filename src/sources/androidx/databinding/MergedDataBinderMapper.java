package androidx.databinding;

import android.view.View;
import defpackage.kw8;
import defpackage.w91;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends w91 {
    public HashSet a;
    public CopyOnWriteArrayList b;
    public CopyOnWriteArrayList c;

    @Override // defpackage.w91
    public final kw8 b(View view, int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            kw8 kw8VarB = ((w91) it.next()).b(view, i);
            if (kw8VarB != null) {
                return kw8VarB;
            }
        }
        if (e()) {
            return b(view, i);
        }
        return null;
    }

    @Override // defpackage.w91
    public final kw8 c(View[] viewArr, int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            kw8 kw8VarC = ((w91) it.next()).c(viewArr, i);
            if (kw8VarC != null) {
                return kw8VarC;
            }
        }
        if (e()) {
            return c(viewArr, i);
        }
        return null;
    }

    public final void d(w91 w91Var) {
        if (this.a.add(w91Var.getClass())) {
            this.b.add(w91Var);
            Iterator it = w91Var.a().iterator();
            while (it.hasNext()) {
                d((w91) it.next());
            }
        }
    }

    public final boolean e() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.c;
        boolean z = false;
        for (String str : copyOnWriteArrayList) {
            try {
                Class<?> cls = Class.forName(str);
                if (w91.class.isAssignableFrom(cls)) {
                    d((w91) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            }
        }
        return z;
    }
}
