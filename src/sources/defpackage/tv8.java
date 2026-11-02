package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tv8 implements View.OnApplyWindowInsetsListener {
    public w19 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ p95 c;

    public tv8(View view, p95 p95Var) {
        this.b = view;
        this.c = p95Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        w19 w19VarG = w19.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        p95 p95Var = this.c;
        if (i < 30) {
            uv8.a(windowInsets, this.b);
            if (w19VarG.equals(this.a)) {
                return p95Var.C(view, w19VarG).f();
            }
        }
        this.a = w19VarG;
        w19 w19VarC = p95Var.C(view, w19VarG);
        if (i >= 30) {
            return w19VarC.f();
        }
        WeakHashMap weakHashMap = cw8.a;
        view.requestApplyInsets();
        return w19VarC.f();
    }
}
