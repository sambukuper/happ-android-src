package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.d46;
import defpackage.h66;
import defpackage.i56;
import defpackage.ju4;
import defpackage.nt4;
import defpackage.st4;
import defpackage.u46;
import defpackage.w26;
import defpackage.zv7;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements ju4, AbsListView.SelectionBoundsAdjuster {
    public st4 f0;
    public ImageView g0;
    public RadioButton h0;
    public TextView i0;
    public CheckBox j0;
    public TextView k0;
    public ImageView l0;
    public ImageView m0;
    public LinearLayout n0;
    public final Drawable o0;
    public final int p0;
    public final Context q0;
    public boolean r0;
    public final Drawable s0;
    public final boolean t0;
    public LayoutInflater u0;
    public boolean v0;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        zv7 zv7VarR = zv7.r(i, 0, getContext(), attributeSet, h66.MenuView);
        this.o0 = zv7VarR.e(h66.MenuView_android_itemBackground);
        int i2 = h66.MenuView_android_itemTextAppearance;
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        this.p0 = typedArray.getResourceId(i2, -1);
        this.r0 = typedArray.getBoolean(h66.MenuView_preserveIconSpacing, false);
        this.q0 = context;
        this.s0 = zv7VarR.e(h66.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, w26.dropDownListViewStyle, 0);
        this.t0 = typedArrayObtainStyledAttributes.hasValue(0);
        zv7VarR.v();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.u0;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.u0 = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.l0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.m0;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m0.getLayoutParams();
        rect.top = this.m0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // defpackage.ju4
    public final void c(st4 st4Var) {
        boolean z;
        int i;
        String string;
        this.f0 = st4Var;
        boolean zIsVisible = st4Var.isVisible();
        nt4 nt4Var = st4Var.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(st4Var.e);
        setCheckable(st4Var.isCheckable());
        if (nt4Var.o()) {
            if ((nt4Var.n() ? st4Var.j : st4Var.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        nt4Var.n();
        if (z) {
            st4 st4Var2 = this.f0;
            nt4 nt4Var2 = st4Var2.n;
            if (nt4Var2.o()) {
                i = (nt4Var2.n() ? st4Var2.j : st4Var2.h) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.k0;
            st4 st4Var3 = this.f0;
            nt4 nt4Var3 = st4Var3.n;
            Context context = nt4Var3.a;
            char c = nt4Var3.n() ? st4Var3.j : st4Var3.h;
            if (c == 0) {
                string = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(i56.abc_prepend_shortcut_label));
                }
                int i2 = nt4Var3.n() ? st4Var3.k : st4Var3.i;
                st4.b(i2, DnsOverHttps.MAX_RESPONSE_SIZE, resources.getString(i56.abc_menu_meta_shortcut_label), sb);
                st4.b(i2, 4096, resources.getString(i56.abc_menu_ctrl_shortcut_label), sb);
                st4.b(i2, 2, resources.getString(i56.abc_menu_alt_shortcut_label), sb);
                st4.b(i2, 1, resources.getString(i56.abc_menu_shift_shortcut_label), sb);
                st4.b(i2, 4, resources.getString(i56.abc_menu_sym_shortcut_label), sb);
                st4.b(i2, 8, resources.getString(i56.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(i56.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(i56.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(i56.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.k0.getVisibility() != i) {
            this.k0.setVisibility(i);
        }
        setIcon(st4Var.getIcon());
        setEnabled(st4Var.isEnabled());
        setSubMenuArrowVisible(st4Var.hasSubMenu());
        setContentDescription(st4Var.q);
    }

    @Override // defpackage.ju4
    public st4 getItemData() {
        return this.f0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.o0);
        TextView textView = (TextView) findViewById(d46.title);
        this.i0 = textView;
        int i = this.p0;
        if (i != -1) {
            textView.setTextAppearance(this.q0, i);
        }
        this.k0 = (TextView) findViewById(d46.shortcut);
        ImageView imageView = (ImageView) findViewById(d46.submenuarrow);
        this.l0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.s0);
        }
        this.m0 = (ImageView) findViewById(d46.group_divider);
        this.n0 = (LinearLayout) findViewById(d46.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.g0 != null && this.r0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.g0.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.h0 == null && this.j0 == null) {
            return;
        }
        if ((this.f0.x & 4) != 0) {
            if (this.h0 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(u46.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h0 = radioButton;
                LinearLayout linearLayout = this.n0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h0;
            compoundButton2 = this.j0;
            compoundButton3 = compoundButton2;
        } else {
            if (this.j0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(u46.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.j0 = checkBox;
                LinearLayout linearLayout2 = this.n0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.j0;
            compoundButton2 = this.h0;
            compoundButton3 = compoundButton;
        }
        if (!z) {
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.h0;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.f0.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
            return;
        }
        compoundButton2.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f0.x & 4) != 0) {
            if (this.h0 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(u46.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h0 = radioButton;
                LinearLayout linearLayout = this.n0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h0;
        } else {
            if (this.j0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(u46.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.j0 = checkBox;
                LinearLayout linearLayout2 = this.n0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.j0;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.v0 = z;
        this.r0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.m0;
        if (imageView != null) {
            imageView.setVisibility((this.t0 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        nt4 nt4Var = this.f0.n;
        boolean z = this.v0;
        if (z || this.r0) {
            ImageView imageView = this.g0;
            if (imageView == null && drawable == null && !this.r0) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(u46.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.g0 = imageView2;
                LinearLayout linearLayout = this.n0;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.r0) {
                this.g0.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.g0;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.g0.getVisibility() != 0) {
                this.g0.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.i0;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.i0.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.i0.getVisibility() != 0) {
                this.i0.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.listMenuViewStyle);
    }
}
