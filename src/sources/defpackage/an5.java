package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.picker.Picker;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class an5 extends f {
    public final int c;
    public final int d;
    public final int e;
    public final cn5 f;
    public final /* synthetic */ Picker g;

    public an5(Picker picker, int i, int i2, int i3) {
        this.g = picker;
        this.c = i;
        this.d = i3;
        this.e = i2;
        this.f = (cn5) picker.h0.get(i3);
    }

    @Override // androidx.recyclerview.widget.f
    public final int a() {
        cn5 cn5Var = this.f;
        if (cn5Var == null) {
            return 0;
        }
        return (cn5Var.c - cn5Var.b) + 1;
    }

    @Override // androidx.recyclerview.widget.f
    public final void e(l lVar, int i) {
        cn5 cn5Var;
        bn5 bn5Var = (bn5) lVar;
        TextView textView = bn5Var.u;
        if (textView != null && (cn5Var = this.f) != null) {
            int i2 = cn5Var.b + i;
            CharSequence[] charSequenceArr = cn5Var.d;
            textView.setText(charSequenceArr == null ? String.format(cn5Var.e, Integer.valueOf(i2)) : charSequenceArr[i2]);
        }
        View view = bn5Var.a;
        Picker picker = this.g;
        ArrayList arrayList = picker.g0;
        int i3 = this.d;
        picker.b(i3, view, ((VerticalGridView) arrayList.get(i3)).getSelectedPosition() == i, false);
    }

    @Override // androidx.recyclerview.widget.f
    public final l g(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.c, viewGroup, false);
        int i2 = this.e;
        return new bn5(viewInflate, i2 != 0 ? (TextView) viewInflate.findViewById(i2) : (TextView) viewInflate);
    }

    @Override // androidx.recyclerview.widget.f
    public final void j(l lVar) {
        ((bn5) lVar).a.setFocusable(this.g.isActivated());
    }
}
