.class public final Lxy4;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# instance fields
.field public final X:Landroid/graphics/Movie;

.field public final Y:Landroid/graphics/Bitmap$Config;

.field public final Z:Lpw6;

.field public final f0:Landroid/graphics/Paint;

.field public final g0:Ljava/util/ArrayList;

.field public final h0:Landroid/graphics/Rect;

.field public final i0:Landroid/graphics/Rect;

.field public j0:Landroid/graphics/Canvas;

.field public k0:Landroid/graphics/Bitmap;

.field public l0:F

.field public m0:F

.field public n0:F

.field public o0:F

.field public p0:Z

.field public q0:J

.field public r0:J

.field public s0:I

.field public t0:Landroid/graphics/Picture;

.field public u0:Lco5;

.field public v0:Z


# direct methods
.method public constructor <init>(Landroid/graphics/Movie;Landroid/graphics/Bitmap$Config;Lpw6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxy4;->X:Landroid/graphics/Movie;

    .line 5
    .line 6
    iput-object p2, p0, Lxy4;->Y:Landroid/graphics/Bitmap$Config;

    .line 7
    .line 8
    iput-object p3, p0, Lxy4;->Z:Lpw6;

    .line 9
    .line 10
    new-instance p1, Landroid/graphics/Paint;

    .line 11
    .line 12
    const/4 p3, 0x3

    .line 13
    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lxy4;->f0:Landroid/graphics/Paint;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lxy4;->g0:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lxy4;->h0:Landroid/graphics/Rect;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/Rect;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lxy4;->i0:Landroid/graphics/Rect;

    .line 38
    .line 39
    const/high16 p1, 0x3f800000    # 1.0f

    .line 40
    .line 41
    iput p1, p0, Lxy4;->l0:F

    .line 42
    .line 43
    iput p1, p0, Lxy4;->m0:F

    .line 44
    .line 45
    const/4 p1, -0x1

    .line 46
    iput p1, p0, Lxy4;->s0:I

    .line 47
    .line 48
    sget-object p1, Lco5;->X:Lco5;

    .line 49
    .line 50
    iput-object p1, p0, Lxy4;->u0:Lco5;

    .line 51
    .line 52
    invoke-static {p2}, Lue3;->z(Landroid/graphics/Bitmap$Config;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-nez p0, :cond_0

    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    const-string p0, "Bitmap config must not be hardware."

    .line 60
    .line 61
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    throw p0
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lxy4;->f0:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget-object v1, p0, Lxy4;->j0:Landroid/graphics/Canvas;

    .line 4
    .line 5
    iget-object v2, p0, Lxy4;->k0:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    const/4 v3, 0x0

    .line 13
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    :try_start_0
    iget v4, p0, Lxy4;->l0:F

    .line 23
    .line 24
    invoke-virtual {v1, v4, v4}, Landroid/graphics/Canvas;->scale(FF)V

    .line 25
    .line 26
    .line 27
    iget-object v4, p0, Lxy4;->X:Landroid/graphics/Movie;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-virtual {v4, v1, v5, v5, v0}, Landroid/graphics/Movie;->draw(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;)V

    .line 31
    .line 32
    .line 33
    iget-object v4, p0, Lxy4;->t0:Landroid/graphics/Picture;

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v4, v1}, Landroid/graphics/Picture;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    :try_start_1
    iget v3, p0, Lxy4;->n0:F

    .line 51
    .line 52
    iget v4, p0, Lxy4;->o0:F

    .line 53
    .line 54
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 55
    .line 56
    .line 57
    iget p0, p0, Lxy4;->m0:F

    .line 58
    .line 59
    invoke-virtual {p1, p0, p0}, Landroid/graphics/Canvas;->scale(FF)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v2, v5, v5, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catchall_1
    move-exception p0

    .line 70
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 71
    .line 72
    .line 73
    throw p0

    .line 74
    :goto_1
    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_2
    :goto_2
    return-void
.end method

.method public final b(Landroid/graphics/Rect;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lxy4;->h0:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    iget-object v0, p0, Lxy4;->X:Landroid/graphics/Movie;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/Movie;->width()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {v0}, Landroid/graphics/Movie;->height()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-lez v2, :cond_6

    .line 33
    .line 34
    if-gtz v3, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    sget-object v7, Lta7;->c:Lta7;

    .line 38
    .line 39
    iget-object v6, p0, Lxy4;->Z:Lpw6;

    .line 40
    .line 41
    invoke-static/range {v2 .. v7}, Lw79;->n(IIIILpw6;Lta7;)D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    iget-boolean v6, p0, Lxy4;->v0:Z

    .line 46
    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 51
    .line 52
    cmpl-double v6, v0, v8

    .line 53
    .line 54
    if-lez v6, :cond_3

    .line 55
    .line 56
    move-wide v0, v8

    .line 57
    :cond_3
    :goto_0
    double-to-float v0, v0

    .line 58
    iput v0, p0, Lxy4;->l0:F

    .line 59
    .line 60
    int-to-float v1, v2

    .line 61
    mul-float/2addr v1, v0

    .line 62
    float-to-int v2, v1

    .line 63
    int-to-float v1, v3

    .line 64
    mul-float/2addr v0, v1

    .line 65
    float-to-int v3, v0

    .line 66
    iget-object v0, p0, Lxy4;->Y:Landroid/graphics/Bitmap$Config;

    .line 67
    .line 68
    invoke-static {v2, v3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v1, p0, Lxy4;->k0:Landroid/graphics/Bitmap;

    .line 73
    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 77
    .line 78
    .line 79
    :cond_4
    iput-object v0, p0, Lxy4;->k0:Landroid/graphics/Bitmap;

    .line 80
    .line 81
    new-instance v1, Landroid/graphics/Canvas;

    .line 82
    .line 83
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lxy4;->j0:Landroid/graphics/Canvas;

    .line 87
    .line 88
    iget-boolean v0, p0, Lxy4;->v0:Z

    .line 89
    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    const/high16 p1, 0x3f800000    # 1.0f

    .line 93
    .line 94
    iput p1, p0, Lxy4;->m0:F

    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    iput p1, p0, Lxy4;->n0:F

    .line 98
    .line 99
    iput p1, p0, Lxy4;->o0:F

    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    iget-object v6, p0, Lxy4;->Z:Lpw6;

    .line 103
    .line 104
    invoke-static/range {v2 .. v7}, Lw79;->n(IIIILpw6;Lta7;)D

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    double-to-float v0, v0

    .line 109
    iput v0, p0, Lxy4;->m0:F

    .line 110
    .line 111
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 112
    .line 113
    int-to-float v1, v1

    .line 114
    int-to-float v4, v4

    .line 115
    int-to-float v2, v2

    .line 116
    mul-float/2addr v2, v0

    .line 117
    sub-float/2addr v4, v2

    .line 118
    const/high16 v2, 0x40000000    # 2.0f

    .line 119
    .line 120
    div-float/2addr v4, v2

    .line 121
    add-float/2addr v4, v1

    .line 122
    iput v4, p0, Lxy4;->n0:F

    .line 123
    .line 124
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 125
    .line 126
    int-to-float p1, p1

    .line 127
    int-to-float v1, v5

    .line 128
    int-to-float v3, v3

    .line 129
    mul-float/2addr v0, v3

    .line 130
    sub-float/2addr v1, v0

    .line 131
    div-float/2addr v1, v2

    .line 132
    add-float/2addr v1, p1

    .line 133
    iput v1, p0, Lxy4;->o0:F

    .line 134
    .line 135
    :cond_6
    :goto_1
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lxy4;->X:Landroid/graphics/Movie;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Movie;->duration()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    move v1, v2

    .line 11
    move v5, v1

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    iget-boolean v3, p0, Lxy4;->p0:Z

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    iput-wide v3, p0, Lxy4;->r0:J

    .line 22
    .line 23
    :cond_1
    iget-wide v3, p0, Lxy4;->r0:J

    .line 24
    .line 25
    iget-wide v5, p0, Lxy4;->q0:J

    .line 26
    .line 27
    sub-long/2addr v3, v5

    .line 28
    long-to-int v3, v3

    .line 29
    div-int v4, v3, v1

    .line 30
    .line 31
    iget v5, p0, Lxy4;->s0:I

    .line 32
    .line 33
    const/4 v6, -0x1

    .line 34
    if-eq v5, v6, :cond_3

    .line 35
    .line 36
    if-gt v4, v5, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    move v5, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    :goto_0
    const/4 v5, 0x1

    .line 42
    :goto_1
    if-eqz v5, :cond_4

    .line 43
    .line 44
    mul-int/2addr v4, v1

    .line 45
    sub-int v1, v3, v4

    .line 46
    .line 47
    :cond_4
    :goto_2
    invoke-virtual {v0, v1}, Landroid/graphics/Movie;->setTime(I)Z

    .line 48
    .line 49
    .line 50
    iget-boolean v0, p0, Lxy4;->v0:Z

    .line 51
    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iget-object v3, p0, Lxy4;->i0:Landroid/graphics/Rect;

    .line 63
    .line 64
    invoke-virtual {v3, v2, v2, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v3}, Lxy4;->b(Landroid/graphics/Rect;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    :try_start_0
    iget v1, p0, Lxy4;->l0:F

    .line 75
    .line 76
    const/high16 v2, 0x3f800000    # 1.0f

    .line 77
    .line 78
    div-float/2addr v2, v1

    .line 79
    invoke-virtual {p1, v2, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1}, Lxy4;->a(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 91
    .line 92
    .line 93
    throw p0

    .line 94
    :cond_5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {p0, v0}, Lxy4;->b(Landroid/graphics/Rect;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1}, Lxy4;->a(Landroid/graphics/Canvas;)V

    .line 102
    .line 103
    .line 104
    :goto_3
    iget-boolean p1, p0, Lxy4;->p0:Z

    .line 105
    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    if-eqz v5, :cond_6

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    invoke-virtual {p0}, Lxy4;->stop()V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lxy4;->X:Landroid/graphics/Movie;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Movie;->height()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getIntrinsicWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Lxy4;->X:Landroid/graphics/Movie;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Movie;->width()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getOpacity()I
    .locals 2

    .line 1
    iget-object v0, p0, Lxy4;->f0:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0xff

    .line 8
    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lxy4;->u0:Lco5;

    .line 12
    .line 13
    sget-object v1, Lco5;->Y:Lco5;

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    sget-object v1, Lco5;->X:Lco5;

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Lxy4;->X:Landroid/graphics/Movie;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/graphics/Movie;->isOpaque()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 p0, -0x1

    .line 30
    return p0

    .line 31
    :cond_1
    const/4 p0, -0x3

    .line 32
    return p0
.end method

.method public final isRunning()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lxy4;->p0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/16 v0, 0x100

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lxy4;->f0:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Invalid alpha: "

    .line 14
    .line 15
    invoke-static {p1, p0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxy4;->f0:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final start()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lxy4;->p0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lxy4;->p0:Z

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lxy4;->q0:J

    .line 14
    .line 15
    iget-object v0, p0, Lxy4;->g0:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    if-ge v2, v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lni;

    .line 29
    .line 30
    invoke-virtual {v3, p0}, Lni;->b(Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final stop()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lxy4;->p0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lxy4;->p0:Z

    .line 8
    .line 9
    iget-object v1, p0, Lxy4;->g0:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    :goto_0
    if-ge v0, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lni;

    .line 22
    .line 23
    invoke-virtual {v3, p0}, Lni;->a(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    :goto_1
    return-void
.end method
