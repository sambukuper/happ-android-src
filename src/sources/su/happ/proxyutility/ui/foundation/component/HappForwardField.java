package su.happ.proxyutility.ui.foundation.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.e46;
import defpackage.t46;
import defpackage.x56;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\rJ\u001b\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\f\u0010\u0019R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u000f\u0010\u0019R$\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u0010\u0010\u0019¨\u0006\u001e"}, d2 = {"Lsu/happ/proxyutility/ui/foundation/component/HappForwardField;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "res", "Ldn8;", "setTitle", "(I)V", "setTitleColor", "setValue", "setDescription", "Lkotlin/Function0;", "handle", "setOnForwardIconClickListener", "(Ldn2;)V", "", "value", "getTitle", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "title", "getValue", "getDescription", "description", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class HappForwardField extends LinearLayout {
    public static final /* synthetic */ int j0 = 0;
    public final TextView f0;
    public final TextView g0;
    public final AppCompatImageView h0;
    public final TextView i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HappForwardField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setOrientation(1);
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context).inflate(t46.happ_forward_field, (ViewGroup) this, true);
        View viewFindViewById = findViewById(e46.tv_forward_field);
        viewFindViewById.getClass();
        this.f0 = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(e46.tv_forward_value);
        viewFindViewById2.getClass();
        this.g0 = (TextView) viewFindViewById2;
        AppCompatImageView appCompatImageViewFindViewById = findViewById(e46.iv_forward_field);
        appCompatImageViewFindViewById.getClass();
        this.h0 = appCompatImageViewFindViewById;
        View viewFindViewById3 = findViewById(e46.tv_forward_description);
        viewFindViewById3.getClass();
        this.i0 = (TextView) viewFindViewById3;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x56.HappForwardField);
            typedArrayObtainStyledAttributes.getClass();
            v18.e(typedArrayObtainStyledAttributes, new p0(this, context, (byte) 29));
        }
        setOnClickListener(new st0(this, (byte) 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDescription() {
        return this.i0.getText().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTitle() {
        return this.f0.getText().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getValue() {
        return this.g0.getText().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDescription(String str) {
        str.getClass();
        this.i0.setText(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnForwardIconClickListener(dn2 handle) {
        handle.getClass();
        this.h0.setOnClickListener(new st0(handle, (byte) 5));
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setValue(String str) {
        str.getClass();
        this.g0.setText(str);
    }

    public final void setDescription(int res) {
        this.i0.setText(res);
    }

    public final void setTitle(int res) {
        this.f0.setText(res);
    }

    public final void setValue(int res) {
        this.g0.setText(res);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HappForwardField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}
