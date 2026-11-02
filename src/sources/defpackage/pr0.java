package defpackage;

import android.view.KeyEvent;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import su.happ.proxyutility.feature.report.ReportActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pr0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ pr0(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object value;
        ke6 ke6Var;
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                int i = Chip.B0;
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) callback).n0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
            default:
                int i2 = ReportActivity.S0;
                compoundButton.getClass();
                oh7 oh7Var = ((le6) ((ReportActivity) callback).R0.getValue()).b;
                oh7Var.getClass();
                do {
                    value = oh7Var.getValue();
                    ke6Var = (ke6) value;
                    ke6Var.getClass();
                } while (!oh7Var.k(value, ke6.a(ke6Var, z, null, 2)));
                break;
        }
    }
}
