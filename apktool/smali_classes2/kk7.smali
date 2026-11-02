.class public final Lkk7;
.super Landroidx/recyclerview/widget/f;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final c:Lg94;

.field public final d:Lml2;

.field public final e:Lqi4;

.field public final f:Lqi4;

.field public final g:Lqi4;

.field public h:Lvl2;

.field public final i:Lvk1;

.field public j:Z

.field public k:Z

.field public final l:Ljava/util/List;


# direct methods
.method public constructor <init>(Lj2;Landroidx/fragment/app/FragmentActivity;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object p2, p2, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 9
    .line 10
    invoke-direct {p0}, Landroidx/recyclerview/widget/f;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lqi4;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, v2}, Lqi4;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lkk7;->e:Lqi4;

    .line 20
    .line 21
    new-instance v1, Lqi4;

    .line 22
    .line 23
    invoke-direct {v1, v2}, Lqi4;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lkk7;->f:Lqi4;

    .line 27
    .line 28
    new-instance v1, Lqi4;

    .line 29
    .line 30
    invoke-direct {v1, v2}, Lqi4;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lkk7;->g:Lqi4;

    .line 34
    .line 35
    new-instance v1, Lvk1;

    .line 36
    .line 37
    const/16 v3, 0xb

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-direct {v1, v3, v4}, Lvk1;-><init>(BZ)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v3, v1, Lvk1;->Y:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object v1, p0, Lkk7;->i:Lvk1;

    .line 51
    .line 52
    iput-boolean v4, p0, Lkk7;->j:Z

    .line 53
    .line 54
    iput-boolean v4, p0, Lkk7;->k:Z

    .line 55
    .line 56
    iput-object v0, p0, Lkk7;->d:Lml2;

    .line 57
    .line 58
    iput-object p2, p0, Lkk7;->c:Lg94;

    .line 59
    .line 60
    iget-object p2, p0, Landroidx/recyclerview/widget/f;->a:Ly86;

    .line 61
    .line 62
    invoke-virtual {p2}, Ly86;->a()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-nez p2, :cond_0

    .line 67
    .line 68
    const/4 p2, 0x1

    .line 69
    iput-boolean p2, p0, Landroidx/recyclerview/widget/f;->b:Z

    .line 70
    .line 71
    iput-object p1, p0, Lkk7;->l:Ljava/util/List;

    .line 72
    .line 73
    return-void

    .line 74
    :cond_0
    const-string p0, "Cannot change whether this adapter has stable IDs while the adapter has registered observers."

    .line 75
    .line 76
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v2
.end method

.method public static l(Landroid/view/View;Landroid/widget/FrameLayout;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-gt v0, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-ne v0, p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    const-string p0, "Design assumption violated."

    .line 44
    .line 45
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkk7;->l:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final d(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lkk7;->h:Lvl2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-static {v0}, Lmb6;->n(Z)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lvl2;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lvl2;-><init>(Lkk7;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lkk7;->h:Lvl2;

    .line 19
    .line 20
    invoke-static {p1}, Lvl2;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/viewpager2/widget/ViewPager2;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, v0, Lvl2;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 25
    .line 26
    new-instance v3, Li01;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Li01;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    iput-object v3, v0, Lvl2;->a:Li01;

    .line 32
    .line 33
    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->h0:Li01;

    .line 34
    .line 35
    iget-object p1, p1, Li01;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    new-instance p1, Lul2;

    .line 43
    .line 44
    invoke-direct {p1, v0, v1}, Lul2;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    iput-object p1, v0, Lvl2;->b:Lul2;

    .line 48
    .line 49
    iget-object v1, p0, Landroidx/recyclerview/widget/f;->a:Ly86;

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, Lr86;

    .line 55
    .line 56
    const/4 v1, 0x4

    .line 57
    invoke-direct {p1, v0, v1}, Lr86;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    iput-object p1, v0, Lvl2;->c:Lr86;

    .line 61
    .line 62
    iget-object p0, p0, Lkk7;->c:Lg94;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lg94;->a(Lc94;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final e(Landroidx/recyclerview/widget/l;I)V
    .locals 8

    .line 1
    check-cast p1, Lfm2;

    .line 2
    .line 3
    iget-wide v0, p1, Landroidx/recyclerview/widget/l;->e:J

    .line 4
    .line 5
    iget-object v2, p1, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 6
    .line 7
    check-cast v2, Landroid/widget/FrameLayout;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual {p0, v3}, Lkk7;->o(I)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    iget-object v5, p0, Lkk7;->g:Lqi4;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    cmp-long v6, v6, v0

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    invoke-virtual {p0, v6, v7}, Lkk7;->q(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    invoke-virtual {v5, v6, v7}, Lqi4;->g(J)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v5, v0, v1, v3}, Lqi4;->f(JLjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    int-to-long v0, p2

    .line 51
    iget-object v3, p0, Lkk7;->e:Lqi4;

    .line 52
    .line 53
    invoke-virtual {v3, v0, v1}, Lqi4;->c(J)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-ltz v4, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iget-object v4, p0, Lkk7;->l:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    check-cast p2, Lld6;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v4, Lrk7;

    .line 72
    .line 73
    invoke-direct {v4}, Lrk7;-><init>()V

    .line 74
    .line 75
    .line 76
    new-instance v5, Landroid/os/Bundle;

    .line 77
    .line 78
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 79
    .line 80
    .line 81
    const-string v6, "story"

    .line 82
    .line 83
    invoke-virtual {v5, v6, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v5}, Lqk2;->Q(Landroid/os/Bundle;)V

    .line 87
    .line 88
    .line 89
    iget-object p2, p0, Lkk7;->f:Lqi4;

    .line 90
    .line 91
    invoke-virtual {p2, v0, v1}, Lqi4;->b(J)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Lpk2;

    .line 96
    .line 97
    iget-object v5, v4, Lqk2;->v0:Lml2;

    .line 98
    .line 99
    if-nez v5, :cond_4

    .line 100
    .line 101
    if-eqz p2, :cond_2

    .line 102
    .line 103
    iget-object p2, p2, Lpk2;->X:Landroid/os/Bundle;

    .line 104
    .line 105
    if-eqz p2, :cond_2

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    const/4 p2, 0x0

    .line 109
    :goto_0
    iput-object p2, v4, Lqk2;->Y:Landroid/os/Bundle;

    .line 110
    .line 111
    invoke-virtual {v3, v0, v1, v4}, Lqi4;->f(JLjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :goto_1
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-eqz p2, :cond_3

    .line 119
    .line 120
    invoke-virtual {p0, p1}, Lkk7;->p(Lfm2;)V

    .line 121
    .line 122
    .line 123
    :cond_3
    invoke-virtual {p0}, Lkk7;->n()V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_4
    const-string p0, "Fragment already added"

    .line 128
    .line 129
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final h(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lkk7;->h:Lvl2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lvl2;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/viewpager2/widget/ViewPager2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v1, v0, Lvl2;->a:Li01;

    .line 11
    .line 12
    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->h0:Li01;

    .line 13
    .line 14
    iget-object p1, p1, Li01;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object p1, v0, Lvl2;->f:Lkk7;

    .line 22
    .line 23
    iget-object v1, v0, Lvl2;->b:Lul2;

    .line 24
    .line 25
    iget-object v2, p1, Landroidx/recyclerview/widget/f;->a:Ly86;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Lkk7;->c:Lg94;

    .line 31
    .line 32
    iget-object v1, v0, Lvl2;->c:Lr86;

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lg94;->f(Lc94;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-object p1, v0, Lvl2;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 39
    .line 40
    iput-object p1, p0, Lkk7;->h:Lvl2;

    .line 41
    .line 42
    return-void
.end method

.method public final i(Landroidx/recyclerview/widget/l;)Z
    .locals 0

    .line 1
    check-cast p1, Lfm2;

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0
.end method

.method public final j(Landroidx/recyclerview/widget/l;)V
    .locals 0

    .line 1
    check-cast p1, Lfm2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkk7;->p(Lfm2;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lkk7;->n()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final k(Landroidx/recyclerview/widget/l;)V
    .locals 2

    .line 1
    check-cast p1, Lfm2;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 4
    .line 5
    check-cast p1, Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Lkk7;->o(I)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-virtual {p0, v0, v1}, Lkk7;->q(J)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lkk7;->g:Lqi4;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-virtual {p0, v0, v1}, Lqi4;->g(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final m(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lkk7;->l:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    int-to-long v0, p0

    .line 14
    cmp-long p0, p1, v0

    .line 15
    .line 16
    if-gez p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final n()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lkk7;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget-object v0, p0, Lkk7;->d:Lml2;

    .line 6
    .line 7
    invoke-virtual {v0}, Lml2;->P()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_0
    new-instance v0, Lbu;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Lbu;-><init>(I)V

    .line 19
    .line 20
    .line 21
    move v2, v1

    .line 22
    :goto_0
    iget-object v3, p0, Lkk7;->e:Lqi4;

    .line 23
    .line 24
    invoke-virtual {v3}, Lqi4;->h()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    iget-object v5, p0, Lkk7;->g:Lqi4;

    .line 29
    .line 30
    if-ge v2, v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Lqi4;->e(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    invoke-virtual {p0, v3, v4}, Lkk7;->m(J)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v0, v6}, Lbu;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v3, v4}, Lqi4;->g(J)V

    .line 50
    .line 51
    .line 52
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget-boolean v2, p0, Lkk7;->j:Z

    .line 56
    .line 57
    if-nez v2, :cond_7

    .line 58
    .line 59
    iput-boolean v1, p0, Lkk7;->k:Z

    .line 60
    .line 61
    :goto_1
    invoke-virtual {v3}, Lqi4;->h()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-ge v1, v2, :cond_7

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Lqi4;->e(I)J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    invoke-virtual {v5, v6, v7}, Lqi4;->c(J)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-ltz v2, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-virtual {v3, v6, v7}, Lqi4;->b(J)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lqk2;

    .line 83
    .line 84
    if-nez v2, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    iget-object v2, v2, Lqk2;->J0:Landroid/view/View;

    .line 88
    .line 89
    if-nez v2, :cond_5

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-eqz v2, :cond_6

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    :goto_2
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, Lbu;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_7
    new-instance v1, Lqt;

    .line 110
    .line 111
    invoke-direct {v1, v0}, Lqt;-><init>(Lbu;)V

    .line 112
    .line 113
    .line 114
    :goto_4
    invoke-virtual {v1}, Lqt;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_8

    .line 119
    .line 120
    invoke-virtual {v1}, Lqt;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Ljava/lang/Long;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    invoke-virtual {p0, v2, v3}, Lkk7;->q(J)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_8
    :goto_5
    return-void
.end method

.method public final o(I)Ljava/lang/Long;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move-object v2, v0

    .line 4
    :goto_0
    iget-object v3, p0, Lkk7;->g:Lqi4;

    .line 5
    .line 6
    invoke-virtual {v3}, Lqi4;->h()I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    if-ge v1, v4, :cond_2

    .line 11
    .line 12
    invoke-virtual {v3, v1}, Lqi4;->i(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-ne v4, p1, :cond_1

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v3, v1}, Lqi4;->e(I)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const-string p0, "Design assumption violated: a ViewHolder can only be bound to one item at a time."

    .line 36
    .line 37
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-object v2
.end method

.method public final p(Lfm2;)V
    .locals 8

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    iget-object v1, p0, Lkk7;->e:Lqi4;

    .line 4
    .line 5
    iget-wide v2, p1, Landroidx/recyclerview/widget/l;->e:J

    .line 6
    .line 7
    invoke-virtual {v1, v2, v3}, Lqi4;->b(J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lqk2;

    .line 12
    .line 13
    const-string v2, "Design assumption violated."

    .line 14
    .line 15
    if-eqz v1, :cond_b

    .line 16
    .line 17
    iget-object v3, p1, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 18
    .line 19
    check-cast v3, Landroid/widget/FrameLayout;

    .line 20
    .line 21
    iget-object v4, v1, Lqk2;->J0:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v1}, Lqk2;->s()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-nez v5, :cond_1

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lqk2;->s()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    iget-object v5, p0, Lkk7;->d:Lml2;

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    new-instance p1, Lmj0;

    .line 47
    .line 48
    invoke-direct {p1, p0, v1, v3}, Lmj0;-><init>(Lkk7;Lqk2;Landroid/widget/FrameLayout;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, v5, Lml2;->o:Lmj0;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lmj0;->Z:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 59
    .line 60
    new-instance v0, Lcl2;

    .line 61
    .line 62
    invoke-direct {v0, p1}, Lcl2;-><init>(Lmj0;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    invoke-virtual {v1}, Lqk2;->s()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-eq p0, v3, :cond_9

    .line 86
    .line 87
    invoke-static {v4, v3}, Lkk7;->l(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    invoke-virtual {v1}, Lqk2;->s()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    invoke-static {v4, v3}, Lkk7;->l(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    invoke-virtual {v5}, Lml2;->P()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-nez v2, :cond_8

    .line 106
    .line 107
    new-instance v2, Lmj0;

    .line 108
    .line 109
    invoke-direct {v2, p0, v1, v3}, Lmj0;-><init>(Lkk7;Lqk2;Landroid/widget/FrameLayout;)V

    .line 110
    .line 111
    .line 112
    iget-object v3, v5, Lml2;->o:Lmj0;

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v3, v3, Lmj0;->Z:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 120
    .line 121
    new-instance v4, Lcl2;

    .line 122
    .line 123
    invoke-direct {v4, v2}, Lcl2;-><init>(Lmj0;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    iget-object v2, p0, Lkk7;->i:Lvk1;

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    new-instance v3, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    iget-object v2, v2, Lvk1;->Y:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-nez v4, :cond_7

    .line 152
    .line 153
    :try_start_0
    iget-boolean v2, v1, Lqk2;->G0:Z

    .line 154
    .line 155
    const/4 v4, 0x0

    .line 156
    if-eqz v2, :cond_5

    .line 157
    .line 158
    iput-boolean v4, v1, Lqk2;->G0:Z

    .line 159
    .line 160
    :cond_5
    new-instance v2, Lr00;

    .line 161
    .line 162
    invoke-direct {v2, v5}, Lr00;-><init>(Lml2;)V

    .line 163
    .line 164
    .line 165
    new-instance v5, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    iget-wide v6, p1, Landroidx/recyclerview/widget/l;->e:J

    .line 171
    .line 172
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    const/4 v0, 0x1

    .line 180
    invoke-virtual {v2, v4, v1, p1, v0}, Lr00;->g(ILqk2;Ljava/lang/String;I)V

    .line 181
    .line 182
    .line 183
    sget-object p1, Lo84;->f0:Lo84;

    .line 184
    .line 185
    invoke-virtual {v2, v1, p1}, Lr00;->j(Lqk2;Lo84;)V

    .line 186
    .line 187
    .line 188
    iget-boolean p1, v2, Lr00;->g:Z

    .line 189
    .line 190
    if-nez p1, :cond_6

    .line 191
    .line 192
    iget-object p1, v2, Lr00;->q:Lml2;

    .line 193
    .line 194
    invoke-virtual {p1, v2, v4}, Lml2;->B(Lr00;Z)V

    .line 195
    .line 196
    .line 197
    iget-object p0, p0, Lkk7;->h:Lvl2;

    .line 198
    .line 199
    invoke-virtual {p0, v4}, Lvl2;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    .line 201
    .line 202
    invoke-static {v3}, Lvk1;->B(Ljava/util/List;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :catchall_0
    move-exception p0

    .line 207
    goto :goto_1

    .line 208
    :cond_6
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 209
    .line 210
    const-string p1, "This transaction is already being added to the back stack"

    .line 211
    .line 212
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 216
    :goto_1
    invoke-static {v3}, Lvk1;->B(Ljava/util/List;)V

    .line 217
    .line 218
    .line 219
    throw p0

    .line 220
    :cond_7
    invoke-static {v2}, Lp61;->k(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    throw p0

    .line 225
    :cond_8
    iget-boolean v0, v5, Lml2;->J:Z

    .line 226
    .line 227
    if-eqz v0, :cond_a

    .line 228
    .line 229
    :cond_9
    return-void

    .line 230
    :cond_a
    new-instance v0, Ljf1;

    .line 231
    .line 232
    invoke-direct {v0, p0, p1}, Ljf1;-><init>(Lkk7;Lfm2;)V

    .line 233
    .line 234
    .line 235
    iget-object p0, p0, Lkk7;->c:Lg94;

    .line 236
    .line 237
    invoke-virtual {p0, v0}, Lg94;->a(Lc94;)V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :cond_b
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    return-void
.end method

.method public final q(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lkk7;->e:Lqi4;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lqi4;->b(J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lqk2;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, v1, Lqk2;->J0:Landroid/view/View;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    check-cast v2, Landroid/widget/FrameLayout;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0, p1, p2}, Lkk7;->m(J)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Lkk7;->f:Lqi4;

    .line 32
    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {v3, p1, p2}, Lqi4;->g(J)V

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-virtual {v1}, Lqk2;->s()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0, p1, p2}, Lqi4;->g(J)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    iget-object v2, p0, Lkk7;->d:Lml2;

    .line 49
    .line 50
    invoke-virtual {v2}, Lml2;->P()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, Lkk7;->k:Z

    .line 58
    .line 59
    return-void

    .line 60
    :cond_4
    invoke-virtual {v1}, Lqk2;->s()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    iget-object v5, p0, Lkk7;->i:Lvk1;

    .line 65
    .line 66
    if-eqz v4, :cond_8

    .line 67
    .line 68
    invoke-virtual {p0, p1, p2}, Lkk7;->m(J)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_8

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance p0, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    iget-object v4, v5, Lvk1;->Y:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-nez v6, :cond_7

    .line 95
    .line 96
    iget-object v4, v2, Lml2;->c:Lz47;

    .line 97
    .line 98
    iget-object v6, v1, Lqk2;->g0:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v4, v4, Lz47;->Z:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v4, Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, Lwl2;

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    if-eqz v4, :cond_6

    .line 112
    .line 113
    iget-object v7, v4, Lwl2;->c:Lqk2;

    .line 114
    .line 115
    if-ne v7, v1, :cond_6

    .line 116
    .line 117
    iget v7, v7, Lqk2;->X:I

    .line 118
    .line 119
    const/4 v8, -0x1

    .line 120
    if-le v7, v8, :cond_5

    .line 121
    .line 122
    new-instance v6, Lpk2;

    .line 123
    .line 124
    invoke-virtual {v4}, Lwl2;->o()Landroid/os/Bundle;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-direct {v6, v4}, Lpk2;-><init>(Landroid/os/Bundle;)V

    .line 129
    .line 130
    .line 131
    :cond_5
    invoke-static {p0}, Lvk1;->B(Ljava/util/List;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, p1, p2, v6}, Lqi4;->f(JLjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 139
    .line 140
    const-string p1, "Fragment "

    .line 141
    .line 142
    const-string p2, " is not currently in the FragmentManager"

    .line 143
    .line 144
    invoke-static {p1, v1, p2}, Lie2;->i(Ljava/lang/String;Lqk2;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, p0}, Lml2;->f0(Ljava/lang/IllegalStateException;)V

    .line 152
    .line 153
    .line 154
    throw v6

    .line 155
    :cond_7
    invoke-static {v4}, Lp61;->k(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    throw p0

    .line 160
    :cond_8
    :goto_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance p0, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    iget-object v3, v5, Lvk1;->Y:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-nez v4, :cond_a

    .line 181
    .line 182
    :try_start_0
    new-instance v3, Lr00;

    .line 183
    .line 184
    invoke-direct {v3, v2}, Lr00;-><init>(Lml2;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v1}, Lr00;->i(Lqk2;)V

    .line 188
    .line 189
    .line 190
    iget-boolean v1, v3, Lr00;->g:Z

    .line 191
    .line 192
    if-nez v1, :cond_9

    .line 193
    .line 194
    iget-object v1, v3, Lr00;->q:Lml2;

    .line 195
    .line 196
    const/4 v2, 0x0

    .line 197
    invoke-virtual {v1, v3, v2}, Lml2;->B(Lr00;Z)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, p1, p2}, Lqi4;->g(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    .line 202
    .line 203
    invoke-static {p0}, Lvk1;->B(Ljava/util/List;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :catchall_0
    move-exception p1

    .line 208
    goto :goto_1

    .line 209
    :cond_9
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 210
    .line 211
    const-string p2, "This transaction is already being added to the back stack"

    .line 212
    .line 213
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 217
    :goto_1
    invoke-static {p0}, Lvk1;->B(Ljava/util/List;)V

    .line 218
    .line 219
    .line 220
    throw p1

    .line 221
    :cond_a
    invoke-static {v3}, Lp61;->k(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    throw p0
.end method
