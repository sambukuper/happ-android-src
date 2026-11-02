package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import defpackage.hw7;
import defpackage.n36;
import java.util.Random;
import java.util.regex.Pattern;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
abstract class StreamingTextView extends EditText {
    public static final Pattern k0 = Pattern.compile("\\S+");
    public static final b l0 = new b(Integer.class, "streamPosition");
    public final Random f0;
    public Bitmap g0;
    public Bitmap h0;
    public int i0;
    public ObjectAnimator j0;

    public StreamingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f0 = new Random();
    }

    public int getStreamPosition() {
        return this.i0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), n36.lb_text_dot_one);
        this.g0 = Bitmap.createScaledBitmap(bitmapDecodeResource, (int) (bitmapDecodeResource.getWidth() * 1.3f), (int) (bitmapDecodeResource.getHeight() * 1.3f), false);
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), n36.lb_text_dot_two);
        this.h0 = Bitmap.createScaledBitmap(bitmapDecodeResource2, (int) (bitmapDecodeResource2.getWidth() * 1.3f), (int) (bitmapDecodeResource2.getHeight() * 1.3f), false);
        SearchEditText searchEditText = (SearchEditText) this;
        searchEditText.i0 = -1;
        ObjectAnimator objectAnimator = searchEditText.j0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        searchEditText.setText(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.leanback.widget.StreamingTextView");
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hw7.k(callback, this));
    }

    public void setStreamPosition(int i) {
        this.i0 = i;
        invalidate();
    }
}
