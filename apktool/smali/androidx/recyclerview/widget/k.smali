.class public final Landroidx/recyclerview/widget/k;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:Lk96;

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/recyclerview/widget/k;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/k;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Landroidx/recyclerview/widget/k;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/recyclerview/widget/k;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Landroidx/recyclerview/widget/k;->d:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, Landroidx/recyclerview/widget/k;->e:I

    .line 31
    .line 32
    iput p1, p0, Landroidx/recyclerview/widget/k;->f:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/l;Z)V
    .locals 6

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->l(Landroidx/recyclerview/widget/l;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/recyclerview/widget/k;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->r1:Lv96;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v2, v2, Lv96;->g0:Lu96;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Lu96;->g0:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lt3;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v3

    .line 27
    :goto_0
    invoke-static {v0, v2}, Lcw8;->n(Landroid/view/View;Lt3;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    if-eqz p2, :cond_6

    .line 31
    .line 32
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->t0:Ll96;

    .line 33
    .line 34
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->u0:Ljava/util/ArrayList;

    .line 35
    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    check-cast p2, Lv10;

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Lv10;->a(Landroidx/recyclerview/widget/l;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    const/4 v4, 0x0

    .line 48
    :goto_1
    if-ge v4, p2, :cond_3

    .line 49
    .line 50
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Ll96;

    .line 55
    .line 56
    check-cast v5, Lv10;

    .line 57
    .line 58
    invoke-virtual {v5, p1}, Lv10;->a(Landroidx/recyclerview/widget/l;)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 65
    .line 66
    if-eqz p2, :cond_4

    .line 67
    .line 68
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/f;->k(Landroidx/recyclerview/widget/l;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->k1:Lq96;

    .line 72
    .line 73
    if-eqz p2, :cond_5

    .line 74
    .line 75
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->l0:Lxd6;

    .line 76
    .line 77
    invoke-virtual {p2, p1}, Lxd6;->G(Landroidx/recyclerview/widget/l;)V

    .line 78
    .line 79
    .line 80
    :cond_5
    sget-boolean p2, Landroidx/recyclerview/widget/RecyclerView;->G1:Z

    .line 81
    .line 82
    if-eqz p2, :cond_6

    .line 83
    .line 84
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    :cond_6
    iput-object v3, p1, Landroidx/recyclerview/widget/l;->s:Landroidx/recyclerview/widget/f;

    .line 88
    .line 89
    iput-object v3, p1, Landroidx/recyclerview/widget/l;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->c()Lk96;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget p2, p1, Landroidx/recyclerview/widget/l;->f:I

    .line 99
    .line 100
    invoke-virtual {p0, p2}, Lk96;->a(I)Lj96;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-object v1, v1, Lj96;->a:Ljava/util/ArrayList;

    .line 105
    .line 106
    iget-object p0, p0, Lk96;->a:Landroid/util/SparseArray;

    .line 107
    .line 108
    invoke-virtual {p0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, Lj96;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const/4 p0, 0x5

    .line 118
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-gt p0, p2, :cond_7

    .line 123
    .line 124
    invoke-static {v0}, Lcr5;->a(Landroid/view/View;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_7
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->F1:Z

    .line 129
    .line 130
    if-eqz p0, :cond_9

    .line 131
    .line 132
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-nez p0, :cond_8

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_8
    const-string p0, "this scrap item already exists"

    .line 140
    .line 141
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_9
    :goto_2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->n()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public final b(I)I
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/k;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->k1:Lq96;

    .line 4
    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Lq96;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    iget-boolean v0, v0, Lq96;->g:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->j0:Ld7;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, p1, v0}, Ld7;->t(II)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 27
    .line 28
    const-string v2, "invalid position "

    .line 29
    .line 30
    const-string v3, ". State item count is "

    .line 31
    .line 32
    invoke-static {v2, p1, v3}, Lie2;->l(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0}, Lq96;->b()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1
.end method

.method public final c()Lk96;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->g:Lk96;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lk96;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lk96;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lk96;->b:I

    .line 19
    .line 20
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, Lk96;->c:Ljava/util/Set;

    .line 30
    .line 31
    iput-object v0, p0, Landroidx/recyclerview/widget/k;->g:Lk96;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/recyclerview/widget/k;->e()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/k;->g:Lk96;

    .line 37
    .line 38
    return-object p0
.end method

.method public final d(I)Landroid/view/View;
    .locals 2

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/k;->l(IJ)Landroidx/recyclerview/widget/l;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-object p0, p0, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 11
    .line 12
    return-object p0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->g:Lk96;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/recyclerview/widget/k;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-boolean p0, p0, Landroidx/recyclerview/widget/RecyclerView;->y0:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, v0, Lk96;->c:Ljava/util/Set;

    .line 16
    .line 17
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final f(Landroidx/recyclerview/widget/f;Z)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/k;->g:Lk96;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lk96;->a:Landroid/util/SparseArray;

    .line 6
    .line 7
    iget-object p0, p0, Lk96;->c:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    move p1, p0

    .line 22
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-ge p1, p2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Lj96;

    .line 37
    .line 38
    iget-object p2, p2, Lj96;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    move v1, p0

    .line 41
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-ge v1, v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroidx/recyclerview/widget/l;

    .line 52
    .line 53
    iget-object v2, v2, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 54
    .line 55
    invoke-static {v2}, Lcr5;->a(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->h(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->K1:Z

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, Landroidx/recyclerview/widget/k;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->j1:Lxr0;

    .line 27
    .line 28
    iget-object v0, p0, Lxr0;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, [I

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const/4 v1, -0x1

    .line 35
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 36
    .line 37
    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    iput v0, p0, Lxr0;->d:I

    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public final h(I)V
    .locals 3

    .line 1
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->F1:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->c:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroidx/recyclerview/widget/l;

    .line 10
    .line 11
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->G1:Z

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v2, 0x1

    .line 19
    invoke-virtual {p0, v1, v2}, Landroidx/recyclerview/widget/k;->a(Landroidx/recyclerview/widget/l;Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final i(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/l;->k()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Landroidx/recyclerview/widget/k;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/l;->j()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Landroidx/recyclerview/widget/l;->n:Landroidx/recyclerview/widget/k;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/k;->m(Landroidx/recyclerview/widget/l;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/l;->q()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget p1, v0, Landroidx/recyclerview/widget/l;->j:I

    .line 36
    .line 37
    and-int/lit8 p1, p1, -0x21

    .line 38
    .line 39
    iput p1, v0, Landroidx/recyclerview/widget/l;->j:I

    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/k;->j(Landroidx/recyclerview/widget/l;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView;->S0:Ld96;

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/recyclerview/widget/l;->h()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_3

    .line 53
    .line 54
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView;->S0:Ld96;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ld96;->d(Landroidx/recyclerview/widget/l;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final j(Landroidx/recyclerview/widget/l;)V
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j1:Lxr0;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, p1, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v2, :cond_14

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_c

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->k()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_13

    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->p()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_12

    .line 34
    .line 35
    iget v2, p1, Landroidx/recyclerview/widget/l;->j:I

    .line 36
    .line 37
    and-int/lit8 v2, v2, 0x10

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    sget-object v2, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/view/View;->hasTransientState()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    move v2, v5

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v2, v4

    .line 52
    :goto_0
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 53
    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v6, p1}, Landroidx/recyclerview/widget/f;->i(Landroidx/recyclerview/widget/l;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_2

    .line 63
    .line 64
    move v6, v5

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move v6, v4

    .line 67
    :goto_1
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->F1:Z

    .line 68
    .line 69
    iget-object v8, p0, Landroidx/recyclerview/widget/k;->c:Ljava/util/ArrayList;

    .line 70
    .line 71
    if-eqz v7, :cond_4

    .line 72
    .line 73
    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-nez v7, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v1, "cached view received recycle internal? "

    .line 83
    .line 84
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p0, p1}, Lom0;->j(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    :goto_2
    if-nez v6, :cond_7

    .line 99
    .line 100
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->h()Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_5

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->G1:Z

    .line 108
    .line 109
    if-eqz p0, :cond_6

    .line 110
    .line 111
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    :cond_6
    move v5, v4

    .line 115
    goto/16 :goto_b

    .line 116
    .line 117
    :cond_7
    :goto_3
    iget v6, p0, Landroidx/recyclerview/widget/k;->f:I

    .line 118
    .line 119
    if-lez v6, :cond_f

    .line 120
    .line 121
    iget v6, p1, Landroidx/recyclerview/widget/l;->j:I

    .line 122
    .line 123
    and-int/lit16 v6, v6, 0x20e

    .line 124
    .line 125
    if-eqz v6, :cond_8

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_8
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    iget v7, p0, Landroidx/recyclerview/widget/k;->f:I

    .line 133
    .line 134
    if-lt v6, v7, :cond_9

    .line 135
    .line 136
    if-lez v6, :cond_9

    .line 137
    .line 138
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/k;->h(I)V

    .line 139
    .line 140
    .line 141
    add-int/lit8 v6, v6, -0x1

    .line 142
    .line 143
    :cond_9
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->K1:Z

    .line 144
    .line 145
    if-eqz v7, :cond_e

    .line 146
    .line 147
    if-lez v6, :cond_e

    .line 148
    .line 149
    iget v7, p1, Landroidx/recyclerview/widget/l;->c:I

    .line 150
    .line 151
    iget-object v9, v1, Lxr0;->e:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v9, [I

    .line 154
    .line 155
    if-eqz v9, :cond_b

    .line 156
    .line 157
    iget v9, v1, Lxr0;->d:I

    .line 158
    .line 159
    mul-int/lit8 v9, v9, 0x2

    .line 160
    .line 161
    move v10, v4

    .line 162
    :goto_4
    if-ge v10, v9, :cond_b

    .line 163
    .line 164
    iget-object v11, v1, Lxr0;->e:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v11, [I

    .line 167
    .line 168
    aget v11, v11, v10

    .line 169
    .line 170
    if-ne v11, v7, :cond_a

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_a
    add-int/lit8 v10, v10, 0x2

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_b
    add-int/lit8 v6, v6, -0x1

    .line 177
    .line 178
    :goto_5
    if-ltz v6, :cond_d

    .line 179
    .line 180
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    check-cast v7, Landroidx/recyclerview/widget/l;

    .line 185
    .line 186
    iget v7, v7, Landroidx/recyclerview/widget/l;->c:I

    .line 187
    .line 188
    iget-object v9, v1, Lxr0;->e:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v9, [I

    .line 191
    .line 192
    if-eqz v9, :cond_d

    .line 193
    .line 194
    iget v9, v1, Lxr0;->d:I

    .line 195
    .line 196
    mul-int/lit8 v9, v9, 0x2

    .line 197
    .line 198
    move v10, v4

    .line 199
    :goto_6
    if-ge v10, v9, :cond_d

    .line 200
    .line 201
    iget-object v11, v1, Lxr0;->e:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v11, [I

    .line 204
    .line 205
    aget v11, v11, v10

    .line 206
    .line 207
    if-ne v11, v7, :cond_c

    .line 208
    .line 209
    add-int/lit8 v6, v6, -0x1

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_c
    add-int/lit8 v10, v10, 0x2

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_d
    add-int/2addr v6, v5

    .line 216
    :cond_e
    :goto_7
    invoke-virtual {v8, v6, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    move v1, v5

    .line 220
    goto :goto_9

    .line 221
    :cond_f
    :goto_8
    move v1, v4

    .line 222
    :goto_9
    if-nez v1, :cond_10

    .line 223
    .line 224
    invoke-virtual {p0, p1, v5}, Landroidx/recyclerview/widget/k;->a(Landroidx/recyclerview/widget/l;Z)V

    .line 225
    .line 226
    .line 227
    :goto_a
    move v4, v1

    .line 228
    goto :goto_b

    .line 229
    :cond_10
    move v5, v4

    .line 230
    goto :goto_a

    .line 231
    :goto_b
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView;->l0:Lxd6;

    .line 232
    .line 233
    invoke-virtual {p0, p1}, Lxd6;->G(Landroidx/recyclerview/widget/l;)V

    .line 234
    .line 235
    .line 236
    if-nez v4, :cond_11

    .line 237
    .line 238
    if-nez v5, :cond_11

    .line 239
    .line 240
    if-eqz v2, :cond_11

    .line 241
    .line 242
    invoke-static {v3}, Lcr5;->a(Landroid/view/View;)V

    .line 243
    .line 244
    .line 245
    const/4 p0, 0x0

    .line 246
    iput-object p0, p1, Landroidx/recyclerview/widget/l;->s:Landroidx/recyclerview/widget/f;

    .line 247
    .line 248
    iput-object p0, p1, Landroidx/recyclerview/widget/l;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 249
    .line 250
    :cond_11
    return-void

    .line 251
    :cond_12
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    const-string p1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 256
    .line 257
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :cond_13
    new-instance p0, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    const-string v1, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 268
    .line 269
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-static {p0, p1}, Lom0;->j(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :cond_14
    :goto_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 284
    .line 285
    new-instance v1, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    const-string v2, "Scrapped or attached views may not be recycled. isScrap:"

    .line 288
    .line 289
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->j()Z

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    const-string p1, " isAttached:"

    .line 300
    .line 301
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    if-eqz p1, :cond_15

    .line 309
    .line 310
    move v4, v5

    .line 311
    :cond_15
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw p0
.end method

.method public final k(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p1, Landroidx/recyclerview/widget/l;->j:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0xc

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/recyclerview/widget/k;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->l()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->S0:Ld96;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->d()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v0, Lff1;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-boolean v0, v0, Lff1;->g:Z

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->g()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->b:Ljava/util/ArrayList;

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Landroidx/recyclerview/widget/k;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    :cond_2
    iput-object p0, p1, Landroidx/recyclerview/widget/l;->n:Landroidx/recyclerview/widget/k;

    .line 59
    .line 60
    const/4 p0, 0x1

    .line 61
    iput-boolean p0, p1, Landroidx/recyclerview/widget/l;->o:Z

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->g()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    invoke-virtual {p1}, Landroidx/recyclerview/widget/l;->i()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 80
    .line 81
    iget-boolean v0, v0, Landroidx/recyclerview/widget/f;->b:Z

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const-string p1, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 91
    .line 92
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_5
    :goto_1
    iput-object p0, p1, Landroidx/recyclerview/widget/l;->n:Landroidx/recyclerview/widget/k;

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    iput-boolean v0, p1, Landroidx/recyclerview/widget/l;->o:Z

    .line 104
    .line 105
    iget-object p0, p0, Landroidx/recyclerview/widget/k;->a:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final l(IJ)Landroidx/recyclerview/widget/l;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/recyclerview/widget/k;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->k1:Lq96;

    .line 8
    .line 9
    if-ltz v1, :cond_54

    .line 10
    .line 11
    invoke-virtual {v3}, Lq96;->b()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ge v1, v4, :cond_54

    .line 16
    .line 17
    iget-boolean v4, v3, Lq96;->g:Z

    .line 18
    .line 19
    const/16 v5, 0x20

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    if-eqz v4, :cond_5

    .line 24
    .line 25
    iget-object v4, v0, Landroidx/recyclerview/widget/k;->b:Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz v4, :cond_4

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    move v9, v8

    .line 37
    :goto_0
    if-ge v9, v4, :cond_2

    .line 38
    .line 39
    iget-object v10, v0, Landroidx/recyclerview/widget/k;->b:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    check-cast v10, Landroidx/recyclerview/widget/l;

    .line 46
    .line 47
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->q()Z

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    if-nez v11, :cond_1

    .line 52
    .line 53
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->c()I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-ne v11, v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {v10, v5}, Landroidx/recyclerview/widget/l;->a(I)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 67
    .line 68
    iget-boolean v9, v9, Landroidx/recyclerview/widget/f;->b:Z

    .line 69
    .line 70
    if-eqz v9, :cond_4

    .line 71
    .line 72
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->j0:Ld7;

    .line 73
    .line 74
    invoke-virtual {v9, v1, v8}, Ld7;->t(II)I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-lez v9, :cond_4

    .line 79
    .line 80
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 81
    .line 82
    invoke-virtual {v10}, Landroidx/recyclerview/widget/f;->a()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-ge v9, v10, :cond_4

    .line 87
    .line 88
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 89
    .line 90
    invoke-virtual {v10, v9}, Landroidx/recyclerview/widget/f;->b(I)J

    .line 91
    .line 92
    .line 93
    move-result-wide v9

    .line 94
    move v11, v8

    .line 95
    :goto_1
    if-ge v11, v4, :cond_4

    .line 96
    .line 97
    iget-object v12, v0, Landroidx/recyclerview/widget/k;->b:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    check-cast v12, Landroidx/recyclerview/widget/l;

    .line 104
    .line 105
    invoke-virtual {v12}, Landroidx/recyclerview/widget/l;->q()Z

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    if-nez v13, :cond_3

    .line 110
    .line 111
    iget-wide v13, v12, Landroidx/recyclerview/widget/l;->e:J

    .line 112
    .line 113
    cmp-long v13, v13, v9

    .line 114
    .line 115
    if-nez v13, :cond_3

    .line 116
    .line 117
    invoke-virtual {v12, v5}, Landroidx/recyclerview/widget/l;->a(I)V

    .line 118
    .line 119
    .line 120
    move-object v10, v12

    .line 121
    goto :goto_3

    .line 122
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    :goto_2
    move-object v10, v6

    .line 126
    :goto_3
    if-eqz v10, :cond_6

    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    goto :goto_4

    .line 130
    :cond_5
    move-object v10, v6

    .line 131
    :cond_6
    move v4, v8

    .line 132
    :goto_4
    iget-object v9, v0, Landroidx/recyclerview/widget/k;->a:Ljava/util/ArrayList;

    .line 133
    .line 134
    iget-object v11, v0, Landroidx/recyclerview/widget/k;->c:Ljava/util/ArrayList;

    .line 135
    .line 136
    if-nez v10, :cond_1d

    .line 137
    .line 138
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    move v12, v8

    .line 143
    :goto_5
    if-ge v12, v10, :cond_9

    .line 144
    .line 145
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    check-cast v13, Landroidx/recyclerview/widget/l;

    .line 150
    .line 151
    invoke-virtual {v13}, Landroidx/recyclerview/widget/l;->q()Z

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-nez v14, :cond_8

    .line 156
    .line 157
    invoke-virtual {v13}, Landroidx/recyclerview/widget/l;->c()I

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    if-ne v14, v1, :cond_8

    .line 162
    .line 163
    invoke-virtual {v13}, Landroidx/recyclerview/widget/l;->g()Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-nez v14, :cond_8

    .line 168
    .line 169
    iget-boolean v14, v3, Lq96;->g:Z

    .line 170
    .line 171
    if-nez v14, :cond_7

    .line 172
    .line 173
    invoke-virtual {v13}, Landroidx/recyclerview/widget/l;->i()Z

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-nez v14, :cond_8

    .line 178
    .line 179
    :cond_7
    invoke-virtual {v13, v5}, Landroidx/recyclerview/widget/l;->a(I)V

    .line 180
    .line 181
    .line 182
    move-object v10, v13

    .line 183
    const/16 v16, 0x1

    .line 184
    .line 185
    goto/16 :goto_9

    .line 186
    .line 187
    :cond_8
    add-int/lit8 v12, v12, 0x1

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_9
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->k0:Llr0;

    .line 191
    .line 192
    iget-object v10, v10, Llr0;->c:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    move v13, v8

    .line 199
    :goto_6
    if-ge v13, v12, :cond_b

    .line 200
    .line 201
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    check-cast v14, Landroid/view/View;

    .line 206
    .line 207
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    const/16 v16, 0x1

    .line 212
    .line 213
    invoke-virtual {v15}, Landroidx/recyclerview/widget/l;->c()I

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-ne v7, v1, :cond_a

    .line 218
    .line 219
    invoke-virtual {v15}, Landroidx/recyclerview/widget/l;->g()Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-nez v7, :cond_a

    .line 224
    .line 225
    invoke-virtual {v15}, Landroidx/recyclerview/widget/l;->i()Z

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    if-nez v7, :cond_a

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_b
    const/16 v16, 0x1

    .line 236
    .line 237
    move-object v14, v6

    .line 238
    :goto_7
    if-eqz v14, :cond_f

    .line 239
    .line 240
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->k0:Llr0;

    .line 245
    .line 246
    iget-object v12, v10, Llr0;->b:Lkr0;

    .line 247
    .line 248
    iget-object v13, v10, Llr0;->a:Lw86;

    .line 249
    .line 250
    iget-object v13, v13, Lw86;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 251
    .line 252
    invoke-virtual {v13, v14}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    if-ltz v13, :cond_e

    .line 257
    .line 258
    invoke-virtual {v12, v13}, Lkr0;->d(I)Z

    .line 259
    .line 260
    .line 261
    move-result v15

    .line 262
    if-eqz v15, :cond_d

    .line 263
    .line 264
    invoke-virtual {v12, v13}, Lkr0;->a(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v10, v14}, Llr0;->l(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->k0:Llr0;

    .line 271
    .line 272
    invoke-virtual {v10, v14}, Llr0;->j(Landroid/view/View;)I

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    const/4 v12, -0x1

    .line 277
    if-eq v10, v12, :cond_c

    .line 278
    .line 279
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->k0:Llr0;

    .line 280
    .line 281
    invoke-virtual {v12, v10}, Llr0;->c(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/k;->k(Landroid/view/View;)V

    .line 285
    .line 286
    .line 287
    const/16 v10, 0x2020

    .line 288
    .line 289
    invoke-virtual {v7, v10}, Landroidx/recyclerview/widget/l;->a(I)V

    .line 290
    .line 291
    .line 292
    move-object v10, v7

    .line 293
    goto :goto_9

    .line 294
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    const-string v1, "layout index should not be -1 after unhiding a view:"

    .line 297
    .line 298
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-static {v0, v1}, Lio/sentry/c2;->l(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    return-object v6

    .line 312
    :cond_d
    new-instance v0, Ljava/lang/RuntimeException;

    .line 313
    .line 314
    new-instance v1, Ljava/lang/StringBuilder;

    .line 315
    .line 316
    const-string v2, "trying to unhide a view that was not hidden"

    .line 317
    .line 318
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v0

    .line 332
    :cond_e
    const-string v0, "view is not a child, cannot hide "

    .line 333
    .line 334
    invoke-static {v14, v0}, Lu52;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    return-object v6

    .line 338
    :cond_f
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    move v10, v8

    .line 343
    :goto_8
    if-ge v10, v7, :cond_12

    .line 344
    .line 345
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v12

    .line 349
    check-cast v12, Landroidx/recyclerview/widget/l;

    .line 350
    .line 351
    invoke-virtual {v12}, Landroidx/recyclerview/widget/l;->g()Z

    .line 352
    .line 353
    .line 354
    move-result v13

    .line 355
    if-nez v13, :cond_11

    .line 356
    .line 357
    invoke-virtual {v12}, Landroidx/recyclerview/widget/l;->c()I

    .line 358
    .line 359
    .line 360
    move-result v13

    .line 361
    if-ne v13, v1, :cond_11

    .line 362
    .line 363
    invoke-virtual {v12}, Landroidx/recyclerview/widget/l;->e()Z

    .line 364
    .line 365
    .line 366
    move-result v13

    .line 367
    if-nez v13, :cond_11

    .line 368
    .line 369
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->G1:Z

    .line 373
    .line 374
    if-eqz v7, :cond_10

    .line 375
    .line 376
    invoke-virtual {v12}, Landroidx/recyclerview/widget/l;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    :cond_10
    move-object v10, v12

    .line 380
    goto :goto_9

    .line 381
    :cond_11
    add-int/lit8 v10, v10, 0x1

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_12
    move-object v10, v6

    .line 385
    :goto_9
    if-eqz v10, :cond_1e

    .line 386
    .line 387
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->i()Z

    .line 388
    .line 389
    .line 390
    move-result v7

    .line 391
    if-eqz v7, :cond_15

    .line 392
    .line 393
    sget-boolean v7, Landroidx/recyclerview/widget/RecyclerView;->F1:Z

    .line 394
    .line 395
    if-eqz v7, :cond_14

    .line 396
    .line 397
    iget-boolean v7, v3, Lq96;->g:Z

    .line 398
    .line 399
    if-eqz v7, :cond_13

    .line 400
    .line 401
    goto :goto_a

    .line 402
    :cond_13
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    const-string v1, "should not receive a removed view unless it is pre layout"

    .line 407
    .line 408
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    return-object v6

    .line 416
    :cond_14
    :goto_a
    iget-boolean v7, v3, Lq96;->g:Z

    .line 417
    .line 418
    goto :goto_b

    .line 419
    :cond_15
    iget v7, v10, Landroidx/recyclerview/widget/l;->c:I

    .line 420
    .line 421
    if-ltz v7, :cond_1c

    .line 422
    .line 423
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 424
    .line 425
    invoke-virtual {v12}, Landroidx/recyclerview/widget/f;->a()I

    .line 426
    .line 427
    .line 428
    move-result v12

    .line 429
    if-ge v7, v12, :cond_1c

    .line 430
    .line 431
    iget-boolean v7, v3, Lq96;->g:Z

    .line 432
    .line 433
    if-nez v7, :cond_17

    .line 434
    .line 435
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 436
    .line 437
    iget v12, v10, Landroidx/recyclerview/widget/l;->c:I

    .line 438
    .line 439
    invoke-virtual {v7, v12}, Landroidx/recyclerview/widget/f;->c(I)I

    .line 440
    .line 441
    .line 442
    move-result v7

    .line 443
    iget v12, v10, Landroidx/recyclerview/widget/l;->f:I

    .line 444
    .line 445
    if-eq v7, v12, :cond_17

    .line 446
    .line 447
    :cond_16
    move v7, v8

    .line 448
    goto :goto_b

    .line 449
    :cond_17
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 450
    .line 451
    iget-boolean v12, v7, Landroidx/recyclerview/widget/f;->b:Z

    .line 452
    .line 453
    if-eqz v12, :cond_18

    .line 454
    .line 455
    iget-wide v12, v10, Landroidx/recyclerview/widget/l;->e:J

    .line 456
    .line 457
    iget v14, v10, Landroidx/recyclerview/widget/l;->c:I

    .line 458
    .line 459
    invoke-virtual {v7, v14}, Landroidx/recyclerview/widget/f;->b(I)J

    .line 460
    .line 461
    .line 462
    move-result-wide v14

    .line 463
    cmp-long v7, v12, v14

    .line 464
    .line 465
    if-nez v7, :cond_16

    .line 466
    .line 467
    :cond_18
    move/from16 v7, v16

    .line 468
    .line 469
    :goto_b
    if-nez v7, :cond_1b

    .line 470
    .line 471
    const/4 v7, 0x4

    .line 472
    invoke-virtual {v10, v7}, Landroidx/recyclerview/widget/l;->a(I)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->j()Z

    .line 476
    .line 477
    .line 478
    move-result v7

    .line 479
    if-eqz v7, :cond_19

    .line 480
    .line 481
    iget-object v7, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 482
    .line 483
    invoke-virtual {v2, v7, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 484
    .line 485
    .line 486
    iget-object v7, v10, Landroidx/recyclerview/widget/l;->n:Landroidx/recyclerview/widget/k;

    .line 487
    .line 488
    invoke-virtual {v7, v10}, Landroidx/recyclerview/widget/k;->m(Landroidx/recyclerview/widget/l;)V

    .line 489
    .line 490
    .line 491
    goto :goto_c

    .line 492
    :cond_19
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->q()Z

    .line 493
    .line 494
    .line 495
    move-result v7

    .line 496
    if-eqz v7, :cond_1a

    .line 497
    .line 498
    iget v7, v10, Landroidx/recyclerview/widget/l;->j:I

    .line 499
    .line 500
    and-int/lit8 v7, v7, -0x21

    .line 501
    .line 502
    iput v7, v10, Landroidx/recyclerview/widget/l;->j:I

    .line 503
    .line 504
    :cond_1a
    :goto_c
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/k;->j(Landroidx/recyclerview/widget/l;)V

    .line 505
    .line 506
    .line 507
    move-object v10, v6

    .line 508
    goto :goto_d

    .line 509
    :cond_1b
    move/from16 v4, v16

    .line 510
    .line 511
    goto :goto_d

    .line 512
    :cond_1c
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 513
    .line 514
    new-instance v1, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    .line 517
    .line 518
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    throw v0

    .line 539
    :cond_1d
    const/16 v16, 0x1

    .line 540
    .line 541
    :cond_1e
    :goto_d
    const-wide/16 v17, 0x0

    .line 542
    .line 543
    const-wide v19, 0x7fffffffffffffffL

    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    if-nez v10, :cond_32

    .line 549
    .line 550
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->j0:Ld7;

    .line 551
    .line 552
    invoke-virtual {v7, v1, v8}, Ld7;->t(II)I

    .line 553
    .line 554
    .line 555
    move-result v7

    .line 556
    if-ltz v7, :cond_31

    .line 557
    .line 558
    const-wide/16 v21, 0x3

    .line 559
    .line 560
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/recyclerview/widget/f;->a()I

    .line 563
    .line 564
    .line 565
    move-result v12

    .line 566
    if-ge v7, v12, :cond_31

    .line 567
    .line 568
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 569
    .line 570
    invoke-virtual {v12, v7}, Landroidx/recyclerview/widget/f;->c(I)I

    .line 571
    .line 572
    .line 573
    move-result v12

    .line 574
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 575
    .line 576
    const-wide/16 v23, 0x4

    .line 577
    .line 578
    iget-boolean v14, v13, Landroidx/recyclerview/widget/f;->b:Z

    .line 579
    .line 580
    if-eqz v14, :cond_26

    .line 581
    .line 582
    invoke-virtual {v13, v7}, Landroidx/recyclerview/widget/f;->b(I)J

    .line 583
    .line 584
    .line 585
    move-result-wide v13

    .line 586
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 587
    .line 588
    .line 589
    move-result v10

    .line 590
    add-int/lit8 v10, v10, -0x1

    .line 591
    .line 592
    :goto_e
    if-ltz v10, :cond_22

    .line 593
    .line 594
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v15

    .line 598
    check-cast v15, Landroidx/recyclerview/widget/l;

    .line 599
    .line 600
    move/from16 v26, v7

    .line 601
    .line 602
    iget-wide v6, v15, Landroidx/recyclerview/widget/l;->e:J

    .line 603
    .line 604
    iget-object v8, v15, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 605
    .line 606
    cmp-long v6, v6, v13

    .line 607
    .line 608
    if-nez v6, :cond_21

    .line 609
    .line 610
    invoke-virtual {v15}, Landroidx/recyclerview/widget/l;->q()Z

    .line 611
    .line 612
    .line 613
    move-result v6

    .line 614
    if-nez v6, :cond_21

    .line 615
    .line 616
    iget v6, v15, Landroidx/recyclerview/widget/l;->f:I

    .line 617
    .line 618
    if-ne v12, v6, :cond_20

    .line 619
    .line 620
    invoke-virtual {v15, v5}, Landroidx/recyclerview/widget/l;->a(I)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v15}, Landroidx/recyclerview/widget/l;->i()Z

    .line 624
    .line 625
    .line 626
    move-result v5

    .line 627
    if-eqz v5, :cond_1f

    .line 628
    .line 629
    iget-boolean v5, v3, Lq96;->g:Z

    .line 630
    .line 631
    if-nez v5, :cond_1f

    .line 632
    .line 633
    iget v5, v15, Landroidx/recyclerview/widget/l;->j:I

    .line 634
    .line 635
    and-int/lit8 v5, v5, -0xf

    .line 636
    .line 637
    or-int/lit8 v5, v5, 0x2

    .line 638
    .line 639
    iput v5, v15, Landroidx/recyclerview/widget/l;->j:I

    .line 640
    .line 641
    :cond_1f
    move-object v10, v15

    .line 642
    goto :goto_10

    .line 643
    :cond_20
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    const/4 v6, 0x0

    .line 647
    invoke-virtual {v2, v8, v6}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 648
    .line 649
    .line 650
    invoke-static {v8}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)Landroidx/recyclerview/widget/l;

    .line 651
    .line 652
    .line 653
    move-result-object v7

    .line 654
    const/4 v8, 0x0

    .line 655
    iput-object v8, v7, Landroidx/recyclerview/widget/l;->n:Landroidx/recyclerview/widget/k;

    .line 656
    .line 657
    iput-boolean v6, v7, Landroidx/recyclerview/widget/l;->o:Z

    .line 658
    .line 659
    iget v6, v7, Landroidx/recyclerview/widget/l;->j:I

    .line 660
    .line 661
    and-int/lit8 v6, v6, -0x21

    .line 662
    .line 663
    iput v6, v7, Landroidx/recyclerview/widget/l;->j:I

    .line 664
    .line 665
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/k;->j(Landroidx/recyclerview/widget/l;)V

    .line 666
    .line 667
    .line 668
    :cond_21
    add-int/lit8 v10, v10, -0x1

    .line 669
    .line 670
    move/from16 v7, v26

    .line 671
    .line 672
    const/4 v6, 0x0

    .line 673
    const/4 v8, 0x0

    .line 674
    goto :goto_e

    .line 675
    :cond_22
    move/from16 v26, v7

    .line 676
    .line 677
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 678
    .line 679
    .line 680
    move-result v5

    .line 681
    add-int/lit8 v5, v5, -0x1

    .line 682
    .line 683
    :goto_f
    if-ltz v5, :cond_24

    .line 684
    .line 685
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v6

    .line 689
    check-cast v6, Landroidx/recyclerview/widget/l;

    .line 690
    .line 691
    iget-wide v7, v6, Landroidx/recyclerview/widget/l;->e:J

    .line 692
    .line 693
    cmp-long v7, v7, v13

    .line 694
    .line 695
    if-nez v7, :cond_25

    .line 696
    .line 697
    invoke-virtual {v6}, Landroidx/recyclerview/widget/l;->e()Z

    .line 698
    .line 699
    .line 700
    move-result v7

    .line 701
    if-nez v7, :cond_25

    .line 702
    .line 703
    iget v7, v6, Landroidx/recyclerview/widget/l;->f:I

    .line 704
    .line 705
    if-ne v12, v7, :cond_23

    .line 706
    .line 707
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-object v10, v6

    .line 711
    goto :goto_10

    .line 712
    :cond_23
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/k;->h(I)V

    .line 713
    .line 714
    .line 715
    :cond_24
    const/4 v10, 0x0

    .line 716
    goto :goto_10

    .line 717
    :cond_25
    add-int/lit8 v5, v5, -0x1

    .line 718
    .line 719
    goto :goto_f

    .line 720
    :goto_10
    if-eqz v10, :cond_26

    .line 721
    .line 722
    move/from16 v5, v26

    .line 723
    .line 724
    iput v5, v10, Landroidx/recyclerview/widget/l;->c:I

    .line 725
    .line 726
    move/from16 v4, v16

    .line 727
    .line 728
    :cond_26
    if-nez v10, :cond_2a

    .line 729
    .line 730
    sget-boolean v5, Landroidx/recyclerview/widget/RecyclerView;->F1:Z

    .line 731
    .line 732
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->c()Lk96;

    .line 733
    .line 734
    .line 735
    move-result-object v5

    .line 736
    iget-object v5, v5, Lk96;->a:Landroid/util/SparseArray;

    .line 737
    .line 738
    invoke-virtual {v5, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v5

    .line 742
    check-cast v5, Lj96;

    .line 743
    .line 744
    if-eqz v5, :cond_28

    .line 745
    .line 746
    iget-object v5, v5, Lj96;->a:Ljava/util/ArrayList;

    .line 747
    .line 748
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 749
    .line 750
    .line 751
    move-result v6

    .line 752
    if-nez v6, :cond_28

    .line 753
    .line 754
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 755
    .line 756
    .line 757
    move-result v6

    .line 758
    add-int/lit8 v6, v6, -0x1

    .line 759
    .line 760
    :goto_11
    if-ltz v6, :cond_28

    .line 761
    .line 762
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v7

    .line 766
    check-cast v7, Landroidx/recyclerview/widget/l;

    .line 767
    .line 768
    invoke-virtual {v7}, Landroidx/recyclerview/widget/l;->e()Z

    .line 769
    .line 770
    .line 771
    move-result v7

    .line 772
    if-nez v7, :cond_27

    .line 773
    .line 774
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    check-cast v5, Landroidx/recyclerview/widget/l;

    .line 779
    .line 780
    goto :goto_12

    .line 781
    :cond_27
    add-int/lit8 v6, v6, -0x1

    .line 782
    .line 783
    goto :goto_11

    .line 784
    :cond_28
    const/4 v5, 0x0

    .line 785
    :goto_12
    if-eqz v5, :cond_29

    .line 786
    .line 787
    invoke-virtual {v5}, Landroidx/recyclerview/widget/l;->n()V

    .line 788
    .line 789
    .line 790
    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->F1:Z

    .line 791
    .line 792
    :cond_29
    move-object v10, v5

    .line 793
    :cond_2a
    if-nez v10, :cond_33

    .line 794
    .line 795
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 796
    .line 797
    .line 798
    move-result-wide v5

    .line 799
    cmp-long v7, p2, v19

    .line 800
    .line 801
    if-eqz v7, :cond_2c

    .line 802
    .line 803
    iget-object v7, v0, Landroidx/recyclerview/widget/k;->g:Lk96;

    .line 804
    .line 805
    invoke-virtual {v7, v12}, Lk96;->a(I)Lj96;

    .line 806
    .line 807
    .line 808
    move-result-object v7

    .line 809
    iget-wide v7, v7, Lj96;->b:J

    .line 810
    .line 811
    cmp-long v9, v7, v17

    .line 812
    .line 813
    if-eqz v9, :cond_2c

    .line 814
    .line 815
    add-long/2addr v7, v5

    .line 816
    cmp-long v7, v7, p2

    .line 817
    .line 818
    if-gez v7, :cond_2b

    .line 819
    .line 820
    goto :goto_13

    .line 821
    :cond_2b
    const/16 v25, 0x0

    .line 822
    .line 823
    return-object v25

    .line 824
    :cond_2c
    :goto_13
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 825
    .line 826
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 827
    .line 828
    .line 829
    :try_start_0
    invoke-static {}, Lwc8;->a()Z

    .line 830
    .line 831
    .line 832
    move-result v8

    .line 833
    if-eqz v8, :cond_2d

    .line 834
    .line 835
    const-string v8, "RV onCreateViewHolder type=0x%X"

    .line 836
    .line 837
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 838
    .line 839
    .line 840
    move-result-object v9

    .line 841
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v9

    .line 845
    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v8

    .line 849
    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    :cond_2d
    invoke-virtual {v7, v2, v12}, Landroidx/recyclerview/widget/f;->g(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/l;

    .line 853
    .line 854
    .line 855
    move-result-object v10

    .line 856
    iget-object v7, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 857
    .line 858
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 859
    .line 860
    .line 861
    move-result-object v8

    .line 862
    if-nez v8, :cond_30

    .line 863
    .line 864
    iput v12, v10, Landroidx/recyclerview/widget/l;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 865
    .line 866
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 867
    .line 868
    .line 869
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->K1:Z

    .line 870
    .line 871
    if-eqz v8, :cond_2e

    .line 872
    .line 873
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->H(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 874
    .line 875
    .line 876
    move-result-object v7

    .line 877
    if-eqz v7, :cond_2e

    .line 878
    .line 879
    new-instance v8, Ljava/lang/ref/WeakReference;

    .line 880
    .line 881
    invoke-direct {v8, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 882
    .line 883
    .line 884
    iput-object v8, v10, Landroidx/recyclerview/widget/l;->b:Ljava/lang/ref/WeakReference;

    .line 885
    .line 886
    :cond_2e
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 887
    .line 888
    .line 889
    move-result-wide v7

    .line 890
    iget-object v9, v0, Landroidx/recyclerview/widget/k;->g:Lk96;

    .line 891
    .line 892
    sub-long/2addr v7, v5

    .line 893
    invoke-virtual {v9, v12}, Lk96;->a(I)Lj96;

    .line 894
    .line 895
    .line 896
    move-result-object v5

    .line 897
    iget-wide v11, v5, Lj96;->b:J

    .line 898
    .line 899
    cmp-long v6, v11, v17

    .line 900
    .line 901
    if-nez v6, :cond_2f

    .line 902
    .line 903
    goto :goto_14

    .line 904
    :cond_2f
    div-long v11, v11, v23

    .line 905
    .line 906
    mul-long v11, v11, v21

    .line 907
    .line 908
    div-long v7, v7, v23

    .line 909
    .line 910
    add-long/2addr v7, v11

    .line 911
    :goto_14
    iput-wide v7, v5, Lj96;->b:J

    .line 912
    .line 913
    goto :goto_15

    .line 914
    :cond_30
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 915
    .line 916
    const-string v1, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 917
    .line 918
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 919
    .line 920
    .line 921
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 922
    :catchall_0
    move-exception v0

    .line 923
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 924
    .line 925
    .line 926
    throw v0

    .line 927
    :cond_31
    move v5, v7

    .line 928
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 929
    .line 930
    const-string v4, "(offset:"

    .line 931
    .line 932
    const-string v6, ").state:"

    .line 933
    .line 934
    const-string v7, "Inconsistency detected. Invalid item position "

    .line 935
    .line 936
    invoke-static {v1, v7, v5, v4, v6}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    invoke-virtual {v3}, Lq96;->b()I

    .line 941
    .line 942
    .line 943
    move-result v3

    .line 944
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 945
    .line 946
    .line 947
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 952
    .line 953
    .line 954
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    throw v0

    .line 962
    :cond_32
    const-wide/16 v21, 0x3

    .line 963
    .line 964
    const-wide/16 v23, 0x4

    .line 965
    .line 966
    :cond_33
    :goto_15
    iget-object v5, v10, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 967
    .line 968
    if-eqz v4, :cond_34

    .line 969
    .line 970
    iget-boolean v6, v3, Lq96;->g:Z

    .line 971
    .line 972
    if-nez v6, :cond_34

    .line 973
    .line 974
    iget v6, v10, Landroidx/recyclerview/widget/l;->j:I

    .line 975
    .line 976
    and-int/lit16 v7, v6, 0x2000

    .line 977
    .line 978
    if-eqz v7, :cond_34

    .line 979
    .line 980
    and-int/lit16 v6, v6, -0x2001

    .line 981
    .line 982
    iput v6, v10, Landroidx/recyclerview/widget/l;->j:I

    .line 983
    .line 984
    iget-boolean v6, v3, Lq96;->j:Z

    .line 985
    .line 986
    if-eqz v6, :cond_34

    .line 987
    .line 988
    invoke-static {v10}, Ld96;->b(Landroidx/recyclerview/widget/l;)V

    .line 989
    .line 990
    .line 991
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->S0:Ld96;

    .line 992
    .line 993
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->d()Ljava/util/List;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 997
    .line 998
    .line 999
    new-instance v6, Lrb0;

    .line 1000
    .line 1001
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v6, v10}, Lrb0;->a(Landroidx/recyclerview/widget/l;)V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v2, v10, v6}, Landroidx/recyclerview/widget/RecyclerView;->b0(Landroidx/recyclerview/widget/l;Lrb0;)V

    .line 1008
    .line 1009
    .line 1010
    :cond_34
    iget-boolean v6, v3, Lq96;->g:Z

    .line 1011
    .line 1012
    if-eqz v6, :cond_35

    .line 1013
    .line 1014
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->f()Z

    .line 1015
    .line 1016
    .line 1017
    move-result v6

    .line 1018
    if-eqz v6, :cond_35

    .line 1019
    .line 1020
    iput v1, v10, Landroidx/recyclerview/widget/l;->g:I

    .line 1021
    .line 1022
    goto :goto_16

    .line 1023
    :cond_35
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->f()Z

    .line 1024
    .line 1025
    .line 1026
    move-result v6

    .line 1027
    if-eqz v6, :cond_38

    .line 1028
    .line 1029
    iget v6, v10, Landroidx/recyclerview/widget/l;->j:I

    .line 1030
    .line 1031
    and-int/lit8 v6, v6, 0x2

    .line 1032
    .line 1033
    if-eqz v6, :cond_36

    .line 1034
    .line 1035
    goto :goto_17

    .line 1036
    :cond_36
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->g()Z

    .line 1037
    .line 1038
    .line 1039
    move-result v6

    .line 1040
    if-eqz v6, :cond_37

    .line 1041
    .line 1042
    goto :goto_17

    .line 1043
    :cond_37
    :goto_16
    move/from16 v9, v16

    .line 1044
    .line 1045
    const/4 v6, 0x0

    .line 1046
    const/4 v7, 0x0

    .line 1047
    goto/16 :goto_21

    .line 1048
    .line 1049
    :cond_38
    :goto_17
    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->F1:Z

    .line 1050
    .line 1051
    if-eqz v6, :cond_39

    .line 1052
    .line 1053
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->i()Z

    .line 1054
    .line 1055
    .line 1056
    move-result v6

    .line 1057
    if-nez v6, :cond_3a

    .line 1058
    .line 1059
    :cond_39
    const/4 v8, 0x0

    .line 1060
    goto :goto_18

    .line 1061
    :cond_3a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1062
    .line 1063
    const-string v1, "Removed holder should be bound and it should come here only in pre-layout. Holder: "

    .line 1064
    .line 1065
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v1

    .line 1075
    invoke-static {v0, v1}, Lio/sentry/c2;->l(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 1076
    .line 1077
    .line 1078
    const/4 v8, 0x0

    .line 1079
    return-object v8

    .line 1080
    :goto_18
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->j0:Ld7;

    .line 1081
    .line 1082
    const/4 v7, 0x0

    .line 1083
    invoke-virtual {v6, v1, v7}, Ld7;->t(II)I

    .line 1084
    .line 1085
    .line 1086
    move-result v6

    .line 1087
    iput-object v8, v10, Landroidx/recyclerview/widget/l;->s:Landroidx/recyclerview/widget/f;

    .line 1088
    .line 1089
    iput-object v2, v10, Landroidx/recyclerview/widget/l;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 1090
    .line 1091
    iget v8, v10, Landroidx/recyclerview/widget/l;->f:I

    .line 1092
    .line 1093
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1094
    .line 1095
    .line 1096
    move-result-wide v11

    .line 1097
    cmp-long v9, p2, v19

    .line 1098
    .line 1099
    if-eqz v9, :cond_3c

    .line 1100
    .line 1101
    iget-object v9, v0, Landroidx/recyclerview/widget/k;->g:Lk96;

    .line 1102
    .line 1103
    invoke-virtual {v9, v8}, Lk96;->a(I)Lj96;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v8

    .line 1107
    iget-wide v8, v8, Lj96;->c:J

    .line 1108
    .line 1109
    cmp-long v13, v8, v17

    .line 1110
    .line 1111
    if-eqz v13, :cond_3c

    .line 1112
    .line 1113
    add-long/2addr v8, v11

    .line 1114
    cmp-long v8, v8, p2

    .line 1115
    .line 1116
    if-gez v8, :cond_3b

    .line 1117
    .line 1118
    goto :goto_19

    .line 1119
    :cond_3b
    move v6, v7

    .line 1120
    move/from16 v9, v16

    .line 1121
    .line 1122
    goto/16 :goto_21

    .line 1123
    .line 1124
    :cond_3c
    :goto_19
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->k()Z

    .line 1125
    .line 1126
    .line 1127
    move-result v8

    .line 1128
    if-eqz v8, :cond_3d

    .line 1129
    .line 1130
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1131
    .line 1132
    .line 1133
    move-result v8

    .line 1134
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v9

    .line 1138
    invoke-static {v2, v5, v8, v9}, Landroidx/recyclerview/widget/RecyclerView;->e(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1139
    .line 1140
    .line 1141
    move/from16 v8, v16

    .line 1142
    .line 1143
    goto :goto_1a

    .line 1144
    :cond_3d
    move v8, v7

    .line 1145
    :goto_1a
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->r0:Landroidx/recyclerview/widget/f;

    .line 1146
    .line 1147
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    iget-object v13, v10, Landroidx/recyclerview/widget/l;->s:Landroidx/recyclerview/widget/f;

    .line 1151
    .line 1152
    if-nez v13, :cond_3e

    .line 1153
    .line 1154
    move/from16 v13, v16

    .line 1155
    .line 1156
    goto :goto_1b

    .line 1157
    :cond_3e
    move v13, v7

    .line 1158
    :goto_1b
    if-eqz v13, :cond_40

    .line 1159
    .line 1160
    iput v6, v10, Landroidx/recyclerview/widget/l;->c:I

    .line 1161
    .line 1162
    iget-boolean v14, v9, Landroidx/recyclerview/widget/f;->b:Z

    .line 1163
    .line 1164
    if-eqz v14, :cond_3f

    .line 1165
    .line 1166
    invoke-virtual {v9, v6}, Landroidx/recyclerview/widget/f;->b(I)J

    .line 1167
    .line 1168
    .line 1169
    move-result-wide v14

    .line 1170
    iput-wide v14, v10, Landroidx/recyclerview/widget/l;->e:J

    .line 1171
    .line 1172
    :cond_3f
    iget v14, v10, Landroidx/recyclerview/widget/l;->j:I

    .line 1173
    .line 1174
    and-int/lit16 v14, v14, -0x208

    .line 1175
    .line 1176
    or-int/lit8 v14, v14, 0x1

    .line 1177
    .line 1178
    iput v14, v10, Landroidx/recyclerview/widget/l;->j:I

    .line 1179
    .line 1180
    invoke-static {}, Lwc8;->a()Z

    .line 1181
    .line 1182
    .line 1183
    move-result v14

    .line 1184
    if-eqz v14, :cond_40

    .line 1185
    .line 1186
    iget v14, v10, Landroidx/recyclerview/widget/l;->f:I

    .line 1187
    .line 1188
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v14

    .line 1192
    filled-new-array {v14}, [Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v14

    .line 1196
    const-string v15, "RV onBindViewHolder type=0x%X"

    .line 1197
    .line 1198
    invoke-static {v15, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v14

    .line 1202
    invoke-static {v14}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1203
    .line 1204
    .line 1205
    :cond_40
    iput-object v9, v10, Landroidx/recyclerview/widget/l;->s:Landroidx/recyclerview/widget/f;

    .line 1206
    .line 1207
    sget-boolean v14, Landroidx/recyclerview/widget/RecyclerView;->F1:Z

    .line 1208
    .line 1209
    if-eqz v14, :cond_43

    .line 1210
    .line 1211
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v14

    .line 1215
    if-nez v14, :cond_42

    .line 1216
    .line 1217
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1218
    .line 1219
    .line 1220
    move-result v14

    .line 1221
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->k()Z

    .line 1222
    .line 1223
    .line 1224
    move-result v15

    .line 1225
    if-ne v14, v15, :cond_41

    .line 1226
    .line 1227
    goto :goto_1c

    .line 1228
    :cond_41
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1229
    .line 1230
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->k()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v1

    .line 1234
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v2

    .line 1238
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1239
    .line 1240
    const-string v4, "Temp-detached state out of sync with reality. holder.isTmpDetached(): "

    .line 1241
    .line 1242
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1246
    .line 1247
    .line 1248
    const-string v1, ", attached to window: "

    .line 1249
    .line 1250
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1254
    .line 1255
    .line 1256
    const-string v1, ", holder: "

    .line 1257
    .line 1258
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v1

    .line 1268
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1269
    .line 1270
    .line 1271
    throw v0

    .line 1272
    :cond_42
    :goto_1c
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v14

    .line 1276
    if-nez v14, :cond_43

    .line 1277
    .line 1278
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1279
    .line 1280
    .line 1281
    move-result v14

    .line 1282
    if-nez v14, :cond_44

    .line 1283
    .line 1284
    :cond_43
    const/16 v25, 0x0

    .line 1285
    .line 1286
    goto :goto_1d

    .line 1287
    :cond_44
    const-string v0, "Attempting to bind attached holder with no parent (AKA temp detached): "

    .line 1288
    .line 1289
    invoke-static {v10, v0}, Lu52;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1290
    .line 1291
    .line 1292
    const/16 v25, 0x0

    .line 1293
    .line 1294
    return-object v25

    .line 1295
    :goto_1d
    invoke-virtual {v10}, Landroidx/recyclerview/widget/l;->d()Ljava/util/List;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v14

    .line 1299
    invoke-virtual {v9, v10, v6, v14}, Landroidx/recyclerview/widget/f;->f(Landroidx/recyclerview/widget/l;ILjava/util/List;)V

    .line 1300
    .line 1301
    .line 1302
    if-eqz v13, :cond_47

    .line 1303
    .line 1304
    iget-object v6, v10, Landroidx/recyclerview/widget/l;->k:Ljava/util/ArrayList;

    .line 1305
    .line 1306
    if-eqz v6, :cond_45

    .line 1307
    .line 1308
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 1309
    .line 1310
    .line 1311
    :cond_45
    iget v6, v10, Landroidx/recyclerview/widget/l;->j:I

    .line 1312
    .line 1313
    and-int/lit16 v6, v6, -0x401

    .line 1314
    .line 1315
    iput v6, v10, Landroidx/recyclerview/widget/l;->j:I

    .line 1316
    .line 1317
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v6

    .line 1321
    instance-of v9, v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 1322
    .line 1323
    if-eqz v9, :cond_46

    .line 1324
    .line 1325
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 1326
    .line 1327
    move/from16 v9, v16

    .line 1328
    .line 1329
    iput-boolean v9, v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->Z:Z

    .line 1330
    .line 1331
    :cond_46
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1332
    .line 1333
    .line 1334
    :cond_47
    if-eqz v8, :cond_48

    .line 1335
    .line 1336
    invoke-static {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->f(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V

    .line 1337
    .line 1338
    .line 1339
    :cond_48
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1340
    .line 1341
    .line 1342
    move-result-wide v8

    .line 1343
    iget-object v0, v0, Landroidx/recyclerview/widget/k;->g:Lk96;

    .line 1344
    .line 1345
    iget v6, v10, Landroidx/recyclerview/widget/l;->f:I

    .line 1346
    .line 1347
    sub-long/2addr v8, v11

    .line 1348
    invoke-virtual {v0, v6}, Lk96;->a(I)Lj96;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v0

    .line 1352
    iget-wide v11, v0, Lj96;->c:J

    .line 1353
    .line 1354
    cmp-long v6, v11, v17

    .line 1355
    .line 1356
    if-nez v6, :cond_49

    .line 1357
    .line 1358
    goto :goto_1e

    .line 1359
    :cond_49
    div-long v11, v11, v23

    .line 1360
    .line 1361
    mul-long v11, v11, v21

    .line 1362
    .line 1363
    div-long v8, v8, v23

    .line 1364
    .line 1365
    add-long/2addr v8, v11

    .line 1366
    :goto_1e
    iput-wide v8, v0, Lj96;->c:J

    .line 1367
    .line 1368
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->H0:Landroid/view/accessibility/AccessibilityManager;

    .line 1369
    .line 1370
    if-eqz v0, :cond_4f

    .line 1371
    .line 1372
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1373
    .line 1374
    .line 1375
    move-result v0

    .line 1376
    if-eqz v0, :cond_4f

    .line 1377
    .line 1378
    invoke-virtual {v5}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1379
    .line 1380
    .line 1381
    move-result v0

    .line 1382
    const/4 v9, 0x1

    .line 1383
    if-nez v0, :cond_4a

    .line 1384
    .line 1385
    invoke-virtual {v5, v9}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1386
    .line 1387
    .line 1388
    :cond_4a
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->r1:Lv96;

    .line 1389
    .line 1390
    if-nez v0, :cond_4b

    .line 1391
    .line 1392
    goto :goto_20

    .line 1393
    :cond_4b
    iget-object v0, v0, Lv96;->g0:Lu96;

    .line 1394
    .line 1395
    if-eqz v0, :cond_4e

    .line 1396
    .line 1397
    invoke-static {v5}, Lcw8;->e(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v6

    .line 1401
    if-nez v6, :cond_4c

    .line 1402
    .line 1403
    move-object/from16 v6, v25

    .line 1404
    .line 1405
    goto :goto_1f

    .line 1406
    :cond_4c
    instance-of v8, v6, Ls3;

    .line 1407
    .line 1408
    if-eqz v8, :cond_4d

    .line 1409
    .line 1410
    check-cast v6, Ls3;

    .line 1411
    .line 1412
    iget-object v6, v6, Ls3;->a:Lt3;

    .line 1413
    .line 1414
    goto :goto_1f

    .line 1415
    :cond_4d
    new-instance v8, Lt3;

    .line 1416
    .line 1417
    invoke-direct {v8, v6}, Lt3;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1418
    .line 1419
    .line 1420
    move-object v6, v8

    .line 1421
    :goto_1f
    if-eqz v6, :cond_4e

    .line 1422
    .line 1423
    if-eq v6, v0, :cond_4e

    .line 1424
    .line 1425
    iget-object v8, v0, Lu96;->g0:Ljava/util/WeakHashMap;

    .line 1426
    .line 1427
    invoke-virtual {v8, v5, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    :cond_4e
    invoke-static {v5, v0}, Lcw8;->n(Landroid/view/View;Lt3;)V

    .line 1431
    .line 1432
    .line 1433
    goto :goto_20

    .line 1434
    :cond_4f
    const/4 v9, 0x1

    .line 1435
    :goto_20
    iget-boolean v0, v3, Lq96;->g:Z

    .line 1436
    .line 1437
    if-eqz v0, :cond_50

    .line 1438
    .line 1439
    iput v1, v10, Landroidx/recyclerview/widget/l;->g:I

    .line 1440
    .line 1441
    :cond_50
    move v6, v9

    .line 1442
    :goto_21
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v0

    .line 1446
    if-nez v0, :cond_51

    .line 1447
    .line 1448
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v0

    .line 1452
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 1453
    .line 1454
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1455
    .line 1456
    .line 1457
    goto :goto_22

    .line 1458
    :cond_51
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1459
    .line 1460
    .line 1461
    move-result v1

    .line 1462
    if-nez v1, :cond_52

    .line 1463
    .line 1464
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v0

    .line 1468
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 1469
    .line 1470
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1471
    .line 1472
    .line 1473
    goto :goto_22

    .line 1474
    :cond_52
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 1475
    .line 1476
    :goto_22
    iput-object v10, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->X:Landroidx/recyclerview/widget/l;

    .line 1477
    .line 1478
    if-eqz v4, :cond_53

    .line 1479
    .line 1480
    if-eqz v6, :cond_53

    .line 1481
    .line 1482
    move v7, v9

    .line 1483
    :cond_53
    iput-boolean v7, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->f0:Z

    .line 1484
    .line 1485
    return-object v10

    .line 1486
    :cond_54
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 1487
    .line 1488
    const-string v4, "("

    .line 1489
    .line 1490
    const-string v5, "). Item count:"

    .line 1491
    .line 1492
    const-string v6, "Invalid item position "

    .line 1493
    .line 1494
    invoke-static {v1, v6, v1, v4, v5}, Loi0;->r(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v1

    .line 1498
    invoke-virtual {v3}, Lq96;->b()I

    .line 1499
    .line 1500
    .line 1501
    move-result v3

    .line 1502
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1503
    .line 1504
    .line 1505
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->C()Ljava/lang/String;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v2

    .line 1509
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1510
    .line 1511
    .line 1512
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v1

    .line 1516
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1517
    .line 1518
    .line 1519
    throw v0
.end method

.method public final m(Landroidx/recyclerview/widget/l;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Landroidx/recyclerview/widget/l;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/recyclerview/widget/k;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/k;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    iput-object p0, p1, Landroidx/recyclerview/widget/l;->n:Landroidx/recyclerview/widget/k;

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    iput-boolean p0, p1, Landroidx/recyclerview/widget/l;->o:Z

    .line 21
    .line 22
    iget p0, p1, Landroidx/recyclerview/widget/l;->j:I

    .line 23
    .line 24
    and-int/lit8 p0, p0, -0x21

    .line 25
    .line 26
    iput p0, p1, Landroidx/recyclerview/widget/l;->j:I

    .line 27
    .line 28
    return-void
.end method

.method public final n()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->s0:Landroidx/recyclerview/widget/j;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Landroidx/recyclerview/widget/j;->l0:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/k;->e:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Landroidx/recyclerview/widget/k;->f:I

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/recyclerview/widget/k;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_1
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p0, Landroidx/recyclerview/widget/k;->f:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/k;->h(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
.end method
