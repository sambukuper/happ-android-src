.class public final Lyi3;
.super Landroidx/recyclerview/widget/g;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lf96;


# instance fields
.field public A:Landroid/graphics/Rect;

.field public B:J

.field public final a:Ljava/util/ArrayList;

.field public final b:[F

.field public c:Landroidx/recyclerview/widget/l;

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public final m:Ly42;

.field public n:B

.field public o:I

.field public final p:Ljava/util/ArrayList;

.field public q:I

.field public r:Landroidx/recyclerview/widget/RecyclerView;

.field public final s:Lxb;

.field public t:Landroid/view/VelocityTracker;

.field public u:Ljava/util/ArrayList;

.field public v:Ljava/util/ArrayList;

.field public w:Landroid/view/View;

.field public x:Landroid/view/GestureDetector;

.field public y:Lxi3;

.field public final z:Lui3;


# direct methods
.method public constructor <init>(Ly42;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyi3;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    new-array v0, v0, [F

    .line 13
    .line 14
    iput-object v0, p0, Lyi3;->b:[F

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iput v1, p0, Lyi3;->l:I

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-byte v1, p0, Lyi3;->n:B

    .line 24
    .line 25
    new-instance v2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Lyi3;->p:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance v2, Lxb;

    .line 33
    .line 34
    const/16 v3, 0xf

    .line 35
    .line 36
    invoke-direct {v2, p0, v3}, Lxb;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    iput-object v2, p0, Lyi3;->s:Lxb;

    .line 40
    .line 41
    iput-object v0, p0, Lyi3;->w:Landroid/view/View;

    .line 42
    .line 43
    new-instance v0, Lui3;

    .line 44
    .line 45
    invoke-direct {v0, p0, v1}, Lui3;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lyi3;->z:Lui3;

    .line 49
    .line 50
    iput-object p1, p0, Lyi3;->m:Ly42;

    .line 51
    .line 52
    return-void
.end method

.method public static o(Landroid/view/View;FFFF)Z
    .locals 1

    .line 1
    cmpl-float v0, p1, p3

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    add-float/2addr p3, v0

    .line 11
    cmpg-float p1, p1, p3

    .line 12
    .line 13
    if-gtz p1, :cond_0

    .line 14
    .line 15
    cmpl-float p1, p2, p4

    .line 16
    .line 17
    if-ltz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    int-to-float p0, p0

    .line 24
    add-float/2addr p4, p0

    .line 25
    cmpg-float p0, p2, p4

    .line 26
    .line 27
    if-gtz p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyi3;->w:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lyi3;->w:Landroid/view/View;

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v0, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    if-ne p1, v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v1, v2}, Lyi3;->q(Landroidx/recyclerview/widget/l;I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    invoke-virtual {p0, p1, v2}, Lyi3;->l(Landroidx/recyclerview/widget/l;Z)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lyi3;->a:Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v0, p1, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_3

    .line 40
    .line 41
    invoke-static {p1}, Ly42;->a(Landroidx/recyclerview/widget/l;)V

    .line 42
    .line 43
    .line 44
    :cond_3
    :goto_0
    return-void
.end method

.method public final d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Rect;->setEmpty()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Lyi3;->b:[F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lyi3;->n([F)V

    .line 11
    .line 12
    .line 13
    aget v3, v1, v2

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aget v1, v1, v4

    .line 17
    .line 18
    move v9, v1

    .line 19
    move v10, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v3, 0x0

    .line 22
    move v9, v3

    .line 23
    move v10, v9

    .line 24
    :goto_0
    iget-object v11, v0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 25
    .line 26
    iget-byte v12, v0, Lyi3;->n:B

    .line 27
    .line 28
    iget-object v13, v0, Lyi3;->p:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v14

    .line 34
    move v15, v2

    .line 35
    :goto_1
    iget-object v1, v0, Lyi3;->m:Ly42;

    .line 36
    .line 37
    if-ge v15, v14, :cond_3

    .line 38
    .line 39
    invoke-interface {v13, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lvi3;

    .line 44
    .line 45
    iget-object v3, v2, Lvi3;->e:Landroidx/recyclerview/widget/l;

    .line 46
    .line 47
    iget v4, v2, Lvi3;->a:F

    .line 48
    .line 49
    iget v5, v2, Lvi3;->c:F

    .line 50
    .line 51
    cmpl-float v6, v4, v5

    .line 52
    .line 53
    if-nez v6, :cond_1

    .line 54
    .line 55
    iget-object v4, v3, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 56
    .line 57
    invoke-virtual {v4}, Landroid/view/View;->getTranslationX()F

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    iput v4, v2, Lvi3;->i:F

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    iget v6, v2, Lvi3;->m:F

    .line 65
    .line 66
    invoke-static {v5, v4, v6, v4}, Lp61;->e(FFFF)F

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    iput v4, v2, Lvi3;->i:F

    .line 71
    .line 72
    :goto_2
    iget v4, v2, Lvi3;->b:F

    .line 73
    .line 74
    iget v5, v2, Lvi3;->d:F

    .line 75
    .line 76
    cmpl-float v6, v4, v5

    .line 77
    .line 78
    if-nez v6, :cond_2

    .line 79
    .line 80
    iget-object v3, v3, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 81
    .line 82
    invoke-virtual {v3}, Landroid/view/View;->getTranslationY()F

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    iput v3, v2, Lvi3;->j:F

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_2
    iget v3, v2, Lvi3;->m:F

    .line 90
    .line 91
    invoke-static {v5, v4, v3, v4}, Lp61;->e(FFFF)F

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    iput v3, v2, Lvi3;->j:F

    .line 96
    .line 97
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    iget-object v4, v2, Lvi3;->e:Landroidx/recyclerview/widget/l;

    .line 102
    .line 103
    iget v5, v2, Lvi3;->i:F

    .line 104
    .line 105
    iget v6, v2, Lvi3;->j:F

    .line 106
    .line 107
    iget-byte v7, v2, Lvi3;->f:B

    .line 108
    .line 109
    const/4 v8, 0x0

    .line 110
    move-object/from16 v2, p1

    .line 111
    .line 112
    move v0, v3

    .line 113
    move-object/from16 v3, p2

    .line 114
    .line 115
    invoke-virtual/range {v1 .. v8}, Ly42;->i(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/l;FFIZ)V

    .line 116
    .line 117
    .line 118
    move-object v1, v2

    .line 119
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 v15, v15, 0x1

    .line 123
    .line 124
    move-object/from16 v0, p0

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    move-object v0, v1

    .line 128
    move-object/from16 v1, p1

    .line 129
    .line 130
    if-eqz v11, :cond_4

    .line 131
    .line 132
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    const/4 v7, 0x1

    .line 137
    move-object/from16 v2, p2

    .line 138
    .line 139
    move v5, v9

    .line 140
    move v4, v10

    .line 141
    move-object v3, v11

    .line 142
    move v6, v12

    .line 143
    invoke-virtual/range {v0 .. v7}, Ly42;->i(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/l;FFIZ)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v8}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 147
    .line 148
    .line 149
    :cond_4
    return-void
.end method

.method public final h(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lyi3;->b:[F

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lyi3;->n([F)V

    .line 10
    .line 11
    .line 12
    aget v3, v0, v2

    .line 13
    .line 14
    aget v0, v0, v1

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 17
    .line 18
    iget-object p0, p0, Lyi3;->p:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    move v4, v2

    .line 25
    :goto_0
    if-ge v4, v3, :cond_1

    .line 26
    .line 27
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, Lvi3;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    iget-object v5, v5, Lvi3;->e:Landroidx/recyclerview/widget/l;

    .line 38
    .line 39
    iget-object v5, v5, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 54
    .line 55
    .line 56
    :cond_2
    sub-int/2addr v3, v1

    .line 57
    :goto_1
    if-ltz v3, :cond_5

    .line 58
    .line 59
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lvi3;

    .line 64
    .line 65
    iget-boolean v0, p1, Lvi3;->l:Z

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    iget-boolean p1, p1, Lvi3;->h:Z

    .line 70
    .line 71
    if-nez p1, :cond_3

    .line 72
    .line 73
    invoke-interface {p0, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    if-nez v0, :cond_4

    .line 78
    .line 79
    move v2, v1

    .line 80
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, -0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    if-eqz v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 86
    .line 87
    .line 88
    :cond_6
    return-void
.end method

.method public final i(Landroidx/recyclerview/widget/l;I)I
    .locals 12

    .line 1
    iget-object v0, p0, Lyi3;->m:Ly42;

    .line 2
    .line 3
    iget-object v1, v0, Ly42;->d:Lkz7;

    .line 4
    .line 5
    and-int/lit8 v2, p2, 0xc

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_7

    .line 9
    .line 10
    iget v2, p0, Lyi3;->h:F

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    cmpl-float v2, v2, v4

    .line 14
    .line 15
    const/4 v5, 0x4

    .line 16
    const/16 v6, 0x8

    .line 17
    .line 18
    if-lez v2, :cond_0

    .line 19
    .line 20
    move v2, v6

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v5

    .line 23
    :goto_0
    iget-object v7, p0, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 24
    .line 25
    if-eqz v7, :cond_6

    .line 26
    .line 27
    iget v8, p0, Lyi3;->l:I

    .line 28
    .line 29
    const/4 v9, -0x1

    .line 30
    if-le v8, v9, :cond_6

    .line 31
    .line 32
    iget v8, p0, Lyi3;->g:F

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    const/4 v10, 0x1

    .line 39
    const/high16 v11, 0x40a00000    # 5.0f

    .line 40
    .line 41
    if-eqz v9, :cond_1

    .line 42
    .line 43
    if-ne v9, v10, :cond_2

    .line 44
    .line 45
    :cond_1
    mul-float/2addr v8, v11

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static {}, Lb61;->c()V

    .line 48
    .line 49
    .line 50
    return v3

    .line 51
    :goto_1
    const/16 v9, 0x3e8

    .line 52
    .line 53
    invoke-virtual {v7, v9, v8}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 54
    .line 55
    .line 56
    iget-object v7, p0, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 57
    .line 58
    iget v8, p0, Lyi3;->l:I

    .line 59
    .line 60
    invoke-virtual {v7, v8}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    iget-object v8, p0, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 65
    .line 66
    iget v9, p0, Lyi3;->l:I

    .line 67
    .line 68
    invoke-virtual {v8, v9}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    cmpl-float v4, v7, v4

    .line 73
    .line 74
    if-lez v4, :cond_3

    .line 75
    .line 76
    move v5, v6

    .line 77
    :cond_3
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    and-int v6, v5, p2

    .line 82
    .line 83
    if-eqz v6, :cond_6

    .line 84
    .line 85
    if-ne v2, v5, :cond_6

    .line 86
    .line 87
    iget v6, p0, Lyi3;->f:F

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    if-ne v1, v10, :cond_4

    .line 96
    .line 97
    const v1, 0x3ecccccd    # 0.4f

    .line 98
    .line 99
    .line 100
    :goto_2
    mul-float/2addr v6, v1

    .line 101
    goto :goto_3

    .line 102
    :cond_4
    invoke-static {}, Lb61;->c()V

    .line 103
    .line 104
    .line 105
    return v3

    .line 106
    :cond_5
    const/high16 v1, 0x3e800000    # 0.25f

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_3
    cmpl-float v1, v4, v6

    .line 110
    .line 111
    if-ltz v1, :cond_6

    .line 112
    .line 113
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    cmpl-float v1, v4, v1

    .line 118
    .line 119
    if-lez v1, :cond_6

    .line 120
    .line 121
    return v5

    .line 122
    :cond_6
    iget-object v1, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    int-to-float v1, v1

    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget p1, v0, Ly42;->f:F

    .line 133
    .line 134
    mul-float/2addr v1, p1

    .line 135
    and-int p1, p2, v2

    .line 136
    .line 137
    if-eqz p1, :cond_7

    .line 138
    .line 139
    iget p0, p0, Lyi3;->h:F

    .line 140
    .line 141
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    cmpl-float p0, p0, v1

    .line 146
    .line 147
    if-lez p0, :cond_7

    .line 148
    .line 149
    return v2

    .line 150
    :cond_7
    return v3
.end method

.method public final j(IILandroid/view/MotionEvent;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 2
    .line 3
    if-nez v0, :cond_d

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-ne p1, v0, :cond_d

    .line 7
    .line 8
    iget-byte p1, p0, Lyi3;->n:B

    .line 9
    .line 10
    if-eq p1, v0, :cond_d

    .line 11
    .line 12
    iget-object p1, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne p1, v1, :cond_0

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/j;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget v2, p0, Lyi3;->l:I

    .line 30
    .line 31
    const/4 v3, -0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-ne v2, v3, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p3, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {p3, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    iget v5, p0, Lyi3;->d:F

    .line 45
    .line 46
    sub-float/2addr v3, v5

    .line 47
    invoke-virtual {p3, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    iget v5, p0, Lyi3;->e:F

    .line 52
    .line 53
    sub-float/2addr v2, v5

    .line 54
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    iget v5, p0, Lyi3;->q:I

    .line 63
    .line 64
    int-to-float v5, v5

    .line 65
    cmpg-float v6, v3, v5

    .line 66
    .line 67
    if-gez v6, :cond_2

    .line 68
    .line 69
    cmpg-float v5, v2, v5

    .line 70
    .line 71
    if-gez v5, :cond_2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    cmpl-float v5, v3, v2

    .line 75
    .line 76
    if-lez v5, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1}, Landroidx/recyclerview/widget/j;->p()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    cmpl-float v2, v2, v3

    .line 86
    .line 87
    if-lez v2, :cond_4

    .line 88
    .line 89
    invoke-virtual {p1}, Landroidx/recyclerview/widget/j;->q()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_4

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    invoke-virtual {p0, p3}, Lyi3;->m(Landroid/view/MotionEvent;)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-nez p1, :cond_5

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    iget-object v2, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 104
    .line 105
    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    :goto_0
    if-nez v4, :cond_6

    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :cond_6
    iget-object p1, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 114
    .line 115
    iget-object v2, p0, Lyi3;->m:Ly42;

    .line 116
    .line 117
    iget-byte v2, v2, Ly42;->b:B

    .line 118
    .line 119
    shl-int/lit8 v3, v2, 0x8

    .line 120
    .line 121
    or-int/2addr v2, v3

    .line 122
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-static {v2, p1}, Ly42;->b(II)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    const v2, 0xff00

    .line 131
    .line 132
    .line 133
    and-int/2addr p1, v2

    .line 134
    shr-int/lit8 p1, p1, 0x8

    .line 135
    .line 136
    if-nez p1, :cond_7

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_7
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    iget v3, p0, Lyi3;->d:F

    .line 148
    .line 149
    sub-float/2addr v2, v3

    .line 150
    iget v3, p0, Lyi3;->e:F

    .line 151
    .line 152
    sub-float/2addr p2, v3

    .line 153
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    iget v6, p0, Lyi3;->q:I

    .line 162
    .line 163
    int-to-float v6, v6

    .line 164
    cmpg-float v7, v3, v6

    .line 165
    .line 166
    if-gez v7, :cond_8

    .line 167
    .line 168
    cmpg-float v6, v5, v6

    .line 169
    .line 170
    if-gez v6, :cond_8

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_8
    cmpl-float v3, v3, v5

    .line 174
    .line 175
    const/4 v5, 0x0

    .line 176
    if-lez v3, :cond_a

    .line 177
    .line 178
    cmpg-float p2, v2, v5

    .line 179
    .line 180
    if-gez p2, :cond_9

    .line 181
    .line 182
    and-int/lit8 p2, p1, 0x4

    .line 183
    .line 184
    if-nez p2, :cond_9

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_9
    cmpl-float p2, v2, v5

    .line 188
    .line 189
    if-lez p2, :cond_c

    .line 190
    .line 191
    and-int/lit8 p1, p1, 0x8

    .line 192
    .line 193
    if-nez p1, :cond_c

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_a
    cmpg-float v2, p2, v5

    .line 197
    .line 198
    if-gez v2, :cond_b

    .line 199
    .line 200
    and-int/lit8 v2, p1, 0x1

    .line 201
    .line 202
    if-nez v2, :cond_b

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_b
    cmpl-float p2, p2, v5

    .line 206
    .line 207
    if-lez p2, :cond_c

    .line 208
    .line 209
    and-int/2addr p1, v0

    .line 210
    if-nez p1, :cond_c

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_c
    iput v5, p0, Lyi3;->i:F

    .line 214
    .line 215
    iput v5, p0, Lyi3;->h:F

    .line 216
    .line 217
    const/4 p1, 0x0

    .line 218
    invoke-virtual {p3, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    iput p1, p0, Lyi3;->l:I

    .line 223
    .line 224
    invoke-virtual {p0, v4, v1}, Lyi3;->q(Landroidx/recyclerview/widget/l;I)V

    .line 225
    .line 226
    .line 227
    :cond_d
    :goto_1
    return-void
.end method

.method public final k(Landroidx/recyclerview/widget/l;I)I
    .locals 11

    .line 1
    iget-object v0, p0, Lyi3;->m:Ly42;

    .line 2
    .line 3
    iget-object v1, v0, Ly42;->d:Lkz7;

    .line 4
    .line 5
    and-int/lit8 v2, p2, 0x3

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_7

    .line 9
    .line 10
    iget v2, p0, Lyi3;->i:F

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    cmpl-float v2, v2, v4

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x2

    .line 17
    if-lez v2, :cond_0

    .line 18
    .line 19
    move v2, v6

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v5

    .line 22
    :goto_0
    iget-object v7, p0, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 23
    .line 24
    if-eqz v7, :cond_6

    .line 25
    .line 26
    iget v8, p0, Lyi3;->l:I

    .line 27
    .line 28
    const/4 v9, -0x1

    .line 29
    if-le v8, v9, :cond_6

    .line 30
    .line 31
    iget v8, p0, Lyi3;->g:F

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    const/high16 v10, 0x40a00000    # 5.0f

    .line 38
    .line 39
    if-eqz v9, :cond_1

    .line 40
    .line 41
    if-ne v9, v5, :cond_2

    .line 42
    .line 43
    :cond_1
    mul-float/2addr v8, v10

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {}, Lb61;->c()V

    .line 46
    .line 47
    .line 48
    return v3

    .line 49
    :goto_1
    const/16 v9, 0x3e8

    .line 50
    .line 51
    invoke-virtual {v7, v9, v8}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 52
    .line 53
    .line 54
    iget-object v7, p0, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 55
    .line 56
    iget v8, p0, Lyi3;->l:I

    .line 57
    .line 58
    invoke-virtual {v7, v8}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    iget-object v8, p0, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 63
    .line 64
    iget v9, p0, Lyi3;->l:I

    .line 65
    .line 66
    invoke-virtual {v8, v9}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    cmpl-float v4, v8, v4

    .line 71
    .line 72
    if-lez v4, :cond_3

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move v6, v5

    .line 76
    :goto_2
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    and-int v8, v6, p2

    .line 81
    .line 82
    if-eqz v8, :cond_6

    .line 83
    .line 84
    if-ne v6, v2, :cond_6

    .line 85
    .line 86
    iget v8, p0, Lyi3;->f:F

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_5

    .line 93
    .line 94
    if-ne v1, v5, :cond_4

    .line 95
    .line 96
    const v1, 0x3ecccccd    # 0.4f

    .line 97
    .line 98
    .line 99
    :goto_3
    mul-float/2addr v8, v1

    .line 100
    goto :goto_4

    .line 101
    :cond_4
    invoke-static {}, Lb61;->c()V

    .line 102
    .line 103
    .line 104
    return v3

    .line 105
    :cond_5
    const/high16 v1, 0x3e800000    # 0.25f

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :goto_4
    cmpl-float v1, v4, v8

    .line 109
    .line 110
    if-ltz v1, :cond_6

    .line 111
    .line 112
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    cmpl-float v1, v4, v1

    .line 117
    .line 118
    if-lez v1, :cond_6

    .line 119
    .line 120
    return v6

    .line 121
    :cond_6
    iget-object v1, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 122
    .line 123
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    int-to-float v1, v1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget p1, v0, Ly42;->f:F

    .line 132
    .line 133
    mul-float/2addr v1, p1

    .line 134
    and-int p1, p2, v2

    .line 135
    .line 136
    if-eqz p1, :cond_7

    .line 137
    .line 138
    iget p0, p0, Lyi3;->i:F

    .line 139
    .line 140
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    cmpl-float p0, p0, v1

    .line 145
    .line 146
    if-lez p0, :cond_7

    .line 147
    .line 148
    return v2

    .line 149
    :cond_7
    return v3
.end method

.method public final l(Landroidx/recyclerview/widget/l;Z)V
    .locals 3

    .line 1
    iget-object p0, p0, Lyi3;->p:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lvi3;

    .line 16
    .line 17
    iget-object v2, v1, Lvi3;->e:Landroidx/recyclerview/widget/l;

    .line 18
    .line 19
    if-ne v2, p1, :cond_1

    .line 20
    .line 21
    iget-boolean p1, v1, Lvi3;->k:Z

    .line 22
    .line 23
    or-int/2addr p1, p2

    .line 24
    iput-boolean p1, v1, Lvi3;->k:Z

    .line 25
    .line 26
    iget-boolean p1, v1, Lvi3;->l:Z

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    iget-object p1, v1, Lvi3;->g:Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    return-void
.end method

.method public final m(Landroid/view/MotionEvent;)Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 14
    .line 15
    iget v2, p0, Lyi3;->j:F

    .line 16
    .line 17
    iget v3, p0, Lyi3;->h:F

    .line 18
    .line 19
    add-float/2addr v2, v3

    .line 20
    iget v3, p0, Lyi3;->k:F

    .line 21
    .line 22
    iget v4, p0, Lyi3;->i:F

    .line 23
    .line 24
    add-float/2addr v3, v4

    .line 25
    invoke-static {v1, v0, p1, v2, v3}, Lyi3;->o(Landroid/view/View;FFFF)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_0
    iget-object v1, p0, Lyi3;->p:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/lit8 v2, v2, -0x1

    .line 39
    .line 40
    :goto_0
    if-ltz v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lvi3;

    .line 47
    .line 48
    iget-object v4, v3, Lvi3;->e:Landroidx/recyclerview/widget/l;

    .line 49
    .line 50
    iget-object v4, v4, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 51
    .line 52
    iget v5, v3, Lvi3;->i:F

    .line 53
    .line 54
    iget v3, v3, Lvi3;->j:F

    .line 55
    .line 56
    invoke-static {v4, v0, p1, v5, v3}, Lyi3;->o(Landroid/view/View;FFFF)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    return-object v4

    .line 63
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object p0, p0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->k0:Llr0;

    .line 69
    .line 70
    invoke-virtual {v1}, Llr0;->e()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    add-int/lit8 v1, v1, -0x1

    .line 75
    .line 76
    :goto_1
    if-ltz v1, :cond_4

    .line 77
    .line 78
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->k0:Llr0;

    .line 79
    .line 80
    invoke-virtual {v2, v1}, Llr0;->d(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    int-to-float v5, v5

    .line 97
    add-float/2addr v5, v3

    .line 98
    cmpl-float v5, v0, v5

    .line 99
    .line 100
    if-ltz v5, :cond_3

    .line 101
    .line 102
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    int-to-float v5, v5

    .line 107
    add-float/2addr v5, v3

    .line 108
    cmpg-float v3, v0, v5

    .line 109
    .line 110
    if-gtz v3, :cond_3

    .line 111
    .line 112
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    int-to-float v3, v3

    .line 117
    add-float/2addr v3, v4

    .line 118
    cmpl-float v3, p1, v3

    .line 119
    .line 120
    if-ltz v3, :cond_3

    .line 121
    .line 122
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    int-to-float v3, v3

    .line 127
    add-float/2addr v3, v4

    .line 128
    cmpg-float v3, p1, v3

    .line 129
    .line 130
    if-gtz v3, :cond_3

    .line 131
    .line 132
    return-object v2

    .line 133
    :cond_3
    add-int/lit8 v1, v1, -0x1

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    const/4 p0, 0x0

    .line 137
    return-object p0
.end method

.method public final n([F)V
    .locals 3

    .line 1
    iget v0, p0, Lyi3;->o:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0xc

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v0, p0, Lyi3;->j:F

    .line 9
    .line 10
    iget v2, p0, Lyi3;->h:F

    .line 11
    .line 12
    add-float/2addr v0, v2

    .line 13
    iget-object v2, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 14
    .line 15
    iget-object v2, v2, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-float v2, v2

    .line 22
    sub-float/2addr v0, v2

    .line 23
    aput v0, p1, v1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 27
    .line 28
    iget-object v0, v0, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    aput v0, p1, v1

    .line 35
    .line 36
    :goto_0
    iget v0, p0, Lyi3;->o:I

    .line 37
    .line 38
    and-int/lit8 v0, v0, 0x3

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget v0, p0, Lyi3;->k:F

    .line 44
    .line 45
    iget v2, p0, Lyi3;->i:F

    .line 46
    .line 47
    add-float/2addr v0, v2

    .line 48
    iget-object p0, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 49
    .line 50
    iget-object p0, p0, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    int-to-float p0, p0

    .line 57
    sub-float/2addr v0, p0

    .line 58
    aput v0, p1, v1

    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    iget-object p0, p0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 62
    .line 63
    iget-object p0, p0, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    aput p0, p1, v1

    .line 70
    .line 71
    return-void
.end method

.method public final p(Landroidx/recyclerview/widget/l;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->isLayoutRequested()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    iget-byte v1, v0, Lyi3;->n:B

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    goto/16 :goto_5

    .line 19
    .line 20
    :cond_1
    iget v1, v0, Lyi3;->j:F

    .line 21
    .line 22
    iget v3, v0, Lyi3;->h:F

    .line 23
    .line 24
    add-float/2addr v1, v3

    .line 25
    float-to-int v1, v1

    .line 26
    iget v3, v0, Lyi3;->k:F

    .line 27
    .line 28
    iget v4, v0, Lyi3;->i:F

    .line 29
    .line 30
    add-float/2addr v3, v4

    .line 31
    float-to-int v3, v3

    .line 32
    move-object/from16 v4, p1

    .line 33
    .line 34
    iget-object v5, v4, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 35
    .line 36
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    sub-int v6, v3, v6

    .line 41
    .line 42
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    int-to-float v6, v6

    .line 47
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    int-to-float v7, v7

    .line 52
    const/high16 v8, 0x3f000000    # 0.5f

    .line 53
    .line 54
    mul-float/2addr v7, v8

    .line 55
    cmpg-float v6, v6, v7

    .line 56
    .line 57
    if-gez v6, :cond_2

    .line 58
    .line 59
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    sub-int v6, v1, v6

    .line 64
    .line 65
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    int-to-float v6, v6

    .line 70
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    int-to-float v7, v7

    .line 75
    mul-float/2addr v7, v8

    .line 76
    cmpg-float v6, v6, v7

    .line 77
    .line 78
    if-gez v6, :cond_2

    .line 79
    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :cond_2
    iget-object v6, v0, Lyi3;->u:Ljava/util/ArrayList;

    .line 83
    .line 84
    if-nez v6, :cond_3

    .line 85
    .line 86
    new-instance v6, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v6, v0, Lyi3;->u:Ljava/util/ArrayList;

    .line 92
    .line 93
    new-instance v6, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v6, v0, Lyi3;->v:Ljava/util/ArrayList;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 102
    .line 103
    .line 104
    iget-object v6, v0, Lyi3;->v:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 107
    .line 108
    .line 109
    :goto_0
    iget v6, v0, Lyi3;->j:F

    .line 110
    .line 111
    iget v7, v0, Lyi3;->h:F

    .line 112
    .line 113
    add-float/2addr v6, v7

    .line 114
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    iget v7, v0, Lyi3;->k:F

    .line 119
    .line 120
    iget v8, v0, Lyi3;->i:F

    .line 121
    .line 122
    add-float/2addr v7, v8

    .line 123
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    add-int/2addr v8, v6

    .line 132
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    add-int/2addr v9, v7

    .line 137
    add-int v10, v6, v8

    .line 138
    .line 139
    div-int/2addr v10, v2

    .line 140
    add-int v11, v7, v9

    .line 141
    .line 142
    div-int/2addr v11, v2

    .line 143
    iget-object v12, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 144
    .line 145
    invoke-virtual {v12}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/j;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    invoke-virtual {v12}, Landroidx/recyclerview/widget/j;->I()I

    .line 150
    .line 151
    .line 152
    move-result v13

    .line 153
    const/4 v15, 0x0

    .line 154
    :goto_1
    if-ge v15, v13, :cond_8

    .line 155
    .line 156
    move/from16 v16, v2

    .line 157
    .line 158
    invoke-virtual {v12, v15}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    if-ne v2, v5, :cond_5

    .line 163
    .line 164
    :cond_4
    :goto_2
    move/from16 v17, v1

    .line 165
    .line 166
    move/from16 v18, v3

    .line 167
    .line 168
    goto/16 :goto_4

    .line 169
    .line 170
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    if-lt v14, v7, :cond_4

    .line 175
    .line 176
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 177
    .line 178
    .line 179
    move-result v14

    .line 180
    if-gt v14, v9, :cond_4

    .line 181
    .line 182
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 183
    .line 184
    .line 185
    move-result v14

    .line 186
    if-lt v14, v6, :cond_4

    .line 187
    .line 188
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 189
    .line 190
    .line 191
    move-result v14

    .line 192
    if-le v14, v8, :cond_6

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_6
    iget-object v14, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 196
    .line 197
    invoke-virtual {v14, v2}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 198
    .line 199
    .line 200
    move-result-object v14

    .line 201
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 202
    .line 203
    .line 204
    move-result v17

    .line 205
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 206
    .line 207
    .line 208
    move-result v18

    .line 209
    add-int v18, v18, v17

    .line 210
    .line 211
    div-int/lit8 v18, v18, 0x2

    .line 212
    .line 213
    sub-int v17, v10, v18

    .line 214
    .line 215
    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->abs(I)I

    .line 216
    .line 217
    .line 218
    move-result v17

    .line 219
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 220
    .line 221
    .line 222
    move-result v18

    .line 223
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    add-int v2, v2, v18

    .line 228
    .line 229
    div-int/lit8 v2, v2, 0x2

    .line 230
    .line 231
    sub-int v2, v11, v2

    .line 232
    .line 233
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    mul-int v17, v17, v17

    .line 238
    .line 239
    mul-int/2addr v2, v2

    .line 240
    add-int v2, v2, v17

    .line 241
    .line 242
    move/from16 v17, v1

    .line 243
    .line 244
    iget-object v1, v0, Lyi3;->u:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    move/from16 v18, v3

    .line 251
    .line 252
    const/4 v3, 0x0

    .line 253
    const/4 v4, 0x0

    .line 254
    :goto_3
    if-ge v3, v1, :cond_7

    .line 255
    .line 256
    move/from16 v19, v1

    .line 257
    .line 258
    iget-object v1, v0, Lyi3;->v:Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    check-cast v1, Ljava/lang/Integer;

    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-le v2, v1, :cond_7

    .line 271
    .line 272
    add-int/lit8 v4, v4, 0x1

    .line 273
    .line 274
    add-int/lit8 v3, v3, 0x1

    .line 275
    .line 276
    move/from16 v1, v19

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :cond_7
    iget-object v1, v0, Lyi3;->u:Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-virtual {v1, v4, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    iget-object v1, v0, Lyi3;->v:Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-virtual {v1, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :goto_4
    add-int/lit8 v15, v15, 0x1

    .line 294
    .line 295
    move-object/from16 v4, p1

    .line 296
    .line 297
    move/from16 v2, v16

    .line 298
    .line 299
    move/from16 v1, v17

    .line 300
    .line 301
    move/from16 v3, v18

    .line 302
    .line 303
    goto/16 :goto_1

    .line 304
    .line 305
    :cond_8
    move/from16 v17, v1

    .line 306
    .line 307
    move/from16 v18, v3

    .line 308
    .line 309
    iget-object v1, v0, Lyi3;->u:Ljava/util/ArrayList;

    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    if-nez v2, :cond_9

    .line 316
    .line 317
    :goto_5
    return-void

    .line 318
    :cond_9
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    add-int v2, v2, v17

    .line 323
    .line 324
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    add-int v3, v3, v18

    .line 329
    .line 330
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    sub-int v4, v17, v4

    .line 335
    .line 336
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 337
    .line 338
    .line 339
    move-result v6

    .line 340
    sub-int v6, v18, v6

    .line 341
    .line 342
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    const/4 v8, 0x0

    .line 347
    const/4 v9, -0x1

    .line 348
    const/4 v14, 0x0

    .line 349
    :goto_6
    if-ge v14, v7, :cond_e

    .line 350
    .line 351
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v10

    .line 355
    check-cast v10, Landroidx/recyclerview/widget/l;

    .line 356
    .line 357
    if-lez v4, :cond_a

    .line 358
    .line 359
    iget-object v11, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 360
    .line 361
    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    .line 362
    .line 363
    .line 364
    move-result v11

    .line 365
    sub-int/2addr v11, v2

    .line 366
    if-gez v11, :cond_a

    .line 367
    .line 368
    iget-object v12, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 369
    .line 370
    invoke-virtual {v12}, Landroid/view/View;->getRight()I

    .line 371
    .line 372
    .line 373
    move-result v12

    .line 374
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 375
    .line 376
    .line 377
    move-result v13

    .line 378
    if-le v12, v13, :cond_a

    .line 379
    .line 380
    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    .line 381
    .line 382
    .line 383
    move-result v11

    .line 384
    if-le v11, v9, :cond_a

    .line 385
    .line 386
    move-object v8, v10

    .line 387
    move v9, v11

    .line 388
    :cond_a
    if-gez v4, :cond_b

    .line 389
    .line 390
    iget-object v11, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 391
    .line 392
    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    .line 393
    .line 394
    .line 395
    move-result v11

    .line 396
    sub-int v11, v11, v17

    .line 397
    .line 398
    if-lez v11, :cond_b

    .line 399
    .line 400
    iget-object v12, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 401
    .line 402
    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    .line 403
    .line 404
    .line 405
    move-result v12

    .line 406
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 407
    .line 408
    .line 409
    move-result v13

    .line 410
    if-ge v12, v13, :cond_b

    .line 411
    .line 412
    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    .line 413
    .line 414
    .line 415
    move-result v11

    .line 416
    if-le v11, v9, :cond_b

    .line 417
    .line 418
    move-object v8, v10

    .line 419
    move v9, v11

    .line 420
    :cond_b
    if-gez v6, :cond_c

    .line 421
    .line 422
    iget-object v11, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 423
    .line 424
    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    .line 425
    .line 426
    .line 427
    move-result v11

    .line 428
    sub-int v11, v11, v18

    .line 429
    .line 430
    if-lez v11, :cond_c

    .line 431
    .line 432
    iget-object v12, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 433
    .line 434
    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    .line 435
    .line 436
    .line 437
    move-result v12

    .line 438
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 439
    .line 440
    .line 441
    move-result v13

    .line 442
    if-ge v12, v13, :cond_c

    .line 443
    .line 444
    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    .line 445
    .line 446
    .line 447
    move-result v11

    .line 448
    if-le v11, v9, :cond_c

    .line 449
    .line 450
    move-object v8, v10

    .line 451
    move v9, v11

    .line 452
    :cond_c
    if-lez v6, :cond_d

    .line 453
    .line 454
    iget-object v11, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 455
    .line 456
    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    .line 457
    .line 458
    .line 459
    move-result v11

    .line 460
    sub-int/2addr v11, v3

    .line 461
    if-gez v11, :cond_d

    .line 462
    .line 463
    iget-object v12, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 464
    .line 465
    invoke-virtual {v12}, Landroid/view/View;->getBottom()I

    .line 466
    .line 467
    .line 468
    move-result v12

    .line 469
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 470
    .line 471
    .line 472
    move-result v13

    .line 473
    if-le v12, v13, :cond_d

    .line 474
    .line 475
    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    if-le v11, v9, :cond_d

    .line 480
    .line 481
    move-object v8, v10

    .line 482
    move v9, v11

    .line 483
    :cond_d
    add-int/lit8 v14, v14, 0x1

    .line 484
    .line 485
    goto/16 :goto_6

    .line 486
    .line 487
    :cond_e
    if-nez v8, :cond_f

    .line 488
    .line 489
    iget-object v1, v0, Lyi3;->u:Ljava/util/ArrayList;

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 492
    .line 493
    .line 494
    iget-object v0, v0, Lyi3;->v:Ljava/util/ArrayList;

    .line 495
    .line 496
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    :cond_f
    invoke-virtual {v8}, Landroidx/recyclerview/widget/l;->b()I

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {p1 .. p1}, Landroidx/recyclerview/widget/l;->b()I

    .line 504
    .line 505
    .line 506
    iget-object v0, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 507
    .line 508
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    return-void
.end method

.method public final q(Landroidx/recyclerview/widget/l;I)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    move/from16 v11, p2

    .line 6
    .line 7
    iget-object v0, v1, Lyi3;->m:Ly42;

    .line 8
    .line 9
    iget-byte v12, v0, Ly42;->b:B

    .line 10
    .line 11
    iget-object v0, v1, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 12
    .line 13
    if-ne v10, v0, :cond_0

    .line 14
    .line 15
    iget-byte v0, v1, Lyi3;->n:B

    .line 16
    .line 17
    if-ne v11, v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-wide/high16 v2, -0x8000000000000000L

    .line 21
    .line 22
    iput-wide v2, v1, Lyi3;->B:J

    .line 23
    .line 24
    iget-byte v3, v1, Lyi3;->n:B

    .line 25
    .line 26
    const/4 v13, 0x1

    .line 27
    invoke-virtual {v1, v10, v13}, Lyi3;->l(Landroidx/recyclerview/widget/l;Z)V

    .line 28
    .line 29
    .line 30
    iput-byte v11, v1, Lyi3;->n:B

    .line 31
    .line 32
    const/4 v14, 0x2

    .line 33
    if-ne v11, v14, :cond_2

    .line 34
    .line 35
    if-eqz v10, :cond_1

    .line 36
    .line 37
    iget-object v0, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 38
    .line 39
    iput-object v0, v1, Lyi3;->w:Landroid/view/View;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string v0, "Must pass a ViewHolder when dragging"

    .line 43
    .line 44
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    :goto_0
    mul-int/lit8 v0, v11, 0x8

    .line 49
    .line 50
    const/16 v15, 0x8

    .line 51
    .line 52
    add-int/2addr v0, v15

    .line 53
    shl-int v0, v13, v0

    .line 54
    .line 55
    add-int/lit8 v16, v0, -0x1

    .line 56
    .line 57
    iget-object v2, v1, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    if-eqz v2, :cond_10

    .line 61
    .line 62
    iget-object v4, v2, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 63
    .line 64
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    const/4 v6, 0x0

    .line 69
    if-eqz v5, :cond_e

    .line 70
    .line 71
    if-ne v3, v14, :cond_3

    .line 72
    .line 73
    move v8, v0

    .line 74
    goto :goto_3

    .line 75
    :cond_3
    iget-byte v4, v1, Lyi3;->n:B

    .line 76
    .line 77
    if-ne v4, v14, :cond_5

    .line 78
    .line 79
    :cond_4
    :goto_1
    move v7, v0

    .line 80
    goto :goto_2

    .line 81
    :cond_5
    iget-object v4, v1, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 82
    .line 83
    shl-int/lit8 v5, v12, 0x8

    .line 84
    .line 85
    or-int/2addr v5, v12

    .line 86
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-static {v5, v4}, Ly42;->b(II)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    const v7, 0xff00

    .line 95
    .line 96
    .line 97
    and-int/2addr v4, v7

    .line 98
    shr-int/2addr v4, v15

    .line 99
    if-nez v4, :cond_6

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    and-int/2addr v5, v7

    .line 103
    shr-int/2addr v5, v15

    .line 104
    iget v7, v1, Lyi3;->h:F

    .line 105
    .line 106
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    iget v8, v1, Lyi3;->i:F

    .line 111
    .line 112
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    cmpl-float v7, v7, v8

    .line 117
    .line 118
    if-lez v7, :cond_8

    .line 119
    .line 120
    invoke-virtual {v1, v2, v4}, Lyi3;->i(Landroidx/recyclerview/widget/l;I)I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-lez v7, :cond_7

    .line 125
    .line 126
    and-int v4, v5, v7

    .line 127
    .line 128
    if-nez v4, :cond_a

    .line 129
    .line 130
    iget-object v4, v1, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 131
    .line 132
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-static {v7, v4}, Ly42;->c(II)I

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    goto :goto_2

    .line 141
    :cond_7
    invoke-virtual {v1, v2, v4}, Lyi3;->k(Landroidx/recyclerview/widget/l;I)I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-lez v7, :cond_4

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_8
    invoke-virtual {v1, v2, v4}, Lyi3;->k(Landroidx/recyclerview/widget/l;I)I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    if-lez v7, :cond_9

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_9
    invoke-virtual {v1, v2, v4}, Lyi3;->i(Landroidx/recyclerview/widget/l;I)I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-lez v7, :cond_4

    .line 160
    .line 161
    and-int v4, v5, v7

    .line 162
    .line 163
    if-nez v4, :cond_a

    .line 164
    .line 165
    iget-object v4, v1, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 166
    .line 167
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    invoke-static {v7, v4}, Ly42;->c(II)I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    :cond_a
    :goto_2
    move v8, v7

    .line 176
    :goto_3
    iget-object v4, v1, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 177
    .line 178
    if-eqz v4, :cond_b

    .line 179
    .line 180
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->recycle()V

    .line 181
    .line 182
    .line 183
    iput-object v6, v1, Lyi3;->t:Landroid/view/VelocityTracker;

    .line 184
    .line 185
    :cond_b
    const/4 v4, 0x0

    .line 186
    if-eq v8, v13, :cond_d

    .line 187
    .line 188
    if-eq v8, v14, :cond_d

    .line 189
    .line 190
    const/4 v5, 0x4

    .line 191
    if-eq v8, v5, :cond_c

    .line 192
    .line 193
    if-eq v8, v15, :cond_c

    .line 194
    .line 195
    const/16 v5, 0x10

    .line 196
    .line 197
    if-eq v8, v5, :cond_c

    .line 198
    .line 199
    const/16 v5, 0x20

    .line 200
    .line 201
    if-eq v8, v5, :cond_c

    .line 202
    .line 203
    move v7, v4

    .line 204
    goto :goto_4

    .line 205
    :cond_c
    iget v5, v1, Lyi3;->h:F

    .line 206
    .line 207
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    iget-object v7, v1, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 212
    .line 213
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    int-to-float v7, v7

    .line 218
    mul-float/2addr v5, v7

    .line 219
    move v7, v4

    .line 220
    move v4, v5

    .line 221
    goto :goto_4

    .line 222
    :cond_d
    iget v5, v1, Lyi3;->i:F

    .line 223
    .line 224
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    iget-object v7, v1, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 229
    .line 230
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    int-to-float v7, v7

    .line 235
    mul-float/2addr v5, v7

    .line 236
    move v7, v5

    .line 237
    :goto_4
    iget-object v5, v1, Lyi3;->b:[F

    .line 238
    .line 239
    invoke-virtual {v1, v5}, Lyi3;->n([F)V

    .line 240
    .line 241
    .line 242
    move-object v9, v6

    .line 243
    move v6, v4

    .line 244
    aget v4, v5, v0

    .line 245
    .line 246
    aget v5, v5, v13

    .line 247
    .line 248
    move/from16 v17, v0

    .line 249
    .line 250
    new-instance v0, Lvi3;

    .line 251
    .line 252
    move-object/from16 v18, v9

    .line 253
    .line 254
    move-object v9, v2

    .line 255
    move/from16 v19, v15

    .line 256
    .line 257
    move/from16 v15, v17

    .line 258
    .line 259
    move-object/from16 v13, v18

    .line 260
    .line 261
    invoke-direct/range {v0 .. v9}, Lvi3;-><init>(Lyi3;Landroidx/recyclerview/widget/l;IFFFFILandroidx/recyclerview/widget/l;)V

    .line 262
    .line 263
    .line 264
    iget-object v3, v1, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 265
    .line 266
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    const-wide/16 v3, 0x12c

    .line 270
    .line 271
    iget-object v5, v0, Lvi3;->g:Landroid/animation/ValueAnimator;

    .line 272
    .line 273
    invoke-virtual {v5, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 274
    .line 275
    .line 276
    iget-object v3, v1, Lyi3;->p:Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v15}, Landroidx/recyclerview/widget/l;->o(Z)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->start()V

    .line 285
    .line 286
    .line 287
    const/4 v0, 0x1

    .line 288
    goto :goto_5

    .line 289
    :cond_e
    move-object v13, v6

    .line 290
    move/from16 v19, v15

    .line 291
    .line 292
    move v15, v0

    .line 293
    iget-object v0, v1, Lyi3;->w:Landroid/view/View;

    .line 294
    .line 295
    if-ne v4, v0, :cond_f

    .line 296
    .line 297
    iput-object v13, v1, Lyi3;->w:Landroid/view/View;

    .line 298
    .line 299
    :cond_f
    invoke-static {v2}, Ly42;->a(Landroidx/recyclerview/widget/l;)V

    .line 300
    .line 301
    .line 302
    move v0, v15

    .line 303
    :goto_5
    iput-object v13, v1, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_10
    move/from16 v19, v15

    .line 307
    .line 308
    move v15, v0

    .line 309
    :goto_6
    if-eqz v10, :cond_11

    .line 310
    .line 311
    iget-object v2, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 312
    .line 313
    iget-object v3, v1, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 314
    .line 315
    shl-int/lit8 v4, v12, 0x8

    .line 316
    .line 317
    or-int/2addr v4, v12

    .line 318
    invoke-virtual {v3}, Landroid/view/View;->getLayoutDirection()I

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    invoke-static {v4, v3}, Ly42;->b(II)I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    and-int v3, v3, v16

    .line 327
    .line 328
    iget-byte v4, v1, Lyi3;->n:B

    .line 329
    .line 330
    mul-int/lit8 v4, v4, 0x8

    .line 331
    .line 332
    shr-int/2addr v3, v4

    .line 333
    iput v3, v1, Lyi3;->o:I

    .line 334
    .line 335
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    int-to-float v3, v3

    .line 340
    iput v3, v1, Lyi3;->j:F

    .line 341
    .line 342
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    int-to-float v3, v3

    .line 347
    iput v3, v1, Lyi3;->k:F

    .line 348
    .line 349
    iput-object v10, v1, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 350
    .line 351
    if-ne v11, v14, :cond_11

    .line 352
    .line 353
    invoke-virtual {v2, v15}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 354
    .line 355
    .line 356
    :cond_11
    iget-object v2, v1, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 357
    .line 358
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    if-eqz v2, :cond_13

    .line 363
    .line 364
    iget-object v3, v1, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 365
    .line 366
    if-eqz v3, :cond_12

    .line 367
    .line 368
    const/4 v15, 0x1

    .line 369
    :cond_12
    invoke-interface {v2, v15}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 370
    .line 371
    .line 372
    :cond_13
    if-nez v0, :cond_14

    .line 373
    .line 374
    iget-object v0, v1, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 375
    .line 376
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/j;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    const/4 v2, 0x1

    .line 381
    iput-boolean v2, v0, Landroidx/recyclerview/widget/j;->h0:Z

    .line 382
    .line 383
    :cond_14
    iget-object v0, v1, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 384
    .line 385
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 386
    .line 387
    .line 388
    return-void
.end method

.method public final r(IILandroid/view/MotionEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget p3, p0, Lyi3;->d:F

    .line 10
    .line 11
    sub-float/2addr v0, p3

    .line 12
    iput v0, p0, Lyi3;->h:F

    .line 13
    .line 14
    iget p3, p0, Lyi3;->e:F

    .line 15
    .line 16
    sub-float/2addr p2, p3

    .line 17
    iput p2, p0, Lyi3;->i:F

    .line 18
    .line 19
    and-int/lit8 p2, p1, 0x4

    .line 20
    .line 21
    const/4 p3, 0x0

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    invoke-static {p3, v0}, Ljava/lang/Math;->max(FF)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lyi3;->h:F

    .line 29
    .line 30
    :cond_0
    and-int/lit8 p2, p1, 0x8

    .line 31
    .line 32
    if-nez p2, :cond_1

    .line 33
    .line 34
    invoke-static {p3, v0}, Ljava/lang/Math;->min(FF)F

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iput p2, p0, Lyi3;->h:F

    .line 39
    .line 40
    :cond_1
    and-int/lit8 p2, p1, 0x1

    .line 41
    .line 42
    if-nez p2, :cond_2

    .line 43
    .line 44
    iget p2, p0, Lyi3;->i:F

    .line 45
    .line 46
    invoke-static {p3, p2}, Ljava/lang/Math;->max(FF)F

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    iput p2, p0, Lyi3;->i:F

    .line 51
    .line 52
    :cond_2
    and-int/lit8 p1, p1, 0x2

    .line 53
    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    iget p1, p0, Lyi3;->i:F

    .line 57
    .line 58
    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iput p1, p0, Lyi3;->i:F

    .line 63
    .line 64
    :cond_3
    return-void
.end method
