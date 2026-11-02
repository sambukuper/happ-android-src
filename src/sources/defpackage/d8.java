package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d8 extends sn1 {
    public final int t1;
    public final Integer u1;
    public final boolean v1;
    public final Integer w1;
    public final boolean x1;
    public View y1;

    public d8(int i, int i2, Integer num, Integer num2) {
        boolean z = (i2 & 8) == 0;
        num2 = (i2 & 16) != 0 ? null : num2;
        boolean z2 = (i2 & 32) == 0;
        this.t1 = i;
        this.u1 = num;
        this.v1 = z;
        this.w1 = num2;
        this.x1 = z2;
    }

    public static final void Z(ml2 ml2Var, d8 d8Var, String str) {
        d8Var.V();
        d8Var.q1 = false;
        d8Var.r1 = true;
        r00 r00Var = new r00(ml2Var);
        r00Var.o = true;
        r00Var.g(0, d8Var, str, 1);
        if (r00Var.g) {
            bt.i("This transaction is already being added to the back stack");
        } else {
            r00Var.q.B(r00Var, false);
        }
    }

    public static final void a0(BaseActivity baseActivity, sn1 sn1Var, String str) {
        baseActivity.getClass();
        sn1Var.getClass();
        sn1Var.V();
        ml2 ml2VarN = baseActivity.n();
        sn1Var.q1 = false;
        sn1Var.r1 = true;
        r00 r00Var = new r00(ml2VarN);
        r00Var.o = true;
        r00Var.g(0, sn1Var, str, 1);
        if (r00Var.g) {
            bt.i("This transaction is already being added to the back stack");
        } else {
            r00Var.q.B(r00Var, false);
        }
    }

    @Override // defpackage.sn1, defpackage.qk2
    public void G() {
        Window window;
        super.G();
        Dialog dialog = this.o1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        WindowManager.LayoutParams attributes = window.getAttributes();
        Integer num = this.u1;
        attributes.gravity = num != null ? num.intValue() : 81;
        if (!this.v1) {
            attributes.width = -1;
        }
        window.setAttributes(attributes);
    }

    @Override // defpackage.sn1
    public Dialog T(Bundle bundle) {
        boolean z = this.v1;
        int i = this.t1;
        if (z) {
            this.y1 = l().inflate(i, (ViewGroup) null);
        } else {
            this.y1 = l().inflate(t46.fragment_dialog, (ViewGroup) null);
            l().inflate(i, (ViewGroup) Y().findViewById(e46.dialog_container), true);
            if (this.x1) {
                ((CardView) Y().findViewById(e46.cv_fragment_dialog)).setBackground(new ColorDrawable(0));
            }
            ((TextView) Y().findViewById(e46.dialog_title)).setVisibility(8);
        }
        Integer num = this.w1;
        b8 b8Var = num == null ? new b8(N()) : new b8(N(), num.intValue());
        ((x7) b8Var.c).h = Y();
        zl2 zl2Var = am2.a;
        am2.b(new p57(this, "Attempting to set retain instance for fragment " + this));
        am2.a(this).getClass();
        this.E0 = true;
        ml2 ml2Var = this.v0;
        if (ml2Var != null) {
            ml2Var.O.e(this);
        } else {
            this.F0 = true;
        }
        return b8Var.d();
    }

    public final View Y() {
        View view = this.y1;
        if (view != null) {
            return view;
        }
        bt.q("Required value was null.");
        return null;
    }

    @Override // defpackage.sn1, defpackage.qk2
    public final void x(Context context) {
        Resources resources = context.getResources();
        Configuration configuration = new Configuration(resources != null ? resources.getConfiguration() : null);
        configuration.fontScale = 1.0f;
        super.x(context.createConfigurationContext(configuration));
    }

    @Override // defpackage.qk2
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        return Y();
    }
}
