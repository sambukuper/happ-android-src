.class public final Lgl6;
.super Landroid/view/View;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final k0:[I

.field public static final l0:[I


# instance fields
.field public f0:Lrn8;

.field public g0:Ljava/lang/Boolean;

.field public h0:Ljava/lang/Long;

.field public i0:Lfl6;

.field public j0:Lhg;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const v0, 0x10100a7

    .line 2
    .line 3
    .line 4
    const v1, 0x101009e

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lgl6;->k0:[I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    new-array v0, v0, [I

    .line 15
    .line 16
    sput-object v0, Lgl6;->l0:[I

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Lgl6;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lgl6;->setRippleState$lambda$2(Lgl6;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final setRippleState(Z)V
    .locals 6

    .line 1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lgl6;->i0:Lfl6;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Lfl6;->run()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v2, p0, Lgl6;->h0:Ljava/lang/Long;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    :goto_0
    sub-long v2, v0, v2

    .line 27
    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    const-wide/16 v4, 0x5

    .line 31
    .line 32
    cmp-long v2, v2, v4

    .line 33
    .line 34
    if-gez v2, :cond_2

    .line 35
    .line 36
    new-instance p1, Lfl6;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {p1, p0, v2}, Lfl6;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lgl6;->i0:Lfl6;

    .line 43
    .line 44
    const-wide/16 v2, 0x32

    .line 45
    .line 46
    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    if-eqz p1, :cond_3

    .line 51
    .line 52
    sget-object p1, Lgl6;->k0:[I

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    sget-object p1, Lgl6;->l0:[I

    .line 56
    .line 57
    :goto_1
    iget-object v2, p0, Lgl6;->f0:Lrn8;

    .line 58
    .line 59
    if-nez v2, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 63
    .line 64
    .line 65
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lgl6;->h0:Ljava/lang/Long;

    .line 70
    .line 71
    return-void
.end method

.method private static final setRippleState$lambda$2(Lgl6;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgl6;->f0:Lrn8;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v1, Lgl6;->l0:[I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 9
    .line 10
    .line 11
    :goto_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lgl6;->i0:Lfl6;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Lft5;ZJIJLhg;)V
    .locals 5

    .line 1
    iget-wide v0, p1, Lft5;->a:J

    .line 2
    .line 3
    iget-object p1, p0, Lgl6;->f0:Lrn8;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v2, p0, Lgl6;->g0:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    :cond_0
    new-instance p1, Lrn8;

    .line 20
    .line 21
    invoke-direct {p1, p2}, Lrn8;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lgl6;->f0:Lrn8;

    .line 28
    .line 29
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lgl6;->g0:Ljava/lang/Boolean;

    .line 34
    .line 35
    :cond_1
    iget-object p1, p0, Lgl6;->f0:Lrn8;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iput-object p8, p0, Lgl6;->j0:Lhg;

    .line 41
    .line 42
    move-wide p7, p6

    .line 43
    move-wide v3, p3

    .line 44
    move-object p3, p0

    .line 45
    move p4, p5

    .line 46
    move-wide p5, v3

    .line 47
    invoke-virtual/range {p3 .. p8}, Lgl6;->e(IJJ)V

    .line 48
    .line 49
    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    const/16 p0, 0x20

    .line 53
    .line 54
    shr-long p4, v0, p0

    .line 55
    .line 56
    long-to-int p0, p4

    .line 57
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    const-wide p4, 0xffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr p4, v0

    .line 67
    long-to-int p2, p4

    .line 68
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-virtual {p1, p0, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerX()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    int-to-float p0, p0

    .line 85
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    int-to-float p2, p2

    .line 94
    invoke-virtual {p1, p0, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    .line 95
    .line 96
    .line 97
    :goto_0
    const/4 p0, 0x1

    .line 98
    invoke-direct {p3, p0}, Lgl6;->setRippleState(Z)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lgl6;->j0:Lhg;

    .line 3
    .line 4
    iget-object v0, p0, Lgl6;->i0:Lfl6;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lgl6;->i0:Lfl6;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lfl6;->run()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lgl6;->f0:Lrn8;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    sget-object v1, Lgl6;->l0:[I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Lgl6;->f0:Lrn8;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    const/4 v1, 0x0

    .line 36
    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/view/View;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lgl6;->setRippleState(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lgl6;->c()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e(IJJ)V
    .locals 4

    .line 1
    iget-object v0, p0, Lgl6;->f0:Lrn8;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, v0, Lrn8;->Z:Ljava/lang/Integer;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eq v1, p1, :cond_2

    .line 16
    .line 17
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, Lrn8;->Z:Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/RippleDrawable;->setRadius(I)V

    .line 24
    .line 25
    .line 26
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v1, 0x1c

    .line 29
    .line 30
    if-ge p1, v1, :cond_3

    .line 31
    .line 32
    const p1, 0x3e4ccccd    # 0.2f

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    const p1, 0x3dcccccd    # 0.1f

    .line 37
    .line 38
    .line 39
    :goto_1
    const/high16 v1, 0x3f800000    # 1.0f

    .line 40
    .line 41
    cmpl-float v2, p1, v1

    .line 42
    .line 43
    if-lez v2, :cond_4

    .line 44
    .line 45
    move p1, v1

    .line 46
    :cond_4
    invoke-static {p1, p4, p5}, Ldw0;->b(FJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide p4

    .line 50
    iget-object p1, v0, Lrn8;->Y:Ldw0;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    if-nez p1, :cond_5

    .line 54
    .line 55
    move p1, v1

    .line 56
    goto :goto_2

    .line 57
    :cond_5
    iget-wide v2, p1, Ldw0;->a:J

    .line 58
    .line 59
    invoke-static {v2, v3, p4, p5}, Ltk8;->a(JJ)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    :goto_2
    if-nez p1, :cond_6

    .line 64
    .line 65
    new-instance p1, Ldw0;

    .line 66
    .line 67
    invoke-direct {p1, p4, p5}, Ldw0;-><init>(J)V

    .line 68
    .line 69
    .line 70
    iput-object p1, v0, Lrn8;->Y:Ldw0;

    .line 71
    .line 72
    invoke-static {p4, p5}, Lz51;->U(J)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 81
    .line 82
    .line 83
    :cond_6
    new-instance p1, Landroid/graphics/Rect;

    .line 84
    .line 85
    invoke-static {p2, p3}, Lua7;->d(J)F

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    invoke-static {p4}, Lnr4;->O(F)I

    .line 90
    .line 91
    .line 92
    move-result p4

    .line 93
    invoke-static {p2, p3}, Lua7;->b(J)F

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    invoke-static {p2}, Lnr4;->O(F)I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-direct {p1, v1, v1, p4, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 102
    .line 103
    .line 104
    iget p2, p1, Landroid/graphics/Rect;->left:I

    .line 105
    .line 106
    invoke-virtual {p0, p2}, Landroid/view/View;->setLeft(I)V

    .line 107
    .line 108
    .line 109
    iget p2, p1, Landroid/graphics/Rect;->top:I

    .line 110
    .line 111
    invoke-virtual {p0, p2}, Landroid/view/View;->setTop(I)V

    .line 112
    .line 113
    .line 114
    iget p2, p1, Landroid/graphics/Rect;->right:I

    .line 115
    .line 116
    invoke-virtual {p0, p2}, Landroid/view/View;->setRight(I)V

    .line 117
    .line 118
    .line 119
    iget p2, p1, Landroid/graphics/Rect;->bottom:I

    .line 120
    .line 121
    invoke-virtual {p0, p2}, Landroid/view/View;->setBottom(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lgl6;->j0:Lhg;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lhg;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final refreshDrawableState()V
    .locals 0

    .line 1
    return-void
.end method
