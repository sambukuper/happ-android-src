package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.i;
import io.sentry.c2;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sb8 extends u70 {
    public final i g;
    public final Window.Callback h;
    public final qb8 i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final ArrayList m = new ArrayList();
    public final xb n = new xb(this, (byte) 24);

    public sb8(Toolbar toolbar, CharSequence charSequence, rp rpVar) {
        qb8 qb8Var = new qb8(this);
        toolbar.getClass();
        i iVar = new i(toolbar, false);
        this.g = iVar;
        rpVar.getClass();
        this.h = rpVar;
        iVar.k = rpVar;
        toolbar.setOnMenuItemClickListener(qb8Var);
        boolean z = iVar.g;
        if (!z) {
            iVar.h = charSequence;
            if ((iVar.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (z) {
                    cw8.o(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.i = new qb8(this);
    }

    @Override // defpackage.u70
    public final boolean B() {
        st4 st4Var;
        h hVar = this.g.a.R0;
        if (hVar == null || (st4Var = hVar.Y) == null) {
            return false;
        }
        if (hVar == null) {
            st4Var = null;
        }
        if (st4Var == null) {
            return true;
        }
        st4Var.collapseActionView();
        return true;
    }

    @Override // defpackage.u70
    public final void H(boolean z) {
        if (z == this.l) {
            return;
        }
        this.l = z;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        c2.m();
    }

    @Override // defpackage.u70
    public final int N() {
        return this.g.b;
    }

    @Override // defpackage.u70
    public final Context U() {
        return this.g.a.getContext();
    }

    @Override // defpackage.u70
    public final boolean V() {
        i iVar = this.g;
        Toolbar toolbar = iVar.a;
        xb xbVar = this.n;
        toolbar.removeCallbacks(xbVar);
        Toolbar toolbar2 = iVar.a;
        WeakHashMap weakHashMap = cw8.a;
        toolbar2.postOnAnimation(xbVar);
        return true;
    }

    @Override // defpackage.u70
    public final void a0() {
        this.g.a.removeCallbacks(this.n);
    }

    @Override // defpackage.u70
    public final boolean b0(int i, KeyEvent keyEvent) {
        Menu menuU0 = u0();
        if (menuU0 == null) {
            return false;
        }
        menuU0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuU0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.u70
    public final boolean c0(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            d0();
        }
        return true;
    }

    @Override // defpackage.u70
    public final boolean d0() {
        return this.g.a.u();
    }

    @Override // defpackage.u70
    public final void l0(boolean z) {
        i iVar = this.g;
        iVar.a((iVar.b & (-5)) | 4);
    }

    @Override // defpackage.u70
    public final void n0(CharSequence charSequence) {
        i iVar = this.g;
        if (iVar.g) {
            return;
        }
        Toolbar toolbar = iVar.a;
        iVar.h = charSequence;
        if ((iVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (iVar.g) {
                cw8.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu u0() {
        boolean z = this.k;
        i iVar = this.g;
        if (!z) {
            h70 h70Var = new h70(this, (byte) 8);
            rb8 rb8Var = new rb8(this, (byte) 0);
            Toolbar toolbar = iVar.a;
            toolbar.S0 = h70Var;
            toolbar.T0 = rb8Var;
            ActionMenuView actionMenuView = toolbar.f0;
            if (actionMenuView != null) {
                actionMenuView.z0 = h70Var;
                actionMenuView.A0 = rb8Var;
            }
            this.k = true;
        }
        return iVar.a.getMenu();
    }

    @Override // defpackage.u70
    public final boolean z() {
        a aVar;
        ActionMenuView actionMenuView = this.g.a.f0;
        return (actionMenuView == null || (aVar = actionMenuView.y0) == null || !aVar.f()) ? false : true;
    }
}
