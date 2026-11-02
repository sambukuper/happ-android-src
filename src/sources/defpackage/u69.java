package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.l;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u69 extends f {
    public final wq4 c;

    public u69(wq4 wq4Var) {
        this.c = wq4Var;
    }

    @Override // androidx.recyclerview.widget.f
    public final int a() {
        return this.c.f1.h0;
    }

    @Override // androidx.recyclerview.widget.f
    public final void e(l lVar, int i) {
        wq4 wq4Var = this.c;
        int i2 = wq4Var.f1.X.Z + i;
        TextView textView = ((t69) lVar).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(tr8.b().get(1) == i2 ? String.format(context.getString(h56.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(h56.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        lr lrVar = wq4Var.i1;
        if (tr8.b().get(1) == i2) {
            Object obj = lrVar.f0;
        } else {
            Object obj2 = lrVar.Z;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.f
    public final l g(ViewGroup viewGroup, int i) {
        return new t69((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(s46.mtrl_calendar_year, viewGroup, false));
    }
}
