package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gq implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ gq(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) obj;
                if (!appCompatSpinner.getInternalPopup().a()) {
                    appCompatSpinner.k0.n(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                lq lqVar = (lq) obj;
                AppCompatSpinner appCompatSpinner2 = lqVar.I0;
                if (appCompatSpinner2.isAttachedToWindow() && appCompatSpinner2.getGlobalVisibleRect(lqVar.G0)) {
                    lqVar.s();
                    lqVar.f();
                } else {
                    lqVar.dismiss();
                }
                break;
            case 2:
                qo0 qo0Var = (qo0) obj;
                ArrayList arrayList = qo0Var.k0;
                if (qo0Var.a() && arrayList.size() > 0 && !((po0) arrayList.get(0)).a.A0) {
                    View view = qo0Var.r0;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((po0) it.next()).a.f();
                        }
                    } else {
                        qo0Var.dismiss();
                    }
                    break;
                }
                break;
            default:
                sg7 sg7Var = (sg7) obj;
                b bVar = sg7Var.k0;
                if (sg7Var.a() && !bVar.A0) {
                    View view2 = sg7Var.p0;
                    if (view2 != null && view2.isShown()) {
                        bVar.f();
                    } else {
                        sg7Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
