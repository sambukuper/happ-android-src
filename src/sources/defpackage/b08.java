package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b08 extends View {
    public final /* synthetic */ ViewGroup f0;
    public final /* synthetic */ d08 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b08(d08 d08Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.g0 = d08Var;
        this.f0 = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        d08 d08Var = this.g0;
        ArrayList arrayList = d08Var.b;
        Drawable background = this.f0.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (d08Var.e != color) {
            d08Var.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((vx5) arrayList.get(size)).b(color);
            }
        }
    }
}
