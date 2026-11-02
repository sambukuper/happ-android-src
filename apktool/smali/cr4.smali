.class public final Lcr4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lp95;


# instance fields
.field public final synthetic X:I

.field public final synthetic Y:Landroid/view/View;

.field public final synthetic Z:I

.field public final synthetic f0:I

.field public final synthetic g0:I


# direct methods
.method public constructor <init>(Landroid/view/View;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lcr4;->X:I

    .line 5
    .line 6
    iput-object p1, p0, Lcr4;->Y:Landroid/view/View;

    .line 7
    .line 8
    iput p3, p0, Lcr4;->Z:I

    .line 9
    .line 10
    iput p4, p0, Lcr4;->f0:I

    .line 11
    .line 12
    iput p5, p0, Lcr4;->g0:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final C(Landroid/view/View;Lw19;)Lw19;
    .locals 4

    .line 1
    const/16 p1, 0x207

    .line 2
    .line 3
    iget-object v0, p2, Lw19;->a:Lt19;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lt19;->h(I)Lfe3;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Lcr4;->Y:Landroid/view/View;

    .line 10
    .line 11
    iget v1, p0, Lcr4;->X:I

    .line 12
    .line 13
    if-ltz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p1, Lfe3;->b:I

    .line 20
    .line 21
    add-int/2addr v1, v3

    .line 22
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget v1, p0, Lcr4;->Z:I

    .line 32
    .line 33
    iget v2, p1, Lfe3;->a:I

    .line 34
    .line 35
    add-int/2addr v1, v2

    .line 36
    iget v2, p0, Lcr4;->f0:I

    .line 37
    .line 38
    iget v3, p1, Lfe3;->b:I

    .line 39
    .line 40
    add-int/2addr v2, v3

    .line 41
    iget p0, p0, Lcr4;->g0:I

    .line 42
    .line 43
    iget p1, p1, Lfe3;->c:I

    .line 44
    .line 45
    add-int/2addr p0, p1

    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {v0, v1, v2, p0, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 51
    .line 52
    .line 53
    return-object p2
.end method
