package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.enums.EConfigType;
import su.happ.proxyutility.ui.ServerActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class c47 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ ServerActivity X;
    public final /* synthetic */ ServerConfig Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c47(ServerActivity serverActivity, ServerConfig serverConfig) {
        this.X = serverActivity;
        this.Y = serverConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ?? r2 = this.X;
        y5 y5Var = r2.Q0;
        Object obj = null;
        if (i < 0) {
            if (y5Var == null) {
                dh3.T("binding");
                throw null;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) y5Var.Z;
            if (y5Var == null) {
                dh3.T("binding");
                throw null;
            }
            LinearLayout linearLayout = (LinearLayout) y5Var.Y;
            linearLayout.getClass();
            Resources resources = r2.getResources();
            resources.getClass();
            a38.b(constraintLayout, linearLayout, resources);
            return;
        }
        if (y5Var == null) {
            dh3.T("binding");
            throw null;
        }
        LinearLayout linearLayout2 = (LinearLayout) y5Var.Y;
        linearLayout2.getClass();
        linearLayout2.setForeground(null);
        int i2 = i + 1;
        EConfigType.INSTANCE.getClass();
        for (Object obj2 : EConfigType.a()) {
            if (((EConfigType) obj2).getValue() == i2) {
                obj = obj2;
                break;
            }
        }
        EConfigType eConfigType = (EConfigType) obj;
        if (eConfigType == null) {
            eConfigType = EConfigType.VLESS;
        }
        r2.U0 = eConfigType;
        r2.F(this.Y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        y5 y5Var = this.X.Q0;
        if (y5Var == null) {
            dh3.T("binding");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) y5Var.Y;
        linearLayout.getClass();
        linearLayout.setForeground(null);
    }
}
