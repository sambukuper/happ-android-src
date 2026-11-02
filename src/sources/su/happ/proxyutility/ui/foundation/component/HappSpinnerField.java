package su.happ.proxyutility.ui.foundation.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import defpackage.e46;
import defpackage.rf7;
import defpackage.t46;
import defpackage.x56;
import defpackage.zw2;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.widget.CustomSpinner;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\rJ\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\f\u0010\u001eR$\u0010!\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001d\"\u0004\b\u000f\u0010\u001eR\u0011\u0010$\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lsu/happ/proxyutility/ui/foundation/component/HappSpinnerField;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "res", "Ldn8;", "setTitle", "(I)V", "setTitleColor", "setDescription", "", "", "entries", "setEntries", "([Ljava/lang/String;)V", "position", "setSelection", "Landroid/widget/AdapterView$OnItemSelectedListener;", "listener", "setOnSpinnerItemClickListener", "(Landroid/widget/AdapterView$OnItemSelectedListener;)V", "value", "getTitle", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "title", "getDescription", "description", "getSelectedItemPosition", "()I", "selectedItemPosition", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class HappSpinnerField extends LinearLayout {
    public static final /* synthetic */ int i0 = 0;
    public final TextView f0;
    public final CustomSpinner g0;
    public final TextView h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HappSpinnerField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setOrientation(1);
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context).inflate(t46.happ_spinner_field, (ViewGroup) this, true);
        View viewFindViewById = findViewById(e46.tv_spinner_field);
        viewFindViewById.getClass();
        this.f0 = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(e46.spinner);
        viewFindViewById2.getClass();
        this.g0 = (CustomSpinner) viewFindViewById2;
        View viewFindViewById3 = findViewById(e46.tv_spinner_description);
        viewFindViewById3.getClass();
        this.h0 = (TextView) viewFindViewById3;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x56.HappSpinnerField);
            typedArrayObtainStyledAttributes.getClass();
            v18.e(typedArrayObtainStyledAttributes, new zw2(this, context, (byte) 4));
        }
        setOnClickListener(new st0(this, (byte) 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDescription() {
        return this.h0.getText().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getSelectedItemPosition() {
        return this.g0.getSelectedItemPosition();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTitle() {
        return this.f0.getText().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDescription(String str) {
        str.getClass();
        this.h0.setText(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setEntries(String[] entries) {
        entries.getClass();
        Context context = getContext();
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        layoutInflaterFrom.getClass();
        CustomSpinner customSpinner = this.g0;
        customSpinner.setAdapter((SpinnerAdapter) new rf7(context, layoutInflaterFrom, customSpinner, entries));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnSpinnerItemClickListener(AdapterView.OnItemSelectedListener listener) {
        listener.getClass();
        this.g0.setOnItemSelectedListener(listener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSelection(int position) {
        CustomSpinner customSpinner = this.g0;
        if (customSpinner.getSelectedItemPosition() != position) {
            customSpinner.setSelection(position);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTitle(String str) {
        str.getClass();
        this.f0.setText(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTitleColor(int res) {
        os4.N(this.f0, res);
    }

    public final void setDescription(int res) {
        this.h0.setText(res);
    }

    public final void setTitle(int res) {
        this.f0.setText(res);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HappSpinnerField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}
