.class public final Lp35;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Liv7;


# direct methods
.method public constructor <init>(Liv7;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp35;->a:Liv7;

    .line 5
    .line 6
    return-void
.end method

.method public static a(Lwv7;Lov7;)V
    .locals 2

    .line 1
    iget-boolean p1, p1, Lov7;->b:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/high16 p1, 0x41800000    # 16.0f

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    iget-object p0, p0, Lwv7;->u:Loi3;

    .line 10
    .line 11
    iget-object v0, p0, Loi3;->n0:Lcom/tistory/zladnrms/roundablelayout/RoundableLayout;

    .line 12
    .line 13
    iget-object p0, p0, Lkw8;->Z:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-static {v1, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-virtual {v0, p0}, Lcom/tistory/zladnrms/roundablelayout/RoundableLayout;->setCornerLeftBottom(F)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Lcom/tistory/zladnrms/roundablelayout/RoundableLayout;->setCornerRightBottom(F)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static b(Lwv7;Lov7;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lwv7;->u:Loi3;

    .line 2
    .line 3
    iget-object v0, p0, Loi3;->m0:Lsu/happ/proxyutility/ui/foundation/component/HappTextView;

    .line 4
    .line 5
    iget-object p0, p0, Lkw8;->Z:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p1, p1, Lov7;->a:La45;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    if-ne p1, v1, :cond_0

    .line 21
    .line 22
    sget p1, Ly46;->network_filter_only_wifi:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    sget p1, Ly46;->network_filter_only_mobile:I

    .line 30
    .line 31
    :goto_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
