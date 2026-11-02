package su.happ.proxyutility.ui.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.preference.ListPreference;
import defpackage.ob4;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsu/happ/proxyutility/ui/widget/ReselectableDropDownPreference;", "Landroidx/preference/ListPreference;", "Landroid/content/Context;", "mContext", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ReselectableDropDownPreference extends ListPreference {
    public final Spinner o0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReselectableDropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        z7 z7Var = new z7(context, R.layout.simple_spinner_dropdown_item);
        Spinner spinner = new Spinner(context);
        this.o0 = spinner;
        spinner.setVisibility(4);
        spinner.setAdapter((SpinnerAdapter) z7Var);
        spinner.setOnItemSelectedListener(new ob4(this, (byte) 2));
        z7Var.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).j0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                z7Var.add(charSequence.toString());
            }
        }
        z7Var.add("");
    }
}
