package su.happ.proxyutility.ui.foundation.component.snackbar;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.flexbox.FlexboxLayout;
import defpackage.ay2;
import defpackage.e46;
import defpackage.my2;
import defpackage.t46;
import java.util.Iterator;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.button.HappTextButton;
import su.happ.proxyutility.ui.foundation.component.snackbar.HappSnackbarView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsu/happ/proxyutility/ui/foundation/component/snackbar/HappSnackbarView;", "Landroid/widget/RelativeLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "message", "Ldn8;", "setSnackbarMessage", "(Ljava/lang/String;)V", "Lmy2;", "status", "setSnackbarStatus", "(Lmy2;)V", "", "Lay2;", "actions", "setActions", "(Ljava/lang/Iterable;)V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class HappSnackbarView extends RelativeLayout {
    public static final /* synthetic */ int n0 = 0;
    public final AppCompatImageView f0;
    public final HappTextView g0;
    public final FlexboxLayout h0;
    public final FrameLayout i0;
    public final HappTextButton j0;
    public final FrameLayout k0;
    public final HappTextButton l0;
    public final HappSettingsDivider m0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HappSnackbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View.inflate(context, t46.snackbar_content, this);
        setClipToPadding(false);
        findViewById(e46.card_snackbar).getClass();
        AppCompatImageView appCompatImageViewFindViewById = findViewById(e46.icon_snackbar_status);
        appCompatImageViewFindViewById.getClass();
        this.f0 = appCompatImageViewFindViewById;
        Object objFindViewById = findViewById(e46.tv_snackbar_message);
        objFindViewById.getClass();
        this.g0 = (HappTextView) objFindViewById;
        FlexboxLayout flexboxLayoutFindViewById = findViewById(e46.fl_actions);
        flexboxLayoutFindViewById.getClass();
        this.h0 = flexboxLayoutFindViewById;
        Object objFindViewById2 = findViewById(e46.snackbar_act1);
        objFindViewById2.getClass();
        this.j0 = (HappTextButton) objFindViewById2;
        View viewFindViewById = findViewById(e46.fl_snackbar_act1);
        viewFindViewById.getClass();
        this.i0 = (FrameLayout) viewFindViewById;
        Object objFindViewById3 = findViewById(e46.snackbar_act2);
        objFindViewById3.getClass();
        this.l0 = (HappTextButton) objFindViewById3;
        View viewFindViewById2 = findViewById(e46.fl_snackbar_act2);
        viewFindViewById2.getClass();
        this.k0 = (FrameLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(e46.divider_snackbar_actions);
        viewFindViewById3.getClass();
        this.m0 = (HappSettingsDivider) viewFindViewById3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setActions(Iterable<ay2> actions) {
        actions.getClass();
        Iterator<ay2> it = actions.iterator();
        it.getClass();
        final ay2 next = it.hasNext() ? it.next() : null;
        if (next == null) {
            return;
        }
        Context context = getContext();
        context.getClass();
        boolean zY = ue3.y(context);
        final byte b = 0;
        this.m0.setVisibility(0);
        this.h0.setVisibility(0);
        FrameLayout frameLayout = this.i0;
        frameLayout.setVisibility(0);
        final byte b2 = 1;
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(zY);
        AppCompatButton appCompatButton = this.j0;
        appCompatButton.setVisibility(0);
        appCompatButton.setText(next.a);
        appCompatButton.setClickable(false);
        appCompatButton.setCompoundDrawablesWithIntrinsicBounds(next.b, null, null, null);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: ny2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                ay2 ay2Var = next;
                switch (b3) {
                    case 0:
                        int i = HappSnackbarView.n0;
                        ay2Var.c.invoke();
                        break;
                    default:
                        int i2 = HappSnackbarView.n0;
                        ay2Var.c.invoke();
                        break;
                }
            }
        });
        if (zY) {
            new Handler(Looper.getMainLooper()).postDelayed(new xb(this, (byte) 14), 300L);
        }
        final ay2 next2 = it.hasNext() ? it.next() : null;
        if (next2 == null) {
            return;
        }
        FrameLayout frameLayout2 = this.k0;
        frameLayout2.setVisibility(0);
        frameLayout2.setFocusable(true);
        frameLayout2.setFocusableInTouchMode(zY);
        AppCompatButton appCompatButton2 = this.l0;
        appCompatButton2.setVisibility(0);
        appCompatButton2.setText(next2.a);
        appCompatButton2.setClickable(false);
        appCompatButton2.setCompoundDrawablesWithIntrinsicBounds(next2.b, null, null, null);
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: ny2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                ay2 ay2Var = next2;
                switch (b3) {
                    case 0:
                        int i = HappSnackbarView.n0;
                        ay2Var.c.invoke();
                        break;
                    default:
                        int i2 = HappSnackbarView.n0;
                        ay2Var.c.invoke();
                        break;
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSnackbarMessage(String message) {
        message.getClass();
        this.g0.setText(message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSnackbarStatus(my2 status) {
        int i;
        status.getClass();
        int iOrdinal = status.ordinal();
        if (iOrdinal == 0) {
            i = q36.ic_snackbar_positive;
        } else if (iOrdinal == 1) {
            i = q36.ic_snackbar_negative;
        } else {
            if (iOrdinal != 2) {
                b61.c();
                return;
            }
            i = q36.ic_snackbar_info;
        }
        this.f0.setImageResource(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HappSnackbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}
