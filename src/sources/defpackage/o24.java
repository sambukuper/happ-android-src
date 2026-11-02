package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.l;
import java.util.List;
import su.happ.proxyutility.dto.LanguageData;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class o24 extends f {
    public final String c;
    public final Drawable d;
    public final Drawable e;
    public final d0 f;
    public final iv g = new iv(this, new h52((byte) 2));
    public dn2 h = new ei3((byte) 9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o24(String str, Drawable drawable, Drawable drawable2, d0 d0Var) {
        this.c = str;
        this.d = drawable;
        this.e = drawable2;
        this.f = d0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        return this.g.f.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(l lVar, int i) {
        n24 n24Var = (n24) lVar;
        LanguageData languageData = (LanguageData) this.g.f.get(i);
        mb6.g(n24Var.v);
        qi3 qi3Var = n24Var.u;
        AppCompatTextView appCompatTextView = qi3Var.h0;
        ConstraintLayout constraintLayout = qi3Var.Z;
        appCompatTextView.setText(languageData.getInfo());
        boolean selected = languageData.getSelected();
        AppCompatImageView appCompatImageView = qi3Var.g0;
        byte b = 0;
        if (selected) {
            appCompatImageView.setImageDrawable(this.d);
            this.h = new l24(qi3Var, this, (byte) 0);
        } else {
            appCompatImageView.setImageDrawable(this.e);
        }
        constraintLayout.setOnClickListener(new m24(this, qi3Var, languageData, b));
        if (dh3.f(this.c, languageData.getValue()) || i == 0) {
            constraintLayout.requestFocus();
        }
        if (i == a() - 1) {
            qi3Var.f0.setVisibility(4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(l lVar, int i, List list) {
        n24 n24Var = (n24) lVar;
        list.getClass();
        if (list.isEmpty()) {
            e(n24Var, i);
            return;
        }
        Object objR0 = wv0.r0(list);
        objR0.getClass();
        if (((Bundle) objR0).getBoolean("update")) {
            iv ivVar = this.g;
            List list2 = ivVar.f;
            list2.getClass();
            ivVar.b(list2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l g(ViewGroup viewGroup, int i) {
        AppCompatImageView appCompatImageViewB;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t46.item_recycler_language, viewGroup, false);
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        int i2 = e46.divider;
        View viewB = ln7.b(constraintLayoutInflate, i2);
        if (viewB != null && (appCompatImageViewB = ln7.b(constraintLayoutInflate, (i2 = e46.language_activated))) != null) {
            i2 = e46.language_name;
            HappTextView happTextView = (HappTextView) ln7.b(constraintLayoutInflate, i2);
            if (happTextView != null) {
                return new n24(this, new qi3(constraintLayout, constraintLayout, viewB, appCompatImageViewB, happTextView, (byte) 0));
            }
        }
        b61.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        return null;
    }
}
