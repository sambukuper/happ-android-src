package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.l;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.util.Arrays;
import java.util.List;
import su.happ.proxyutility.dto.AppInfo;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ik5 extends f {
    public final uj5 c;
    public final d0 d;
    public final iv e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ik5(uj5 uj5Var, d0 d0Var) {
        uj5Var.getClass();
        this.c = uj5Var;
        this.d = d0Var;
        this.e = new iv(this, new h52((byte) 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() {
        return this.e.f.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(l lVar, int i) {
        hk5 hk5Var = (hk5) lVar;
        final AppInfo appInfo = (AppInfo) this.e.f.get(i);
        fu6 fu6Var = hk5Var.u;
        mb6.g(hk5Var.r());
        ((AppCompatImageView) fu6Var.g0).setImageDrawable(appInfo.getAppIcon());
        final byte b = 0;
        final byte b2 = 1;
        ((MaterialCheckBox) fu6Var.Z).setChecked(appInfo.getIsSelected() == 1);
        ((HappTextView) fu6Var.i0).setText(appInfo.getPackageName());
        ((HappTextView) fu6Var.h0).setText(appInfo.getIsSystemApp() ? String.format("* %1s", Arrays.copyOf(new Object[]{appInfo.getAppName()}, 1)) : appInfo.getAppName());
        ((ConstraintLayout) fu6Var.f0).setOnClickListener(new View.OnClickListener(this) { // from class: fk5
            public final /* synthetic */ ik5 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                AppInfo appInfo2 = appInfo;
                ik5 ik5Var = this.Y;
                switch (b3) {
                    case 0:
                        ik5Var.d.B(appInfo2);
                        break;
                    default:
                        ik5Var.d.B(appInfo2);
                        break;
                }
            }
        });
        ((l) hk5Var).a.setOnClickListener(new View.OnClickListener(this) { // from class: fk5
            public final /* synthetic */ ik5 Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                AppInfo appInfo2 = appInfo;
                ik5 ik5Var = this.Y;
                switch (b3) {
                    case 0:
                        ik5Var.d.B(appInfo2);
                        break;
                    default:
                        ik5Var.d.B(appInfo2);
                        break;
                }
            }
        });
        if (i == 0) {
            ((ConstraintLayout) hk5Var.r().X.f0).requestFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(l lVar, int i, List list) {
        hk5 hk5Var = (hk5) lVar;
        list.getClass();
        Object objT0 = wv0.t0(list);
        Bundle bundle = objT0 instanceof Bundle ? (Bundle) objT0 : null;
        if (bundle == null) {
            e(hk5Var, i);
        } else if (bundle.getBoolean("select")) {
            ((MaterialCheckBox) hk5Var.u.Z).setChecked(((AppInfo) this.e.f.get(i)).getIsSelected() == 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l g(ViewGroup viewGroup, int i) {
        MaterialCheckBox materialCheckBoxB;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t46.item_recycler_per_app_proxy, viewGroup, false);
        int i2 = e46.f0l_names;
        if (ln7.b(constraintLayoutInflate, i2) != null && (materialCheckBoxB = ln7.b(constraintLayoutInflate, (i2 = e46.check_box))) != null) {
            ConstraintLayout constraintLayout = constraintLayoutInflate;
            i2 = e46.icon;
            AppCompatImageView appCompatImageViewB = ln7.b(constraintLayoutInflate, i2);
            if (appCompatImageViewB != null) {
                i2 = e46.name;
                AppCompatTextView appCompatTextView = (HappTextView) ln7.b(constraintLayoutInflate, i2);
                if (appCompatTextView != null) {
                    i2 = e46.package_name;
                    AppCompatTextView appCompatTextView2 = (HappTextView) ln7.b(constraintLayoutInflate, i2);
                    if (appCompatTextView2 != null) {
                        return new hk5(this, new fu6(constraintLayout, materialCheckBoxB, constraintLayout, appCompatImageViewB, appCompatTextView, appCompatTextView2, (byte) 13));
                    }
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        return null;
    }
}
