package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.ab8;
import defpackage.bb8;
import defpackage.cz6;
import defpackage.q46;
import defpackage.r26;
import defpackage.u36;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class TitleView extends FrameLayout {
    public final ImageView f0;
    public final TextView g0;
    public final SearchOrbView h0;
    public final byte i0;
    public boolean j0;
    public final ab8 k0;

    public TitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i0 = (byte) 6;
        this.j0 = false;
        this.k0 = new ab8();
        View viewInflate = LayoutInflater.from(context).inflate(q46.lb_title_view, this);
        this.f0 = (ImageView) viewInflate.findViewById(u36.title_badge);
        this.g0 = (TextView) viewInflate.findViewById(u36.title_text);
        this.h0 = (SearchOrbView) viewInflate.findViewById(u36.title_orb);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public Drawable getBadgeDrawable() {
        return this.f0.getDrawable();
    }

    public cz6 getSearchAffordanceColors() {
        return this.h0.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.h0;
    }

    public CharSequence getTitle() {
        return this.g0.getText();
    }

    public bb8 getTitleViewAdapter() {
        return this.k0;
    }

    public void setBadgeDrawable(Drawable drawable) {
        ImageView imageView = this.f0;
        imageView.setImageDrawable(drawable);
        Drawable drawable2 = imageView.getDrawable();
        TextView textView = this.g0;
        if (drawable2 != null) {
            imageView.setVisibility(0);
            textView.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            textView.setVisibility(0);
        }
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        this.j0 = onClickListener != null;
        SearchOrbView searchOrbView = this.h0;
        searchOrbView.setOnOrbClickedListener(onClickListener);
        searchOrbView.setVisibility((this.j0 && (this.i0 & 4) == 4) ? 0 : 4);
    }

    public void setSearchAffordanceColors(cz6 cz6Var) {
        this.h0.setOrbColors(cz6Var);
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.g0;
        textView.setText(charSequence);
        ImageView imageView = this.f0;
        if (imageView.getDrawable() != null) {
            imageView.setVisibility(0);
            textView.setVisibility(8);
        } else {
            imageView.setVisibility(8);
            textView.setVisibility(0);
        }
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r26.browseTitleViewStyle);
    }
}
