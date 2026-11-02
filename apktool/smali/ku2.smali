.class public abstract Lku2;
.super Landroidx/recyclerview/widget/c;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public p:Z

.field public final synthetic q:Landroidx/leanback/widget/GridLayoutManager;


# direct methods
.method public constructor <init>(Landroidx/leanback/widget/GridLayoutManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lku2;->q:Landroidx/leanback/widget/GridLayoutManager;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/c;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/recyclerview/widget/c;->c()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lku2;->p:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lku2;->k()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lku2;->q:Landroidx/leanback/widget/GridLayoutManager;

    .line 12
    .line 13
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->H0:Lku2;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-ne v1, p0, :cond_1

    .line 17
    .line 18
    iput-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->H0:Lku2;

    .line 19
    .line 20
    :cond_1
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->I0:Lmu2;

    .line 21
    .line 22
    if-ne v1, p0, :cond_2

    .line 23
    .line 24
    iput-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->I0:Lmu2;

    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public final d(Landroid/view/View;Ln96;)V
    .locals 6

    .line 1
    sget-object v0, Landroidx/leanback/widget/GridLayoutManager;->i1:[I

    .line 2
    .line 3
    iget-object v1, p0, Lku2;->q:Landroidx/leanback/widget/GridLayoutManager;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, p1, v2, v0}, Landroidx/leanback/widget/GridLayoutManager;->k1(Landroid/view/View;Landroid/view/View;[I)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-boolean p1, v1, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    aget p1, v0, v2

    .line 19
    .line 20
    aget v0, v0, v1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    aget p1, v0, v1

    .line 24
    .line 25
    aget v0, v0, v2

    .line 26
    .line 27
    :goto_0
    mul-int v2, p1, p1

    .line 28
    .line 29
    mul-int v3, v0, v0

    .line 30
    .line 31
    add-int/2addr v3, v2

    .line 32
    int-to-double v2, v3

    .line 33
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    double-to-int v2, v2

    .line 38
    invoke-virtual {p0, v2}, Lku2;->j(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-double v2, v2

    .line 43
    const-wide v4, 0x3fd57a786c22680aL    # 0.3356

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    div-double/2addr v2, v4

    .line 49
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    double-to-int v2, v2

    .line 54
    iput p1, p2, Ln96;->a:I

    .line 55
    .line 56
    iput v0, p2, Ln96;->b:I

    .line 57
    .line 58
    iput v2, p2, Ln96;->c:I

    .line 59
    .line 60
    iget-object p0, p0, Landroidx/recyclerview/widget/c;->i:Landroid/view/animation/DecelerateInterpolator;

    .line 61
    .line 62
    iput-object p0, p2, Ln96;->e:Landroid/view/animation/BaseInterpolator;

    .line 63
    .line 64
    iput-boolean v1, p2, Ln96;->f:Z

    .line 65
    .line 66
    :cond_1
    return-void
.end method

.method public final i(Landroid/util/DisplayMetrics;)F
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/c;->i(Landroid/util/DisplayMetrics;)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object p0, p0, Lku2;->q:Landroidx/leanback/widget/GridLayoutManager;

    .line 6
    .line 7
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->r0:F

    .line 8
    .line 9
    mul-float/2addr p1, p0

    .line 10
    return p1
.end method

.method public final j(I)I
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/c;->j(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lku2;->q:Landroidx/leanback/widget/GridLayoutManager;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->Z0:Lyr6;

    .line 8
    .line 9
    iget-object p0, p0, Lyr6;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lm09;

    .line 12
    .line 13
    iget p0, p0, Lm09;->i:I

    .line 14
    .line 15
    if-lez p0, :cond_0

    .line 16
    .line 17
    const/high16 v1, 0x41f00000    # 30.0f

    .line 18
    .line 19
    int-to-float p0, p0

    .line 20
    div-float/2addr v1, p0

    .line 21
    int-to-float p0, p1

    .line 22
    mul-float/2addr v1, p0

    .line 23
    int-to-float p0, v0

    .line 24
    cmpg-float p0, p0, v1

    .line 25
    .line 26
    if-gez p0, :cond_0

    .line 27
    .line 28
    float-to-int p0, v1

    .line 29
    return p0

    .line 30
    :cond_0
    return v0
.end method

.method public k()V
    .locals 3

    .line 1
    iget v0, p0, Lp96;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lp96;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->s0:Landroidx/recyclerview/widget/j;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lku2;->q:Landroidx/leanback/widget/GridLayoutManager;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget p0, p0, Lp96;->a:I

    .line 16
    .line 17
    if-ltz p0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {v1, p0, v0}, Landroidx/leanback/widget/GridLayoutManager;->A1(IZ)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    iget v2, v1, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 25
    .line 26
    iget p0, p0, Lp96;->a:I

    .line 27
    .line 28
    if-eq v2, p0, :cond_2

    .line 29
    .line 30
    iput p0, v1, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 31
    .line 32
    :cond_2
    invoke-virtual {v1}, Landroidx/recyclerview/widget/j;->X()Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_3

    .line 37
    .line 38
    iget p0, v1, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 39
    .line 40
    or-int/lit8 p0, p0, 0x20

    .line 41
    .line 42
    iput p0, v1, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 45
    .line 46
    .line 47
    iget p0, v1, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 48
    .line 49
    and-int/lit8 p0, p0, -0x21

    .line 50
    .line 51
    iput p0, v1, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 52
    .line 53
    :cond_3
    invoke-virtual {v1}, Landroidx/leanback/widget/GridLayoutManager;->b1()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Landroidx/leanback/widget/GridLayoutManager;->c1()V

    .line 57
    .line 58
    .line 59
    return-void
.end method
