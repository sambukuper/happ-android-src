package defpackage;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.l;
import su.happ.proxyutility.dto.ExcludeSettingsCache;
import su.happ.proxyutility.ui.foundation.component.HappEditText;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class j52 extends eb4 {
    public final w42 d;
    public final b1 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j52(w42 w42Var, b1 b1Var) {
        super(new h52((byte) 0));
        w42Var.getClass();
        this.d = w42Var;
        this.e = b1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(l lVar, int i) {
        i52 i52Var = (i52) lVar;
        final ExcludeSettingsCache excludeSettingsCache = (ExcludeSettingsCache) ((eb4) this).c.f.get(i);
        mb6.g(i52Var.v);
        zz2 zz2Var = i52Var.u;
        ((HappEditText) zz2Var.Z).setText(wl7.e0(excludeSettingsCache.getValue()));
        ((HappEditText) zz2Var.Z).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: g52
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 != 6) {
                    return false;
                }
                this.a.e.K(excludeSettingsCache, textView.getText().toString());
                return true;
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l g(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t46.item_recycler_excluded_route, viewGroup, false);
        int i2 = e46.et_ip_address;
        HappEditText happEditText = (HappEditText) ln7.b(viewInflate, i2);
        if (happEditText != null) {
            return new i52(this, new zz2((RelativeLayout) viewInflate, happEditText, (byte) 3));
        }
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
