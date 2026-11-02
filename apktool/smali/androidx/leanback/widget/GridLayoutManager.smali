.class public final Landroidx/leanback/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/j;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final h1:Landroid/graphics/Rect;

.field public static final i1:[I


# instance fields
.field public final A0:Landroid/util/SparseIntArray;

.field public B0:[I

.field public C0:Landroid/media/AudioManager;

.field public D0:Landroidx/recyclerview/widget/k;

.field public E0:I

.field public F0:Ljava/util/ArrayList;

.field public G0:I

.field public H0:Lku2;

.field public I0:Lmu2;

.field public J0:I

.field public K0:I

.field public L0:I

.field public M0:I

.field public N0:I

.field public O0:[I

.field public P0:I

.field public Q0:I

.field public R0:I

.field public S0:I

.field public T0:I

.field public U0:I

.field public V0:I

.field public W0:I

.field public X0:Liu2;

.field public Y0:I

.field public final Z0:Lyr6;

.field public final a1:Lf63;

.field public b1:I

.field public c1:I

.field public final d1:[I

.field public final e1:Lcb0;

.field public final f1:Lxb;

.field public final g1:Lq02;

.field public r0:F

.field public s0:I

.field public t0:Lb20;

.field public u0:Z

.field public v0:Ltd5;

.field public w0:I

.field public x0:Lq96;

.field public y0:I

.field public z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/leanback/widget/GridLayoutManager;->h1:Landroid/graphics/Rect;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    new-array v0, v0, [I

    .line 10
    .line 11
    sput-object v0, Landroidx/leanback/widget/GridLayoutManager;->i1:[I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 128
    invoke-direct {p0, v0}, Landroidx/leanback/widget/GridLayoutManager;-><init>(Lb20;)V

    return-void
.end method

.method public constructor <init>(Lb20;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/j;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->r0:F

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->s0:I

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 14
    .line 15
    new-instance v1, Landroidx/recyclerview/widget/d;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Ltd5;-><init>(Landroidx/recyclerview/widget/j;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 21
    .line 22
    new-instance v1, Landroid/util/SparseIntArray;

    .line 23
    .line 24
    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->A0:Landroid/util/SparseIntArray;

    .line 28
    .line 29
    const v1, 0x36200

    .line 30
    .line 31
    .line 32
    iput v1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    iput-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->F0:Ljava/util/ArrayList;

    .line 36
    .line 37
    const/4 v1, -0x1

    .line 38
    iput v1, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 39
    .line 40
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 41
    .line 42
    const v2, 0x800033

    .line 43
    .line 44
    .line 45
    iput v2, p0, Landroidx/leanback/widget/GridLayoutManager;->U0:I

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    iput v2, p0, Landroidx/leanback/widget/GridLayoutManager;->W0:I

    .line 49
    .line 50
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->Y0:I

    .line 51
    .line 52
    new-instance v2, Lyr6;

    .line 53
    .line 54
    const/16 v3, 0xd

    .line 55
    .line 56
    invoke-direct {v2, v3}, Lyr6;-><init>(B)V

    .line 57
    .line 58
    .line 59
    iput-object v2, p0, Landroidx/leanback/widget/GridLayoutManager;->Z0:Lyr6;

    .line 60
    .line 61
    new-instance v2, Lf63;

    .line 62
    .line 63
    const/4 v3, 0x4

    .line 64
    invoke-direct {v2, v3}, Lf63;-><init>(B)V

    .line 65
    .line 66
    .line 67
    iput-object v2, p0, Landroidx/leanback/widget/GridLayoutManager;->a1:Lf63;

    .line 68
    .line 69
    const/4 v2, 0x2

    .line 70
    new-array v2, v2, [I

    .line 71
    .line 72
    iput-object v2, p0, Landroidx/leanback/widget/GridLayoutManager;->d1:[I

    .line 73
    .line 74
    new-instance v2, Lcb0;

    .line 75
    .line 76
    const/16 v3, 0x8

    .line 77
    .line 78
    invoke-direct {v2, v3}, Lcb0;-><init>(B)V

    .line 79
    .line 80
    .line 81
    iput v0, v2, Lcb0;->Y:I

    .line 82
    .line 83
    const/16 v3, 0x64

    .line 84
    .line 85
    iput v3, v2, Lcb0;->Z:I

    .line 86
    .line 87
    iput-object v2, p0, Landroidx/leanback/widget/GridLayoutManager;->e1:Lcb0;

    .line 88
    .line 89
    new-instance v2, Lxb;

    .line 90
    .line 91
    const/16 v3, 0xc

    .line 92
    .line 93
    invoke-direct {v2, p0, v3}, Lxb;-><init>(Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    iput-object v2, p0, Landroidx/leanback/widget/GridLayoutManager;->f1:Lxb;

    .line 97
    .line 98
    new-instance v2, Lq02;

    .line 99
    .line 100
    const/4 v3, 0x7

    .line 101
    invoke-direct {v2, p0, v3}, Lq02;-><init>(Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    iput-object v2, p0, Landroidx/leanback/widget/GridLayoutManager;->g1:Lq02;

    .line 105
    .line 106
    iput-object p1, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 107
    .line 108
    iput v1, p0, Landroidx/leanback/widget/GridLayoutManager;->K0:I

    .line 109
    .line 110
    iget-boolean p1, p0, Landroidx/recyclerview/widget/j;->k0:Z

    .line 111
    .line 112
    if-eqz p1, :cond_0

    .line 113
    .line 114
    iput-boolean v0, p0, Landroidx/recyclerview/widget/j;->k0:Z

    .line 115
    .line 116
    iput v0, p0, Landroidx/recyclerview/widget/j;->l0:I

    .line 117
    .line 118
    iget-object p0, p0, Landroidx/recyclerview/widget/j;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 119
    .line 120
    if-eqz p0, :cond_0

    .line 121
    .line 122
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:Landroidx/recyclerview/widget/k;

    .line 123
    .line 124
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->n()V

    .line 125
    .line 126
    .line 127
    :cond_0
    return-void
.end method

.method public static e1(Landroid/view/View;)I
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Llu2;

    .line 9
    .line 10
    if-eqz p0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->X:Landroidx/recyclerview/widget/l;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/recyclerview/widget/l;->i()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->X:Landroidx/recyclerview/widget/l;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->b()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_2
    :goto_0
    const/4 p0, -0x1

    .line 29
    return p0
.end method

.method public static f1(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Llu2;

    .line 6
    .line 7
    invoke-static {p0}, Landroidx/recyclerview/widget/j;->O(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 12
    .line 13
    add-int/2addr p0, v1

    .line 14
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 15
    .line 16
    add-int/2addr p0, v0

    .line 17
    return p0
.end method

.method public static g1(Landroid/view/View;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Llu2;

    .line 6
    .line 7
    invoke-static {p0}, Landroidx/recyclerview/widget/j;->P(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 12
    .line 13
    add-int/2addr p0, v1

    .line 14
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 15
    .line 16
    add-int/2addr p0, v0

    .line 17
    return p0
.end method


# virtual methods
.method public final A1(IZ)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/j;->g0:Landroidx/recyclerview/widget/c;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, v0, Lp96;->e:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v0, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v3, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroid/view/View;->isLayoutRequested()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-static {v1}, Landroidx/leanback/widget/GridLayoutManager;->e1(Landroid/view/View;)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-ne v3, p1, :cond_1

    .line 34
    .line 35
    iget p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 36
    .line 37
    or-int/lit8 p1, p1, 0x20

    .line 38
    .line 39
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    move-object v0, p0

    .line 48
    move v3, p2

    .line 49
    invoke-virtual/range {v0 .. v5}, Landroidx/leanback/widget/GridLayoutManager;->C1(Landroid/view/View;Landroid/view/View;ZII)V

    .line 50
    .line 51
    .line 52
    iget p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 53
    .line 54
    and-int/lit8 p1, p1, -0x21

    .line 55
    .line 56
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    move v3, p2

    .line 60
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 61
    .line 62
    and-int/lit16 v4, p2, 0x200

    .line 63
    .line 64
    const/high16 v5, -0x80000000

    .line 65
    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    and-int/lit8 p2, p2, 0x40

    .line 69
    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    :cond_2
    move-object v0, p0

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    if-eqz v3, :cond_6

    .line 75
    .line 76
    iget-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 77
    .line 78
    invoke-virtual {p2}, Landroid/view/View;->isLayoutRequested()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-nez p2, :cond_6

    .line 83
    .line 84
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 85
    .line 86
    iput v5, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 87
    .line 88
    iget-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 89
    .line 90
    if-eqz p2, :cond_5

    .line 91
    .line 92
    new-instance p2, Lju2;

    .line 93
    .line 94
    invoke-direct {p2, p0}, Lju2;-><init>(Landroidx/leanback/widget/GridLayoutManager;)V

    .line 95
    .line 96
    .line 97
    iput p1, p2, Lp96;->a:I

    .line 98
    .line 99
    invoke-virtual {p0, p2}, Landroidx/leanback/widget/GridLayoutManager;->Y0(Landroidx/recyclerview/widget/c;)V

    .line 100
    .line 101
    .line 102
    iget p1, p2, Lp96;->a:I

    .line 103
    .line 104
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 105
    .line 106
    if-eq p1, p2, :cond_4

    .line 107
    .line 108
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 109
    .line 110
    :cond_4
    return-void

    .line 111
    :cond_5
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_6
    if-eqz v0, :cond_8

    .line 118
    .line 119
    iget-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->H0:Lku2;

    .line 120
    .line 121
    if-eqz p2, :cond_7

    .line 122
    .line 123
    iput-boolean v2, p2, Lku2;->p:Z

    .line 124
    .line 125
    :cond_7
    iget-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 126
    .line 127
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->t0()V

    .line 128
    .line 129
    .line 130
    :cond_8
    iget-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 131
    .line 132
    invoke-virtual {p2}, Landroid/view/View;->isLayoutRequested()Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-nez p2, :cond_9

    .line 137
    .line 138
    if-eqz v1, :cond_9

    .line 139
    .line 140
    invoke-static {v1}, Landroidx/leanback/widget/GridLayoutManager;->e1(Landroid/view/View;)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-ne p2, p1, :cond_9

    .line 145
    .line 146
    iget p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 147
    .line 148
    or-int/lit8 p1, p1, 0x20

    .line 149
    .line 150
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 151
    .line 152
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    const/4 v4, 0x0

    .line 157
    const/4 v5, 0x0

    .line 158
    move-object v0, p0

    .line 159
    invoke-virtual/range {v0 .. v5}, Landroidx/leanback/widget/GridLayoutManager;->C1(Landroid/view/View;Landroid/view/View;ZII)V

    .line 160
    .line 161
    .line 162
    iget p0, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 163
    .line 164
    and-int/lit8 p0, p0, -0x21

    .line 165
    .line 166
    iput p0, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 167
    .line 168
    return-void

    .line 169
    :cond_9
    move-object v0, p0

    .line 170
    iput p1, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 171
    .line 172
    iput v5, v0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 173
    .line 174
    iget p0, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 175
    .line 176
    or-int/lit16 p0, p0, 0x100

    .line 177
    .line 178
    iput p0, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 179
    .line 180
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->K0()V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :goto_1
    iput p1, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 185
    .line 186
    iput v5, v0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 187
    .line 188
    return-void
.end method

.method public final B1(Landroid/view/View;Landroid/view/View;Z)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move v3, p3

    .line 7
    invoke-virtual/range {v0 .. v5}, Landroidx/leanback/widget/GridLayoutManager;->C1(Landroid/view/View;Landroid/view/View;ZII)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final C0(Landroidx/recyclerview/widget/k;Lq96;ILandroid/os/Bundle;)Z
    .locals 4

    .line 1
    iget p4, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    const/high16 v0, 0x20000

    .line 4
    .line 5
    and-int/2addr p4, v0

    .line 6
    const/4 v0, 0x1

    .line 7
    if-eqz p4, :cond_d

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Landroidx/leanback/widget/GridLayoutManager;->x1(Landroidx/recyclerview/widget/k;Lq96;)V

    .line 10
    .line 11
    .line 12
    iget p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 13
    .line 14
    const/high16 p4, 0x40000

    .line 15
    .line 16
    and-int/2addr p1, p4

    .line 17
    const/4 p4, 0x0

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    move p1, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move p1, p4

    .line 23
    :goto_0
    iget-boolean v1, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 24
    .line 25
    const/16 v2, 0x2000

    .line 26
    .line 27
    const/16 v3, 0x1000

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    sget-object v1, La4;->p:La4;

    .line 32
    .line 33
    invoke-virtual {v1}, La4;->a()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-ne p3, v1, :cond_1

    .line 38
    .line 39
    if-eqz p1, :cond_3

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    sget-object v1, La4;->r:La4;

    .line 43
    .line 44
    invoke-virtual {v1}, La4;->a()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-ne p3, v1, :cond_6

    .line 49
    .line 50
    if-eqz p1, :cond_5

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    sget-object p1, La4;->o:La4;

    .line 54
    .line 55
    invoke-virtual {p1}, La4;->a()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-ne p3, p1, :cond_4

    .line 60
    .line 61
    :cond_3
    :goto_1
    move p3, v2

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    sget-object p1, La4;->q:La4;

    .line 64
    .line 65
    invoke-virtual {p1}, La4;->a()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-ne p3, p1, :cond_6

    .line 70
    .line 71
    :cond_5
    :goto_2
    move p3, v3

    .line 72
    :cond_6
    :goto_3
    iget p1, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 73
    .line 74
    if-nez p1, :cond_7

    .line 75
    .line 76
    if-ne p3, v2, :cond_7

    .line 77
    .line 78
    move v1, v0

    .line 79
    goto :goto_4

    .line 80
    :cond_7
    move v1, p4

    .line 81
    :goto_4
    invoke-virtual {p2}, Lq96;->b()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    sub-int/2addr p2, v0

    .line 86
    if-ne p1, p2, :cond_8

    .line 87
    .line 88
    if-ne p3, v3, :cond_8

    .line 89
    .line 90
    move p1, v0

    .line 91
    goto :goto_5

    .line 92
    :cond_8
    move p1, p4

    .line 93
    :goto_5
    if-nez v1, :cond_c

    .line 94
    .line 95
    if-eqz p1, :cond_9

    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_9
    if-eq p3, v3, :cond_b

    .line 99
    .line 100
    if-eq p3, v2, :cond_a

    .line 101
    .line 102
    goto :goto_7

    .line 103
    :cond_a
    invoke-virtual {p0, p4}, Landroidx/leanback/widget/GridLayoutManager;->s1(Z)V

    .line 104
    .line 105
    .line 106
    const/4 p1, -0x1

    .line 107
    invoke-virtual {p0, p1, p4}, Landroidx/leanback/widget/GridLayoutManager;->u1(IZ)I

    .line 108
    .line 109
    .line 110
    goto :goto_7

    .line 111
    :cond_b
    invoke-virtual {p0, v0}, Landroidx/leanback/widget/GridLayoutManager;->s1(Z)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v0, p4}, Landroidx/leanback/widget/GridLayoutManager;->u1(IZ)I

    .line 115
    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_c
    :goto_6
    invoke-static {v3}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 123
    .line 124
    invoke-virtual {p2, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 125
    .line 126
    .line 127
    iget-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 128
    .line 129
    invoke-virtual {p2, p2, p1}, Landroid/view/ViewGroup;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 130
    .line 131
    .line 132
    :goto_7
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->p1()V

    .line 133
    .line 134
    .line 135
    :cond_d
    return v0
.end method

.method public final C1(Landroid/view/View;Landroid/view/View;ZII)V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x40

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-static {p1}, Landroidx/leanback/widget/GridLayoutManager;->e1(Landroid/view/View;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Llu2;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    :cond_2
    :goto_0
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    const/4 v3, 0x0

    .line 30
    if-ne v0, v1, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 34
    .line 35
    iput v3, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 36
    .line 37
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 38
    .line 39
    and-int/lit8 v0, v0, 0x3

    .line 40
    .line 41
    if-eq v0, v2, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->b1()V

    .line 44
    .line 45
    .line 46
    :cond_4
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 47
    .line 48
    invoke-virtual {v0}, Lb20;->Q()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 57
    .line 58
    .line 59
    :cond_5
    :goto_1
    if-nez p1, :cond_6

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_7

    .line 67
    .line 68
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_7

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 77
    .line 78
    .line 79
    :cond_7
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 80
    .line 81
    const/high16 v1, 0x20000

    .line 82
    .line 83
    and-int/2addr v0, v1

    .line 84
    if-nez v0, :cond_8

    .line 85
    .line 86
    if-eqz p3, :cond_8

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_8
    sget-object v0, Landroidx/leanback/widget/GridLayoutManager;->i1:[I

    .line 90
    .line 91
    invoke-virtual {p0, p1, p2, v0}, Landroidx/leanback/widget/GridLayoutManager;->k1(Landroid/view/View;Landroid/view/View;[I)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_a

    .line 96
    .line 97
    if-nez p4, :cond_a

    .line 98
    .line 99
    if-eqz p5, :cond_9

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_9
    :goto_2
    return-void

    .line 103
    :cond_a
    :goto_3
    aget p1, v0, v3

    .line 104
    .line 105
    add-int/2addr p1, p4

    .line 106
    aget p2, v0, v2

    .line 107
    .line 108
    add-int/2addr p2, p5

    .line 109
    iget p4, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 110
    .line 111
    and-int/lit8 p4, p4, 0x3

    .line 112
    .line 113
    if-ne p4, v2, :cond_b

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Landroidx/leanback/widget/GridLayoutManager;->y1(I)I

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p2}, Landroidx/leanback/widget/GridLayoutManager;->z1(I)I

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_b
    iget-boolean p4, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 123
    .line 124
    if-nez p4, :cond_c

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_c
    move v4, p2

    .line 128
    move p2, p1

    .line 129
    move p1, v4

    .line 130
    :goto_4
    iget-object p4, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 131
    .line 132
    if-eqz p3, :cond_d

    .line 133
    .line 134
    invoke-virtual {p4, p1, p2, v3}, Landroidx/recyclerview/widget/RecyclerView;->n0(IIZ)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_d
    invoke-virtual {p4, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->c1()V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final D1(I)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iput-boolean p1, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 8
    .line 9
    invoke-static {p0, p1}, Ltd5;->b(Landroidx/recyclerview/widget/j;I)Ltd5;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->Z0:Lyr6;

    .line 16
    .line 17
    iget-object v1, v0, Lyr6;->Y:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lm09;

    .line 20
    .line 21
    iget-object v2, v0, Lyr6;->Z:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lm09;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iput-object v2, v0, Lyr6;->f0:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object v1, v0, Lyr6;->g0:Ljava/lang/Object;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iput-object v1, v0, Lyr6;->f0:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v2, v0, Lyr6;->g0:Ljava/lang/Object;

    .line 35
    .line 36
    :goto_0
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->a1:Lf63;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    iget-object p1, v0, Lf63;->Z:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lmi3;

    .line 46
    .line 47
    iput-object p1, v0, Lf63;->f0:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-object p1, v0, Lf63;->Y:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lmi3;

    .line 53
    .line 54
    iput-object p1, v0, Lf63;->f0:Ljava/lang/Object;

    .line 55
    .line 56
    :goto_1
    iget p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 57
    .line 58
    or-int/lit16 p1, p1, 0x100

    .line 59
    .line 60
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 61
    .line 62
    return-void
.end method

.method public final E0(Landroidx/recyclerview/widget/k;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/j;->H0(ILandroidx/recyclerview/widget/k;)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final E1(I)V
    .locals 1

    .line 1
    if-gez p1, :cond_1

    .line 2
    .line 3
    const/4 v0, -0x2

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string p0, "Invalid row height: "

    .line 8
    .line 9
    invoke-static {p1, p0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    :goto_0
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->M0:I

    .line 18
    .line 19
    return-void
.end method

.method public final F(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 0

    .line 1
    new-instance p0, Llu2;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final F1(IZ)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/leanback/widget/GridLayoutManager;->A1(IZ)V

    .line 10
    .line 11
    .line 12
    :cond_1
    :goto_0
    return-void
.end method

.method public final G(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$LayoutParams;
    .locals 0

    .line 1
    instance-of p0, p1, Llu2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Llu2;

    .line 6
    .line 7
    check-cast p1, Llu2;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of p0, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    new-instance p0, Llu2;

    .line 18
    .line 19
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    instance-of p0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    new-instance p0, Llu2;

    .line 30
    .line 31
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    new-instance p0, Llu2;

    .line 38
    .line 39
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    return-object p0
.end method

.method public final G1()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0, v2}, Landroidx/leanback/widget/GridLayoutManager;->H1(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
.end method

.method public final H1(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Llu2;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->a1:Lf63;

    .line 11
    .line 12
    iget-object v1, p0, Lf63;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lmi3;

    .line 15
    .line 16
    iget-boolean v2, v1, Lmi3;->e:Z

    .line 17
    .line 18
    invoke-static {p1, v1, v2}, Lni3;->a(Landroid/view/View;Lmi3;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, v0, Llu2;->k0:I

    .line 23
    .line 24
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lmi3;

    .line 27
    .line 28
    iget-boolean v1, p0, Lmi3;->e:Z

    .line 29
    .line 30
    invoke-static {p1, p0, v1}, Lni3;->a(Landroid/view/View;Lmi3;I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput p0, v0, Llu2;->l0:I

    .line 35
    .line 36
    return-void
.end method

.method public final I0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final I1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Llu2;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 19
    .line 20
    iget v1, v1, Liu2;->f:I

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->X:Landroidx/recyclerview/widget/l;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/recyclerview/widget/l;->c()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    sub-int/2addr v1, v0

    .line 29
    iput v1, p0, Landroidx/leanback/widget/GridLayoutManager;->y0:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    iput v1, p0, Landroidx/leanback/widget/GridLayoutManager;->y0:I

    .line 33
    .line 34
    return-void
.end method

.method public final J1()V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x401

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, Landroidx/leanback/widget/GridLayoutManager;->t1(Z)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/16 v3, 0x400

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    move v1, v3

    .line 15
    :cond_0
    or-int/2addr v0, v1

    .line 16
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 17
    .line 18
    and-int/2addr v0, v3

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 22
    .line 23
    sget-object v1, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->f1:Lxb;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final K(Landroidx/recyclerview/widget/k;Lq96;)I
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget p0, v0, Liu2;->e:I

    .line 11
    .line 12
    return p0

    .line 13
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/j;->K(Landroidx/recyclerview/widget/k;Lq96;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final K1()V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->x0:Lq96;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq96;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_8

    .line 10
    .line 11
    :cond_0
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 12
    .line 13
    const/high16 v1, 0x40000

    .line 14
    .line 15
    and-int/2addr v0, v1

    .line 16
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget v0, v1, Liu2;->g:I

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->x0:Lq96;

    .line 25
    .line 26
    invoke-virtual {v1}, Lq96;->b()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    sub-int/2addr v1, v3

    .line 31
    iget-object v4, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 32
    .line 33
    iget v4, v4, Liu2;->f:I

    .line 34
    .line 35
    move v5, v4

    .line 36
    move v4, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget v0, v1, Liu2;->f:I

    .line 39
    .line 40
    iget v4, v1, Liu2;->g:I

    .line 41
    .line 42
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->x0:Lq96;

    .line 43
    .line 44
    invoke-virtual {v1}, Lq96;->b()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    sub-int/2addr v1, v3

    .line 49
    move v5, v4

    .line 50
    move v4, v1

    .line 51
    move v1, v2

    .line 52
    :goto_0
    if-ltz v0, :cond_a

    .line 53
    .line 54
    if-gez v5, :cond_2

    .line 55
    .line 56
    goto/16 :goto_8

    .line 57
    .line 58
    :cond_2
    if-ne v0, v1, :cond_3

    .line 59
    .line 60
    move v0, v3

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move v0, v2

    .line 63
    :goto_1
    if-ne v5, v4, :cond_4

    .line 64
    .line 65
    move v1, v3

    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move v1, v2

    .line 68
    :goto_2
    const/high16 v4, -0x80000000

    .line 69
    .line 70
    const v5, 0x7fffffff

    .line 71
    .line 72
    .line 73
    iget-object v6, p0, Landroidx/leanback/widget/GridLayoutManager;->Z0:Lyr6;

    .line 74
    .line 75
    if-nez v0, :cond_5

    .line 76
    .line 77
    iget-object v7, v6, Lyr6;->f0:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v7, Lm09;

    .line 80
    .line 81
    iget v8, v7, Lm09;->a:I

    .line 82
    .line 83
    if-ne v8, v5, :cond_5

    .line 84
    .line 85
    if-nez v1, :cond_5

    .line 86
    .line 87
    iget v7, v7, Lm09;->b:I

    .line 88
    .line 89
    if-ne v7, v4, :cond_5

    .line 90
    .line 91
    return-void

    .line 92
    :cond_5
    sget-object v7, Landroidx/leanback/widget/GridLayoutManager;->i1:[I

    .line 93
    .line 94
    if-eqz v0, :cond_7

    .line 95
    .line 96
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 97
    .line 98
    invoke-virtual {v0, v3, v7}, Liu2;->g(Z[I)I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    aget v0, v7, v3

    .line 103
    .line 104
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-boolean v8, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 109
    .line 110
    if-nez v8, :cond_6

    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    check-cast v8, Llu2;

    .line 117
    .line 118
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    iget v10, v8, Llu2;->g0:I

    .line 126
    .line 127
    add-int/2addr v9, v10

    .line 128
    iget v8, v8, Llu2;->k0:I

    .line 129
    .line 130
    :goto_3
    add-int/2addr v9, v8

    .line 131
    goto :goto_4

    .line 132
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    check-cast v8, Llu2;

    .line 137
    .line 138
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    iget v10, v8, Llu2;->h0:I

    .line 146
    .line 147
    add-int/2addr v9, v10

    .line 148
    iget v8, v8, Llu2;->l0:I

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :goto_4
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Llu2;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_7
    move v9, v5

    .line 162
    :goto_5
    if-eqz v1, :cond_9

    .line 163
    .line 164
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 165
    .line 166
    invoke-virtual {v0, v2, v7}, Liu2;->i(Z[I)I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    aget v0, v7, v3

    .line 171
    .line 172
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget-boolean p0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 177
    .line 178
    if-nez p0, :cond_8

    .line 179
    .line 180
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, Llu2;

    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    iget v1, p0, Llu2;->g0:I

    .line 194
    .line 195
    add-int/2addr v0, v1

    .line 196
    iget p0, p0, Llu2;->k0:I

    .line 197
    .line 198
    :goto_6
    add-int/2addr v0, p0

    .line 199
    goto :goto_7

    .line 200
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    check-cast p0, Llu2;

    .line 205
    .line 206
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    iget v1, p0, Llu2;->h0:I

    .line 214
    .line 215
    add-int/2addr v0, v1

    .line 216
    iget p0, p0, Llu2;->l0:I

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_9
    move v0, v4

    .line 220
    :goto_7
    iget-object p0, v6, Lyr6;->f0:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast p0, Lm09;

    .line 223
    .line 224
    invoke-virtual {p0, v4, v5, v0, v9}, Lm09;->c(IIII)V

    .line 225
    .line 226
    .line 227
    :cond_a
    :goto_8
    return-void
.end method

.method public final L(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/j;->L(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Llu2;

    .line 10
    .line 11
    iget p1, p1, Llu2;->j0:I

    .line 12
    .line 13
    sub-int/2addr p0, p1

    .line 14
    return p0
.end method

.method public final L1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->Z0:Lyr6;

    .line 2
    .line 3
    iget-object v0, v0, Lyr6;->g0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lm09;

    .line 6
    .line 7
    iget v1, v0, Lm09;->j:I

    .line 8
    .line 9
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->L0:I

    .line 10
    .line 11
    sub-int/2addr v1, v2

    .line 12
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->l1()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    add-int/2addr p0, v1

    .line 17
    invoke-virtual {v0, v1, p0, v1, p0}, Lm09;->c(IIII)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final M(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/j;->M(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Llu2;

    .line 9
    .line 10
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 11
    .line 12
    iget v0, p0, Llu2;->g0:I

    .line 13
    .line 14
    add-int/2addr p1, v0

    .line 15
    iput p1, p2, Landroid/graphics/Rect;->left:I

    .line 16
    .line 17
    iget p1, p2, Landroid/graphics/Rect;->top:I

    .line 18
    .line 19
    iget v0, p0, Llu2;->h0:I

    .line 20
    .line 21
    add-int/2addr p1, v0

    .line 22
    iput p1, p2, Landroid/graphics/Rect;->top:I

    .line 23
    .line 24
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 25
    .line 26
    iget v0, p0, Llu2;->i0:I

    .line 27
    .line 28
    sub-int/2addr p1, v0

    .line 29
    iput p1, p2, Landroid/graphics/Rect;->right:I

    .line 30
    .line 31
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 32
    .line 33
    iget p0, p0, Llu2;->j0:I

    .line 34
    .line 35
    sub-int/2addr p1, p0

    .line 36
    iput p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 37
    .line 38
    return-void
.end method

.method public final M0(ILq96;Landroidx/recyclerview/widget/k;)I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x200

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p3, p2}, Landroidx/leanback/widget/GridLayoutManager;->x1(Landroidx/recyclerview/widget/k;Lq96;)V

    .line 12
    .line 13
    .line 14
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 15
    .line 16
    and-int/lit8 p2, p2, -0x4

    .line 17
    .line 18
    or-int/lit8 p2, p2, 0x2

    .line 19
    .line 20
    iput p2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 21
    .line 22
    iget-boolean p2, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 23
    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroidx/leanback/widget/GridLayoutManager;->y1(I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/leanback/widget/GridLayoutManager;->z1(I)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    :goto_0
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->p1()V

    .line 36
    .line 37
    .line 38
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 39
    .line 40
    and-int/lit8 p2, p2, -0x4

    .line 41
    .line 42
    iput p2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 43
    .line 44
    return p1

    .line 45
    :cond_1
    const/4 p0, 0x0

    .line 46
    return p0
.end method

.method public final N(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/j;->N(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Llu2;

    .line 10
    .line 11
    iget p1, p1, Llu2;->g0:I

    .line 12
    .line 13
    add-int/2addr p0, p1

    .line 14
    return p0
.end method

.method public final N0(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Landroidx/leanback/widget/GridLayoutManager;->F1(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final O0(ILq96;Landroidx/recyclerview/widget/k;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    and-int/lit16 v1, v0, 0x200

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    and-int/lit8 v0, v0, -0x4

    .line 12
    .line 13
    or-int/lit8 v0, v0, 0x2

    .line 14
    .line 15
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 16
    .line 17
    invoke-virtual {p0, p3, p2}, Landroidx/leanback/widget/GridLayoutManager;->x1(Landroidx/recyclerview/widget/k;Lq96;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p2, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 21
    .line 22
    const/4 p3, 0x1

    .line 23
    if-ne p2, p3, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroidx/leanback/widget/GridLayoutManager;->y1(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/leanback/widget/GridLayoutManager;->z1(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    :goto_0
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->p1()V

    .line 35
    .line 36
    .line 37
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 38
    .line 39
    and-int/lit8 p2, p2, -0x4

    .line 40
    .line 41
    iput p2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 42
    .line 43
    return p1

    .line 44
    :cond_1
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method public final Q(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/j;->Q(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Llu2;

    .line 10
    .line 11
    iget p1, p1, Llu2;->i0:I

    .line 12
    .line 13
    sub-int/2addr p0, p1

    .line 14
    return p0
.end method

.method public final R(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/j;->R(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Llu2;

    .line 10
    .line 11
    iget p1, p1, Llu2;->h0:I

    .line 12
    .line 13
    add-int/2addr p0, p1

    .line 14
    return p0
.end method

.method public final V(Landroidx/recyclerview/widget/k;Lq96;)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p0, v0, Liu2;->e:I

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/j;->V(Landroidx/recyclerview/widget/k;Lq96;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final X0(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p2, p1}, Landroidx/leanback/widget/GridLayoutManager;->F1(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final Y0(Landroidx/recyclerview/widget/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->H0:Lku2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, v0, Lku2;->p:Z

    .line 7
    .line 8
    :cond_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/j;->Y0(Landroidx/recyclerview/widget/c;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p1, Lp96;->e:Z

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    instance-of v0, p1, Lku2;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p1, Lku2;

    .line 21
    .line 22
    iput-object p1, p0, Landroidx/leanback/widget/GridLayoutManager;->H0:Lku2;

    .line 23
    .line 24
    instance-of v0, p1, Lmu2;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    check-cast p1, Lmu2;

    .line 29
    .line 30
    iput-object p1, p0, Landroidx/leanback/widget/GridLayoutManager;->I0:Lmu2;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iput-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->I0:Lmu2;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    iput-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->H0:Lku2;

    .line 37
    .line 38
    iput-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->I0:Lmu2;

    .line 39
    .line 40
    return-void
.end method

.method public final a1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 2
    .line 3
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 4
    .line 5
    const/high16 v2, 0x40000

    .line 6
    .line 7
    and-int/2addr v1, v2

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->c1:I

    .line 11
    .line 12
    neg-int v1, v1

    .line 13
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->z0:I

    .line 14
    .line 15
    sub-int/2addr v1, p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->b1:I

    .line 18
    .line 19
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->c1:I

    .line 20
    .line 21
    add-int/2addr v1, v2

    .line 22
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->z0:I

    .line 23
    .line 24
    add-int/2addr v1, p0

    .line 25
    :goto_0
    const/4 p0, 0x0

    .line 26
    invoke-virtual {v0, v1, p0}, Liu2;->b(IZ)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final b1()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->F0:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_3

    .line 10
    .line 11
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, -0x1

    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    move-object v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    iget-object v3, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 32
    .line 33
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 34
    .line 35
    invoke-virtual {p0, v1, v0, v2}, Landroidx/leanback/widget/GridLayoutManager;->d1(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/l;I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p0, v3, v1, v2}, Landroidx/leanback/widget/GridLayoutManager;->d1(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/l;I)V

    .line 40
    .line 41
    .line 42
    :goto_1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 43
    .line 44
    and-int/lit8 v0, v0, 0x3

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    if-eq v0, v1, :cond_3

    .line 48
    .line 49
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const/4 v1, 0x0

    .line 62
    :goto_2
    if-ge v1, v0, :cond_3

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Landroid/view/View;->isLayoutRequested()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 75
    .line 76
    sget-object v1, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 77
    .line 78
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->f1:Lxb;

    .line 79
    .line 80
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    return-void
.end method

.method public final c1()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->F0:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_4

    .line 10
    .line 11
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->F0:Ljava/util/ArrayList;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/lit8 v0, v0, -0x1

    .line 39
    .line 40
    :goto_1
    if-ltz v0, :cond_4

    .line 41
    .line 42
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->F0:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lea5;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    add-int/lit8 v0, v0, -0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->F0:Ljava/util/ArrayList;

    .line 57
    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    add-int/lit8 v0, v0, -0x1

    .line 66
    .line 67
    :goto_2
    if-ltz v0, :cond_4

    .line 68
    .line 69
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->F0:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lea5;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    add-int/lit8 v0, v0, -0x1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    :goto_3
    return-void
.end method

.method public final d1(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/l;I)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->F0:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    sub-int/2addr v0, v1

    .line 13
    :goto_0
    if-ltz v0, :cond_6

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/leanback/widget/GridLayoutManager;->F0:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lea5;

    .line 22
    .line 23
    check-cast v2, Lzm5;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-object v3, p1

    .line 29
    check-cast v3, Landroidx/leanback/widget/VerticalGridView;

    .line 30
    .line 31
    iget-object v2, v2, Lzm5;->a:Landroidx/leanback/widget/picker/Picker;

    .line 32
    .line 33
    iget-object v4, v2, Landroidx/leanback/widget/picker/Picker;->g0:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v2, v3}, Landroidx/leanback/widget/picker/Picker;->d(I)V

    .line 40
    .line 41
    .line 42
    if-eqz p2, :cond_5

    .line 43
    .line 44
    iget-object v4, v2, Landroidx/leanback/widget/picker/Picker;->h0:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lcn5;

    .line 51
    .line 52
    iget v4, v4, Lcn5;->b:I

    .line 53
    .line 54
    add-int/2addr v4, p3

    .line 55
    check-cast v2, Landroidx/leanback/widget/picker/DatePicker;

    .line 56
    .line 57
    iget-object v5, v2, Landroidx/leanback/widget/picker/DatePicker;->G0:Ljava/util/Calendar;

    .line 58
    .line 59
    iget-object v6, v2, Landroidx/leanback/widget/picker/DatePicker;->F0:Ljava/util/Calendar;

    .line 60
    .line 61
    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 62
    .line 63
    .line 64
    move-result-wide v6

    .line 65
    invoke-virtual {v5, v6, v7}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 66
    .line 67
    .line 68
    iget-object v5, v2, Landroidx/leanback/widget/picker/Picker;->h0:Ljava/util/ArrayList;

    .line 69
    .line 70
    if-nez v5, :cond_1

    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Lcn5;

    .line 79
    .line 80
    :goto_1
    iget v5, v5, Lcn5;->a:I

    .line 81
    .line 82
    iget v6, v2, Landroidx/leanback/widget/picker/DatePicker;->z0:I

    .line 83
    .line 84
    const/4 v7, 0x2

    .line 85
    const/4 v8, 0x5

    .line 86
    if-ne v3, v6, :cond_2

    .line 87
    .line 88
    iget-object v3, v2, Landroidx/leanback/widget/picker/DatePicker;->G0:Ljava/util/Calendar;

    .line 89
    .line 90
    sub-int/2addr v4, v5

    .line 91
    invoke-virtual {v3, v8, v4}, Ljava/util/Calendar;->add(II)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    iget v6, v2, Landroidx/leanback/widget/picker/DatePicker;->y0:I

    .line 96
    .line 97
    if-ne v3, v6, :cond_3

    .line 98
    .line 99
    iget-object v3, v2, Landroidx/leanback/widget/picker/DatePicker;->G0:Ljava/util/Calendar;

    .line 100
    .line 101
    sub-int/2addr v4, v5

    .line 102
    invoke-virtual {v3, v7, v4}, Ljava/util/Calendar;->add(II)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    iget v6, v2, Landroidx/leanback/widget/picker/DatePicker;->A0:I

    .line 107
    .line 108
    if-ne v3, v6, :cond_4

    .line 109
    .line 110
    iget-object v3, v2, Landroidx/leanback/widget/picker/DatePicker;->G0:Ljava/util/Calendar;

    .line 111
    .line 112
    sub-int/2addr v4, v5

    .line 113
    invoke-virtual {v3, v1, v4}, Ljava/util/Calendar;->add(II)V

    .line 114
    .line 115
    .line 116
    :goto_2
    iget-object v3, v2, Landroidx/leanback/widget/picker/DatePicker;->G0:Ljava/util/Calendar;

    .line 117
    .line 118
    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    iget-object v4, v2, Landroidx/leanback/widget/picker/DatePicker;->G0:Ljava/util/Calendar;

    .line 123
    .line 124
    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    iget-object v5, v2, Landroidx/leanback/widget/picker/DatePicker;->G0:Ljava/util/Calendar;

    .line 129
    .line 130
    invoke-virtual {v5, v8}, Ljava/util/Calendar;->get(I)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    invoke-virtual {v2, v3, v4, v5}, Landroidx/leanback/widget/picker/DatePicker;->g(III)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    invoke-static {}, Lkp5;->e()V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_5
    :goto_3
    add-int/lit8 v0, v0, -0x1

    .line 143
    .line 144
    goto/16 :goto_0

    .line 145
    .line 146
    :cond_6
    :goto_4
    return-void
.end method

.method public final e0(Landroidx/recyclerview/widget/f;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 5
    .line 6
    iput-object p1, p0, Landroidx/leanback/widget/GridLayoutManager;->O0:[I

    .line 7
    .line 8
    iget p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 9
    .line 10
    and-int/lit16 p1, p1, -0x401

    .line 11
    .line 12
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 19
    .line 20
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->e1:Lcb0;

    .line 21
    .line 22
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lej4;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lej4;->d(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final f0(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/ArrayList;II)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    iget v4, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 10
    .line 11
    const v5, 0x8000

    .line 12
    .line 13
    .line 14
    and-int/2addr v4, v5

    .line 15
    const/4 v5, 0x1

    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    :cond_0
    :goto_0
    move/from16 v17, v5

    .line 19
    .line 20
    goto/16 :goto_f

    .line 21
    .line 22
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->hasFocus()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1e

    .line 27
    .line 28
    iget-object v4, v0, Landroidx/leanback/widget/GridLayoutManager;->I0:Lmu2;

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-virtual {v0, v2}, Landroidx/leanback/widget/GridLayoutManager;->h1(I)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    const/4 v8, -0x1

    .line 42
    if-eqz v7, :cond_4

    .line 43
    .line 44
    iget-object v9, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 45
    .line 46
    if-eqz v9, :cond_4

    .line 47
    .line 48
    if-eq v7, v9, :cond_4

    .line 49
    .line 50
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/j;->C(Landroid/view/View;)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    if-eqz v7, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    const/4 v10, 0x0

    .line 61
    :goto_1
    if-ge v10, v9, :cond_4

    .line 62
    .line 63
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    if-ne v11, v7, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    move v10, v8

    .line 74
    :goto_2
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-static {v7}, Landroidx/leanback/widget/GridLayoutManager;->e1(Landroid/view/View;)I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-ne v7, v8, :cond_5

    .line 83
    .line 84
    const/4 v9, 0x0

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    :goto_3
    if-eqz v9, :cond_6

    .line 91
    .line 92
    invoke-virtual {v9, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 93
    .line 94
    .line 95
    :cond_6
    iget-object v11, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 96
    .line 97
    if-eqz v11, :cond_0

    .line 98
    .line 99
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    if-nez v11, :cond_7

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_7
    const/4 v11, 0x2

    .line 107
    const/4 v12, 0x3

    .line 108
    if-eq v4, v12, :cond_8

    .line 109
    .line 110
    if-ne v4, v11, :cond_9

    .line 111
    .line 112
    :cond_8
    iget-object v13, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 113
    .line 114
    iget v13, v13, Liu2;->e:I

    .line 115
    .line 116
    if-gt v13, v5, :cond_9

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_9
    iget-object v13, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 120
    .line 121
    if-eqz v13, :cond_a

    .line 122
    .line 123
    if-eqz v9, :cond_a

    .line 124
    .line 125
    invoke-virtual {v13, v7}, Liu2;->k(I)Lr75;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    iget v13, v13, Lr75;->Y:I

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_a
    move v13, v8

    .line 133
    :goto_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    if-eq v4, v5, :cond_c

    .line 138
    .line 139
    if-ne v4, v12, :cond_b

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_b
    move v15, v8

    .line 143
    goto :goto_6

    .line 144
    :cond_c
    :goto_5
    move v15, v5

    .line 145
    :goto_6
    if-lez v15, :cond_d

    .line 146
    .line 147
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 148
    .line 149
    .line 150
    move-result v16

    .line 151
    add-int/lit8 v16, v16, -0x1

    .line 152
    .line 153
    move/from16 v6, v16

    .line 154
    .line 155
    goto :goto_7

    .line 156
    :cond_d
    const/4 v6, 0x0

    .line 157
    :goto_7
    if-ne v10, v8, :cond_f

    .line 158
    .line 159
    if-lez v15, :cond_e

    .line 160
    .line 161
    const/16 v16, 0x0

    .line 162
    .line 163
    goto :goto_8

    .line 164
    :cond_e
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    sub-int/2addr v8, v5

    .line 169
    move/from16 v16, v8

    .line 170
    .line 171
    goto :goto_8

    .line 172
    :cond_f
    add-int v16, v10, v15

    .line 173
    .line 174
    :goto_8
    move/from16 v8, v16

    .line 175
    .line 176
    :goto_9
    if-lez v15, :cond_10

    .line 177
    .line 178
    if-gt v8, v6, :cond_0

    .line 179
    .line 180
    goto :goto_a

    .line 181
    :cond_10
    if-lt v8, v6, :cond_0

    .line 182
    .line 183
    :goto_a
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    .line 188
    .line 189
    .line 190
    move-result v16

    .line 191
    if-nez v16, :cond_11

    .line 192
    .line 193
    invoke-virtual {v10}, Landroid/view/View;->hasFocusable()Z

    .line 194
    .line 195
    .line 196
    move-result v16

    .line 197
    if-nez v16, :cond_12

    .line 198
    .line 199
    :cond_11
    move/from16 v17, v5

    .line 200
    .line 201
    move v5, v11

    .line 202
    move v11, v12

    .line 203
    goto/16 :goto_c

    .line 204
    .line 205
    :cond_12
    if-nez v9, :cond_13

    .line 206
    .line 207
    invoke-virtual {v10, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    if-le v10, v14, :cond_11

    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_13
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object v16

    .line 222
    invoke-static/range {v16 .. v16}, Landroidx/leanback/widget/GridLayoutManager;->e1(Landroid/view/View;)I

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    iget-object v12, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 227
    .line 228
    invoke-virtual {v12, v11}, Liu2;->k(I)Lr75;

    .line 229
    .line 230
    .line 231
    move-result-object v12

    .line 232
    if-nez v12, :cond_15

    .line 233
    .line 234
    :cond_14
    move/from16 v17, v5

    .line 235
    .line 236
    const/4 v5, 0x2

    .line 237
    const/4 v11, 0x3

    .line 238
    goto :goto_c

    .line 239
    :cond_15
    iget v12, v12, Lr75;->Y:I

    .line 240
    .line 241
    if-ne v4, v5, :cond_16

    .line 242
    .line 243
    if-ne v12, v13, :cond_14

    .line 244
    .line 245
    if-le v11, v7, :cond_14

    .line 246
    .line 247
    invoke-virtual {v10, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    if-le v10, v14, :cond_14

    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_16
    if-nez v4, :cond_17

    .line 259
    .line 260
    if-ne v12, v13, :cond_14

    .line 261
    .line 262
    if-ge v11, v7, :cond_14

    .line 263
    .line 264
    invoke-virtual {v10, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    if-le v10, v14, :cond_14

    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_17
    const/4 v11, 0x3

    .line 276
    if-ne v4, v11, :cond_1a

    .line 277
    .line 278
    if-ne v12, v13, :cond_18

    .line 279
    .line 280
    :goto_b
    move/from16 v17, v5

    .line 281
    .line 282
    const/4 v5, 0x2

    .line 283
    goto :goto_c

    .line 284
    :cond_18
    if-ge v12, v13, :cond_19

    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :cond_19
    invoke-virtual {v10, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 289
    .line 290
    .line 291
    goto :goto_b

    .line 292
    :cond_1a
    move/from16 v17, v5

    .line 293
    .line 294
    const/4 v5, 0x2

    .line 295
    if-ne v4, v5, :cond_1d

    .line 296
    .line 297
    if-ne v12, v13, :cond_1b

    .line 298
    .line 299
    goto :goto_c

    .line 300
    :cond_1b
    if-le v12, v13, :cond_1c

    .line 301
    .line 302
    goto/16 :goto_f

    .line 303
    .line 304
    :cond_1c
    invoke-virtual {v10, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 305
    .line 306
    .line 307
    :cond_1d
    :goto_c
    add-int/2addr v8, v15

    .line 308
    move v12, v11

    .line 309
    move v11, v5

    .line 310
    move/from16 v5, v17

    .line 311
    .line 312
    goto/16 :goto_9

    .line 313
    .line 314
    :cond_1e
    move/from16 v17, v5

    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    iget v5, v0, Landroidx/leanback/widget/GridLayoutManager;->Y0:I

    .line 321
    .line 322
    if-eqz v5, :cond_22

    .line 323
    .line 324
    iget-object v5, v0, Landroidx/leanback/widget/GridLayoutManager;->Z0:Lyr6;

    .line 325
    .line 326
    iget-object v5, v5, Lyr6;->f0:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v5, Lm09;

    .line 329
    .line 330
    iget v6, v5, Lm09;->j:I

    .line 331
    .line 332
    iget v7, v5, Lm09;->i:I

    .line 333
    .line 334
    sub-int/2addr v7, v6

    .line 335
    iget v5, v5, Lm09;->k:I

    .line 336
    .line 337
    sub-int/2addr v7, v5

    .line 338
    add-int/2addr v7, v6

    .line 339
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    const/4 v8, 0x0

    .line 344
    :goto_d
    if-ge v8, v5, :cond_20

    .line 345
    .line 346
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    if-nez v10, :cond_1f

    .line 355
    .line 356
    iget-object v10, v0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 357
    .line 358
    invoke-virtual {v10, v9}, Ltd5;->g(Landroid/view/View;)I

    .line 359
    .line 360
    .line 361
    move-result v10

    .line 362
    if-lt v10, v6, :cond_1f

    .line 363
    .line 364
    iget-object v10, v0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 365
    .line 366
    invoke-virtual {v10, v9}, Ltd5;->d(Landroid/view/View;)I

    .line 367
    .line 368
    .line 369
    move-result v10

    .line 370
    if-gt v10, v7, :cond_1f

    .line 371
    .line 372
    invoke-virtual {v9, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 373
    .line 374
    .line 375
    :cond_1f
    add-int/lit8 v8, v8, 0x1

    .line 376
    .line 377
    goto :goto_d

    .line 378
    :cond_20
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-ne v5, v4, :cond_23

    .line 383
    .line 384
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 385
    .line 386
    .line 387
    move-result v5

    .line 388
    const/4 v6, 0x0

    .line 389
    :goto_e
    if-ge v6, v5, :cond_23

    .line 390
    .line 391
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 392
    .line 393
    .line 394
    move-result-object v7

    .line 395
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 396
    .line 397
    .line 398
    move-result v8

    .line 399
    if-nez v8, :cond_21

    .line 400
    .line 401
    invoke-virtual {v7, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 402
    .line 403
    .line 404
    :cond_21
    add-int/lit8 v6, v6, 0x1

    .line 405
    .line 406
    goto :goto_e

    .line 407
    :cond_22
    iget v5, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 408
    .line 409
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    if-eqz v0, :cond_23

    .line 414
    .line 415
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 416
    .line 417
    .line 418
    :cond_23
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eq v0, v4, :cond_24

    .line 423
    .line 424
    goto :goto_f

    .line 425
    :cond_24
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->isFocusable()Z

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_25

    .line 430
    .line 431
    move-object/from16 v0, p1

    .line 432
    .line 433
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    :cond_25
    :goto_f
    return v17
.end method

.method public final h1(I)I
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 2
    .line 3
    const/16 v1, 0x82

    .line 4
    .line 5
    const/16 v2, 0x42

    .line 6
    .line 7
    const/16 v3, 0x21

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/16 v5, 0x11

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    const/high16 v0, 0x40000

    .line 15
    .line 16
    if-eq p1, v5, :cond_1

    .line 17
    .line 18
    if-eq p1, v3, :cond_7

    .line 19
    .line 20
    if-eq p1, v2, :cond_0

    .line 21
    .line 22
    if-eq p1, v1, :cond_8

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_0
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 26
    .line 27
    and-int/2addr p0, v0

    .line 28
    if-nez p0, :cond_5

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 32
    .line 33
    and-int/2addr p0, v0

    .line 34
    if-nez p0, :cond_3

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    if-ne v0, v4, :cond_9

    .line 38
    .line 39
    const/high16 v0, 0x80000

    .line 40
    .line 41
    if-eq p1, v5, :cond_6

    .line 42
    .line 43
    if-eq p1, v3, :cond_5

    .line 44
    .line 45
    if-eq p1, v2, :cond_4

    .line 46
    .line 47
    if-eq p1, v1, :cond_3

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    :goto_0
    return v4

    .line 51
    :cond_4
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 52
    .line 53
    and-int/2addr p0, v0

    .line 54
    if-nez p0, :cond_7

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 58
    return p0

    .line 59
    :cond_6
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 60
    .line 61
    and-int/2addr p0, v0

    .line 62
    if-nez p0, :cond_8

    .line 63
    .line 64
    :cond_7
    const/4 p0, 0x2

    .line 65
    return p0

    .line 66
    :cond_8
    :goto_2
    const/4 p0, 0x3

    .line 67
    return p0

    .line 68
    :cond_9
    :goto_3
    return v5
.end method

.method public final i1(I)I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->N0:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->O0:[I

    .line 7
    .line 8
    if-nez p0, :cond_1

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    aget p0, p0, p1

    .line 13
    .line 14
    return p0
.end method

.method public final j1(I)I
    .locals 4

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    const/high16 v1, 0x80000

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_0
    if-le v0, p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/leanback/widget/GridLayoutManager;->i1(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget v3, p0, Landroidx/leanback/widget/GridLayoutManager;->T0:I

    .line 20
    .line 21
    add-int/2addr v2, v3

    .line 22
    add-int/2addr v1, v2

    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return v1

    .line 27
    :cond_1
    move v0, v1

    .line 28
    :goto_1
    if-ge v1, p1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroidx/leanback/widget/GridLayoutManager;->i1(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget v3, p0, Landroidx/leanback/widget/GridLayoutManager;->T0:I

    .line 35
    .line 36
    add-int/2addr v2, v3

    .line 37
    add-int/2addr v0, v2

    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    return v0
.end method

.method public final k0(Landroidx/recyclerview/widget/k;Lq96;Lh4;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/leanback/widget/GridLayoutManager;->x1(Landroidx/recyclerview/widget/k;Lq96;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lq96;->b()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 9
    .line 10
    const/high16 v2, 0x40000

    .line 11
    .line 12
    and-int/2addr v2, v1

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    move v2, v4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v3

    .line 20
    :goto_0
    and-int/lit16 v1, v1, 0x800

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    if-le v0, v4, :cond_4

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Landroidx/leanback/widget/GridLayoutManager;->n1(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_4

    .line 31
    .line 32
    :cond_1
    iget-boolean v1, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    sget-object v1, La4;->r:La4;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    sget-object v1, La4;->p:La4;

    .line 42
    .line 43
    :goto_1
    invoke-virtual {p3, v1}, Lh4;->b(La4;)V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    sget-object v1, La4;->o:La4;

    .line 48
    .line 49
    invoke-virtual {p3, v1}, Lh4;->b(La4;)V

    .line 50
    .line 51
    .line 52
    :goto_2
    invoke-virtual {p3, v4}, Lh4;->u(Z)V

    .line 53
    .line 54
    .line 55
    :cond_4
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 56
    .line 57
    and-int/lit16 v1, v1, 0x1000

    .line 58
    .line 59
    if-eqz v1, :cond_5

    .line 60
    .line 61
    if-le v0, v4, :cond_8

    .line 62
    .line 63
    sub-int/2addr v0, v4

    .line 64
    invoke-virtual {p0, v0}, Landroidx/leanback/widget/GridLayoutManager;->n1(I)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_8

    .line 69
    .line 70
    :cond_5
    iget-boolean v0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 71
    .line 72
    if-nez v0, :cond_7

    .line 73
    .line 74
    if-eqz v2, :cond_6

    .line 75
    .line 76
    sget-object v0, La4;->p:La4;

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_6
    sget-object v0, La4;->r:La4;

    .line 80
    .line 81
    :goto_3
    invoke-virtual {p3, v0}, Lh4;->b(La4;)V

    .line 82
    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_7
    sget-object v0, La4;->q:La4;

    .line 86
    .line 87
    invoke-virtual {p3, v0}, Lh4;->b(La4;)V

    .line 88
    .line 89
    .line 90
    :goto_4
    invoke-virtual {p3, v4}, Lh4;->u(Z)V

    .line 91
    .line 92
    .line 93
    :cond_8
    invoke-virtual {p0, p1, p2}, Landroidx/leanback/widget/GridLayoutManager;->V(Landroidx/recyclerview/widget/k;Lq96;)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-virtual {p0, p1, p2}, Landroidx/leanback/widget/GridLayoutManager;->K(Landroidx/recyclerview/widget/k;Lq96;)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-static {v0, p1, v3}, Lf4;->a(III)Lf4;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p3, p1}, Lh4;->n(Lf4;)V

    .line 106
    .line 107
    .line 108
    const-class p1, Landroid/widget/GridView;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p3, p1}, Lh4;->m(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->p1()V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public final k1(Landroid/view/View;Landroid/view/View;[I)Z
    .locals 12

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->Y0:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->Z0:Lyr6;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eq v0, v4, :cond_5

    .line 9
    .line 10
    if-eq v0, v3, :cond_5

    .line 11
    .line 12
    iget-object v0, v1, Lyr6;->f0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lm09;

    .line 15
    .line 16
    iget-boolean v3, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Llu2;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    iget v6, v3, Llu2;->g0:I

    .line 34
    .line 35
    add-int/2addr v5, v6

    .line 36
    iget v3, v3, Llu2;->k0:I

    .line 37
    .line 38
    :goto_0
    add-int/2addr v5, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Llu2;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    iget v6, v3, Llu2;->h0:I

    .line 54
    .line 55
    add-int/2addr v5, v6

    .line 56
    iget v3, v3, Llu2;->l0:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    invoke-virtual {v0, v5}, Lm09;->b(I)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz p2, :cond_1

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p2, Llu2;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    :cond_1
    iget-boolean p0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 75
    .line 76
    if-nez p0, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Llu2;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iget p2, p0, Llu2;->h0:I

    .line 92
    .line 93
    add-int/2addr p1, p2

    .line 94
    iget p0, p0, Llu2;->l0:I

    .line 95
    .line 96
    :goto_2
    add-int/2addr p1, p0

    .line 97
    goto :goto_3

    .line 98
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, Llu2;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    iget p2, p0, Llu2;->g0:I

    .line 112
    .line 113
    add-int/2addr p1, p2

    .line 114
    iget p0, p0, Llu2;->k0:I

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :goto_3
    iget-object p0, v1, Lyr6;->g0:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p0, Lm09;

    .line 120
    .line 121
    invoke-virtual {p0, p1}, Lm09;->b(I)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-nez v0, :cond_4

    .line 126
    .line 127
    if-eqz p0, :cond_3

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_3
    aput v2, p3, v2

    .line 131
    .line 132
    aput v2, p3, v4

    .line 133
    .line 134
    return v2

    .line 135
    :cond_4
    :goto_4
    aput v0, p3, v2

    .line 136
    .line 137
    aput p0, p3, v4

    .line 138
    .line 139
    return v4

    .line 140
    :cond_5
    invoke-static {p1}, Landroidx/leanback/widget/GridLayoutManager;->e1(Landroid/view/View;)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 145
    .line 146
    invoke-virtual {v0, p1}, Ltd5;->g(Landroid/view/View;)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    iget-object v5, p0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 151
    .line 152
    invoke-virtual {v5, p1}, Ltd5;->d(Landroid/view/View;)I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    iget-object v6, v1, Lyr6;->f0:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v6, Lm09;

    .line 159
    .line 160
    iget v7, v6, Lm09;->j:I

    .line 161
    .line 162
    iget v8, v6, Lm09;->i:I

    .line 163
    .line 164
    sub-int/2addr v8, v7

    .line 165
    iget v6, v6, Lm09;->k:I

    .line 166
    .line 167
    sub-int/2addr v8, v6

    .line 168
    iget-object v6, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 169
    .line 170
    invoke-virtual {v6, p2}, Liu2;->k(I)Lr75;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    if-nez v6, :cond_6

    .line 175
    .line 176
    const/4 v6, -0x1

    .line 177
    goto :goto_5

    .line 178
    :cond_6
    iget v6, v6, Lr75;->Y:I

    .line 179
    .line 180
    :goto_5
    const/4 v9, 0x0

    .line 181
    if-ge v0, v7, :cond_d

    .line 182
    .line 183
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->Y0:I

    .line 184
    .line 185
    if-ne v0, v3, :cond_b

    .line 186
    .line 187
    move-object v0, p1

    .line 188
    :goto_6
    iget-object v10, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 189
    .line 190
    iget-boolean v11, v10, Liu2;->c:Z

    .line 191
    .line 192
    if-eqz v11, :cond_7

    .line 193
    .line 194
    const/high16 v11, -0x80000000

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_7
    const v11, 0x7fffffff

    .line 198
    .line 199
    .line 200
    :goto_7
    invoke-virtual {v10, v11, v4}, Liu2;->m(IZ)Z

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    if-eqz v10, :cond_a

    .line 205
    .line 206
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 207
    .line 208
    iget v10, v0, Liu2;->f:I

    .line 209
    .line 210
    invoke-virtual {v0, v10, p2}, Liu2;->j(II)[Lcb0;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    aget-object v0, v0, v6

    .line 215
    .line 216
    invoke-virtual {v0, v2}, Lcb0;->q(I)I

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    invoke-virtual {p0, v10}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    iget-object v11, p0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 225
    .line 226
    invoke-virtual {v11, v10}, Ltd5;->g(Landroid/view/View;)I

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    sub-int v11, v5, v11

    .line 231
    .line 232
    if-le v11, v8, :cond_9

    .line 233
    .line 234
    iget p2, v0, Lcb0;->Y:I

    .line 235
    .line 236
    iget v5, v0, Lcb0;->Z:I

    .line 237
    .line 238
    and-int/2addr p2, v5

    .line 239
    if-le p2, v3, :cond_8

    .line 240
    .line 241
    invoke-virtual {v0, v3}, Lcb0;->q(I)I

    .line 242
    .line 243
    .line 244
    move-result p2

    .line 245
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    move-object v3, v9

    .line 250
    move-object v9, p2

    .line 251
    goto :goto_9

    .line 252
    :cond_8
    move-object v3, v9

    .line 253
    move-object v9, v10

    .line 254
    goto :goto_9

    .line 255
    :cond_9
    move-object v0, v10

    .line 256
    goto :goto_6

    .line 257
    :cond_a
    move-object v3, v9

    .line 258
    move-object v9, v0

    .line 259
    goto :goto_9

    .line 260
    :cond_b
    move-object v3, v9

    .line 261
    :cond_c
    move-object v9, p1

    .line 262
    goto :goto_9

    .line 263
    :cond_d
    add-int v10, v8, v7

    .line 264
    .line 265
    if-le v5, v10, :cond_11

    .line 266
    .line 267
    iget v5, p0, Landroidx/leanback/widget/GridLayoutManager;->Y0:I

    .line 268
    .line 269
    if-ne v5, v3, :cond_10

    .line 270
    .line 271
    :cond_e
    iget-object v3, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 272
    .line 273
    iget v5, v3, Liu2;->g:I

    .line 274
    .line 275
    invoke-virtual {v3, p2, v5}, Liu2;->j(II)[Lcb0;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    aget-object v3, v3, v6

    .line 280
    .line 281
    iget v5, v3, Lcb0;->Y:I

    .line 282
    .line 283
    iget v10, v3, Lcb0;->Z:I

    .line 284
    .line 285
    and-int/2addr v5, v10

    .line 286
    sub-int/2addr v5, v4

    .line 287
    invoke-virtual {v3, v5}, Lcb0;->q(I)I

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    iget-object v5, p0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 296
    .line 297
    invoke-virtual {v5, v3}, Ltd5;->d(Landroid/view/View;)I

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    sub-int/2addr v5, v0

    .line 302
    if-le v5, v8, :cond_f

    .line 303
    .line 304
    move-object v3, v9

    .line 305
    goto :goto_8

    .line 306
    :cond_f
    iget-object v5, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 307
    .line 308
    invoke-virtual {v5}, Liu2;->a()Z

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-nez v5, :cond_e

    .line 313
    .line 314
    :goto_8
    if-eqz v3, :cond_c

    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_10
    move-object v3, p1

    .line 318
    goto :goto_9

    .line 319
    :cond_11
    move-object v3, v9

    .line 320
    :goto_9
    if-eqz v9, :cond_12

    .line 321
    .line 322
    iget-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 323
    .line 324
    invoke-virtual {p2, v9}, Ltd5;->g(Landroid/view/View;)I

    .line 325
    .line 326
    .line 327
    move-result p2

    .line 328
    :goto_a
    sub-int/2addr p2, v7

    .line 329
    goto :goto_b

    .line 330
    :cond_12
    if-eqz v3, :cond_13

    .line 331
    .line 332
    iget-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 333
    .line 334
    invoke-virtual {p2, v3}, Ltd5;->d(Landroid/view/View;)I

    .line 335
    .line 336
    .line 337
    move-result p2

    .line 338
    add-int/2addr v7, v8

    .line 339
    goto :goto_a

    .line 340
    :cond_13
    move p2, v2

    .line 341
    :goto_b
    if-eqz v9, :cond_14

    .line 342
    .line 343
    move-object p1, v9

    .line 344
    goto :goto_c

    .line 345
    :cond_14
    if-eqz v3, :cond_15

    .line 346
    .line 347
    move-object p1, v3

    .line 348
    :cond_15
    :goto_c
    iget-boolean p0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 349
    .line 350
    if-nez p0, :cond_16

    .line 351
    .line 352
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    check-cast p0, Llu2;

    .line 357
    .line 358
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    iget v0, p0, Llu2;->h0:I

    .line 366
    .line 367
    add-int/2addr p1, v0

    .line 368
    iget p0, p0, Llu2;->l0:I

    .line 369
    .line 370
    :goto_d
    add-int/2addr p1, p0

    .line 371
    goto :goto_e

    .line 372
    :cond_16
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    check-cast p0, Llu2;

    .line 377
    .line 378
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    iget v0, p0, Llu2;->g0:I

    .line 386
    .line 387
    add-int/2addr p1, v0

    .line 388
    iget p0, p0, Llu2;->k0:I

    .line 389
    .line 390
    goto :goto_d

    .line 391
    :goto_e
    iget-object p0, v1, Lyr6;->g0:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast p0, Lm09;

    .line 394
    .line 395
    invoke-virtual {p0, p1}, Lm09;->b(I)I

    .line 396
    .line 397
    .line 398
    move-result p0

    .line 399
    if-nez p2, :cond_18

    .line 400
    .line 401
    if-eqz p0, :cond_17

    .line 402
    .line 403
    goto :goto_f

    .line 404
    :cond_17
    return v2

    .line 405
    :cond_18
    :goto_f
    aput p2, p3, v2

    .line 406
    .line 407
    aput p0, p3, v4

    .line 408
    .line 409
    return v4
.end method

.method public final l1()I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    const/high16 v1, 0x80000

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/leanback/widget/GridLayoutManager;->j1(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0, v0}, Landroidx/leanback/widget/GridLayoutManager;->i1(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v1

    .line 23
    return p0
.end method

.method public final m0(Landroidx/recyclerview/widget/k;Lq96;Landroid/view/View;Lh4;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 6
    .line 7
    if-eqz p2, :cond_5

    .line 8
    .line 9
    instance-of p2, p1, Llu2;

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    check-cast p1, Llu2;

    .line 15
    .line 16
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->X:Landroidx/recyclerview/widget/l;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->b()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 p2, -0x1

    .line 23
    if-ltz p1, :cond_2

    .line 24
    .line 25
    iget-object p3, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 26
    .line 27
    invoke-virtual {p3, p1}, Liu2;->k(I)Lr75;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    if-nez p3, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget p2, p3, Lr75;->Y:I

    .line 35
    .line 36
    :cond_2
    :goto_0
    if-gez p2, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    iget-object p3, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 40
    .line 41
    iget p3, p3, Liu2;->e:I

    .line 42
    .line 43
    div-int/2addr p1, p3

    .line 44
    iget-boolean p0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 45
    .line 46
    const/4 p3, 0x0

    .line 47
    const/4 v0, 0x1

    .line 48
    if-nez p0, :cond_4

    .line 49
    .line 50
    invoke-static {p2, p3, v0, p1, v0}, Lg4;->a(IZIII)Lg4;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p4, p0}, Lh4;->o(Lg4;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_4
    invoke-static {p1, p3, v0, p2, v0}, Lg4;->a(IZIII)Lg4;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p4, p0}, Lh4;->o(Lg4;)V

    .line 63
    .line 64
    .line 65
    :cond_5
    :goto_1
    return-void
.end method

.method public final m1()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->S()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 9
    .line 10
    sub-int/2addr v0, v1

    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    return v1
.end method

.method public final n0(Landroid/view/View;I)Landroid/view/View;
    .locals 7

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    const v1, 0x8000

    .line 4
    .line 5
    .line 6
    and-int/2addr v0, v1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eq p2, v2, :cond_2

    .line 18
    .line 19
    if-ne p2, v3, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v4, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 23
    .line 24
    invoke-virtual {v0, v4, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_6

    .line 29
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->q()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_4

    .line 34
    .line 35
    if-ne p2, v2, :cond_3

    .line 36
    .line 37
    const/16 v4, 0x82

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    const/16 v4, 0x21

    .line 41
    .line 42
    :goto_1
    iget-object v5, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 43
    .line 44
    invoke-virtual {v0, v5, p1, v4}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    goto :goto_2

    .line 49
    :cond_4
    const/4 v4, 0x0

    .line 50
    :goto_2
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->p()Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_8

    .line 55
    .line 56
    iget-object v4, p0, Landroidx/recyclerview/widget/j;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-ne v4, v3, :cond_5

    .line 63
    .line 64
    move v4, v3

    .line 65
    goto :goto_3

    .line 66
    :cond_5
    move v4, v1

    .line 67
    :goto_3
    if-ne p2, v2, :cond_6

    .line 68
    .line 69
    move v5, v3

    .line 70
    goto :goto_4

    .line 71
    :cond_6
    move v5, v1

    .line 72
    :goto_4
    xor-int/2addr v4, v5

    .line 73
    if-eqz v4, :cond_7

    .line 74
    .line 75
    const/16 v4, 0x42

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_7
    const/16 v4, 0x11

    .line 79
    .line 80
    :goto_5
    iget-object v5, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 81
    .line 82
    invoke-virtual {v0, v5, p1, v4}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    goto :goto_6

    .line 87
    :cond_8
    move-object v0, v4

    .line 88
    :goto_6
    if-eqz v0, :cond_9

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_9
    iget-object v4, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 92
    .line 93
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    iget-object v5, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 98
    .line 99
    const/high16 v6, 0x60000

    .line 100
    .line 101
    if-ne v4, v6, :cond_a

    .line 102
    .line 103
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-interface {p0, p1, p2}, Landroid/view/ViewParent;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :cond_a
    invoke-virtual {p0, p2}, Landroidx/leanback/widget/GridLayoutManager;->h1(I)I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_b

    .line 121
    .line 122
    move v5, v3

    .line 123
    goto :goto_7

    .line 124
    :cond_b
    move v5, v1

    .line 125
    :goto_7
    const/high16 v6, 0x20000

    .line 126
    .line 127
    if-ne v4, v3, :cond_e

    .line 128
    .line 129
    if-nez v5, :cond_c

    .line 130
    .line 131
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 132
    .line 133
    and-int/lit16 v1, v1, 0x1000

    .line 134
    .line 135
    if-nez v1, :cond_d

    .line 136
    .line 137
    :cond_c
    move-object v0, p1

    .line 138
    :cond_d
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 139
    .line 140
    and-int/2addr v1, v6

    .line 141
    if-eqz v1, :cond_15

    .line 142
    .line 143
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->m1()Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_15

    .line 148
    .line 149
    invoke-virtual {p0, v3}, Landroidx/leanback/widget/GridLayoutManager;->s1(Z)V

    .line 150
    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_e
    if-nez v4, :cond_12

    .line 154
    .line 155
    if-nez v5, :cond_f

    .line 156
    .line 157
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 158
    .line 159
    and-int/lit16 v2, v2, 0x800

    .line 160
    .line 161
    if-nez v2, :cond_10

    .line 162
    .line 163
    :cond_f
    move-object v0, p1

    .line 164
    :cond_10
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 165
    .line 166
    and-int/2addr v2, v6

    .line 167
    if-eqz v2, :cond_15

    .line 168
    .line 169
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->S()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_15

    .line 174
    .line 175
    iget-object v2, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 176
    .line 177
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    if-eqz v2, :cond_11

    .line 182
    .line 183
    goto :goto_9

    .line 184
    :cond_11
    invoke-virtual {p0, v1}, Landroidx/leanback/widget/GridLayoutManager;->s1(Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_8

    .line 188
    :cond_12
    const/4 v1, 0x3

    .line 189
    if-ne v4, v1, :cond_13

    .line 190
    .line 191
    if-nez v5, :cond_14

    .line 192
    .line 193
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 194
    .line 195
    and-int/lit16 v1, v1, 0x4000

    .line 196
    .line 197
    if-nez v1, :cond_15

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_13
    if-ne v4, v2, :cond_15

    .line 201
    .line 202
    if-nez v5, :cond_14

    .line 203
    .line 204
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 205
    .line 206
    and-int/lit16 v1, v1, 0x2000

    .line 207
    .line 208
    if-nez v1, :cond_15

    .line 209
    .line 210
    :cond_14
    :goto_8
    move-object v0, p1

    .line 211
    :cond_15
    :goto_9
    if-eqz v0, :cond_16

    .line 212
    .line 213
    return-object v0

    .line 214
    :cond_16
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 215
    .line 216
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-interface {v0, p1, p2}, Landroid/view/ViewParent;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    if-eqz p2, :cond_17

    .line 225
    .line 226
    return-object p2

    .line 227
    :cond_17
    if-eqz p1, :cond_18

    .line 228
    .line 229
    return-object p1

    .line 230
    :cond_18
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 231
    .line 232
    return-object p0
.end method

.method public final n1(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    iget-object p1, p1, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ltz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-gt v1, v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ltz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-gt p1, p0, :cond_1

    .line 48
    .line 49
    const/4 p0, 0x1

    .line 50
    return p0

    .line 51
    :cond_1
    return v0
.end method

.method public final o0(II)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget v2, v2, Liu2;->f:I

    .line 11
    .line 12
    if-ltz v2, :cond_0

    .line 13
    .line 14
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 15
    .line 16
    const/high16 v3, -0x80000000

    .line 17
    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    if-gt p1, v0, :cond_0

    .line 22
    .line 23
    add-int/2addr v2, p2

    .line 24
    iput v2, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 25
    .line 26
    :cond_0
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->e1:Lcb0;

    .line 27
    .line 28
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lej4;

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lej4;->d(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final o1(Landroid/view/View;IIII)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Landroidx/leanback/widget/GridLayoutManager;->f1(Landroid/view/View;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Landroidx/leanback/widget/GridLayoutManager;->g1(Landroid/view/View;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    :goto_0
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->N0:I

    .line 15
    .line 16
    if-lez v1, :cond_1

    .line 17
    .line 18
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    :cond_1
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->U0:I

    .line 23
    .line 24
    and-int/lit8 v2, v1, 0x70

    .line 25
    .line 26
    iget v3, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 27
    .line 28
    const/high16 v4, 0xc0000

    .line 29
    .line 30
    and-int/2addr v3, v4

    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    const v3, 0x800007

    .line 35
    .line 36
    .line 37
    and-int/2addr v1, v3

    .line 38
    invoke-static {v1, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    and-int/lit8 v1, v1, 0x7

    .line 44
    .line 45
    :goto_1
    iget-boolean v3, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 46
    .line 47
    if-nez v3, :cond_3

    .line 48
    .line 49
    const/16 v5, 0x30

    .line 50
    .line 51
    if-eq v2, v5, :cond_a

    .line 52
    .line 53
    :cond_3
    if-ne v3, v4, :cond_4

    .line 54
    .line 55
    const/4 v5, 0x3

    .line 56
    if-ne v1, v5, :cond_4

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_4
    if-nez v3, :cond_5

    .line 60
    .line 61
    const/16 v5, 0x50

    .line 62
    .line 63
    if-eq v2, v5, :cond_6

    .line 64
    .line 65
    :cond_5
    if-ne v3, v4, :cond_7

    .line 66
    .line 67
    const/4 v5, 0x5

    .line 68
    if-ne v1, v5, :cond_7

    .line 69
    .line 70
    :cond_6
    invoke-virtual {p0, p2}, Landroidx/leanback/widget/GridLayoutManager;->i1(I)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    sub-int/2addr p2, v0

    .line 75
    :goto_2
    add-int/2addr p5, p2

    .line 76
    goto :goto_3

    .line 77
    :cond_7
    if-nez v3, :cond_8

    .line 78
    .line 79
    const/16 v5, 0x10

    .line 80
    .line 81
    if-eq v2, v5, :cond_9

    .line 82
    .line 83
    :cond_8
    if-ne v3, v4, :cond_a

    .line 84
    .line 85
    if-ne v1, v4, :cond_a

    .line 86
    .line 87
    :cond_9
    invoke-virtual {p0, p2}, Landroidx/leanback/widget/GridLayoutManager;->i1(I)I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    sub-int/2addr p2, v0

    .line 92
    div-int/lit8 p2, p2, 0x2

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_a
    :goto_3
    iget-boolean p2, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 96
    .line 97
    if-nez p2, :cond_b

    .line 98
    .line 99
    add-int/2addr v0, p5

    .line 100
    goto :goto_4

    .line 101
    :cond_b
    add-int/2addr v0, p5

    .line 102
    move v6, p5

    .line 103
    move p5, p3

    .line 104
    move p3, v6

    .line 105
    move v6, v0

    .line 106
    move v0, p4

    .line 107
    move p4, v6

    .line 108
    :goto_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    check-cast p2, Llu2;

    .line 113
    .line 114
    invoke-static {p1, p3, p5, p4, v0}, Landroidx/recyclerview/widget/j;->b0(Landroid/view/View;IIII)V

    .line 115
    .line 116
    .line 117
    sget-object v1, Landroidx/leanback/widget/GridLayoutManager;->h1:Landroid/graphics/Rect;

    .line 118
    .line 119
    invoke-super {p0, p1, v1}, Landroidx/recyclerview/widget/j;->M(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 120
    .line 121
    .line 122
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 123
    .line 124
    sub-int/2addr p3, v2

    .line 125
    iget v2, v1, Landroid/graphics/Rect;->top:I

    .line 126
    .line 127
    sub-int/2addr p5, v2

    .line 128
    iget v2, v1, Landroid/graphics/Rect;->right:I

    .line 129
    .line 130
    sub-int/2addr v2, p4

    .line 131
    iget p4, v1, Landroid/graphics/Rect;->bottom:I

    .line 132
    .line 133
    sub-int/2addr p4, v0

    .line 134
    iput p3, p2, Llu2;->g0:I

    .line 135
    .line 136
    iput p5, p2, Llu2;->h0:I

    .line 137
    .line 138
    iput v2, p2, Llu2;->i0:I

    .line 139
    .line 140
    iput p4, p2, Llu2;->j0:I

    .line 141
    .line 142
    invoke-virtual {p0, p1}, Landroidx/leanback/widget/GridLayoutManager;->H1(Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public final p()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 7
    .line 8
    if-le p0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_1
    :goto_0
    return v1
.end method

.method public final p0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 3
    .line 4
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->e1:Lcb0;

    .line 5
    .line 6
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lej4;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    invoke-virtual {p0, v0}, Lej4;->d(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final p1()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->w0:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->w0:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->D0:Landroidx/recyclerview/widget/k;

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->x0:Lq96;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->y0:I

    .line 16
    .line 17
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->z0:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final q()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 7
    .line 8
    if-le p0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_1
    :goto_0
    return v1
.end method

.method public final q0(II)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 7
    .line 8
    const/high16 v3, -0x80000000

    .line 9
    .line 10
    if-eq v2, v3, :cond_2

    .line 11
    .line 12
    add-int/2addr v0, v2

    .line 13
    if-gt p1, v0, :cond_0

    .line 14
    .line 15
    add-int/lit8 v3, p1, 0x1

    .line 16
    .line 17
    if-ge v0, v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr p2, p1

    .line 20
    add-int/2addr p2, v2

    .line 21
    iput p2, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-ge p1, v0, :cond_1

    .line 25
    .line 26
    add-int/lit8 v3, v0, -0x1

    .line 27
    .line 28
    if-le p2, v3, :cond_1

    .line 29
    .line 30
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    iput v2, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    if-le p1, v0, :cond_2

    .line 36
    .line 37
    if-ge p2, v0, :cond_2

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    iput v2, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 42
    .line 43
    :cond_2
    :goto_0
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->e1:Lcb0;

    .line 44
    .line 45
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Lej4;

    .line 48
    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lej4;->d(I)V

    .line 52
    .line 53
    .line 54
    :cond_3
    return-void
.end method

.method public final q1(Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Llu2;

    .line 6
    .line 7
    sget-object v1, Landroidx/leanback/widget/GridLayoutManager;->h1:Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/j;->o(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 13
    .line 14
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 15
    .line 16
    add-int/2addr v2, v3

    .line 17
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 18
    .line 19
    add-int/2addr v2, v3

    .line 20
    iget v3, v1, Landroid/graphics/Rect;->right:I

    .line 21
    .line 22
    add-int/2addr v2, v3

    .line 23
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 24
    .line 25
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 26
    .line 27
    add-int/2addr v3, v4

    .line 28
    iget v4, v1, Landroid/graphics/Rect;->top:I

    .line 29
    .line 30
    add-int/2addr v3, v4

    .line 31
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 32
    .line 33
    add-int/2addr v3, v1

    .line 34
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->M0:I

    .line 35
    .line 36
    const/4 v4, -0x2

    .line 37
    const/4 v5, 0x0

    .line 38
    if-ne v1, v4, :cond_0

    .line 39
    .line 40
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->N0:I

    .line 46
    .line 47
    const/high16 v4, 0x40000000    # 2.0f

    .line 48
    .line 49
    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    :goto_0
    iget-boolean p0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 54
    .line 55
    if-nez p0, :cond_1

    .line 56
    .line 57
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 62
    .line 63
    invoke-static {p0, v2, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 68
    .line 69
    invoke-static {v1, v3, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 79
    .line 80
    invoke-static {p0, v3, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 85
    .line 86
    invoke-static {v1, v2, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    move v6, v0

    .line 91
    move v0, p0

    .line 92
    move p0, v6

    .line 93
    :goto_1
    invoke-virtual {p1, p0, v0}, Landroid/view/View;->measure(II)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final r(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Llu2;

    .line 2
    .line 3
    return p0
.end method

.method public final r0(II)V
    .locals 6

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    iget v2, v2, Liu2;->f:I

    .line 11
    .line 12
    if-ltz v2, :cond_1

    .line 13
    .line 14
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 15
    .line 16
    const/high16 v3, -0x80000000

    .line 17
    .line 18
    if-eq v2, v3, :cond_1

    .line 19
    .line 20
    add-int v4, v0, v2

    .line 21
    .line 22
    if-gt p1, v4, :cond_1

    .line 23
    .line 24
    add-int v5, p1, p2

    .line 25
    .line 26
    if-le v5, v4, :cond_0

    .line 27
    .line 28
    sub-int/2addr p1, v4

    .line 29
    add-int/2addr p1, v2

    .line 30
    add-int/2addr p1, v0

    .line 31
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 32
    .line 33
    iput v3, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sub-int/2addr v2, p2

    .line 37
    iput v2, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 38
    .line 39
    :cond_1
    :goto_0
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->e1:Lcb0;

    .line 40
    .line 41
    iget-object p0, p0, Lcb0;->f0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lej4;

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lej4;->d(I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void
.end method

.method public final r1()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 2
    .line 3
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 4
    .line 5
    const/high16 v2, 0x40000

    .line 6
    .line 7
    and-int/2addr v1, v2

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->b1:I

    .line 11
    .line 12
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->c1:I

    .line 13
    .line 14
    add-int/2addr v1, v2

    .line 15
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->z0:I

    .line 16
    .line 17
    add-int/2addr v1, p0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->c1:I

    .line 20
    .line 21
    neg-int v1, v1

    .line 22
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->z0:I

    .line 23
    .line 24
    sub-int/2addr v1, p0

    .line 25
    :goto_0
    const/4 p0, 0x0

    .line 26
    invoke-virtual {v0, v1, p0}, Liu2;->m(IZ)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final s0(II)V
    .locals 3

    .line 1
    add-int/2addr p2, p1

    .line 2
    :goto_0
    if-ge p1, p2, :cond_1

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->e1:Lcb0;

    .line 5
    .line 6
    iget-object v1, v0, Lcb0;->f0:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lej4;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v2, v1, Lej4;->c:Lk42;

    .line 13
    .line 14
    monitor-enter v2

    .line 15
    :try_start_0
    iget v1, v1, Lej4;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v2

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, Lcb0;->f0:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lej4;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lej4;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    monitor-exit v2

    .line 34
    throw p0

    .line 35
    :cond_0
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-void
.end method

.method public final s1(Z)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->m1()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->S()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_d

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_1
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->I0:Lmu2;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-nez v1, :cond_4

    .line 31
    .line 32
    new-instance v1, Lmu2;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    move v3, v2

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 v3, -0x1

    .line 39
    :goto_0
    iget v4, p0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 40
    .line 41
    if-le v4, v2, :cond_3

    .line 42
    .line 43
    move v4, v2

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    move v4, v0

    .line 46
    :goto_1
    invoke-direct {v1, p0, v3, v4}, Lmu2;-><init>(Landroidx/leanback/widget/GridLayoutManager;IZ)V

    .line 47
    .line 48
    .line 49
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Landroidx/leanback/widget/GridLayoutManager;->Y0(Landroidx/recyclerview/widget/c;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    iget-object v0, v1, Lmu2;->t:Landroidx/leanback/widget/GridLayoutManager;

    .line 56
    .line 57
    iget v3, v1, Lmu2;->s:I

    .line 58
    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iget v0, v0, Landroidx/leanback/widget/GridLayoutManager;->s0:I

    .line 62
    .line 63
    if-ge v3, v0, :cond_6

    .line 64
    .line 65
    add-int/2addr v3, v2

    .line 66
    iput v3, v1, Lmu2;->s:I

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    iget v0, v0, Landroidx/leanback/widget/GridLayoutManager;->s0:I

    .line 70
    .line 71
    neg-int v0, v0

    .line 72
    if-le v3, v0, :cond_6

    .line 73
    .line 74
    sub-int/2addr v3, v2

    .line 75
    iput v3, v1, Lmu2;->s:I

    .line 76
    .line 77
    :cond_6
    :goto_2
    iget-boolean v0, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 78
    .line 79
    if-nez v0, :cond_9

    .line 80
    .line 81
    iget-object v0, p0, Landroidx/recyclerview/widget/j;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    const/4 v1, 0x4

    .line 88
    const/4 v3, 0x3

    .line 89
    if-ne v0, v2, :cond_8

    .line 90
    .line 91
    if-eqz p1, :cond_b

    .line 92
    .line 93
    :cond_7
    move v1, v3

    .line 94
    goto :goto_3

    .line 95
    :cond_8
    if-eqz p1, :cond_7

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_9
    if-eqz p1, :cond_a

    .line 99
    .line 100
    const/4 v2, 0x2

    .line 101
    :cond_a
    move v1, v2

    .line 102
    :cond_b
    :goto_3
    iget-object p1, p0, Landroidx/leanback/widget/GridLayoutManager;->C0:Landroid/media/AudioManager;

    .line 103
    .line 104
    if-nez p1, :cond_c

    .line 105
    .line 106
    iget-object p1, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v0, "audio"

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Landroid/media/AudioManager;

    .line 119
    .line 120
    iput-object p1, p0, Landroidx/leanback/widget/GridLayoutManager;->C0:Landroid/media/AudioManager;

    .line 121
    .line 122
    :cond_c
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 123
    .line 124
    .line 125
    :cond_d
    :goto_4
    return-void
.end method

.method public final t(IILq96;Lxr0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0, p3}, Landroidx/leanback/widget/GridLayoutManager;->x1(Landroidx/recyclerview/widget/k;Lq96;)V

    .line 3
    .line 4
    .line 5
    iget-boolean p3, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, p2

    .line 11
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_3

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_1
    if-gez p1, :cond_2

    .line 21
    .line 22
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->c1:I

    .line 23
    .line 24
    neg-int p2, p2

    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_3

    .line 28
    :cond_2
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->b1:I

    .line 29
    .line 30
    iget p3, p0, Landroidx/leanback/widget/GridLayoutManager;->c1:I

    .line 31
    .line 32
    add-int/2addr p2, p3

    .line 33
    :goto_1
    iget-object p3, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 34
    .line 35
    invoke-virtual {p3, p2, p1, p4}, Liu2;->e(IILxr0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->p1()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_3
    :goto_2
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->p1()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_3
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->p1()V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method public final t1(Z)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->N0:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->O0:[I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    :cond_0
    move/from16 v16, v2

    .line 13
    .line 14
    goto/16 :goto_f

    .line 15
    .line 16
    :cond_1
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget v4, v1, Liu2;->f:I

    .line 23
    .line 24
    iget v5, v1, Liu2;->g:I

    .line 25
    .line 26
    invoke-virtual {v1, v4, v5}, Liu2;->j(II)[Lcb0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    const/4 v4, -0x1

    .line 31
    move v5, v2

    .line 32
    move v6, v5

    .line 33
    move v7, v4

    .line 34
    :goto_1
    iget v8, v0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 35
    .line 36
    if-ge v5, v8, :cond_17

    .line 37
    .line 38
    if-nez v1, :cond_3

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    goto :goto_2

    .line 42
    :cond_3
    aget-object v8, v1, v5

    .line 43
    .line 44
    :goto_2
    if-nez v8, :cond_4

    .line 45
    .line 46
    move v9, v2

    .line 47
    goto :goto_3

    .line 48
    :cond_4
    iget v9, v8, Lcb0;->Y:I

    .line 49
    .line 50
    iget v10, v8, Lcb0;->Z:I

    .line 51
    .line 52
    and-int/2addr v9, v10

    .line 53
    :goto_3
    move v10, v2

    .line 54
    move v11, v4

    .line 55
    :goto_4
    if-ge v10, v9, :cond_a

    .line 56
    .line 57
    invoke-virtual {v8, v10}, Lcb0;->q(I)I

    .line 58
    .line 59
    .line 60
    move-result v12

    .line 61
    add-int/lit8 v13, v10, 0x1

    .line 62
    .line 63
    invoke-virtual {v8, v13}, Lcb0;->q(I)I

    .line 64
    .line 65
    .line 66
    move-result v13

    .line 67
    :goto_5
    if-gt v12, v13, :cond_9

    .line 68
    .line 69
    iget v14, v0, Landroidx/leanback/widget/GridLayoutManager;->y0:I

    .line 70
    .line 71
    sub-int v14, v12, v14

    .line 72
    .line 73
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v14

    .line 77
    if-nez v14, :cond_5

    .line 78
    .line 79
    goto :goto_7

    .line 80
    :cond_5
    if-eqz p1, :cond_6

    .line 81
    .line 82
    invoke-virtual {v0, v14}, Landroidx/leanback/widget/GridLayoutManager;->q1(Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    :cond_6
    iget-boolean v15, v0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 86
    .line 87
    if-nez v15, :cond_7

    .line 88
    .line 89
    invoke-static {v14}, Landroidx/leanback/widget/GridLayoutManager;->f1(Landroid/view/View;)I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    goto :goto_6

    .line 94
    :cond_7
    invoke-static {v14}, Landroidx/leanback/widget/GridLayoutManager;->g1(Landroid/view/View;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    :goto_6
    if-le v14, v11, :cond_8

    .line 99
    .line 100
    move v11, v14

    .line 101
    :cond_8
    :goto_7
    add-int/lit8 v12, v12, 0x1

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_9
    add-int/lit8 v10, v10, 0x2

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_a
    iget-object v8, v0, Landroidx/leanback/widget/GridLayoutManager;->x0:Lq96;

    .line 108
    .line 109
    invoke-virtual {v8}, Lq96;->b()I

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    iget-object v9, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 114
    .line 115
    iget-boolean v9, v9, Landroidx/recyclerview/widget/RecyclerView;->z0:Z

    .line 116
    .line 117
    const/4 v10, 0x1

    .line 118
    if-nez v9, :cond_13

    .line 119
    .line 120
    if-eqz p1, :cond_13

    .line 121
    .line 122
    if-gez v11, :cond_13

    .line 123
    .line 124
    if-lez v8, :cond_13

    .line 125
    .line 126
    if-gez v7, :cond_12

    .line 127
    .line 128
    iget v9, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 129
    .line 130
    if-gez v9, :cond_b

    .line 131
    .line 132
    move v9, v2

    .line 133
    goto :goto_8

    .line 134
    :cond_b
    if-lt v9, v8, :cond_c

    .line 135
    .line 136
    add-int/lit8 v9, v8, -0x1

    .line 137
    .line 138
    :cond_c
    :goto_8
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    if-lez v12, :cond_f

    .line 143
    .line 144
    iget-object v12, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    invoke-virtual {v12, v13}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    invoke-virtual {v12}, Landroidx/recyclerview/widget/l;->c()I

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    iget-object v13, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 159
    .line 160
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 161
    .line 162
    .line 163
    move-result v14

    .line 164
    sub-int/2addr v14, v10

    .line 165
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    invoke-virtual {v13, v14}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    invoke-virtual {v13}, Landroidx/recyclerview/widget/l;->c()I

    .line 174
    .line 175
    .line 176
    move-result v13

    .line 177
    if-lt v9, v12, :cond_f

    .line 178
    .line 179
    if-gt v9, v13, :cond_f

    .line 180
    .line 181
    sub-int v14, v9, v12

    .line 182
    .line 183
    sub-int v9, v13, v9

    .line 184
    .line 185
    if-gt v14, v9, :cond_d

    .line 186
    .line 187
    add-int/lit8 v9, v12, -0x1

    .line 188
    .line 189
    goto :goto_9

    .line 190
    :cond_d
    add-int/lit8 v9, v13, 0x1

    .line 191
    .line 192
    :goto_9
    if-gez v9, :cond_e

    .line 193
    .line 194
    add-int/lit8 v14, v8, -0x1

    .line 195
    .line 196
    if-ge v13, v14, :cond_e

    .line 197
    .line 198
    add-int/lit8 v9, v13, 0x1

    .line 199
    .line 200
    goto :goto_a

    .line 201
    :cond_e
    if-lt v9, v8, :cond_f

    .line 202
    .line 203
    if-lez v12, :cond_f

    .line 204
    .line 205
    add-int/lit8 v9, v12, -0x1

    .line 206
    .line 207
    :cond_f
    :goto_a
    if-ltz v9, :cond_12

    .line 208
    .line 209
    if-ge v9, v8, :cond_12

    .line 210
    .line 211
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    iget-object v12, v0, Landroidx/leanback/widget/GridLayoutManager;->D0:Landroidx/recyclerview/widget/k;

    .line 220
    .line 221
    invoke-virtual {v12, v9}, Landroidx/recyclerview/widget/k;->d(I)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    iget-object v12, v0, Landroidx/leanback/widget/GridLayoutManager;->d1:[I

    .line 226
    .line 227
    if-eqz v9, :cond_10

    .line 228
    .line 229
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 230
    .line 231
    .line 232
    move-result-object v13

    .line 233
    check-cast v13, Llu2;

    .line 234
    .line 235
    sget-object v14, Landroidx/leanback/widget/GridLayoutManager;->h1:Landroid/graphics/Rect;

    .line 236
    .line 237
    invoke-virtual {v0, v9, v14}, Landroidx/recyclerview/widget/j;->o(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 238
    .line 239
    .line 240
    iget v15, v13, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 241
    .line 242
    move/from16 v16, v2

    .line 243
    .line 244
    iget v2, v13, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 245
    .line 246
    add-int/2addr v15, v2

    .line 247
    iget v2, v14, Landroid/graphics/Rect;->left:I

    .line 248
    .line 249
    add-int/2addr v15, v2

    .line 250
    iget v2, v14, Landroid/graphics/Rect;->right:I

    .line 251
    .line 252
    add-int/2addr v15, v2

    .line 253
    iget v2, v13, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 254
    .line 255
    iget v3, v13, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 256
    .line 257
    add-int/2addr v2, v3

    .line 258
    iget v3, v14, Landroid/graphics/Rect;->top:I

    .line 259
    .line 260
    add-int/2addr v2, v3

    .line 261
    iget v3, v14, Landroid/graphics/Rect;->bottom:I

    .line 262
    .line 263
    add-int/2addr v2, v3

    .line 264
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingLeft()I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingRight()I

    .line 269
    .line 270
    .line 271
    move-result v14

    .line 272
    add-int/2addr v14, v3

    .line 273
    add-int/2addr v14, v15

    .line 274
    iget v3, v13, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 275
    .line 276
    invoke-static {v7, v14, v3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingTop()I

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingBottom()I

    .line 285
    .line 286
    .line 287
    move-result v14

    .line 288
    add-int/2addr v14, v7

    .line 289
    add-int/2addr v14, v2

    .line 290
    iget v2, v13, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 291
    .line 292
    invoke-static {v8, v14, v2}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    invoke-virtual {v9, v3, v2}, Landroid/view/View;->measure(II)V

    .line 297
    .line 298
    .line 299
    invoke-static {v9}, Landroidx/leanback/widget/GridLayoutManager;->g1(Landroid/view/View;)I

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    aput v2, v12, v16

    .line 304
    .line 305
    invoke-static {v9}, Landroidx/leanback/widget/GridLayoutManager;->f1(Landroid/view/View;)I

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    aput v2, v12, v10

    .line 310
    .line 311
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->D0:Landroidx/recyclerview/widget/k;

    .line 312
    .line 313
    invoke-virtual {v2, v9}, Landroidx/recyclerview/widget/k;->i(Landroid/view/View;)V

    .line 314
    .line 315
    .line 316
    goto :goto_b

    .line 317
    :cond_10
    move/from16 v16, v2

    .line 318
    .line 319
    :goto_b
    iget-boolean v2, v0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 320
    .line 321
    if-nez v2, :cond_11

    .line 322
    .line 323
    aget v2, v12, v10

    .line 324
    .line 325
    :goto_c
    move v7, v2

    .line 326
    goto :goto_d

    .line 327
    :cond_11
    aget v2, v12, v16

    .line 328
    .line 329
    goto :goto_c

    .line 330
    :cond_12
    move/from16 v16, v2

    .line 331
    .line 332
    :goto_d
    if-ltz v7, :cond_14

    .line 333
    .line 334
    move v11, v7

    .line 335
    goto :goto_e

    .line 336
    :cond_13
    move/from16 v16, v2

    .line 337
    .line 338
    :cond_14
    :goto_e
    if-gez v11, :cond_15

    .line 339
    .line 340
    move/from16 v11, v16

    .line 341
    .line 342
    :cond_15
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->O0:[I

    .line 343
    .line 344
    aget v3, v2, v5

    .line 345
    .line 346
    if-eq v3, v11, :cond_16

    .line 347
    .line 348
    aput v11, v2, v5

    .line 349
    .line 350
    move v6, v10

    .line 351
    :cond_16
    add-int/lit8 v5, v5, 0x1

    .line 352
    .line 353
    move/from16 v2, v16

    .line 354
    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :cond_17
    return v6

    .line 358
    :goto_f
    return v16
.end method

.method public final u(ILxr0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 2
    .line 3
    iget v0, v0, Lb20;->S1:I

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 10
    .line 11
    add-int/lit8 v1, v0, -0x1

    .line 12
    .line 13
    div-int/lit8 v1, v1, 0x2

    .line 14
    .line 15
    sub-int/2addr p0, v1

    .line 16
    sub-int v1, p1, v0

    .line 17
    .line 18
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    move v2, p0

    .line 28
    :goto_0
    if-ge v2, p1, :cond_0

    .line 29
    .line 30
    add-int v3, p0, v0

    .line 31
    .line 32
    if-ge v2, v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {p2, v2, v1}, Lxr0;->b(II)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
.end method

.method public final u0(Landroidx/recyclerview/widget/k;Lq96;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v6}, Lq96;->b()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-gez v1, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 18
    .line 19
    const/16 v2, 0x40

    .line 20
    .line 21
    and-int/2addr v1, v2

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-lez v1, :cond_2

    .line 29
    .line 30
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 31
    .line 32
    or-int/lit16 v1, v1, 0x80

    .line 33
    .line 34
    iput v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 38
    .line 39
    and-int/lit16 v3, v1, 0x200

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    iput-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 45
    .line 46
    iput-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->O0:[I

    .line 47
    .line 48
    and-int/lit16 v1, v1, -0x401

    .line 49
    .line 50
    iput v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 51
    .line 52
    invoke-virtual/range {p0 .. p1}, Landroidx/leanback/widget/GridLayoutManager;->E0(Landroidx/recyclerview/widget/k;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    and-int/lit8 v1, v1, -0x4

    .line 57
    .line 58
    const/4 v7, 0x1

    .line 59
    or-int/2addr v1, v7

    .line 60
    iput v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 61
    .line 62
    invoke-virtual/range {p0 .. p2}, Landroidx/leanback/widget/GridLayoutManager;->x1(Landroidx/recyclerview/widget/k;Lq96;)V

    .line 63
    .line 64
    .line 65
    iget-boolean v1, v6, Lq96;->g:Z

    .line 66
    .line 67
    const/high16 v4, -0x80000000

    .line 68
    .line 69
    const/4 v5, -0x1

    .line 70
    const/4 v8, 0x0

    .line 71
    if-eqz v1, :cond_c

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->I1()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 81
    .line 82
    if-eqz v2, :cond_b

    .line 83
    .line 84
    if-lez v1, :cond_b

    .line 85
    .line 86
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 87
    .line 88
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v2, v6}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iget v2, v2, Landroidx/recyclerview/widget/l;->d:I

    .line 97
    .line 98
    iget-object v6, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 99
    .line 100
    add-int/lit8 v7, v1, -0x1

    .line 101
    .line 102
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-virtual {v6, v7}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    iget v6, v6, Landroidx/recyclerview/widget/l;->d:I

    .line 111
    .line 112
    const v3, 0x7fffffff

    .line 113
    .line 114
    .line 115
    :goto_1
    if-ge v8, v1, :cond_9

    .line 116
    .line 117
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    check-cast v9, Llu2;

    .line 126
    .line 127
    iget-object v10, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 128
    .line 129
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    if-eqz v10, :cond_4

    .line 137
    .line 138
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->b()I

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    goto :goto_2

    .line 143
    :cond_4
    move v10, v5

    .line 144
    :goto_2
    iget-object v11, v9, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->X:Landroidx/recyclerview/widget/l;

    .line 145
    .line 146
    invoke-virtual {v11}, Landroidx/recyclerview/widget/l;->l()Z

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    if-nez v11, :cond_7

    .line 151
    .line 152
    iget-object v11, v9, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->X:Landroidx/recyclerview/widget/l;

    .line 153
    .line 154
    invoke-virtual {v11}, Landroidx/recyclerview/widget/l;->i()Z

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    if-nez v11, :cond_7

    .line 159
    .line 160
    invoke-virtual {v7}, Landroid/view/View;->isLayoutRequested()Z

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    if-nez v11, :cond_7

    .line 165
    .line 166
    invoke-virtual {v7}, Landroid/view/View;->hasFocus()Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    if-nez v11, :cond_5

    .line 171
    .line 172
    iget v11, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 173
    .line 174
    iget-object v12, v9, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->X:Landroidx/recyclerview/widget/l;

    .line 175
    .line 176
    invoke-virtual {v12}, Landroidx/recyclerview/widget/l;->b()I

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    if-eq v11, v12, :cond_7

    .line 181
    .line 182
    :cond_5
    invoke-virtual {v7}, Landroid/view/View;->hasFocus()Z

    .line 183
    .line 184
    .line 185
    move-result v11

    .line 186
    if-eqz v11, :cond_6

    .line 187
    .line 188
    iget v11, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 189
    .line 190
    iget-object v9, v9, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->X:Landroidx/recyclerview/widget/l;

    .line 191
    .line 192
    invoke-virtual {v9}, Landroidx/recyclerview/widget/l;->b()I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-ne v11, v9, :cond_7

    .line 197
    .line 198
    :cond_6
    if-lt v10, v2, :cond_7

    .line 199
    .line 200
    if-le v10, v6, :cond_8

    .line 201
    .line 202
    :cond_7
    iget-object v9, v0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 203
    .line 204
    invoke-virtual {v9, v7}, Ltd5;->g(Landroid/view/View;)I

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    invoke-static {v3, v9}, Ljava/lang/Math;->min(II)I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    iget-object v9, v0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 213
    .line 214
    invoke-virtual {v9, v7}, Ltd5;->d(Landroid/view/View;)I

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    :cond_8
    add-int/lit8 v8, v8, 0x1

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_9
    if-le v4, v3, :cond_a

    .line 226
    .line 227
    sub-int/2addr v4, v3

    .line 228
    iput v4, v0, Landroidx/leanback/widget/GridLayoutManager;->z0:I

    .line 229
    .line 230
    :cond_a
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->a1()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->r1()V

    .line 234
    .line 235
    .line 236
    :cond_b
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 237
    .line 238
    and-int/lit8 v1, v1, -0x4

    .line 239
    .line 240
    iput v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 241
    .line 242
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->p1()V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_c
    iget-boolean v1, v6, Lq96;->k:Z

    .line 247
    .line 248
    iget-object v9, v0, Landroidx/leanback/widget/GridLayoutManager;->A0:Landroid/util/SparseIntArray;

    .line 249
    .line 250
    if-eqz v1, :cond_e

    .line 251
    .line 252
    invoke-virtual {v9}, Landroid/util/SparseIntArray;->clear()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    move v10, v8

    .line 260
    :goto_3
    if-ge v10, v1, :cond_e

    .line 261
    .line 262
    iget-object v11, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 263
    .line 264
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    invoke-virtual {v11, v12}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    iget v11, v11, Landroidx/recyclerview/widget/l;->d:I

    .line 273
    .line 274
    if-ltz v11, :cond_d

    .line 275
    .line 276
    iget-object v12, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 277
    .line 278
    invoke-virtual {v12, v11}, Liu2;->k(I)Lr75;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    if-eqz v12, :cond_d

    .line 283
    .line 284
    iget v12, v12, Lr75;->Y:I

    .line 285
    .line 286
    invoke-virtual {v9, v11, v12}, Landroid/util/SparseIntArray;->put(II)V

    .line 287
    .line 288
    .line 289
    :cond_d
    add-int/lit8 v10, v10, 0x1

    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_e
    iget-object v1, v0, Landroidx/recyclerview/widget/j;->g0:Landroidx/recyclerview/widget/c;

    .line 293
    .line 294
    if-eqz v1, :cond_f

    .line 295
    .line 296
    iget-boolean v1, v1, Lp96;->e:Z

    .line 297
    .line 298
    if-eqz v1, :cond_f

    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_f
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->Y0:I

    .line 302
    .line 303
    if-nez v1, :cond_10

    .line 304
    .line 305
    move v10, v7

    .line 306
    goto :goto_5

    .line 307
    :cond_10
    :goto_4
    move v10, v8

    .line 308
    :goto_5
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 309
    .line 310
    if-eq v1, v5, :cond_11

    .line 311
    .line 312
    iget v11, v0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 313
    .line 314
    if-eq v11, v4, :cond_11

    .line 315
    .line 316
    add-int/2addr v1, v11

    .line 317
    iput v1, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 318
    .line 319
    :cond_11
    iput v8, v0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 320
    .line 321
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 322
    .line 323
    .line 324
    move-result-object v11

    .line 325
    iget v12, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 326
    .line 327
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 328
    .line 329
    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    .line 330
    .line 331
    .line 332
    move-result v13

    .line 333
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 334
    .line 335
    if-eqz v1, :cond_12

    .line 336
    .line 337
    iget v14, v1, Liu2;->f:I

    .line 338
    .line 339
    goto :goto_6

    .line 340
    :cond_12
    move v14, v5

    .line 341
    :goto_6
    if-eqz v1, :cond_13

    .line 342
    .line 343
    iget v1, v1, Liu2;->g:I

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_13
    move v1, v5

    .line 347
    :goto_7
    iget-boolean v15, v0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 348
    .line 349
    iget v3, v6, Lq96;->o:I

    .line 350
    .line 351
    iget v4, v6, Lq96;->p:I

    .line 352
    .line 353
    if-nez v15, :cond_14

    .line 354
    .line 355
    move v15, v3

    .line 356
    move v3, v4

    .line 357
    goto :goto_8

    .line 358
    :cond_14
    move v15, v4

    .line 359
    :goto_8
    iget-object v4, v0, Landroidx/leanback/widget/GridLayoutManager;->x0:Lq96;

    .line 360
    .line 361
    invoke-virtual {v4}, Lq96;->b()I

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    if-nez v4, :cond_15

    .line 366
    .line 367
    iput v5, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 368
    .line 369
    goto :goto_9

    .line 370
    :cond_15
    iget v2, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 371
    .line 372
    if-lt v2, v4, :cond_16

    .line 373
    .line 374
    sub-int/2addr v4, v7

    .line 375
    iput v4, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 376
    .line 377
    goto :goto_9

    .line 378
    :cond_16
    if-ne v2, v5, :cond_17

    .line 379
    .line 380
    if-lez v4, :cond_17

    .line 381
    .line 382
    iput v8, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 383
    .line 384
    :cond_17
    :goto_9
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->x0:Lq96;

    .line 385
    .line 386
    iget-boolean v2, v2, Lq96;->f:Z

    .line 387
    .line 388
    iget-object v4, v0, Landroidx/leanback/widget/GridLayoutManager;->Z0:Lyr6;

    .line 389
    .line 390
    const/high16 v18, 0x40000

    .line 391
    .line 392
    move/from16 v19, v7

    .line 393
    .line 394
    if-nez v2, :cond_22

    .line 395
    .line 396
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 397
    .line 398
    if-eqz v2, :cond_22

    .line 399
    .line 400
    iget v7, v2, Liu2;->f:I

    .line 401
    .line 402
    if-ltz v7, :cond_22

    .line 403
    .line 404
    iget v7, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 405
    .line 406
    and-int/lit16 v7, v7, 0x100

    .line 407
    .line 408
    if-nez v7, :cond_22

    .line 409
    .line 410
    iget v2, v2, Liu2;->e:I

    .line 411
    .line 412
    iget v7, v0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 413
    .line 414
    if-ne v2, v7, :cond_22

    .line 415
    .line 416
    iget-object v1, v4, Lyr6;->Z:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v1, Lm09;

    .line 419
    .line 420
    iget-object v2, v4, Lyr6;->Y:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v2, Lm09;

    .line 423
    .line 424
    iget v5, v0, Landroidx/recyclerview/widget/j;->p0:I

    .line 425
    .line 426
    iput v5, v1, Lm09;->i:I

    .line 427
    .line 428
    iget v5, v0, Landroidx/recyclerview/widget/j;->q0:I

    .line 429
    .line 430
    iput v5, v2, Lm09;->i:I

    .line 431
    .line 432
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingLeft()I

    .line 433
    .line 434
    .line 435
    move-result v5

    .line 436
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingRight()I

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    iput v5, v1, Lm09;->j:I

    .line 441
    .line 442
    iput v7, v1, Lm09;->k:I

    .line 443
    .line 444
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingTop()I

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingBottom()I

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    iput v1, v2, Lm09;->j:I

    .line 453
    .line 454
    iput v5, v2, Lm09;->k:I

    .line 455
    .line 456
    iget-object v1, v4, Lyr6;->f0:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v1, Lm09;

    .line 459
    .line 460
    iget v1, v1, Lm09;->i:I

    .line 461
    .line 462
    iput v1, v0, Landroidx/leanback/widget/GridLayoutManager;->b1:I

    .line 463
    .line 464
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->L1()V

    .line 465
    .line 466
    .line 467
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 468
    .line 469
    iget v2, v0, Landroidx/leanback/widget/GridLayoutManager;->S0:I

    .line 470
    .line 471
    iput v2, v1, Liu2;->d:I

    .line 472
    .line 473
    iget v2, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 474
    .line 475
    or-int/lit8 v2, v2, 0x4

    .line 476
    .line 477
    iput v2, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 478
    .line 479
    iget v2, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 480
    .line 481
    iput v2, v1, Liu2;->i:I

    .line 482
    .line 483
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 488
    .line 489
    iget v1, v1, Liu2;->f:I

    .line 490
    .line 491
    iget v2, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 492
    .line 493
    and-int/lit8 v2, v2, -0x9

    .line 494
    .line 495
    iput v2, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 496
    .line 497
    move v14, v1

    .line 498
    move v1, v8

    .line 499
    :goto_a
    if-ge v1, v7, :cond_20

    .line 500
    .line 501
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    invoke-static {v2}, Landroidx/leanback/widget/GridLayoutManager;->e1(Landroid/view/View;)I

    .line 506
    .line 507
    .line 508
    move-result v5

    .line 509
    if-eq v14, v5, :cond_18

    .line 510
    .line 511
    :goto_b
    move v8, v3

    .line 512
    move/from16 p1, v7

    .line 513
    .line 514
    move/from16 v21, v10

    .line 515
    .line 516
    move-object/from16 v23, v11

    .line 517
    .line 518
    move/from16 v22, v13

    .line 519
    .line 520
    move v7, v1

    .line 521
    goto/16 :goto_10

    .line 522
    .line 523
    :cond_18
    iget-object v5, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 524
    .line 525
    invoke-virtual {v5, v14}, Liu2;->k(I)Lr75;

    .line 526
    .line 527
    .line 528
    move-result-object v5

    .line 529
    if-nez v5, :cond_19

    .line 530
    .line 531
    goto :goto_b

    .line 532
    :cond_19
    iget v8, v5, Lr75;->Y:I

    .line 533
    .line 534
    invoke-virtual {v0, v8}, Landroidx/leanback/widget/GridLayoutManager;->j1(I)I

    .line 535
    .line 536
    .line 537
    move-result v8

    .line 538
    move/from16 v21, v3

    .line 539
    .line 540
    iget-object v3, v4, Lyr6;->g0:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v3, Lm09;

    .line 543
    .line 544
    iget v3, v3, Lm09;->j:I

    .line 545
    .line 546
    add-int/2addr v8, v3

    .line 547
    iget v3, v0, Landroidx/leanback/widget/GridLayoutManager;->L0:I

    .line 548
    .line 549
    sub-int/2addr v8, v3

    .line 550
    iget-object v3, v0, Landroidx/leanback/widget/GridLayoutManager;->v0:Ltd5;

    .line 551
    .line 552
    invoke-virtual {v3, v2}, Ltd5;->g(Landroid/view/View;)I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    move/from16 p1, v3

    .line 557
    .line 558
    sget-object v3, Landroidx/leanback/widget/GridLayoutManager;->h1:Landroid/graphics/Rect;

    .line 559
    .line 560
    invoke-virtual {v0, v2, v3}, Landroidx/leanback/widget/GridLayoutManager;->M(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 561
    .line 562
    .line 563
    move-object/from16 v16, v3

    .line 564
    .line 565
    iget-boolean v3, v0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 566
    .line 567
    if-nez v3, :cond_1a

    .line 568
    .line 569
    invoke-virtual/range {v16 .. v16}, Landroid/graphics/Rect;->width()I

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    goto :goto_c

    .line 574
    :cond_1a
    invoke-virtual/range {v16 .. v16}, Landroid/graphics/Rect;->height()I

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    :goto_c
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 579
    .line 580
    .line 581
    move-result-object v16

    .line 582
    move/from16 v17, v3

    .line 583
    .line 584
    move-object/from16 v3, v16

    .line 585
    .line 586
    check-cast v3, Llu2;

    .line 587
    .line 588
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->X:Landroidx/recyclerview/widget/l;

    .line 589
    .line 590
    iget v3, v3, Landroidx/recyclerview/widget/l;->j:I

    .line 591
    .line 592
    and-int/lit8 v3, v3, 0x2

    .line 593
    .line 594
    if-eqz v3, :cond_1b

    .line 595
    .line 596
    iget v3, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 597
    .line 598
    or-int/lit8 v3, v3, 0x8

    .line 599
    .line 600
    iput v3, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 601
    .line 602
    iget-object v3, v0, Landroidx/leanback/widget/GridLayoutManager;->D0:Landroidx/recyclerview/widget/k;

    .line 603
    .line 604
    move-object/from16 v22, v4

    .line 605
    .line 606
    iget-object v4, v0, Landroidx/recyclerview/widget/j;->X:Llr0;

    .line 607
    .line 608
    invoke-virtual {v4, v2}, Llr0;->j(Landroid/view/View;)I

    .line 609
    .line 610
    .line 611
    move-result v4

    .line 612
    invoke-virtual {v0, v3, v4, v2}, Landroidx/recyclerview/widget/j;->L0(Landroidx/recyclerview/widget/k;ILandroid/view/View;)V

    .line 613
    .line 614
    .line 615
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->D0:Landroidx/recyclerview/widget/k;

    .line 616
    .line 617
    invoke-virtual {v2, v14}, Landroidx/recyclerview/widget/k;->d(I)Landroid/view/View;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    check-cast v3, Llu2;

    .line 626
    .line 627
    iget-object v4, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 628
    .line 629
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    const/4 v3, 0x0

    .line 636
    invoke-virtual {v0, v2, v1, v3}, Landroidx/recyclerview/widget/j;->m(Landroid/view/View;IZ)V

    .line 637
    .line 638
    .line 639
    goto :goto_d

    .line 640
    :cond_1b
    move-object/from16 v22, v4

    .line 641
    .line 642
    :goto_d
    invoke-virtual {v0, v2}, Landroidx/leanback/widget/GridLayoutManager;->q1(Landroid/view/View;)V

    .line 643
    .line 644
    .line 645
    iget-boolean v3, v0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 646
    .line 647
    if-nez v3, :cond_1c

    .line 648
    .line 649
    invoke-static {v2}, Landroidx/leanback/widget/GridLayoutManager;->g1(Landroid/view/View;)I

    .line 650
    .line 651
    .line 652
    move-result v3

    .line 653
    :goto_e
    add-int v4, p1, v3

    .line 654
    .line 655
    goto :goto_f

    .line 656
    :cond_1c
    invoke-static {v2}, Landroidx/leanback/widget/GridLayoutManager;->f1(Landroid/view/View;)I

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    goto :goto_e

    .line 661
    :goto_f
    iget v5, v5, Lr75;->Y:I

    .line 662
    .line 663
    move-object/from16 v23, v11

    .line 664
    .line 665
    move-object/from16 v11, v22

    .line 666
    .line 667
    move/from16 v22, v13

    .line 668
    .line 669
    move v13, v3

    .line 670
    move/from16 v3, p1

    .line 671
    .line 672
    move/from16 p1, v7

    .line 673
    .line 674
    move v7, v1

    .line 675
    move-object v1, v2

    .line 676
    move v2, v5

    .line 677
    move v5, v8

    .line 678
    move/from16 v8, v21

    .line 679
    .line 680
    move/from16 v21, v10

    .line 681
    .line 682
    move/from16 v10, v17

    .line 683
    .line 684
    invoke-virtual/range {v0 .. v5}, Landroidx/leanback/widget/GridLayoutManager;->o1(Landroid/view/View;IIII)V

    .line 685
    .line 686
    .line 687
    if-eq v10, v13, :cond_1f

    .line 688
    .line 689
    :goto_10
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 690
    .line 691
    iget v1, v1, Liu2;->g:I

    .line 692
    .line 693
    add-int/lit8 v2, p1, -0x1

    .line 694
    .line 695
    :goto_11
    if-lt v2, v7, :cond_1d

    .line 696
    .line 697
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 698
    .line 699
    .line 700
    move-result-object v3

    .line 701
    iget-object v4, v0, Landroidx/leanback/widget/GridLayoutManager;->D0:Landroidx/recyclerview/widget/k;

    .line 702
    .line 703
    iget-object v5, v0, Landroidx/recyclerview/widget/j;->X:Llr0;

    .line 704
    .line 705
    invoke-virtual {v5, v3}, Llr0;->j(Landroid/view/View;)I

    .line 706
    .line 707
    .line 708
    move-result v5

    .line 709
    invoke-virtual {v0, v4, v5, v3}, Landroidx/recyclerview/widget/j;->L0(Landroidx/recyclerview/widget/k;ILandroid/view/View;)V

    .line 710
    .line 711
    .line 712
    add-int/lit8 v2, v2, -0x1

    .line 713
    .line 714
    goto :goto_11

    .line 715
    :cond_1d
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 716
    .line 717
    invoke-virtual {v2, v14}, Liu2;->l(I)V

    .line 718
    .line 719
    .line 720
    iget v2, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 721
    .line 722
    const/high16 v3, 0x10000

    .line 723
    .line 724
    and-int/2addr v2, v3

    .line 725
    if-eqz v2, :cond_1e

    .line 726
    .line 727
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->a1()V

    .line 728
    .line 729
    .line 730
    iget v2, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 731
    .line 732
    if-ltz v2, :cond_21

    .line 733
    .line 734
    if-gt v2, v1, :cond_21

    .line 735
    .line 736
    :goto_12
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 737
    .line 738
    iget v2, v1, Liu2;->g:I

    .line 739
    .line 740
    iget v3, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 741
    .line 742
    if-ge v2, v3, :cond_21

    .line 743
    .line 744
    invoke-virtual {v1}, Liu2;->a()Z

    .line 745
    .line 746
    .line 747
    goto :goto_12

    .line 748
    :cond_1e
    :goto_13
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 749
    .line 750
    invoke-virtual {v2}, Liu2;->a()Z

    .line 751
    .line 752
    .line 753
    move-result v2

    .line 754
    if-eqz v2, :cond_21

    .line 755
    .line 756
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 757
    .line 758
    iget v2, v2, Liu2;->g:I

    .line 759
    .line 760
    if-ge v2, v1, :cond_21

    .line 761
    .line 762
    goto :goto_13

    .line 763
    :cond_1f
    add-int/lit8 v1, v7, 0x1

    .line 764
    .line 765
    add-int/lit8 v14, v14, 0x1

    .line 766
    .line 767
    move/from16 v7, p1

    .line 768
    .line 769
    move v3, v8

    .line 770
    move-object v4, v11

    .line 771
    move/from16 v10, v21

    .line 772
    .line 773
    move/from16 v13, v22

    .line 774
    .line 775
    move-object/from16 v11, v23

    .line 776
    .line 777
    const/4 v8, 0x0

    .line 778
    goto/16 :goto_a

    .line 779
    .line 780
    :cond_20
    move v8, v3

    .line 781
    move/from16 v21, v10

    .line 782
    .line 783
    move-object/from16 v23, v11

    .line 784
    .line 785
    move/from16 v22, v13

    .line 786
    .line 787
    :cond_21
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->K1()V

    .line 788
    .line 789
    .line 790
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->L1()V

    .line 791
    .line 792
    .line 793
    goto/16 :goto_19

    .line 794
    .line 795
    :cond_22
    move v8, v3

    .line 796
    move/from16 v21, v10

    .line 797
    .line 798
    move-object/from16 v23, v11

    .line 799
    .line 800
    move/from16 v22, v13

    .line 801
    .line 802
    move-object v11, v4

    .line 803
    iget v2, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 804
    .line 805
    and-int/lit16 v3, v2, -0x101

    .line 806
    .line 807
    iput v3, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 808
    .line 809
    iget-object v3, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 810
    .line 811
    if-eqz v3, :cond_24

    .line 812
    .line 813
    iget v4, v0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 814
    .line 815
    iget v7, v3, Liu2;->e:I

    .line 816
    .line 817
    if-ne v4, v7, :cond_24

    .line 818
    .line 819
    and-int v2, v2, v18

    .line 820
    .line 821
    if-eqz v2, :cond_23

    .line 822
    .line 823
    move/from16 v2, v19

    .line 824
    .line 825
    goto :goto_14

    .line 826
    :cond_23
    const/4 v2, 0x0

    .line 827
    :goto_14
    iget-boolean v3, v3, Liu2;->c:Z

    .line 828
    .line 829
    if-eq v2, v3, :cond_27

    .line 830
    .line 831
    :cond_24
    iget v2, v0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 832
    .line 833
    move/from16 v3, v19

    .line 834
    .line 835
    if-ne v2, v3, :cond_25

    .line 836
    .line 837
    new-instance v2, Lla7;

    .line 838
    .line 839
    invoke-direct {v2}, Lla7;-><init>()V

    .line 840
    .line 841
    .line 842
    goto :goto_15

    .line 843
    :cond_25
    new-instance v3, Lig7;

    .line 844
    .line 845
    invoke-direct {v3}, Liu2;-><init>()V

    .line 846
    .line 847
    .line 848
    new-instance v4, Lxr0;

    .line 849
    .line 850
    const/16 v7, 0x40

    .line 851
    .line 852
    invoke-direct {v4, v7}, Lxr0;-><init>(I)V

    .line 853
    .line 854
    .line 855
    iput-object v4, v3, Lig7;->j:Lxr0;

    .line 856
    .line 857
    iput v5, v3, Lig7;->k:I

    .line 858
    .line 859
    invoke-virtual {v3, v2}, Liu2;->n(I)V

    .line 860
    .line 861
    .line 862
    move-object v2, v3

    .line 863
    :goto_15
    iput-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 864
    .line 865
    iget-object v3, v0, Landroidx/leanback/widget/GridLayoutManager;->g1:Lq02;

    .line 866
    .line 867
    iput-object v3, v2, Liu2;->b:Lq02;

    .line 868
    .line 869
    iget v3, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 870
    .line 871
    and-int v3, v3, v18

    .line 872
    .line 873
    if-eqz v3, :cond_26

    .line 874
    .line 875
    const/4 v3, 0x1

    .line 876
    goto :goto_16

    .line 877
    :cond_26
    const/4 v3, 0x0

    .line 878
    :goto_16
    iput-boolean v3, v2, Liu2;->c:Z

    .line 879
    .line 880
    :cond_27
    iget-object v2, v11, Lyr6;->f0:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v2, Lm09;

    .line 883
    .line 884
    iget-object v3, v11, Lyr6;->Y:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v3, Lm09;

    .line 887
    .line 888
    const/high16 v4, -0x80000000

    .line 889
    .line 890
    iput v4, v2, Lm09;->b:I

    .line 891
    .line 892
    const v4, 0x7fffffff

    .line 893
    .line 894
    .line 895
    iput v4, v2, Lm09;->a:I

    .line 896
    .line 897
    iget-object v2, v11, Lyr6;->Z:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v2, Lm09;

    .line 900
    .line 901
    iget v4, v0, Landroidx/recyclerview/widget/j;->p0:I

    .line 902
    .line 903
    iput v4, v2, Lm09;->i:I

    .line 904
    .line 905
    iget v4, v0, Landroidx/recyclerview/widget/j;->q0:I

    .line 906
    .line 907
    iput v4, v3, Lm09;->i:I

    .line 908
    .line 909
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingLeft()I

    .line 910
    .line 911
    .line 912
    move-result v4

    .line 913
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingRight()I

    .line 914
    .line 915
    .line 916
    move-result v7

    .line 917
    iput v4, v2, Lm09;->j:I

    .line 918
    .line 919
    iput v7, v2, Lm09;->k:I

    .line 920
    .line 921
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingTop()I

    .line 922
    .line 923
    .line 924
    move-result v2

    .line 925
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->getPaddingBottom()I

    .line 926
    .line 927
    .line 928
    move-result v4

    .line 929
    iput v2, v3, Lm09;->j:I

    .line 930
    .line 931
    iput v4, v3, Lm09;->k:I

    .line 932
    .line 933
    iget-object v2, v11, Lyr6;->f0:Ljava/lang/Object;

    .line 934
    .line 935
    check-cast v2, Lm09;

    .line 936
    .line 937
    iget v2, v2, Lm09;->i:I

    .line 938
    .line 939
    iput v2, v0, Landroidx/leanback/widget/GridLayoutManager;->b1:I

    .line 940
    .line 941
    const/4 v3, 0x0

    .line 942
    iput v3, v0, Landroidx/leanback/widget/GridLayoutManager;->L0:I

    .line 943
    .line 944
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->L1()V

    .line 945
    .line 946
    .line 947
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 948
    .line 949
    iget v3, v0, Landroidx/leanback/widget/GridLayoutManager;->S0:I

    .line 950
    .line 951
    iput v3, v2, Liu2;->d:I

    .line 952
    .line 953
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->D0:Landroidx/recyclerview/widget/k;

    .line 954
    .line 955
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/j;->B(Landroidx/recyclerview/widget/k;)V

    .line 956
    .line 957
    .line 958
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 959
    .line 960
    iput v5, v2, Liu2;->g:I

    .line 961
    .line 962
    iput v5, v2, Liu2;->f:I

    .line 963
    .line 964
    iget-object v3, v11, Lyr6;->f0:Ljava/lang/Object;

    .line 965
    .line 966
    check-cast v3, Lm09;

    .line 967
    .line 968
    const/high16 v4, -0x80000000

    .line 969
    .line 970
    iput v4, v3, Lm09;->b:I

    .line 971
    .line 972
    iput v4, v3, Lm09;->d:I

    .line 973
    .line 974
    const v4, 0x7fffffff

    .line 975
    .line 976
    .line 977
    iput v4, v3, Lm09;->a:I

    .line 978
    .line 979
    iput v4, v3, Lm09;->c:I

    .line 980
    .line 981
    iget v3, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 982
    .line 983
    and-int/lit8 v4, v3, -0x5

    .line 984
    .line 985
    iput v4, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 986
    .line 987
    and-int/lit8 v3, v3, -0x15

    .line 988
    .line 989
    if-eqz v21, :cond_28

    .line 990
    .line 991
    const/16 v4, 0x10

    .line 992
    .line 993
    goto :goto_17

    .line 994
    :cond_28
    const/4 v4, 0x0

    .line 995
    :goto_17
    or-int/2addr v3, v4

    .line 996
    iput v3, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 997
    .line 998
    if-eqz v21, :cond_2a

    .line 999
    .line 1000
    if-ltz v14, :cond_29

    .line 1001
    .line 1002
    iget v3, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 1003
    .line 1004
    if-gt v3, v1, :cond_29

    .line 1005
    .line 1006
    if-ge v3, v14, :cond_2a

    .line 1007
    .line 1008
    :cond_29
    iget v14, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 1009
    .line 1010
    move v1, v14

    .line 1011
    :cond_2a
    iput v14, v2, Liu2;->i:I

    .line 1012
    .line 1013
    if-eq v1, v5, :cond_2b

    .line 1014
    .line 1015
    :goto_18
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 1016
    .line 1017
    invoke-virtual {v2}, Liu2;->a()Z

    .line 1018
    .line 1019
    .line 1020
    move-result v2

    .line 1021
    if-eqz v2, :cond_2b

    .line 1022
    .line 1023
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v2

    .line 1027
    if-nez v2, :cond_2b

    .line 1028
    .line 1029
    goto :goto_18

    .line 1030
    :cond_2b
    :goto_19
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->K1()V

    .line 1031
    .line 1032
    .line 1033
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 1034
    .line 1035
    iget v7, v1, Liu2;->f:I

    .line 1036
    .line 1037
    iget v10, v1, Liu2;->g:I

    .line 1038
    .line 1039
    neg-int v4, v15

    .line 1040
    neg-int v5, v8

    .line 1041
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 1042
    .line 1043
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v1

    .line 1047
    if-eqz v1, :cond_2c

    .line 1048
    .line 1049
    if-eqz v21, :cond_2c

    .line 1050
    .line 1051
    const/4 v3, 0x0

    .line 1052
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    invoke-virtual/range {v0 .. v5}, Landroidx/leanback/widget/GridLayoutManager;->C1(Landroid/view/View;Landroid/view/View;ZII)V

    .line 1057
    .line 1058
    .line 1059
    :cond_2c
    if-eqz v1, :cond_2d

    .line 1060
    .line 1061
    if-eqz v22, :cond_2d

    .line 1062
    .line 1063
    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    .line 1064
    .line 1065
    .line 1066
    move-result v2

    .line 1067
    if-nez v2, :cond_2d

    .line 1068
    .line 1069
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 1070
    .line 1071
    .line 1072
    goto :goto_1c

    .line 1073
    :cond_2d
    if-nez v22, :cond_31

    .line 1074
    .line 1075
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 1076
    .line 1077
    invoke-virtual {v2}, Landroid/view/View;->hasFocus()Z

    .line 1078
    .line 1079
    .line 1080
    move-result v2

    .line 1081
    if-nez v2, :cond_31

    .line 1082
    .line 1083
    if-eqz v1, :cond_2e

    .line 1084
    .line 1085
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 1086
    .line 1087
    .line 1088
    move-result v2

    .line 1089
    if-eqz v2, :cond_2e

    .line 1090
    .line 1091
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 1092
    .line 1093
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->focusableViewAvailable(Landroid/view/View;)V

    .line 1094
    .line 1095
    .line 1096
    goto :goto_1b

    .line 1097
    :cond_2e
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 1098
    .line 1099
    .line 1100
    move-result v2

    .line 1101
    const/4 v3, 0x0

    .line 1102
    :goto_1a
    if-ge v3, v2, :cond_30

    .line 1103
    .line 1104
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v1

    .line 1108
    if-eqz v1, :cond_2f

    .line 1109
    .line 1110
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 1111
    .line 1112
    .line 1113
    move-result v11

    .line 1114
    if-eqz v11, :cond_2f

    .line 1115
    .line 1116
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 1117
    .line 1118
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->focusableViewAvailable(Landroid/view/View;)V

    .line 1119
    .line 1120
    .line 1121
    goto :goto_1b

    .line 1122
    :cond_2f
    add-int/lit8 v3, v3, 0x1

    .line 1123
    .line 1124
    goto :goto_1a

    .line 1125
    :cond_30
    :goto_1b
    if-eqz v21, :cond_31

    .line 1126
    .line 1127
    if-eqz v1, :cond_31

    .line 1128
    .line 1129
    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    .line 1130
    .line 1131
    .line 1132
    move-result v2

    .line 1133
    if-eqz v2, :cond_31

    .line 1134
    .line 1135
    const/4 v3, 0x0

    .line 1136
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v2

    .line 1140
    invoke-virtual/range {v0 .. v5}, Landroidx/leanback/widget/GridLayoutManager;->C1(Landroid/view/View;Landroid/view/View;ZII)V

    .line 1141
    .line 1142
    .line 1143
    :cond_31
    :goto_1c
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->a1()V

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->r1()V

    .line 1147
    .line 1148
    .line 1149
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 1150
    .line 1151
    iget v2, v1, Liu2;->f:I

    .line 1152
    .line 1153
    if-ne v2, v7, :cond_2b

    .line 1154
    .line 1155
    iget v1, v1, Liu2;->g:I

    .line 1156
    .line 1157
    if-ne v1, v10, :cond_2b

    .line 1158
    .line 1159
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->w1()V

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->v1()V

    .line 1163
    .line 1164
    .line 1165
    iget-boolean v1, v6, Lq96;->k:Z

    .line 1166
    .line 1167
    if-eqz v1, :cond_43

    .line 1168
    .line 1169
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->D0:Landroidx/recyclerview/widget/k;

    .line 1170
    .line 1171
    iget-object v1, v1, Landroidx/recyclerview/widget/k;->d:Ljava/util/List;

    .line 1172
    .line 1173
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1174
    .line 1175
    .line 1176
    move-result v2

    .line 1177
    if-nez v2, :cond_32

    .line 1178
    .line 1179
    goto/16 :goto_29

    .line 1180
    .line 1181
    :cond_32
    iget-object v3, v0, Landroidx/leanback/widget/GridLayoutManager;->B0:[I

    .line 1182
    .line 1183
    if-eqz v3, :cond_33

    .line 1184
    .line 1185
    array-length v4, v3

    .line 1186
    if-le v2, v4, :cond_36

    .line 1187
    .line 1188
    :cond_33
    if-nez v3, :cond_34

    .line 1189
    .line 1190
    const/16 v3, 0x10

    .line 1191
    .line 1192
    goto :goto_1d

    .line 1193
    :cond_34
    array-length v3, v3

    .line 1194
    :goto_1d
    if-ge v3, v2, :cond_35

    .line 1195
    .line 1196
    shl-int/lit8 v3, v3, 0x1

    .line 1197
    .line 1198
    goto :goto_1d

    .line 1199
    :cond_35
    new-array v3, v3, [I

    .line 1200
    .line 1201
    iput-object v3, v0, Landroidx/leanback/widget/GridLayoutManager;->B0:[I

    .line 1202
    .line 1203
    :cond_36
    const/4 v3, 0x0

    .line 1204
    const/4 v4, 0x0

    .line 1205
    :goto_1e
    if-ge v3, v2, :cond_38

    .line 1206
    .line 1207
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v5

    .line 1211
    check-cast v5, Landroidx/recyclerview/widget/l;

    .line 1212
    .line 1213
    invoke-virtual {v5}, Landroidx/recyclerview/widget/l;->b()I

    .line 1214
    .line 1215
    .line 1216
    move-result v5

    .line 1217
    if-ltz v5, :cond_37

    .line 1218
    .line 1219
    iget-object v6, v0, Landroidx/leanback/widget/GridLayoutManager;->B0:[I

    .line 1220
    .line 1221
    add-int/lit8 v7, v4, 0x1

    .line 1222
    .line 1223
    aput v5, v6, v4

    .line 1224
    .line 1225
    move v4, v7

    .line 1226
    :cond_37
    add-int/lit8 v3, v3, 0x1

    .line 1227
    .line 1228
    goto :goto_1e

    .line 1229
    :cond_38
    if-lez v4, :cond_42

    .line 1230
    .line 1231
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->B0:[I

    .line 1232
    .line 1233
    const/4 v3, 0x0

    .line 1234
    invoke-static {v1, v3, v4}, Ljava/util/Arrays;->sort([III)V

    .line 1235
    .line 1236
    .line 1237
    iget-object v1, v0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 1238
    .line 1239
    iget-object v2, v0, Landroidx/leanback/widget/GridLayoutManager;->B0:[I

    .line 1240
    .line 1241
    iget-object v5, v1, Liu2;->a:[Ljava/lang/Object;

    .line 1242
    .line 1243
    iget v6, v1, Liu2;->g:I

    .line 1244
    .line 1245
    if-ltz v6, :cond_39

    .line 1246
    .line 1247
    invoke-static {v2, v3, v4, v6}, Ljava/util/Arrays;->binarySearch([IIII)I

    .line 1248
    .line 1249
    .line 1250
    move-result v7

    .line 1251
    goto :goto_1f

    .line 1252
    :cond_39
    const/4 v7, 0x0

    .line 1253
    :goto_1f
    if-gez v7, :cond_3d

    .line 1254
    .line 1255
    neg-int v3, v7

    .line 1256
    const/16 v19, 0x1

    .line 1257
    .line 1258
    add-int/lit8 v3, v3, -0x1

    .line 1259
    .line 1260
    iget-boolean v7, v1, Liu2;->c:Z

    .line 1261
    .line 1262
    iget-object v8, v1, Liu2;->b:Lq02;

    .line 1263
    .line 1264
    if-eqz v7, :cond_3a

    .line 1265
    .line 1266
    invoke-virtual {v8, v6}, Lq02;->H(I)I

    .line 1267
    .line 1268
    .line 1269
    move-result v7

    .line 1270
    iget-object v8, v1, Liu2;->b:Lq02;

    .line 1271
    .line 1272
    invoke-virtual {v8, v6}, Lq02;->L(I)I

    .line 1273
    .line 1274
    .line 1275
    move-result v6

    .line 1276
    sub-int/2addr v7, v6

    .line 1277
    iget v6, v1, Liu2;->d:I

    .line 1278
    .line 1279
    sub-int/2addr v7, v6

    .line 1280
    goto :goto_20

    .line 1281
    :cond_3a
    invoke-virtual {v8, v6}, Lq02;->H(I)I

    .line 1282
    .line 1283
    .line 1284
    move-result v7

    .line 1285
    iget-object v8, v1, Liu2;->b:Lq02;

    .line 1286
    .line 1287
    invoke-virtual {v8, v6}, Lq02;->L(I)I

    .line 1288
    .line 1289
    .line 1290
    move-result v6

    .line 1291
    add-int/2addr v6, v7

    .line 1292
    iget v7, v1, Liu2;->d:I

    .line 1293
    .line 1294
    add-int/2addr v7, v6

    .line 1295
    :goto_20
    move/from16 v29, v7

    .line 1296
    .line 1297
    :goto_21
    if-ge v3, v4, :cond_3d

    .line 1298
    .line 1299
    aget v6, v2, v3

    .line 1300
    .line 1301
    invoke-virtual {v9, v6}, Landroid/util/SparseIntArray;->get(I)I

    .line 1302
    .line 1303
    .line 1304
    move-result v7

    .line 1305
    if-gez v7, :cond_3b

    .line 1306
    .line 1307
    const/16 v28, 0x0

    .line 1308
    .line 1309
    goto :goto_22

    .line 1310
    :cond_3b
    move/from16 v28, v7

    .line 1311
    .line 1312
    :goto_22
    iget-object v7, v1, Liu2;->b:Lq02;

    .line 1313
    .line 1314
    const/4 v8, 0x1

    .line 1315
    invoke-virtual {v7, v6, v8, v5, v8}, Lq02;->B(IZ[Ljava/lang/Object;Z)I

    .line 1316
    .line 1317
    .line 1318
    move-result v27

    .line 1319
    iget-object v7, v1, Liu2;->b:Lq02;

    .line 1320
    .line 1321
    const/16 v20, 0x0

    .line 1322
    .line 1323
    aget-object v25, v5, v20

    .line 1324
    .line 1325
    move/from16 v26, v6

    .line 1326
    .line 1327
    move-object/from16 v24, v7

    .line 1328
    .line 1329
    invoke-virtual/range {v24 .. v29}, Lq02;->A(Ljava/lang/Object;IIII)V

    .line 1330
    .line 1331
    .line 1332
    iget-boolean v6, v1, Liu2;->c:Z

    .line 1333
    .line 1334
    iget v7, v1, Liu2;->d:I

    .line 1335
    .line 1336
    if-eqz v6, :cond_3c

    .line 1337
    .line 1338
    sub-int v29, v29, v27

    .line 1339
    .line 1340
    sub-int v29, v29, v7

    .line 1341
    .line 1342
    goto :goto_23

    .line 1343
    :cond_3c
    add-int v29, v29, v27

    .line 1344
    .line 1345
    add-int v29, v29, v7

    .line 1346
    .line 1347
    :goto_23
    add-int/lit8 v3, v3, 0x1

    .line 1348
    .line 1349
    goto :goto_21

    .line 1350
    :cond_3d
    iget v3, v1, Liu2;->f:I

    .line 1351
    .line 1352
    if-ltz v3, :cond_3e

    .line 1353
    .line 1354
    const/4 v6, 0x0

    .line 1355
    invoke-static {v2, v6, v4, v3}, Ljava/util/Arrays;->binarySearch([IIII)I

    .line 1356
    .line 1357
    .line 1358
    move-result v4

    .line 1359
    goto :goto_24

    .line 1360
    :cond_3e
    const/4 v4, 0x0

    .line 1361
    :goto_24
    if-gez v4, :cond_42

    .line 1362
    .line 1363
    neg-int v4, v4

    .line 1364
    add-int/lit8 v4, v4, -0x2

    .line 1365
    .line 1366
    iget-boolean v6, v1, Liu2;->c:Z

    .line 1367
    .line 1368
    iget-object v7, v1, Liu2;->b:Lq02;

    .line 1369
    .line 1370
    if-eqz v6, :cond_3f

    .line 1371
    .line 1372
    invoke-virtual {v7, v3}, Lq02;->H(I)I

    .line 1373
    .line 1374
    .line 1375
    move-result v3

    .line 1376
    goto :goto_25

    .line 1377
    :cond_3f
    invoke-virtual {v7, v3}, Lq02;->H(I)I

    .line 1378
    .line 1379
    .line 1380
    move-result v3

    .line 1381
    :goto_25
    if-ltz v4, :cond_42

    .line 1382
    .line 1383
    aget v6, v2, v4

    .line 1384
    .line 1385
    invoke-virtual {v9, v6}, Landroid/util/SparseIntArray;->get(I)I

    .line 1386
    .line 1387
    .line 1388
    move-result v7

    .line 1389
    if-gez v7, :cond_40

    .line 1390
    .line 1391
    const/16 v28, 0x0

    .line 1392
    .line 1393
    goto :goto_26

    .line 1394
    :cond_40
    move/from16 v28, v7

    .line 1395
    .line 1396
    :goto_26
    iget-object v7, v1, Liu2;->b:Lq02;

    .line 1397
    .line 1398
    const/4 v8, 0x1

    .line 1399
    const/4 v10, 0x0

    .line 1400
    invoke-virtual {v7, v6, v10, v5, v8}, Lq02;->B(IZ[Ljava/lang/Object;Z)I

    .line 1401
    .line 1402
    .line 1403
    move-result v27

    .line 1404
    iget-boolean v7, v1, Liu2;->c:Z

    .line 1405
    .line 1406
    iget v8, v1, Liu2;->d:I

    .line 1407
    .line 1408
    if-eqz v7, :cond_41

    .line 1409
    .line 1410
    add-int/2addr v3, v8

    .line 1411
    add-int v3, v3, v27

    .line 1412
    .line 1413
    :goto_27
    move/from16 v29, v3

    .line 1414
    .line 1415
    goto :goto_28

    .line 1416
    :cond_41
    sub-int/2addr v3, v8

    .line 1417
    sub-int v3, v3, v27

    .line 1418
    .line 1419
    goto :goto_27

    .line 1420
    :goto_28
    iget-object v3, v1, Liu2;->b:Lq02;

    .line 1421
    .line 1422
    aget-object v25, v5, v10

    .line 1423
    .line 1424
    move-object/from16 v24, v3

    .line 1425
    .line 1426
    move/from16 v26, v6

    .line 1427
    .line 1428
    invoke-virtual/range {v24 .. v29}, Lq02;->A(Ljava/lang/Object;IIII)V

    .line 1429
    .line 1430
    .line 1431
    add-int/lit8 v4, v4, -0x1

    .line 1432
    .line 1433
    move/from16 v3, v29

    .line 1434
    .line 1435
    goto :goto_25

    .line 1436
    :cond_42
    invoke-virtual {v9}, Landroid/util/SparseIntArray;->clear()V

    .line 1437
    .line 1438
    .line 1439
    :cond_43
    :goto_29
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 1440
    .line 1441
    and-int/lit16 v2, v1, 0x400

    .line 1442
    .line 1443
    if-eqz v2, :cond_44

    .line 1444
    .line 1445
    and-int/lit16 v1, v1, -0x401

    .line 1446
    .line 1447
    iput v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 1448
    .line 1449
    goto :goto_2a

    .line 1450
    :cond_44
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->J1()V

    .line 1451
    .line 1452
    .line 1453
    :goto_2a
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 1454
    .line 1455
    and-int/lit8 v2, v1, 0x4

    .line 1456
    .line 1457
    if-eqz v2, :cond_46

    .line 1458
    .line 1459
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 1460
    .line 1461
    if-ne v1, v12, :cond_45

    .line 1462
    .line 1463
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/j;->D(I)Landroid/view/View;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    move-object/from16 v2, v23

    .line 1468
    .line 1469
    if-ne v1, v2, :cond_45

    .line 1470
    .line 1471
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 1472
    .line 1473
    and-int/lit8 v2, v1, 0x8

    .line 1474
    .line 1475
    if-eqz v2, :cond_46

    .line 1476
    .line 1477
    :cond_45
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->b1()V

    .line 1478
    .line 1479
    .line 1480
    goto :goto_2b

    .line 1481
    :cond_46
    and-int/lit8 v1, v1, 0x14

    .line 1482
    .line 1483
    const/16 v3, 0x10

    .line 1484
    .line 1485
    if-ne v1, v3, :cond_47

    .line 1486
    .line 1487
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->b1()V

    .line 1488
    .line 1489
    .line 1490
    :cond_47
    :goto_2b
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->c1()V

    .line 1491
    .line 1492
    .line 1493
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 1494
    .line 1495
    and-int/lit8 v2, v1, 0x40

    .line 1496
    .line 1497
    if-eqz v2, :cond_4c

    .line 1498
    .line 1499
    iget-boolean v2, v0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 1500
    .line 1501
    const/4 v4, 0x1

    .line 1502
    if-ne v2, v4, :cond_48

    .line 1503
    .line 1504
    iget v1, v0, Landroidx/recyclerview/widget/j;->q0:I

    .line 1505
    .line 1506
    neg-int v1, v1

    .line 1507
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 1508
    .line 1509
    .line 1510
    move-result v2

    .line 1511
    if-lez v2, :cond_4b

    .line 1512
    .line 1513
    const/4 v3, 0x0

    .line 1514
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v2

    .line 1518
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 1519
    .line 1520
    .line 1521
    move-result v2

    .line 1522
    if-gez v2, :cond_4b

    .line 1523
    .line 1524
    :goto_2c
    add-int/2addr v1, v2

    .line 1525
    goto :goto_2d

    .line 1526
    :cond_48
    and-int v1, v1, v18

    .line 1527
    .line 1528
    iget v2, v0, Landroidx/recyclerview/widget/j;->p0:I

    .line 1529
    .line 1530
    if-eqz v1, :cond_4a

    .line 1531
    .line 1532
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 1533
    .line 1534
    .line 1535
    move-result v1

    .line 1536
    if-lez v1, :cond_49

    .line 1537
    .line 1538
    const/4 v10, 0x0

    .line 1539
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v1

    .line 1543
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 1544
    .line 1545
    .line 1546
    move-result v1

    .line 1547
    if-le v1, v2, :cond_49

    .line 1548
    .line 1549
    goto :goto_2d

    .line 1550
    :cond_49
    move v1, v2

    .line 1551
    goto :goto_2d

    .line 1552
    :cond_4a
    const/4 v10, 0x0

    .line 1553
    neg-int v1, v2

    .line 1554
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->I()I

    .line 1555
    .line 1556
    .line 1557
    move-result v2

    .line 1558
    if-lez v2, :cond_4b

    .line 1559
    .line 1560
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v2

    .line 1564
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 1565
    .line 1566
    .line 1567
    move-result v2

    .line 1568
    if-gez v2, :cond_4b

    .line 1569
    .line 1570
    goto :goto_2c

    .line 1571
    :cond_4b
    :goto_2d
    invoke-virtual {v0, v1}, Landroidx/leanback/widget/GridLayoutManager;->y1(I)I

    .line 1572
    .line 1573
    .line 1574
    :cond_4c
    iget v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 1575
    .line 1576
    and-int/lit8 v1, v1, -0x4

    .line 1577
    .line 1578
    iput v1, v0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 1579
    .line 1580
    invoke-virtual {v0}, Landroidx/leanback/widget/GridLayoutManager;->p1()V

    .line 1581
    .line 1582
    .line 1583
    return-void
.end method

.method public final u1(IZ)I
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    if-eq v1, v2, :cond_2

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Liu2;->k(I)Lr75;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget v0, v0, Lr75;->Y:I

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    :goto_0
    move v0, v2

    .line 22
    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    :goto_2
    if-ge v4, v3, :cond_b

    .line 29
    .line 30
    if-eqz p1, :cond_b

    .line 31
    .line 32
    if-lez p1, :cond_3

    .line 33
    .line 34
    move v6, v4

    .line 35
    goto :goto_3

    .line 36
    :cond_3
    add-int/lit8 v6, v3, -0x1

    .line 37
    .line 38
    sub-int/2addr v6, v4

    .line 39
    :goto_3
    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    if-nez v8, :cond_a

    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->X()Z

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-eqz v8, :cond_4

    .line 54
    .line 55
    invoke-virtual {v7}, Landroid/view/View;->hasFocusable()Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_a

    .line 60
    .line 61
    :cond_4
    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-static {v6}, Landroidx/leanback/widget/GridLayoutManager;->e1(Landroid/view/View;)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    iget-object v8, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 70
    .line 71
    invoke-virtual {v8, v6}, Liu2;->k(I)Lr75;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    if-nez v8, :cond_5

    .line 76
    .line 77
    move v8, v2

    .line 78
    goto :goto_4

    .line 79
    :cond_5
    iget v8, v8, Lr75;->Y:I

    .line 80
    .line 81
    :goto_4
    if-ne v0, v2, :cond_6

    .line 82
    .line 83
    move v1, v6

    .line 84
    move-object v5, v7

    .line 85
    move v0, v8

    .line 86
    goto :goto_6

    .line 87
    :cond_6
    if-ne v8, v0, :cond_a

    .line 88
    .line 89
    if-lez p1, :cond_7

    .line 90
    .line 91
    if-gt v6, v1, :cond_8

    .line 92
    .line 93
    :cond_7
    if-gez p1, :cond_a

    .line 94
    .line 95
    if-ge v6, v1, :cond_a

    .line 96
    .line 97
    :cond_8
    if-lez p1, :cond_9

    .line 98
    .line 99
    add-int/lit8 p1, p1, -0x1

    .line 100
    .line 101
    :goto_5
    move v1, v6

    .line 102
    move-object v5, v7

    .line 103
    goto :goto_6

    .line 104
    :cond_9
    add-int/lit8 p1, p1, 0x1

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_a
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_b
    if-eqz v5, :cond_e

    .line 111
    .line 112
    if-eqz p2, :cond_d

    .line 113
    .line 114
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->X()Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-eqz p2, :cond_c

    .line 119
    .line 120
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 121
    .line 122
    or-int/lit8 p2, p2, 0x20

    .line 123
    .line 124
    iput p2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 125
    .line 126
    invoke-virtual {v5}, Landroid/view/View;->requestFocus()Z

    .line 127
    .line 128
    .line 129
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 130
    .line 131
    and-int/lit8 p2, p2, -0x21

    .line 132
    .line 133
    iput p2, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 134
    .line 135
    :cond_c
    iput v1, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 136
    .line 137
    return p1

    .line 138
    :cond_d
    invoke-virtual {v5}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    const/4 v0, 0x1

    .line 143
    invoke-virtual {p0, v5, p2, v0}, Landroidx/leanback/widget/GridLayoutManager;->B1(Landroid/view/View;Landroid/view/View;Z)V

    .line 144
    .line 145
    .line 146
    :cond_e
    return p1
.end method

.method public final v1()V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    const v1, 0x10040

    .line 4
    .line 5
    .line 6
    and-int/2addr v1, v0

    .line 7
    const/high16 v2, 0x10000

    .line 8
    .line 9
    if-ne v1, v2, :cond_3

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 12
    .line 13
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 14
    .line 15
    const/high16 v3, 0x40000

    .line 16
    .line 17
    and-int/2addr v0, v3

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->c1:I

    .line 21
    .line 22
    neg-int p0, p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->b1:I

    .line 25
    .line 26
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->c1:I

    .line 27
    .line 28
    add-int/2addr p0, v0

    .line 29
    :goto_0
    iget v0, v1, Liu2;->g:I

    .line 30
    .line 31
    iget v3, v1, Liu2;->f:I

    .line 32
    .line 33
    if-lt v0, v3, :cond_2

    .line 34
    .line 35
    if-le v0, v2, :cond_2

    .line 36
    .line 37
    iget-boolean v3, v1, Liu2;->c:Z

    .line 38
    .line 39
    iget-object v4, v1, Liu2;->b:Lq02;

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v4, v0}, Lq02;->H(I)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-lt v0, p0, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v4, v0}, Lq02;->H(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-gt v0, p0, :cond_2

    .line 55
    .line 56
    :goto_1
    iget-object v0, v1, Liu2;->b:Lq02;

    .line 57
    .line 58
    iget v3, v1, Liu2;->g:I

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Lq02;->Q(I)V

    .line 61
    .line 62
    .line 63
    iget v0, v1, Liu2;->g:I

    .line 64
    .line 65
    add-int/lit8 v0, v0, -0x1

    .line 66
    .line 67
    iput v0, v1, Liu2;->g:I

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget p0, v1, Liu2;->g:I

    .line 71
    .line 72
    iget v0, v1, Liu2;->f:I

    .line 73
    .line 74
    if-ge p0, v0, :cond_3

    .line 75
    .line 76
    const/4 p0, -0x1

    .line 77
    iput p0, v1, Liu2;->g:I

    .line 78
    .line 79
    iput p0, v1, Liu2;->f:I

    .line 80
    .line 81
    :cond_3
    return-void
.end method

.method public final w0(Landroidx/recyclerview/widget/k;Lq96;II)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/leanback/widget/GridLayoutManager;->x1(Landroidx/recyclerview/widget/k;Lq96;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->getPaddingTop()I

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->getPaddingBottom()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    add-int/2addr v0, p4

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->getPaddingLeft()I

    .line 43
    .line 44
    .line 45
    move-result p4

    .line 46
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->getPaddingRight()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    goto :goto_0

    .line 51
    :goto_1
    iput p2, p0, Landroidx/leanback/widget/GridLayoutManager;->P0:I

    .line 52
    .line 53
    iget p4, p0, Landroidx/leanback/widget/GridLayoutManager;->M0:I

    .line 54
    .line 55
    const/4 v1, -0x2

    .line 56
    const-string v2, "wrong spec"

    .line 57
    .line 58
    const/high16 v3, 0x40000000    # 2.0f

    .line 59
    .line 60
    const/high16 v4, -0x80000000

    .line 61
    .line 62
    const/4 v5, 0x1

    .line 63
    if-ne p4, v1, :cond_8

    .line 64
    .line 65
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->W0:I

    .line 66
    .line 67
    if-nez p2, :cond_1

    .line 68
    .line 69
    move p2, v5

    .line 70
    :cond_1
    iput p2, p0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 71
    .line 72
    const/4 p4, 0x0

    .line 73
    iput p4, p0, Landroidx/leanback/widget/GridLayoutManager;->N0:I

    .line 74
    .line 75
    iget-object p4, p0, Landroidx/leanback/widget/GridLayoutManager;->O0:[I

    .line 76
    .line 77
    if-eqz p4, :cond_2

    .line 78
    .line 79
    array-length p4, p4

    .line 80
    if-eq p4, p2, :cond_3

    .line 81
    .line 82
    :cond_2
    new-array p2, p2, [I

    .line 83
    .line 84
    iput-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->O0:[I

    .line 85
    .line 86
    :cond_3
    iget-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->x0:Lq96;

    .line 87
    .line 88
    iget-boolean p2, p2, Lq96;->g:Z

    .line 89
    .line 90
    if-eqz p2, :cond_4

    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->I1()V

    .line 93
    .line 94
    .line 95
    :cond_4
    invoke-virtual {p0, v5}, Landroidx/leanback/widget/GridLayoutManager;->t1(Z)Z

    .line 96
    .line 97
    .line 98
    if-eq p3, v4, :cond_7

    .line 99
    .line 100
    if-eqz p3, :cond_6

    .line 101
    .line 102
    if-ne p3, v3, :cond_5

    .line 103
    .line 104
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->P0:I

    .line 105
    .line 106
    goto/16 :goto_5

    .line 107
    .line 108
    :cond_5
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_6
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->l1()I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    :goto_2
    add-int/2addr p2, v0

    .line 117
    goto/16 :goto_5

    .line 118
    .line 119
    :cond_7
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->l1()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    add-int/2addr p2, v0

    .line 124
    iget p3, p0, Landroidx/leanback/widget/GridLayoutManager;->P0:I

    .line 125
    .line 126
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    goto :goto_5

    .line 131
    :cond_8
    if-eq p3, v4, :cond_d

    .line 132
    .line 133
    if-eqz p3, :cond_a

    .line 134
    .line 135
    if-ne p3, v3, :cond_9

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_9
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_a
    if-nez p4, :cond_b

    .line 143
    .line 144
    sub-int p4, p2, v0

    .line 145
    .line 146
    :cond_b
    iput p4, p0, Landroidx/leanback/widget/GridLayoutManager;->N0:I

    .line 147
    .line 148
    iget p2, p0, Landroidx/leanback/widget/GridLayoutManager;->W0:I

    .line 149
    .line 150
    if-nez p2, :cond_c

    .line 151
    .line 152
    move p2, v5

    .line 153
    :cond_c
    iput p2, p0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 154
    .line 155
    mul-int/2addr p4, p2

    .line 156
    iget p3, p0, Landroidx/leanback/widget/GridLayoutManager;->T0:I

    .line 157
    .line 158
    sub-int/2addr p2, v5

    .line 159
    mul-int/2addr p2, p3

    .line 160
    add-int/2addr p2, p4

    .line 161
    goto :goto_2

    .line 162
    :cond_d
    :goto_3
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->W0:I

    .line 163
    .line 164
    if-nez v1, :cond_e

    .line 165
    .line 166
    if-nez p4, :cond_e

    .line 167
    .line 168
    iput v5, p0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 169
    .line 170
    sub-int p4, p2, v0

    .line 171
    .line 172
    iput p4, p0, Landroidx/leanback/widget/GridLayoutManager;->N0:I

    .line 173
    .line 174
    move v1, v5

    .line 175
    goto :goto_4

    .line 176
    :cond_e
    if-nez v1, :cond_f

    .line 177
    .line 178
    iput p4, p0, Landroidx/leanback/widget/GridLayoutManager;->N0:I

    .line 179
    .line 180
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->T0:I

    .line 181
    .line 182
    add-int v2, p2, v1

    .line 183
    .line 184
    add-int/2addr v1, p4

    .line 185
    div-int v1, v2, v1

    .line 186
    .line 187
    iput v1, p0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_f
    if-nez p4, :cond_10

    .line 191
    .line 192
    iput v1, p0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 193
    .line 194
    sub-int p4, p2, v0

    .line 195
    .line 196
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->T0:I

    .line 197
    .line 198
    add-int/lit8 v3, v1, -0x1

    .line 199
    .line 200
    mul-int/2addr v3, v2

    .line 201
    sub-int/2addr p4, v3

    .line 202
    div-int/2addr p4, v1

    .line 203
    iput p4, p0, Landroidx/leanback/widget/GridLayoutManager;->N0:I

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_10
    iput v1, p0, Landroidx/leanback/widget/GridLayoutManager;->V0:I

    .line 207
    .line 208
    iput p4, p0, Landroidx/leanback/widget/GridLayoutManager;->N0:I

    .line 209
    .line 210
    :goto_4
    if-ne p3, v4, :cond_11

    .line 211
    .line 212
    mul-int/2addr p4, v1

    .line 213
    iget p3, p0, Landroidx/leanback/widget/GridLayoutManager;->T0:I

    .line 214
    .line 215
    sub-int/2addr v1, v5

    .line 216
    mul-int/2addr v1, p3

    .line 217
    add-int/2addr v1, p4

    .line 218
    add-int/2addr v1, v0

    .line 219
    if-ge v1, p2, :cond_11

    .line 220
    .line 221
    move p2, v1

    .line 222
    :cond_11
    :goto_5
    iget-boolean p3, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 223
    .line 224
    iget-object p4, p0, Landroidx/recyclerview/widget/j;->Y:Landroidx/recyclerview/widget/RecyclerView;

    .line 225
    .line 226
    if-nez p3, :cond_12

    .line 227
    .line 228
    invoke-static {p4, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->g(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 229
    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_12
    invoke-static {p4, p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->g(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 233
    .line 234
    .line 235
    :goto_6
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->p1()V

    .line 236
    .line 237
    .line 238
    return-void
.end method

.method public final w1()V
    .locals 6

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    const v1, 0x10040

    .line 4
    .line 5
    .line 6
    and-int/2addr v1, v0

    .line 7
    const/high16 v2, 0x10000

    .line 8
    .line 9
    if-ne v1, v2, :cond_3

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->X0:Liu2;

    .line 12
    .line 13
    iget v2, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 14
    .line 15
    const/high16 v3, 0x40000

    .line 16
    .line 17
    and-int/2addr v0, v3

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->b1:I

    .line 21
    .line 22
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->c1:I

    .line 23
    .line 24
    add-int/2addr v0, p0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget p0, p0, Landroidx/leanback/widget/GridLayoutManager;->c1:I

    .line 27
    .line 28
    neg-int v0, p0

    .line 29
    :goto_0
    iget p0, v1, Liu2;->g:I

    .line 30
    .line 31
    iget v3, v1, Liu2;->f:I

    .line 32
    .line 33
    if-lt p0, v3, :cond_2

    .line 34
    .line 35
    if-ge v3, v2, :cond_2

    .line 36
    .line 37
    iget-object p0, v1, Liu2;->b:Lq02;

    .line 38
    .line 39
    invoke-virtual {p0, v3}, Lq02;->L(I)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    iget-boolean v3, v1, Liu2;->c:Z

    .line 44
    .line 45
    iget-object v4, v1, Liu2;->b:Lq02;

    .line 46
    .line 47
    iget v5, v1, Liu2;->f:I

    .line 48
    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    invoke-virtual {v4, v5}, Lq02;->H(I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    add-int/2addr v3, p0

    .line 56
    if-gt v3, v0, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {v4, v5}, Lq02;->H(I)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    sub-int/2addr v3, p0

    .line 64
    if-lt v3, v0, :cond_2

    .line 65
    .line 66
    :goto_1
    iget-object p0, v1, Liu2;->b:Lq02;

    .line 67
    .line 68
    iget v3, v1, Liu2;->f:I

    .line 69
    .line 70
    invoke-virtual {p0, v3}, Lq02;->Q(I)V

    .line 71
    .line 72
    .line 73
    iget p0, v1, Liu2;->f:I

    .line 74
    .line 75
    add-int/lit8 p0, p0, 0x1

    .line 76
    .line 77
    iput p0, v1, Liu2;->f:I

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iget p0, v1, Liu2;->g:I

    .line 81
    .line 82
    iget v0, v1, Liu2;->f:I

    .line 83
    .line 84
    if-ge p0, v0, :cond_3

    .line 85
    .line 86
    const/4 p0, -0x1

    .line 87
    iput p0, v1, Liu2;->g:I

    .line 88
    .line 89
    iput p0, v1, Liu2;->f:I

    .line 90
    .line 91
    :cond_3
    return-void
.end method

.method public final x0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/view/View;)Z
    .locals 6

    .line 1
    iget p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    const v0, 0x8000

    .line 4
    .line 5
    .line 6
    and-int/2addr p1, v0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p2}, Landroidx/leanback/widget/GridLayoutManager;->e1(Landroid/view/View;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, -0x1

    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 20
    .line 21
    and-int/lit8 p1, p1, 0x23

    .line 22
    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    move-object v0, p0

    .line 28
    move-object v1, p2

    .line 29
    move-object v2, p3

    .line 30
    invoke-virtual/range {v0 .. v5}, Landroidx/leanback/widget/GridLayoutManager;->C1(Landroid/view/View;Landroid/view/View;ZII)V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_0
    return v3
.end method

.method public final x1(Landroidx/recyclerview/widget/k;Lq96;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->w0:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/leanback/widget/GridLayoutManager;->D0:Landroidx/recyclerview/widget/k;

    .line 6
    .line 7
    iput-object p2, p0, Landroidx/leanback/widget/GridLayoutManager;->x0:Lq96;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->y0:I

    .line 11
    .line 12
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->z0:I

    .line 13
    .line 14
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->w0:I

    .line 17
    .line 18
    return-void
.end method

.method public final y0(Landroid/os/Parcelable;)V
    .locals 5

    .line 1
    instance-of v0, p1, Lnu2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p1, Lnu2;

    .line 7
    .line 8
    iget v0, p1, Lnu2;->X:I

    .line 9
    .line 10
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->J0:I

    .line 14
    .line 15
    iget-object p1, p1, Lnu2;->Y:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->e1:Lcb0;

    .line 18
    .line 19
    iget-object v1, v0, Lcb0;->f0:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lej4;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    const/4 v2, -0x1

    .line 28
    invoke-virtual {v1, v2}, Lej4;->d(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    iget-object v3, v0, Lcb0;->f0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Lej4;

    .line 54
    .line 55
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v3, v2, v4}, Lej4;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 64
    .line 65
    or-int/lit16 p1, p1, 0x100

    .line 66
    .line 67
    iput p1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->K0()V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final y1(I)I
    .locals 6

    .line 1
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x40

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_3

    .line 7
    .line 8
    and-int/lit8 v0, v0, 0x3

    .line 9
    .line 10
    if-eq v0, v2, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->Z0:Lyr6;

    .line 13
    .line 14
    if-lez p1, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, Lyr6;->f0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lm09;

    .line 19
    .line 20
    iget v1, v0, Lm09;->a:I

    .line 21
    .line 22
    const v3, 0x7fffffff

    .line 23
    .line 24
    .line 25
    if-ne v1, v3, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget v0, v0, Lm09;->c:I

    .line 29
    .line 30
    if-le p1, v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-gez p1, :cond_3

    .line 34
    .line 35
    iget-object v0, v0, Lyr6;->f0:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lm09;

    .line 38
    .line 39
    iget v1, v0, Lm09;->b:I

    .line 40
    .line 41
    const/high16 v3, -0x80000000

    .line 42
    .line 43
    if-ne v1, v3, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget v0, v0, Lm09;->d:I

    .line 47
    .line 48
    if-ge p1, v0, :cond_3

    .line 49
    .line 50
    :goto_0
    move p1, v0

    .line 51
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 52
    if-nez p1, :cond_4

    .line 53
    .line 54
    return v0

    .line 55
    :cond_4
    neg-int v1, p1

    .line 56
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    iget-boolean v4, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 61
    .line 62
    if-ne v4, v2, :cond_5

    .line 63
    .line 64
    move v4, v0

    .line 65
    :goto_2
    if-ge v4, v3, :cond_6

    .line 66
    .line 67
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v5, v1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    move v4, v0

    .line 78
    :goto_3
    if-ge v4, v3, :cond_6

    .line 79
    .line 80
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v5, v1}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 85
    .line 86
    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_6
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 91
    .line 92
    and-int/lit8 v1, v1, 0x3

    .line 93
    .line 94
    if-ne v1, v2, :cond_7

    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->K1()V

    .line 97
    .line 98
    .line 99
    return p1

    .line 100
    :cond_7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    iget v3, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 105
    .line 106
    const/high16 v4, 0x40000

    .line 107
    .line 108
    and-int/2addr v3, v4

    .line 109
    if-eqz v3, :cond_8

    .line 110
    .line 111
    if-lez p1, :cond_9

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_8
    if-gez p1, :cond_9

    .line 115
    .line 116
    :goto_4
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->r1()V

    .line 117
    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_9
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->a1()V

    .line 121
    .line 122
    .line 123
    :goto_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-le v3, v1, :cond_a

    .line 128
    .line 129
    move v1, v2

    .line 130
    goto :goto_6

    .line 131
    :cond_a
    move v1, v0

    .line 132
    :goto_6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    iget v5, p0, Landroidx/leanback/widget/GridLayoutManager;->E0:I

    .line 137
    .line 138
    and-int/2addr v4, v5

    .line 139
    if-eqz v4, :cond_b

    .line 140
    .line 141
    if-lez p1, :cond_c

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_b
    if-gez p1, :cond_c

    .line 145
    .line 146
    :goto_7
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->v1()V

    .line 147
    .line 148
    .line 149
    goto :goto_8

    .line 150
    :cond_c
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->w1()V

    .line 151
    .line 152
    .line 153
    :goto_8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-ge v4, v3, :cond_d

    .line 158
    .line 159
    goto :goto_9

    .line 160
    :cond_d
    move v2, v0

    .line 161
    :goto_9
    or-int v0, v1, v2

    .line 162
    .line 163
    if-eqz v0, :cond_e

    .line 164
    .line 165
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->J1()V

    .line 166
    .line 167
    .line 168
    :cond_e
    iget-object v0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->K1()V

    .line 174
    .line 175
    .line 176
    return p1
.end method

.method public final z0()Landroid/os/Parcelable;
    .locals 7

    .line 1
    new-instance v0, Lnu2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 7
    .line 8
    iput-object v1, v0, Lnu2;->Y:Landroid/os/Bundle;

    .line 9
    .line 10
    iget v1, p0, Landroidx/leanback/widget/GridLayoutManager;->G0:I

    .line 11
    .line 12
    iput v1, v0, Lnu2;->X:I

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/leanback/widget/GridLayoutManager;->e1:Lcb0;

    .line 15
    .line 16
    iget-object v2, v1, Lcb0;->f0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lej4;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v3, v2, Lej4;->c:Lk42;

    .line 23
    .line 24
    monitor-enter v3

    .line 25
    :try_start_0
    iget v2, v2, Lej4;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    .line 27
    monitor-exit v3

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    iget-object v1, v1, Lcb0;->f0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lej4;

    .line 35
    .line 36
    iget-object v2, v1, Lej4;->c:Lk42;

    .line 37
    .line 38
    monitor-enter v2

    .line 39
    :try_start_1
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    iget-object v4, v1, Lej4;->b:Lfj4;

    .line 42
    .line 43
    iget-object v4, v4, Lfj4;->a:Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/Set;->size()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 57
    .line 58
    .line 59
    iget-object v1, v1, Lej4;->b:Lfj4;

    .line 60
    .line 61
    iget-object v1, v1, Lfj4;->a:Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    check-cast v1, Ljava/lang/Iterable;

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_1

    .line 81
    .line 82
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Ljava/util/Map$Entry;

    .line 87
    .line 88
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :catchall_0
    move-exception p0

    .line 101
    goto :goto_2

    .line 102
    :cond_1
    monitor-exit v2

    .line 103
    new-instance v1, Landroid/os/Bundle;

    .line 104
    .line 105
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_3

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Ljava/util/Map$Entry;

    .line 127
    .line 128
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    check-cast v4, Ljava/lang/String;

    .line 133
    .line 134
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Landroid/util/SparseArray;

    .line 139
    .line 140
    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :goto_2
    monitor-exit v2

    .line 145
    throw p0

    .line 146
    :catchall_1
    move-exception p0

    .line 147
    monitor-exit v3

    .line 148
    throw p0

    .line 149
    :cond_2
    :goto_3
    const/4 v1, 0x0

    .line 150
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    const/4 v3, 0x0

    .line 155
    :goto_4
    if-ge v3, v2, :cond_6

    .line 156
    .line 157
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-static {v4}, Landroidx/leanback/widget/GridLayoutManager;->e1(Landroid/view/View;)I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    const/4 v6, -0x1

    .line 166
    if-eq v5, v6, :cond_5

    .line 167
    .line 168
    iget-object v6, p0, Landroidx/leanback/widget/GridLayoutManager;->e1:Lcb0;

    .line 169
    .line 170
    iget v6, v6, Lcb0;->Y:I

    .line 171
    .line 172
    if-eqz v6, :cond_5

    .line 173
    .line 174
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    new-instance v6, Landroid/util/SparseArray;

    .line 179
    .line 180
    invoke-direct {v6}, Landroid/util/SparseArray;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v6}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 184
    .line 185
    .line 186
    if-nez v1, :cond_4

    .line 187
    .line 188
    new-instance v1, Landroid/os/Bundle;

    .line 189
    .line 190
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 191
    .line 192
    .line 193
    :cond_4
    invoke-virtual {v1, v5, v6}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 194
    .line 195
    .line 196
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_6
    iput-object v1, v0, Lnu2;->Y:Landroid/os/Bundle;

    .line 200
    .line 201
    return-object v0
.end method

.method public final z1(I)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    neg-int v1, p1

    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/j;->I()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    iget-boolean v3, p0, Landroidx/leanback/widget/GridLayoutManager;->u0:Z

    .line 11
    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    :goto_0
    if-ge v0, v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3, v1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    :goto_1
    if-ge v0, v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/j;->H(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3, v1}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget v0, p0, Landroidx/leanback/widget/GridLayoutManager;->L0:I

    .line 39
    .line 40
    add-int/2addr v0, p1

    .line 41
    iput v0, p0, Landroidx/leanback/widget/GridLayoutManager;->L0:I

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/leanback/widget/GridLayoutManager;->L1()V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Landroidx/leanback/widget/GridLayoutManager;->t0:Lb20;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 49
    .line 50
    .line 51
    return p1
.end method
