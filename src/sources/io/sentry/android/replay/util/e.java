package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import defpackage.bz4;
import defpackage.g24;
import defpackage.g44;
import defpackage.gn2;
import defpackage.i21;
import defpackage.nr4;
import defpackage.oc;
import defpackage.qg5;
import defpackage.tg5;
import defpackage.x78;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g24 implements gn2 {
    public final /* synthetic */ f Y;
    public final /* synthetic */ Bitmap Z;
    public final /* synthetic */ Matrix f0;
    public final /* synthetic */ ArrayList g0;
    public final /* synthetic */ Canvas h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Bitmap bitmap, Matrix matrix, ArrayList arrayList, Canvas canvas) {
        super(1);
        this.Y = fVar;
        this.Z = bitmap;
        this.f0 = matrix;
        this.g0 = arrayList;
        this.h0 = canvas;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        qg5 qg5Var;
        qg5 qg5Var2;
        Integer num;
        int lineCount;
        List listK;
        float lineRight;
        int lineTop;
        int lineBottom;
        int i;
        io.sentry.android.replay.viewhierarchy.g gVar = (io.sentry.android.replay.viewhierarchy.g) obj;
        f fVar = this.Y;
        g44 g44Var = fVar.Z;
        g44 g44Var2 = fVar.X;
        gVar.getClass();
        if (gVar.d && gVar.a > 0 && gVar.b > 0) {
            Rect rect = gVar.f;
            if (rect == null) {
                return Boolean.FALSE;
            }
            Integer numValueOf = null;
            int iIntValue = -16777216;
            if (gVar instanceof io.sentry.android.replay.viewhierarchy.d) {
                List listK2 = i21.K(rect);
                Rect rect2 = gVar.f;
                Bitmap bitmap = this.Z;
                if (!bitmap.isRecycled() && !((Bitmap) g44Var2.getValue()).isRecycled()) {
                    Rect rect3 = new Rect(rect2);
                    RectF rectF = new RectF(rect3);
                    Matrix matrix = this.f0;
                    if (matrix != null) {
                        matrix.mapRect(rectF);
                    }
                    rectF.round(rect3);
                    ((Canvas) fVar.Y.getValue()).drawBitmap(bitmap, rect3, new Rect(0, 0, 1, 1), (Paint) null);
                    iIntValue = ((Bitmap) g44Var2.getValue()).getPixel(0, 0);
                }
                qg5Var2 = new qg5(listK2, Integer.valueOf(iIntValue));
            } else {
                if (gVar instanceof io.sentry.android.replay.viewhierarchy.f) {
                    io.sentry.android.replay.viewhierarchy.f fVar2 = (io.sentry.android.replay.viewhierarchy.f) gVar;
                    io.sentry.d dVar = fVar2.h;
                    if (dVar != null) {
                        switch (dVar.X) {
                            case 5:
                                Layout layout = (Layout) dVar.Y;
                                if (layout.getText() instanceof Spanned) {
                                    CharSequence text = layout.getText();
                                    text.getClass();
                                    ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
                                    foregroundColorSpanArr.getClass();
                                    int i2 = Integer.MIN_VALUE;
                                    Integer numValueOf2 = null;
                                    for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                                        CharSequence text2 = layout.getText();
                                        text2.getClass();
                                        int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
                                        CharSequence text3 = layout.getText();
                                        text3.getClass();
                                        int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
                                        if (spanStart != -1 && spanEnd != -1 && (i = spanEnd - spanStart) > i2) {
                                            numValueOf2 = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                                            i2 = i;
                                        }
                                    }
                                    if (numValueOf2 != null) {
                                        numValueOf = Integer.valueOf(numValueOf2.intValue() | (-16777216));
                                    } else {
                                        numValueOf = null;
                                    }
                                } else {
                                    numValueOf = null;
                                }
                                break;
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            num = fVar2.i;
                            if (num != null) {
                                iIntValue = num.intValue();
                            }
                        }
                    } else {
                        num = fVar2.i;
                        if (num != null) {
                            iIntValue = num.intValue();
                        }
                    }
                    Rect rect4 = gVar.f;
                    int i3 = fVar2.j;
                    int i4 = fVar2.k;
                    rect4.getClass();
                    if (dVar == null) {
                        listK = i21.K(rect4);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        switch (dVar.X) {
                            case 5:
                                lineCount = ((Layout) dVar.Y).getLineCount();
                                break;
                            default:
                                lineCount = ((x78) dVar.Y).b.f;
                                break;
                        }
                        for (int i5 = 0; i5 < lineCount; i5++) {
                            float lineLeft = 0.0f;
                            switch (dVar.X) {
                                case 5:
                                    Layout layout2 = (Layout) dVar.Y;
                                    if (layout2.getEllipsizedWidth() <= 0 || layout2.getEllipsizedWidth() >= layout2.getWidth()) {
                                        lineLeft = layout2.getLineLeft(i5);
                                    }
                                    break;
                                default:
                                    x78 x78Var = (x78) dVar.Y;
                                    if (x78Var.b.d <= ((int) (x78Var.c >> 32))) {
                                        lineLeft = x78Var.f(i5);
                                    }
                                    break;
                            }
                            int i6 = (int) lineLeft;
                            switch (dVar.X) {
                                case 5:
                                    Layout layout3 = (Layout) dVar.Y;
                                    lineRight = (layout3.getEllipsizedWidth() <= 0 || layout3.getEllipsizedWidth() >= layout3.getWidth()) ? layout3.getLineRight(i5) : layout3.getEllipsizedWidth();
                                    break;
                                default:
                                    x78 x78Var2 = (x78) dVar.Y;
                                    bz4 bz4Var = x78Var2.b;
                                    if (bz4Var.d > ((float) ((int) (x78Var2.c >> 32)))) {
                                        bz4Var.l(i5);
                                        ArrayList arrayList2 = bz4Var.h;
                                        tg5 tg5Var = (tg5) arrayList2.get(oc.q(i5, arrayList2));
                                        lineRight = tg5Var.a.d.f.getLineWidth(i5 - tg5Var.d);
                                    } else {
                                        lineRight = x78Var2.g(i5);
                                    }
                                    break;
                            }
                            int i7 = (int) lineRight;
                            switch (dVar.X) {
                                case 5:
                                    lineTop = ((Layout) dVar.Y).getLineTop(i5);
                                    break;
                                default:
                                    lineTop = nr4.O(((x78) dVar.Y).b.e(i5));
                                    break;
                            }
                            switch (dVar.X) {
                                case 5:
                                    lineBottom = ((Layout) dVar.Y).getLineBottom(i5);
                                    break;
                                default:
                                    lineBottom = nr4.O(((x78) dVar.Y).b.a(i5));
                                    break;
                            }
                            Rect rect5 = new Rect();
                            rect5.left = rect4.left + i3 + i6;
                            rect5.right = rect4.left + i3 + i7;
                            int i8 = rect4.top + i4 + lineTop;
                            rect5.top = i8;
                            rect5.bottom = (lineBottom - lineTop) + i8;
                            arrayList.add(rect5);
                        }
                        listK = arrayList;
                    }
                    qg5Var = new qg5(listK, Integer.valueOf(iIntValue));
                } else {
                    qg5Var = new qg5(i21.K(rect), -16777216);
                }
                qg5Var2 = qg5Var;
            }
            List list = (List) qg5Var2.X;
            ((Paint) g44Var.getValue()).setColor(((Number) qg5Var2.Y).intValue());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h0.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, (Paint) g44Var.getValue());
            }
            this.g0.addAll(list);
        }
        return Boolean.TRUE;
    }
}
