package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z09 extends WindowInsetsAnimation$Callback {
    public final jv0 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public z09(jv0 jv0Var) {
        super(jv0Var.X);
        this.d = new HashMap();
        this.a = jv0Var;
    }

    public final c19 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        c19 c19Var = (c19) map.get(windowInsetsAnimation);
        if (c19Var != null) {
            return c19Var;
        }
        c19 c19Var2 = new c19(0, null, 0L);
        c19Var2.a = new a19(windowInsetsAnimation);
        map.put(windowInsetsAnimation, c19Var2);
        return c19Var2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            c19 c19VarA = a(windowInsetsAnimation);
            c19VarA.a.e(windowInsetsAnimation.getFraction());
            this.c.add(c19VarA);
        }
        return this.a.f(w19.g(null, windowInsets), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        xd6 xd6VarG = this.a.g(a(windowInsetsAnimation), new xd6(bounds));
        xd6VarG.getClass();
        na.c();
        return na.a(((fe3) xd6VarG.Y).e(), ((fe3) xd6VarG.Z).e());
    }
}
