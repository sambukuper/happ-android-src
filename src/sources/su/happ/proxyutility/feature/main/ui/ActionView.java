package su.happ.proxyutility.feature.main.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.t46;
import defpackage.x56;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.ui.ActionView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lsu/happ/proxyutility/feature/main/ui/ActionView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "resId", "Ldn8;", "setIcon", "(I)V", "Landroid/widget/ImageView;", "f0", "Lg44;", "getIconView", "()Landroid/widget/ImageView;", "iconView", "Landroid/widget/TextView;", "g0", "getTextView", "()Landroid/widget/TextView;", "textView", "", "value", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ActionView extends LinearLayout {
    public static final /* synthetic */ int h0 = 0;
    public final vz7 f0;
    public final vz7 g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        final byte b = 0;
        this.f0 = new vz7(new dn2(this) { // from class: n5
            public final /* synthetic */ ActionView Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b2 = b;
                ActionView actionView = this.Y;
                switch (b2) {
                    case 0:
                        int i = ActionView.h0;
                        return (ImageView) actionView.findViewById(e46.icon);
                    default:
                        int i2 = ActionView.h0;
                        return (TextView) actionView.findViewById(e46.text);
                }
            }
        });
        final byte b2 = 1;
        this.g0 = new vz7(new dn2(this) { // from class: n5
            public final /* synthetic */ ActionView Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                byte b3 = b2;
                ActionView actionView = this.Y;
                switch (b3) {
                    case 0:
                        int i = ActionView.h0;
                        return (ImageView) actionView.findViewById(e46.icon);
                    default:
                        int i2 = ActionView.h0;
                        return (TextView) actionView.findViewById(e46.text);
                }
            }
        });
        LayoutInflater.from(context).inflate(t46.action_view, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, x56.ActionView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(x56.ActionView_iconSrc, 0);
            String string = typedArrayObtainStyledAttributes.getString(x56.ActionView_text);
            if (resourceId != 0) {
                getIconView().setImageResource(resourceId);
            }
            if (string != null) {
                getTextView().setText(string);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final ImageView getIconView() {
        Object value = this.f0.getValue();
        value.getClass();
        return (ImageView) value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final TextView getTextView() {
        Object value = this.g0.getValue();
        value.getClass();
        return (TextView) value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getText() {
        return getTextView().getText().toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setIcon(int resId) {
        getIconView().setImageResource(resId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setText(String str) {
        str.getClass();
        getTextView().setText(str);
    }
}
