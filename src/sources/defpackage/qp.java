package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qp extends ux8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qp(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.ux8, defpackage.tx8
    public void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((np) obj).Y.w0.setVisibility(0);
                break;
            case 1:
                wp wpVar = (wp) obj;
                wpVar.w0.setVisibility(0);
                if (wpVar.w0.getParent() instanceof View) {
                    View view = (View) wpVar.w0.getParent();
                    WeakHashMap weakHashMap = cw8.a;
                    view.requestApplyInsets();
                }
                break;
        }
    }

    @Override // defpackage.tx8
    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wp wpVar = ((np) obj).Y;
                wpVar.w0.setAlpha(1.0f);
                wpVar.z0.d(null);
                wpVar.z0 = null;
                break;
            case 1:
                wp wpVar2 = (wp) obj;
                wpVar2.w0.setAlpha(1.0f);
                wpVar2.z0.d(null);
                wpVar2.z0 = null;
                break;
            default:
                wp wpVar3 = (wp) ((dq) obj).Z;
                wpVar3.w0.setVisibility(8);
                PopupWindow popupWindow = wpVar3.x0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (wpVar3.w0.getParent() instanceof View) {
                    View view = (View) wpVar3.w0.getParent();
                    WeakHashMap weakHashMap = cw8.a;
                    view.requestApplyInsets();
                }
                wpVar3.w0.e();
                wpVar3.z0.d(null);
                wpVar3.z0 = null;
                ViewGroup viewGroup = wpVar3.B0;
                WeakHashMap weakHashMap2 = cw8.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
