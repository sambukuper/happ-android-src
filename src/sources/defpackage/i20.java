package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.progressindicator.a;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i20 extends ni {
    public final /* synthetic */ byte b;
    public final /* synthetic */ View c;

    public /* synthetic */ i20(View view, byte b) {
        this.b = b;
        this.c = view;
    }

    @Override // defpackage.ni
    public final void a(Drawable drawable) {
        byte b = this.b;
        View view = this.c;
        switch (b) {
            case 0:
                a aVar = (a) view;
                aVar.setIndeterminate(false);
                aVar.c(aVar.g0, aVar.h0);
                break;
            case 1:
                a aVar2 = (a) view;
                if (!aVar2.m0) {
                    aVar2.setVisibility(aVar2.n0);
                }
                break;
            default:
                ColorStateList colorStateList = ((MaterialCheckBox) view).t0;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    @Override // defpackage.ni
    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.c;
                ColorStateList colorStateList = materialCheckBox.t0;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(materialCheckBox.x0, colorStateList.getDefaultColor()));
                }
                break;
        }
    }
}
