package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class yp extends py0 implements ip {
    public wp g0;
    public final xp h0;

    /* JADX WARN: Type inference failed for: r1v2, types: [xp] */
    public yp(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(w26.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.h0 = new dx3() { // from class: xp
            @Override // defpackage.dx3
            public final boolean g(KeyEvent keyEvent) {
                return this.X.i(keyEvent);
            }
        };
        mp mpVarG = g();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(w26.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((wp) mpVarG).T0 = i;
        mpVarG.c();
    }

    @Override // defpackage.py0, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        wp wpVar = (wp) g();
        wpVar.v();
        ((ViewGroup) wpVar.B0.findViewById(R.id.content)).addView(view, layoutParams);
        wpVar.o0.a(wpVar.n0.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        g().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return vj8.z(this.h0, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        wp wpVar = (wp) g();
        wpVar.v();
        return wpVar.n0.findViewById(i);
    }

    public final mp g() {
        wp wpVar = this.g0;
        if (wpVar != null) {
            return wpVar;
        }
        lp lpVar = mp.X;
        wp wpVar2 = new wp(getContext(), getWindow(), this, this);
        this.g0 = wpVar2;
        return wpVar2;
    }

    public final boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        g().a();
    }

    @Override // defpackage.py0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        wp wpVar = (wp) g();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(wpVar.m0);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(wpVar);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        g().c();
    }

    @Override // defpackage.py0, android.app.Dialog
    public final void onStop() {
        super.onStop();
        wp wpVar = (wp) g();
        wpVar.z();
        u70 u70Var = wpVar.p0;
        if (u70Var != null) {
            u70Var.m0(false);
        }
    }

    @Override // defpackage.py0, android.app.Dialog
    public void setContentView(int i) {
        d();
        g().g(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        g().k(getContext().getString(i));
    }

    @Override // defpackage.py0, android.app.Dialog
    public void setContentView(View view) {
        d();
        g().h(view);
    }

    @Override // defpackage.py0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        g().i(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        g().k(charSequence);
    }
}
