package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.l;
import java.util.List;
import su.happ.proxyutility.dto.PingTypeData;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class in5 extends f {
    public final Drawable c;
    public final Drawable d;
    public final xn5 e;
    public final al5 f;
    public final iv g;
    public dn2 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public in5(Drawable drawable, Drawable drawable2, xn5 xn5Var, al5 al5Var) {
        xn5Var.getClass();
        this.c = drawable;
        this.d = drawable2;
        this.e = xn5Var;
        this.f = al5Var;
        this.g = new iv(this, new h52((byte) 4));
        this.h = new dw4((byte) 19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        return this.g.f.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(l lVar, int i) {
        hn5 hn5Var = (hn5) lVar;
        PingTypeData pingTypeData = (PingTypeData) this.g.f.get(i);
        mb6.g(hn5Var.v);
        qi3 qi3Var = hn5Var.u;
        Context context = qi3Var.Y.getContext();
        context.getClass();
        boolean zY = ue3.y(context);
        ConstraintLayout constraintLayout = qi3Var.Z;
        constraintLayout.setFocusableInTouchMode(zY);
        qi3Var.h0.setText(pingTypeData.getInfo());
        boolean selected = pingTypeData.getSelected();
        AppCompatImageView appCompatImageView = qi3Var.g0;
        if (selected) {
            appCompatImageView.setImageDrawable(this.c);
            this.h = new gn5(qi3Var, this, (byte) 0);
        } else {
            appCompatImageView.setImageDrawable(this.d);
        }
        constraintLayout.setOnClickListener(new m24(this, qi3Var, pingTypeData, (byte) 1));
        if (i == 0) {
            constraintLayout.requestFocus();
        } else if (i == a() - 1) {
            qi3Var.f0.setVisibility(4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(l lVar, int i, List list) {
        hn5 hn5Var = (hn5) lVar;
        list.getClass();
        if (list.isEmpty()) {
            e(hn5Var, i);
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
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t46.item_recycler_ping, viewGroup, false);
        ConstraintLayout constraintLayout = constraintLayoutInflate;
        int i2 = e46.divider;
        View viewB = ln7.b(constraintLayoutInflate, i2);
        if (viewB != null && (appCompatImageViewB = ln7.b(constraintLayoutInflate, (i2 = e46.ping_activated))) != null) {
            i2 = e46.ping_name;
            HappTextView happTextView = (HappTextView) ln7.b(constraintLayoutInflate, i2);
            if (happTextView != null) {
                return new hn5(this, new qi3(constraintLayout, constraintLayout, viewB, appCompatImageViewB, happTextView, (byte) 1));
            }
        }
        b61.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        return null;
    }
}
