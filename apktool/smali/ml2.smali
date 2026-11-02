.class public final Lml2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final A:Lgl2;

.field public final B:Lk42;

.field public C:Lr6;

.field public D:Lr6;

.field public E:Lr6;

.field public F:Ljava/util/ArrayDeque;

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Ljava/util/ArrayList;

.field public M:Ljava/util/ArrayList;

.field public N:Ljava/util/ArrayList;

.field public O:Lpl2;

.field public final P:Lxb;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Lz47;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Lbl2;

.field public g:Lz95;

.field public h:Lr00;

.field public i:Z

.field public final j:Ll00;

.field public final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final l:Ljava/util/Map;

.field public final m:Ljava/util/Map;

.field public final n:Ljava/util/ArrayList;

.field public final o:Lmj0;

.field public final p:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final q:Ldl2;

.field public final r:Ldl2;

.field public final s:Ldl2;

.field public final t:Ldl2;

.field public final u:Lfl2;

.field public v:I

.field public w:Ltk2;

.field public x:Lvj8;

.field public y:Lqk2;

.field public z:Lqk2;


# direct methods
.method public constructor <init>()V
    .locals 2

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
    iput-object v0, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lz47;

    .line 12
    .line 13
    const/16 v1, 0x13

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lz47;-><init>(B)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lml2;->c:Lz47;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v0, Lbl2;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lbl2;-><init>(Lml2;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lml2;->f:Lbl2;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lml2;->h:Lr00;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lml2;->i:Z

    .line 39
    .line 40
    new-instance v0, Ll00;

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-direct {v0, p0, v1}, Ll00;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lml2;->j:Ll00;

    .line 47
    .line 48
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lml2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lml2;->l:Ljava/util/Map;

    .line 65
    .line 66
    new-instance v0, Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lml2;->m:Ljava/util/Map;

    .line 76
    .line 77
    new-instance v0, Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    new-instance v0, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, Lml2;->n:Ljava/util/ArrayList;

    .line 91
    .line 92
    new-instance v0, Lmj0;

    .line 93
    .line 94
    invoke-direct {v0, p0}, Lmj0;-><init>(Lml2;)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, Lml2;->o:Lmj0;

    .line 98
    .line 99
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, Lml2;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 105
    .line 106
    new-instance v0, Ldl2;

    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    invoke-direct {v0, p0, v1}, Ldl2;-><init>(Lml2;B)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Lml2;->q:Ldl2;

    .line 113
    .line 114
    new-instance v0, Ldl2;

    .line 115
    .line 116
    const/4 v1, 0x1

    .line 117
    invoke-direct {v0, p0, v1}, Ldl2;-><init>(Lml2;B)V

    .line 118
    .line 119
    .line 120
    iput-object v0, p0, Lml2;->r:Ldl2;

    .line 121
    .line 122
    new-instance v0, Ldl2;

    .line 123
    .line 124
    const/4 v1, 0x2

    .line 125
    invoke-direct {v0, p0, v1}, Ldl2;-><init>(Lml2;B)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p0, Lml2;->s:Ldl2;

    .line 129
    .line 130
    new-instance v0, Ldl2;

    .line 131
    .line 132
    const/4 v1, 0x3

    .line 133
    invoke-direct {v0, p0, v1}, Ldl2;-><init>(Lml2;B)V

    .line 134
    .line 135
    .line 136
    iput-object v0, p0, Lml2;->t:Ldl2;

    .line 137
    .line 138
    new-instance v0, Lfl2;

    .line 139
    .line 140
    invoke-direct {v0, p0}, Lfl2;-><init>(Lml2;)V

    .line 141
    .line 142
    .line 143
    iput-object v0, p0, Lml2;->u:Lfl2;

    .line 144
    .line 145
    const/4 v0, -0x1

    .line 146
    iput v0, p0, Lml2;->v:I

    .line 147
    .line 148
    new-instance v0, Lgl2;

    .line 149
    .line 150
    invoke-direct {v0, p0}, Lgl2;-><init>(Lml2;)V

    .line 151
    .line 152
    .line 153
    iput-object v0, p0, Lml2;->A:Lgl2;

    .line 154
    .line 155
    new-instance v0, Lk42;

    .line 156
    .line 157
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 158
    .line 159
    .line 160
    iput-object v0, p0, Lml2;->B:Lk42;

    .line 161
    .line 162
    new-instance v0, Ljava/util/ArrayDeque;

    .line 163
    .line 164
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 165
    .line 166
    .line 167
    iput-object v0, p0, Lml2;->F:Ljava/util/ArrayDeque;

    .line 168
    .line 169
    new-instance v0, Lxb;

    .line 170
    .line 171
    const/16 v1, 0x9

    .line 172
    .line 173
    invoke-direct {v0, p0, v1}, Lxb;-><init>(Ljava/lang/Object;B)V

    .line 174
    .line 175
    .line 176
    iput-object v0, p0, Lml2;->P:Lxb;

    .line 177
    .line 178
    return-void
.end method

.method public static G(Lr00;)Ljava/util/HashSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lr00;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Lr00;->a:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lcm2;

    .line 22
    .line 23
    iget-object v2, v2, Lcm2;->b:Lqk2;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-boolean v3, p0, Lr00;->g:Z

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-object v0
.end method

.method public static K(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static L(Lqk2;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Lqk2;->x0:Lml2;

    .line 2
    .line 3
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 4
    .line 5
    invoke-virtual {p0}, Lz47;->D()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x0

    .line 14
    move v1, v0

    .line 15
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lqk2;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {v2}, Lml2;->L(Lqk2;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :cond_1
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    return v0
.end method

.method public static N(Lqk2;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, Lqk2;->G0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lqk2;->v0:Lml2;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lqk2;->y0:Lqk2;

    .line 13
    .line 14
    invoke-static {p0}, Lml2;->N(Lqk2;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_2
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static O(Lqk2;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lqk2;->v0:Lml2;

    .line 5
    .line 6
    iget-object v1, v0, Lml2;->z:Lqk2;

    .line 7
    .line 8
    if-eq p0, v1, :cond_1

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_1
    iget-object p0, v0, Lml2;->y:Lqk2;

    .line 12
    .line 13
    invoke-static {p0}, Lml2;->O(Lqk2;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    :goto_0
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 22
    return p0
.end method


# virtual methods
.method public final A(Z)Z
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Lml2;->z(Z)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lml2;->i:Z

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p1, :cond_3

    .line 9
    .line 10
    iget-object p1, p0, Lml2;->h:Lr00;

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    iput-boolean v1, p1, Lr00;->r:Z

    .line 15
    .line 16
    invoke-virtual {p1}, Lr00;->d()V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    invoke-static {p1}, Lml2;->K(I)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Lml2;->h:Lr00;

    .line 27
    .line 28
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p1, p0, Lml2;->h:Lr00;

    .line 37
    .line 38
    invoke-virtual {p1, v1, v1}, Lr00;->f(ZZ)I

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 42
    .line 43
    iget-object v2, p0, Lml2;->h:Lr00;

    .line 44
    .line 45
    invoke-virtual {p1, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lml2;->h:Lr00;

    .line 49
    .line 50
    iget-object p1, p1, Lr00;->a:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lcm2;

    .line 67
    .line 68
    iget-object v2, v2, Lcm2;->b:Lqk2;

    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    iput-boolean v1, v2, Lqk2;->o0:Z

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iput-object v0, p0, Lml2;->h:Lr00;

    .line 76
    .line 77
    :cond_3
    move p1, v1

    .line 78
    :goto_1
    iget-object v2, p0, Lml2;->L:Ljava/util/ArrayList;

    .line 79
    .line 80
    iget-object v3, p0, Lml2;->M:Ljava/util/ArrayList;

    .line 81
    .line 82
    iget-object v4, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 83
    .line 84
    monitor-enter v4

    .line 85
    :try_start_0
    iget-object v5, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_4

    .line 92
    .line 93
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    move v7, v1

    .line 95
    goto :goto_3

    .line 96
    :catchall_0
    move-exception p0

    .line 97
    goto :goto_5

    .line 98
    :cond_4
    :try_start_1
    iget-object v5, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 101
    .line 102
    .line 103
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    move v6, v1

    .line 105
    move v7, v6

    .line 106
    :goto_2
    iget-object v8, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 107
    .line 108
    if-ge v6, v5, :cond_5

    .line 109
    .line 110
    :try_start_2
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    check-cast v8, Ljl2;

    .line 115
    .line 116
    invoke-interface {v8, v2, v3}, Ljl2;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 117
    .line 118
    .line 119
    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 120
    or-int/2addr v7, v8

    .line 121
    add-int/lit8 v6, v6, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    goto :goto_4

    .line 126
    :cond_5
    :try_start_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 127
    .line 128
    .line 129
    iget-object v2, p0, Lml2;->w:Ltk2;

    .line 130
    .line 131
    iget-object v2, v2, Ltk2;->D0:Landroid/os/Handler;

    .line 132
    .line 133
    iget-object v3, p0, Lml2;->P:Lxb;

    .line 134
    .line 135
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 136
    .line 137
    .line 138
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 139
    :goto_3
    if-eqz v7, :cond_6

    .line 140
    .line 141
    const/4 p1, 0x1

    .line 142
    iput-boolean p1, p0, Lml2;->b:Z

    .line 143
    .line 144
    :try_start_4
    iget-object v2, p0, Lml2;->L:Ljava/util/ArrayList;

    .line 145
    .line 146
    iget-object v3, p0, Lml2;->M:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {p0, v2, v3}, Lml2;->W(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lml2;->e()V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catchall_2
    move-exception p1

    .line 156
    invoke-virtual {p0}, Lml2;->e()V

    .line 157
    .line 158
    .line 159
    throw p1

    .line 160
    :cond_6
    invoke-virtual {p0}, Lml2;->g0()V

    .line 161
    .line 162
    .line 163
    iget-boolean v2, p0, Lml2;->K:Z

    .line 164
    .line 165
    if-eqz v2, :cond_7

    .line 166
    .line 167
    iput-boolean v1, p0, Lml2;->K:Z

    .line 168
    .line 169
    invoke-virtual {p0}, Lml2;->e0()V

    .line 170
    .line 171
    .line 172
    :cond_7
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 173
    .line 174
    iget-object p0, p0, Lz47;->Z:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Ljava/util/HashMap;

    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-interface {p0, v0}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 187
    .line 188
    .line 189
    return p1

    .line 190
    :goto_4
    :try_start_5
    iget-object v0, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 193
    .line 194
    .line 195
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 196
    .line 197
    iget-object v0, v0, Ltk2;->D0:Landroid/os/Handler;

    .line 198
    .line 199
    iget-object p0, p0, Lml2;->P:Lxb;

    .line 200
    .line 201
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 202
    .line 203
    .line 204
    throw p1

    .line 205
    :goto_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 206
    throw p0
.end method

.method public final B(Lr00;Z)V
    .locals 4

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lml2;->J:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    return-void

    .line 12
    :cond_1
    invoke-virtual {p0, p2}, Lml2;->z(Z)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lml2;->h:Lr00;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz p2, :cond_5

    .line 20
    .line 21
    iput-boolean v1, p2, Lr00;->r:Z

    .line 22
    .line 23
    invoke-virtual {p2}, Lr00;->d()V

    .line 24
    .line 25
    .line 26
    const/4 p2, 0x3

    .line 27
    invoke-static {p2}, Lml2;->K(I)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    iget-object p2, p0, Lml2;->h:Lr00;

    .line 34
    .line 35
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object p2, p0, Lml2;->h:Lr00;

    .line 42
    .line 43
    invoke-virtual {p2, v1, v1}, Lr00;->f(ZZ)I

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, Lml2;->h:Lr00;

    .line 47
    .line 48
    iget-object v2, p0, Lml2;->L:Ljava/util/ArrayList;

    .line 49
    .line 50
    iget-object v3, p0, Lml2;->M:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {p2, v2, v3}, Lr00;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 53
    .line 54
    .line 55
    iget-object p2, p0, Lml2;->h:Lr00;

    .line 56
    .line 57
    iget-object p2, p2, Lr00;->a:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    :cond_3
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lcm2;

    .line 74
    .line 75
    iget-object v2, v2, Lcm2;->b:Lqk2;

    .line 76
    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    iput-boolean v1, v2, Lqk2;->o0:Z

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    iput-object v0, p0, Lml2;->h:Lr00;

    .line 83
    .line 84
    :cond_5
    iget-object p2, p0, Lml2;->L:Ljava/util/ArrayList;

    .line 85
    .line 86
    iget-object v2, p0, Lml2;->M:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-virtual {p1, p2, v2}, Lr00;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 89
    .line 90
    .line 91
    const/4 p1, 0x1

    .line 92
    iput-boolean p1, p0, Lml2;->b:Z

    .line 93
    .line 94
    :try_start_0
    iget-object p1, p0, Lml2;->L:Ljava/util/ArrayList;

    .line 95
    .line 96
    iget-object p2, p0, Lml2;->M:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2}, Lml2;->W(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lml2;->e()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lml2;->g0()V

    .line 105
    .line 106
    .line 107
    iget-boolean p1, p0, Lml2;->K:Z

    .line 108
    .line 109
    if-eqz p1, :cond_6

    .line 110
    .line 111
    iput-boolean v1, p0, Lml2;->K:Z

    .line 112
    .line 113
    invoke-virtual {p0}, Lml2;->e0()V

    .line 114
    .line 115
    .line 116
    :cond_6
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 117
    .line 118
    iget-object p0, p0, Lz47;->Z:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, Ljava/util/HashMap;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-interface {p0, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :catchall_0
    move-exception p1

    .line 135
    invoke-virtual {p0}, Lml2;->e()V

    .line 136
    .line 137
    .line 138
    throw p1
.end method

.method public final C(IILjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v0, Lml2;->c:Lz47;

    .line 12
    .line 13
    iget-object v6, v0, Lml2;->n:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    check-cast v7, Lr00;

    .line 20
    .line 21
    iget-boolean v7, v7, Lr00;->o:Z

    .line 22
    .line 23
    iget-object v8, v0, Lml2;->N:Ljava/util/ArrayList;

    .line 24
    .line 25
    if-nez v8, :cond_0

    .line 26
    .line 27
    new-instance v8, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v8, v0, Lml2;->N:Ljava/util/ArrayList;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v8, v0, Lml2;->N:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v5}, Lz47;->G()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 45
    .line 46
    .line 47
    iget-object v8, v0, Lml2;->z:Lqk2;

    .line 48
    .line 49
    move v10, v1

    .line 50
    const/4 v11, 0x0

    .line 51
    :goto_1
    if-ge v10, v2, :cond_13

    .line 52
    .line 53
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v15

    .line 57
    check-cast v15, Lr00;

    .line 58
    .line 59
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v16

    .line 63
    check-cast v16, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v16

    .line 69
    iget-object v13, v0, Lml2;->N:Ljava/util/ArrayList;

    .line 70
    .line 71
    if-nez v16, :cond_d

    .line 72
    .line 73
    iget-object v9, v15, Lr00;->a:Ljava/util/ArrayList;

    .line 74
    .line 75
    const/4 v12, 0x0

    .line 76
    :goto_2
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v14

    .line 80
    if-ge v12, v14, :cond_c

    .line 81
    .line 82
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v14

    .line 86
    check-cast v14, Lcm2;

    .line 87
    .line 88
    move/from16 v20, v7

    .line 89
    .line 90
    iget v7, v14, Lcm2;->a:I

    .line 91
    .line 92
    move/from16 v21, v10

    .line 93
    .line 94
    const/4 v10, 0x1

    .line 95
    if-eq v7, v10, :cond_b

    .line 96
    .line 97
    const/4 v10, 0x2

    .line 98
    if-eq v7, v10, :cond_5

    .line 99
    .line 100
    const/4 v10, 0x3

    .line 101
    if-eq v7, v10, :cond_3

    .line 102
    .line 103
    const/4 v10, 0x6

    .line 104
    if-eq v7, v10, :cond_3

    .line 105
    .line 106
    const/4 v10, 0x7

    .line 107
    if-eq v7, v10, :cond_2

    .line 108
    .line 109
    const/16 v10, 0x8

    .line 110
    .line 111
    if-eq v7, v10, :cond_1

    .line 112
    .line 113
    move-object/from16 v25, v6

    .line 114
    .line 115
    move/from16 v23, v11

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_1
    new-instance v7, Lcm2;

    .line 119
    .line 120
    move/from16 v23, v11

    .line 121
    .line 122
    const/4 v10, 0x0

    .line 123
    const/16 v11, 0x9

    .line 124
    .line 125
    invoke-direct {v7, v11, v8, v10}, Lcm2;-><init>(ILqk2;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v9, v12, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    const/4 v10, 0x1

    .line 132
    iput-boolean v10, v14, Lcm2;->c:Z

    .line 133
    .line 134
    add-int/lit8 v12, v12, 0x1

    .line 135
    .line 136
    iget-object v7, v14, Lcm2;->b:Lqk2;

    .line 137
    .line 138
    move-object/from16 v25, v6

    .line 139
    .line 140
    move-object v8, v7

    .line 141
    :goto_3
    const/4 v10, 0x1

    .line 142
    goto/16 :goto_8

    .line 143
    .line 144
    :cond_2
    const/4 v10, 0x1

    .line 145
    move/from16 v23, v11

    .line 146
    .line 147
    move-object/from16 v25, v6

    .line 148
    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :cond_3
    move/from16 v23, v11

    .line 152
    .line 153
    iget-object v7, v14, Lcm2;->b:Lqk2;

    .line 154
    .line 155
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    iget-object v7, v14, Lcm2;->b:Lqk2;

    .line 159
    .line 160
    if-ne v7, v8, :cond_4

    .line 161
    .line 162
    new-instance v8, Lcm2;

    .line 163
    .line 164
    const/16 v11, 0x9

    .line 165
    .line 166
    invoke-direct {v8, v11, v7}, Lcm2;-><init>(ILqk2;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v12, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    add-int/lit8 v12, v12, 0x1

    .line 173
    .line 174
    move-object/from16 v25, v6

    .line 175
    .line 176
    const/4 v8, 0x0

    .line 177
    goto :goto_3

    .line 178
    :cond_4
    move-object/from16 v25, v6

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_5
    move/from16 v23, v11

    .line 182
    .line 183
    iget-object v7, v14, Lcm2;->b:Lqk2;

    .line 184
    .line 185
    iget v10, v7, Lqk2;->A0:I

    .line 186
    .line 187
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    const/16 v19, 0x1

    .line 192
    .line 193
    add-int/lit8 v11, v11, -0x1

    .line 194
    .line 195
    const/16 v24, 0x0

    .line 196
    .line 197
    :goto_4
    if-ltz v11, :cond_9

    .line 198
    .line 199
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v25

    .line 203
    move/from16 v26, v11

    .line 204
    .line 205
    move-object/from16 v11, v25

    .line 206
    .line 207
    check-cast v11, Lqk2;

    .line 208
    .line 209
    move-object/from16 v25, v6

    .line 210
    .line 211
    iget v6, v11, Lqk2;->A0:I

    .line 212
    .line 213
    if-ne v6, v10, :cond_8

    .line 214
    .line 215
    if-ne v11, v7, :cond_6

    .line 216
    .line 217
    move/from16 v22, v10

    .line 218
    .line 219
    const/4 v10, 0x1

    .line 220
    const/16 v24, 0x1

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_6
    if-ne v11, v8, :cond_7

    .line 224
    .line 225
    new-instance v6, Lcm2;

    .line 226
    .line 227
    move/from16 v22, v10

    .line 228
    .line 229
    const/4 v8, 0x0

    .line 230
    const/16 v10, 0x9

    .line 231
    .line 232
    invoke-direct {v6, v10, v11, v8}, Lcm2;-><init>(ILqk2;I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v9, v12, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    add-int/lit8 v12, v12, 0x1

    .line 239
    .line 240
    move v6, v8

    .line 241
    const/4 v8, 0x0

    .line 242
    goto :goto_5

    .line 243
    :cond_7
    move/from16 v22, v10

    .line 244
    .line 245
    const/4 v6, 0x0

    .line 246
    const/16 v10, 0x9

    .line 247
    .line 248
    :goto_5
    new-instance v10, Lcm2;

    .line 249
    .line 250
    move-object/from16 v27, v8

    .line 251
    .line 252
    const/4 v8, 0x3

    .line 253
    invoke-direct {v10, v8, v11, v6}, Lcm2;-><init>(ILqk2;I)V

    .line 254
    .line 255
    .line 256
    iget v6, v14, Lcm2;->d:I

    .line 257
    .line 258
    iput v6, v10, Lcm2;->d:I

    .line 259
    .line 260
    iget v6, v14, Lcm2;->f:I

    .line 261
    .line 262
    iput v6, v10, Lcm2;->f:I

    .line 263
    .line 264
    iget v6, v14, Lcm2;->e:I

    .line 265
    .line 266
    iput v6, v10, Lcm2;->e:I

    .line 267
    .line 268
    iget v6, v14, Lcm2;->g:I

    .line 269
    .line 270
    iput v6, v10, Lcm2;->g:I

    .line 271
    .line 272
    invoke-virtual {v9, v12, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    const/4 v10, 0x1

    .line 279
    add-int/2addr v12, v10

    .line 280
    move-object/from16 v8, v27

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_8
    move/from16 v22, v10

    .line 284
    .line 285
    const/4 v10, 0x1

    .line 286
    :goto_6
    add-int/lit8 v11, v26, -0x1

    .line 287
    .line 288
    move/from16 v10, v22

    .line 289
    .line 290
    move-object/from16 v6, v25

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_9
    move-object/from16 v25, v6

    .line 294
    .line 295
    const/4 v10, 0x1

    .line 296
    if-eqz v24, :cond_a

    .line 297
    .line 298
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    add-int/lit8 v12, v12, -0x1

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_a
    iput v10, v14, Lcm2;->a:I

    .line 305
    .line 306
    iput-boolean v10, v14, Lcm2;->c:Z

    .line 307
    .line 308
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_b
    move-object/from16 v25, v6

    .line 313
    .line 314
    move/from16 v23, v11

    .line 315
    .line 316
    :goto_7
    iget-object v6, v14, Lcm2;->b:Lqk2;

    .line 317
    .line 318
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    :goto_8
    add-int/2addr v12, v10

    .line 322
    move/from16 v7, v20

    .line 323
    .line 324
    move/from16 v10, v21

    .line 325
    .line 326
    move/from16 v11, v23

    .line 327
    .line 328
    move-object/from16 v6, v25

    .line 329
    .line 330
    goto/16 :goto_2

    .line 331
    .line 332
    :cond_c
    move-object/from16 v25, v6

    .line 333
    .line 334
    move/from16 v20, v7

    .line 335
    .line 336
    move/from16 v21, v10

    .line 337
    .line 338
    move/from16 v23, v11

    .line 339
    .line 340
    goto :goto_b

    .line 341
    :cond_d
    move-object/from16 v25, v6

    .line 342
    .line 343
    move/from16 v20, v7

    .line 344
    .line 345
    move/from16 v21, v10

    .line 346
    .line 347
    move/from16 v23, v11

    .line 348
    .line 349
    const/4 v10, 0x1

    .line 350
    iget-object v6, v15, Lr00;->a:Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    sub-int/2addr v7, v10

    .line 357
    :goto_9
    if-ltz v7, :cond_10

    .line 358
    .line 359
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v9

    .line 363
    check-cast v9, Lcm2;

    .line 364
    .line 365
    iget v11, v9, Lcm2;->a:I

    .line 366
    .line 367
    if-eq v11, v10, :cond_f

    .line 368
    .line 369
    const/4 v10, 0x3

    .line 370
    if-eq v11, v10, :cond_e

    .line 371
    .line 372
    packed-switch v11, :pswitch_data_0

    .line 373
    .line 374
    .line 375
    goto :goto_a

    .line 376
    :pswitch_0
    iget-object v11, v9, Lcm2;->h:Lo84;

    .line 377
    .line 378
    iput-object v11, v9, Lcm2;->i:Lo84;

    .line 379
    .line 380
    goto :goto_a

    .line 381
    :pswitch_1
    iget-object v8, v9, Lcm2;->b:Lqk2;

    .line 382
    .line 383
    goto :goto_a

    .line 384
    :pswitch_2
    const/4 v8, 0x0

    .line 385
    goto :goto_a

    .line 386
    :cond_e
    :pswitch_3
    iget-object v9, v9, Lcm2;->b:Lqk2;

    .line 387
    .line 388
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    goto :goto_a

    .line 392
    :cond_f
    const/4 v10, 0x3

    .line 393
    :pswitch_4
    iget-object v9, v9, Lcm2;->b:Lqk2;

    .line 394
    .line 395
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    :goto_a
    add-int/lit8 v7, v7, -0x1

    .line 399
    .line 400
    const/4 v10, 0x1

    .line 401
    goto :goto_9

    .line 402
    :cond_10
    :goto_b
    if-nez v23, :cond_12

    .line 403
    .line 404
    iget-boolean v6, v15, Lr00;->g:Z

    .line 405
    .line 406
    if-eqz v6, :cond_11

    .line 407
    .line 408
    goto :goto_c

    .line 409
    :cond_11
    const/4 v11, 0x0

    .line 410
    goto :goto_d

    .line 411
    :cond_12
    :goto_c
    const/4 v11, 0x1

    .line 412
    :goto_d
    add-int/lit8 v10, v21, 0x1

    .line 413
    .line 414
    move/from16 v7, v20

    .line 415
    .line 416
    move-object/from16 v6, v25

    .line 417
    .line 418
    goto/16 :goto_1

    .line 419
    .line 420
    :cond_13
    move-object/from16 v25, v6

    .line 421
    .line 422
    move/from16 v20, v7

    .line 423
    .line 424
    move/from16 v23, v11

    .line 425
    .line 426
    iget-object v6, v0, Lml2;->N:Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 429
    .line 430
    .line 431
    if-nez v20, :cond_16

    .line 432
    .line 433
    iget v6, v0, Lml2;->v:I

    .line 434
    .line 435
    const/4 v10, 0x1

    .line 436
    if-lt v6, v10, :cond_16

    .line 437
    .line 438
    move v6, v1

    .line 439
    :goto_e
    if-ge v6, v2, :cond_16

    .line 440
    .line 441
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v7

    .line 445
    check-cast v7, Lr00;

    .line 446
    .line 447
    iget-object v7, v7, Lr00;->a:Ljava/util/ArrayList;

    .line 448
    .line 449
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 450
    .line 451
    .line 452
    move-result-object v7

    .line 453
    :cond_14
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 454
    .line 455
    .line 456
    move-result v8

    .line 457
    if-eqz v8, :cond_15

    .line 458
    .line 459
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v8

    .line 463
    check-cast v8, Lcm2;

    .line 464
    .line 465
    iget-object v8, v8, Lcm2;->b:Lqk2;

    .line 466
    .line 467
    if-eqz v8, :cond_14

    .line 468
    .line 469
    iget-object v9, v8, Lqk2;->v0:Lml2;

    .line 470
    .line 471
    if-eqz v9, :cond_14

    .line 472
    .line 473
    invoke-virtual {v0, v8}, Lml2;->h(Lqk2;)Lwl2;

    .line 474
    .line 475
    .line 476
    move-result-object v8

    .line 477
    invoke-virtual {v5, v8}, Lz47;->N(Lwl2;)V

    .line 478
    .line 479
    .line 480
    goto :goto_f

    .line 481
    :cond_15
    add-int/lit8 v6, v6, 0x1

    .line 482
    .line 483
    goto :goto_e

    .line 484
    :cond_16
    const-string v5, "Unknown cmd: "

    .line 485
    .line 486
    move v6, v1

    .line 487
    :goto_10
    const/4 v7, -0x1

    .line 488
    if-ge v6, v2, :cond_29

    .line 489
    .line 490
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v8

    .line 494
    check-cast v8, Lr00;

    .line 495
    .line 496
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    check-cast v9, Ljava/lang/Boolean;

    .line 501
    .line 502
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 503
    .line 504
    .line 505
    move-result v9

    .line 506
    if-eqz v9, :cond_21

    .line 507
    .line 508
    invoke-virtual {v8, v7}, Lr00;->c(I)V

    .line 509
    .line 510
    .line 511
    iget-object v7, v8, Lr00;->q:Lml2;

    .line 512
    .line 513
    iget-object v9, v8, Lr00;->a:Ljava/util/ArrayList;

    .line 514
    .line 515
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 516
    .line 517
    .line 518
    move-result v10

    .line 519
    const/4 v11, 0x1

    .line 520
    sub-int/2addr v10, v11

    .line 521
    :goto_11
    if-ltz v10, :cond_20

    .line 522
    .line 523
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v12

    .line 527
    check-cast v12, Lcm2;

    .line 528
    .line 529
    iget-object v13, v12, Lcm2;->b:Lqk2;

    .line 530
    .line 531
    if-eqz v13, :cond_1c

    .line 532
    .line 533
    iget-object v14, v13, Lqk2;->M0:Lnk2;

    .line 534
    .line 535
    if-nez v14, :cond_17

    .line 536
    .line 537
    goto :goto_12

    .line 538
    :cond_17
    invoke-virtual {v13}, Lqk2;->g()Lnk2;

    .line 539
    .line 540
    .line 541
    move-result-object v14

    .line 542
    iput-boolean v11, v14, Lnk2;->a:Z

    .line 543
    .line 544
    :goto_12
    iget v11, v8, Lr00;->f:I

    .line 545
    .line 546
    const/16 v14, 0x2002

    .line 547
    .line 548
    const/16 v15, 0x1001

    .line 549
    .line 550
    if-eq v11, v15, :cond_1a

    .line 551
    .line 552
    if-eq v11, v14, :cond_19

    .line 553
    .line 554
    const/16 v14, 0x1004

    .line 555
    .line 556
    const/16 v15, 0x2005

    .line 557
    .line 558
    if-eq v11, v15, :cond_1a

    .line 559
    .line 560
    const/16 v15, 0x1003

    .line 561
    .line 562
    if-eq v11, v15, :cond_19

    .line 563
    .line 564
    if-eq v11, v14, :cond_18

    .line 565
    .line 566
    const/4 v14, 0x0

    .line 567
    goto :goto_13

    .line 568
    :cond_18
    const/16 v14, 0x2005

    .line 569
    .line 570
    goto :goto_13

    .line 571
    :cond_19
    move v14, v15

    .line 572
    :cond_1a
    :goto_13
    iget-object v11, v13, Lqk2;->M0:Lnk2;

    .line 573
    .line 574
    if-nez v11, :cond_1b

    .line 575
    .line 576
    if-nez v14, :cond_1b

    .line 577
    .line 578
    goto :goto_14

    .line 579
    :cond_1b
    invoke-virtual {v13}, Lqk2;->g()Lnk2;

    .line 580
    .line 581
    .line 582
    iget-object v11, v13, Lqk2;->M0:Lnk2;

    .line 583
    .line 584
    iput v14, v11, Lnk2;->f:I

    .line 585
    .line 586
    :goto_14
    invoke-virtual {v13}, Lqk2;->g()Lnk2;

    .line 587
    .line 588
    .line 589
    iget-object v11, v13, Lqk2;->M0:Lnk2;

    .line 590
    .line 591
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    :cond_1c
    iget v11, v12, Lcm2;->a:I

    .line 595
    .line 596
    packed-switch v11, :pswitch_data_1

    .line 597
    .line 598
    .line 599
    :pswitch_5
    iget v0, v12, Lcm2;->a:I

    .line 600
    .line 601
    invoke-static {v0, v5}, Lxw3;->h(ILjava/lang/String;)V

    .line 602
    .line 603
    .line 604
    return-void

    .line 605
    :pswitch_6
    iget-object v11, v13, Lqk2;->R0:Lo84;

    .line 606
    .line 607
    iput-object v11, v12, Lcm2;->i:Lo84;

    .line 608
    .line 609
    iget-object v11, v12, Lcm2;->h:Lo84;

    .line 610
    .line 611
    invoke-virtual {v7, v13, v11}, Lml2;->b0(Lqk2;Lo84;)V

    .line 612
    .line 613
    .line 614
    :cond_1d
    :goto_15
    const/4 v11, 0x1

    .line 615
    goto/16 :goto_16

    .line 616
    .line 617
    :pswitch_7
    invoke-virtual {v7, v13}, Lml2;->c0(Lqk2;)V

    .line 618
    .line 619
    .line 620
    goto :goto_15

    .line 621
    :pswitch_8
    const/4 v11, 0x0

    .line 622
    invoke-virtual {v7, v11}, Lml2;->c0(Lqk2;)V

    .line 623
    .line 624
    .line 625
    goto :goto_15

    .line 626
    :pswitch_9
    iget v11, v12, Lcm2;->d:I

    .line 627
    .line 628
    iget v14, v12, Lcm2;->e:I

    .line 629
    .line 630
    iget v15, v12, Lcm2;->f:I

    .line 631
    .line 632
    iget v12, v12, Lcm2;->g:I

    .line 633
    .line 634
    invoke-virtual {v13, v11, v14, v15, v12}, Lqk2;->P(IIII)V

    .line 635
    .line 636
    .line 637
    const/4 v11, 0x1

    .line 638
    invoke-virtual {v7, v13, v11}, Lml2;->a0(Lqk2;Z)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v7, v13}, Lml2;->i(Lqk2;)V

    .line 642
    .line 643
    .line 644
    goto :goto_15

    .line 645
    :pswitch_a
    iget v11, v12, Lcm2;->d:I

    .line 646
    .line 647
    iget v14, v12, Lcm2;->e:I

    .line 648
    .line 649
    iget v15, v12, Lcm2;->f:I

    .line 650
    .line 651
    iget v12, v12, Lcm2;->g:I

    .line 652
    .line 653
    invoke-virtual {v13, v11, v14, v15, v12}, Lqk2;->P(IIII)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v7, v13}, Lml2;->c(Lqk2;)V

    .line 657
    .line 658
    .line 659
    goto :goto_15

    .line 660
    :pswitch_b
    iget v11, v12, Lcm2;->d:I

    .line 661
    .line 662
    iget v14, v12, Lcm2;->e:I

    .line 663
    .line 664
    iget v15, v12, Lcm2;->f:I

    .line 665
    .line 666
    iget v12, v12, Lcm2;->g:I

    .line 667
    .line 668
    invoke-virtual {v13, v11, v14, v15, v12}, Lqk2;->P(IIII)V

    .line 669
    .line 670
    .line 671
    const/4 v11, 0x1

    .line 672
    invoke-virtual {v7, v13, v11}, Lml2;->a0(Lqk2;Z)V

    .line 673
    .line 674
    .line 675
    const/16 v18, 0x2

    .line 676
    .line 677
    invoke-static/range {v18 .. v18}, Lml2;->K(I)Z

    .line 678
    .line 679
    .line 680
    move-result v12

    .line 681
    if-eqz v12, :cond_1e

    .line 682
    .line 683
    invoke-static {v13}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    :cond_1e
    iget-boolean v12, v13, Lqk2;->C0:Z

    .line 687
    .line 688
    if-nez v12, :cond_1d

    .line 689
    .line 690
    iput-boolean v11, v13, Lqk2;->C0:Z

    .line 691
    .line 692
    iget-boolean v12, v13, Lqk2;->N0:Z

    .line 693
    .line 694
    xor-int/2addr v12, v11

    .line 695
    iput-boolean v12, v13, Lqk2;->N0:Z

    .line 696
    .line 697
    invoke-virtual {v7, v13}, Lml2;->d0(Lqk2;)V

    .line 698
    .line 699
    .line 700
    goto :goto_15

    .line 701
    :pswitch_c
    iget v11, v12, Lcm2;->d:I

    .line 702
    .line 703
    iget v14, v12, Lcm2;->e:I

    .line 704
    .line 705
    iget v15, v12, Lcm2;->f:I

    .line 706
    .line 707
    iget v12, v12, Lcm2;->g:I

    .line 708
    .line 709
    invoke-virtual {v13, v11, v14, v15, v12}, Lqk2;->P(IIII)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    const/16 v18, 0x2

    .line 716
    .line 717
    invoke-static/range {v18 .. v18}, Lml2;->K(I)Z

    .line 718
    .line 719
    .line 720
    move-result v11

    .line 721
    if-eqz v11, :cond_1f

    .line 722
    .line 723
    invoke-static {v13}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    :cond_1f
    iget-boolean v11, v13, Lqk2;->C0:Z

    .line 727
    .line 728
    if-eqz v11, :cond_1d

    .line 729
    .line 730
    const/4 v11, 0x0

    .line 731
    iput-boolean v11, v13, Lqk2;->C0:Z

    .line 732
    .line 733
    iget-boolean v11, v13, Lqk2;->N0:Z

    .line 734
    .line 735
    const/16 v19, 0x1

    .line 736
    .line 737
    xor-int/lit8 v11, v11, 0x1

    .line 738
    .line 739
    iput-boolean v11, v13, Lqk2;->N0:Z

    .line 740
    .line 741
    goto :goto_15

    .line 742
    :pswitch_d
    iget v11, v12, Lcm2;->d:I

    .line 743
    .line 744
    iget v14, v12, Lcm2;->e:I

    .line 745
    .line 746
    iget v15, v12, Lcm2;->f:I

    .line 747
    .line 748
    iget v12, v12, Lcm2;->g:I

    .line 749
    .line 750
    invoke-virtual {v13, v11, v14, v15, v12}, Lqk2;->P(IIII)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v7, v13}, Lml2;->a(Lqk2;)Lwl2;

    .line 754
    .line 755
    .line 756
    goto/16 :goto_15

    .line 757
    .line 758
    :pswitch_e
    iget v11, v12, Lcm2;->d:I

    .line 759
    .line 760
    iget v14, v12, Lcm2;->e:I

    .line 761
    .line 762
    iget v15, v12, Lcm2;->f:I

    .line 763
    .line 764
    iget v12, v12, Lcm2;->g:I

    .line 765
    .line 766
    invoke-virtual {v13, v11, v14, v15, v12}, Lqk2;->P(IIII)V

    .line 767
    .line 768
    .line 769
    const/4 v11, 0x1

    .line 770
    invoke-virtual {v7, v13, v11}, Lml2;->a0(Lqk2;Z)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v7, v13}, Lml2;->V(Lqk2;)V

    .line 774
    .line 775
    .line 776
    :goto_16
    add-int/lit8 v10, v10, -0x1

    .line 777
    .line 778
    goto/16 :goto_11

    .line 779
    .line 780
    :cond_20
    move-object/from16 v16, v5

    .line 781
    .line 782
    const/16 v18, 0x2

    .line 783
    .line 784
    goto/16 :goto_1d

    .line 785
    .line 786
    :cond_21
    const/4 v11, 0x1

    .line 787
    invoke-virtual {v8, v11}, Lr00;->c(I)V

    .line 788
    .line 789
    .line 790
    iget-object v7, v8, Lr00;->q:Lml2;

    .line 791
    .line 792
    iget-object v9, v8, Lr00;->a:Ljava/util/ArrayList;

    .line 793
    .line 794
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 795
    .line 796
    .line 797
    move-result v10

    .line 798
    const/4 v11, 0x0

    .line 799
    :goto_17
    if-ge v11, v10, :cond_20

    .line 800
    .line 801
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v12

    .line 805
    check-cast v12, Lcm2;

    .line 806
    .line 807
    iget-object v13, v12, Lcm2;->b:Lqk2;

    .line 808
    .line 809
    if-eqz v13, :cond_24

    .line 810
    .line 811
    iget-object v14, v13, Lqk2;->M0:Lnk2;

    .line 812
    .line 813
    if-nez v14, :cond_22

    .line 814
    .line 815
    goto :goto_18

    .line 816
    :cond_22
    invoke-virtual {v13}, Lqk2;->g()Lnk2;

    .line 817
    .line 818
    .line 819
    move-result-object v14

    .line 820
    const/4 v15, 0x0

    .line 821
    iput-boolean v15, v14, Lnk2;->a:Z

    .line 822
    .line 823
    :goto_18
    iget v14, v8, Lr00;->f:I

    .line 824
    .line 825
    iget-object v15, v13, Lqk2;->M0:Lnk2;

    .line 826
    .line 827
    if-nez v15, :cond_23

    .line 828
    .line 829
    if-nez v14, :cond_23

    .line 830
    .line 831
    goto :goto_19

    .line 832
    :cond_23
    invoke-virtual {v13}, Lqk2;->g()Lnk2;

    .line 833
    .line 834
    .line 835
    iget-object v15, v13, Lqk2;->M0:Lnk2;

    .line 836
    .line 837
    iput v14, v15, Lnk2;->f:I

    .line 838
    .line 839
    :goto_19
    invoke-virtual {v13}, Lqk2;->g()Lnk2;

    .line 840
    .line 841
    .line 842
    iget-object v14, v13, Lqk2;->M0:Lnk2;

    .line 843
    .line 844
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    :cond_24
    iget v14, v12, Lcm2;->a:I

    .line 848
    .line 849
    packed-switch v14, :pswitch_data_2

    .line 850
    .line 851
    .line 852
    :pswitch_f
    iget v0, v12, Lcm2;->a:I

    .line 853
    .line 854
    invoke-static {v0, v5}, Lxw3;->h(ILjava/lang/String;)V

    .line 855
    .line 856
    .line 857
    return-void

    .line 858
    :pswitch_10
    iget-object v14, v13, Lqk2;->R0:Lo84;

    .line 859
    .line 860
    iput-object v14, v12, Lcm2;->h:Lo84;

    .line 861
    .line 862
    iget-object v12, v12, Lcm2;->i:Lo84;

    .line 863
    .line 864
    invoke-virtual {v7, v13, v12}, Lml2;->b0(Lqk2;Lo84;)V

    .line 865
    .line 866
    .line 867
    :goto_1a
    move-object/from16 v16, v5

    .line 868
    .line 869
    :cond_25
    :goto_1b
    const/16 v18, 0x2

    .line 870
    .line 871
    goto/16 :goto_1c

    .line 872
    .line 873
    :pswitch_11
    const/4 v12, 0x0

    .line 874
    invoke-virtual {v7, v12}, Lml2;->c0(Lqk2;)V

    .line 875
    .line 876
    .line 877
    goto :goto_1a

    .line 878
    :pswitch_12
    invoke-virtual {v7, v13}, Lml2;->c0(Lqk2;)V

    .line 879
    .line 880
    .line 881
    goto :goto_1a

    .line 882
    :pswitch_13
    iget v14, v12, Lcm2;->d:I

    .line 883
    .line 884
    iget v15, v12, Lcm2;->e:I

    .line 885
    .line 886
    move-object/from16 v16, v5

    .line 887
    .line 888
    iget v5, v12, Lcm2;->f:I

    .line 889
    .line 890
    iget v12, v12, Lcm2;->g:I

    .line 891
    .line 892
    invoke-virtual {v13, v14, v15, v5, v12}, Lqk2;->P(IIII)V

    .line 893
    .line 894
    .line 895
    const/4 v15, 0x0

    .line 896
    invoke-virtual {v7, v13, v15}, Lml2;->a0(Lqk2;Z)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v7, v13}, Lml2;->c(Lqk2;)V

    .line 900
    .line 901
    .line 902
    goto :goto_1b

    .line 903
    :pswitch_14
    move-object/from16 v16, v5

    .line 904
    .line 905
    iget v5, v12, Lcm2;->d:I

    .line 906
    .line 907
    iget v14, v12, Lcm2;->e:I

    .line 908
    .line 909
    iget v15, v12, Lcm2;->f:I

    .line 910
    .line 911
    iget v12, v12, Lcm2;->g:I

    .line 912
    .line 913
    invoke-virtual {v13, v5, v14, v15, v12}, Lqk2;->P(IIII)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v7, v13}, Lml2;->i(Lqk2;)V

    .line 917
    .line 918
    .line 919
    goto :goto_1b

    .line 920
    :pswitch_15
    move-object/from16 v16, v5

    .line 921
    .line 922
    iget v5, v12, Lcm2;->d:I

    .line 923
    .line 924
    iget v14, v12, Lcm2;->e:I

    .line 925
    .line 926
    iget v15, v12, Lcm2;->f:I

    .line 927
    .line 928
    iget v12, v12, Lcm2;->g:I

    .line 929
    .line 930
    invoke-virtual {v13, v5, v14, v15, v12}, Lqk2;->P(IIII)V

    .line 931
    .line 932
    .line 933
    const/4 v15, 0x0

    .line 934
    invoke-virtual {v7, v13, v15}, Lml2;->a0(Lqk2;Z)V

    .line 935
    .line 936
    .line 937
    const/16 v18, 0x2

    .line 938
    .line 939
    invoke-static/range {v18 .. v18}, Lml2;->K(I)Z

    .line 940
    .line 941
    .line 942
    move-result v5

    .line 943
    if-eqz v5, :cond_26

    .line 944
    .line 945
    invoke-static {v13}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    :cond_26
    iget-boolean v5, v13, Lqk2;->C0:Z

    .line 949
    .line 950
    if-eqz v5, :cond_25

    .line 951
    .line 952
    iput-boolean v15, v13, Lqk2;->C0:Z

    .line 953
    .line 954
    iget-boolean v5, v13, Lqk2;->N0:Z

    .line 955
    .line 956
    const/16 v19, 0x1

    .line 957
    .line 958
    xor-int/lit8 v5, v5, 0x1

    .line 959
    .line 960
    iput-boolean v5, v13, Lqk2;->N0:Z

    .line 961
    .line 962
    goto :goto_1b

    .line 963
    :pswitch_16
    move-object/from16 v16, v5

    .line 964
    .line 965
    iget v5, v12, Lcm2;->d:I

    .line 966
    .line 967
    iget v14, v12, Lcm2;->e:I

    .line 968
    .line 969
    iget v15, v12, Lcm2;->f:I

    .line 970
    .line 971
    iget v12, v12, Lcm2;->g:I

    .line 972
    .line 973
    invoke-virtual {v13, v5, v14, v15, v12}, Lqk2;->P(IIII)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 977
    .line 978
    .line 979
    const/16 v18, 0x2

    .line 980
    .line 981
    invoke-static/range {v18 .. v18}, Lml2;->K(I)Z

    .line 982
    .line 983
    .line 984
    move-result v5

    .line 985
    if-eqz v5, :cond_27

    .line 986
    .line 987
    invoke-static {v13}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    :cond_27
    iget-boolean v5, v13, Lqk2;->C0:Z

    .line 991
    .line 992
    if-nez v5, :cond_28

    .line 993
    .line 994
    const/4 v5, 0x1

    .line 995
    iput-boolean v5, v13, Lqk2;->C0:Z

    .line 996
    .line 997
    iget-boolean v12, v13, Lqk2;->N0:Z

    .line 998
    .line 999
    xor-int/2addr v12, v5

    .line 1000
    iput-boolean v12, v13, Lqk2;->N0:Z

    .line 1001
    .line 1002
    invoke-virtual {v7, v13}, Lml2;->d0(Lqk2;)V

    .line 1003
    .line 1004
    .line 1005
    goto :goto_1c

    .line 1006
    :pswitch_17
    move-object/from16 v16, v5

    .line 1007
    .line 1008
    const/16 v18, 0x2

    .line 1009
    .line 1010
    iget v5, v12, Lcm2;->d:I

    .line 1011
    .line 1012
    iget v14, v12, Lcm2;->e:I

    .line 1013
    .line 1014
    iget v15, v12, Lcm2;->f:I

    .line 1015
    .line 1016
    iget v12, v12, Lcm2;->g:I

    .line 1017
    .line 1018
    invoke-virtual {v13, v5, v14, v15, v12}, Lqk2;->P(IIII)V

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v7, v13}, Lml2;->V(Lqk2;)V

    .line 1022
    .line 1023
    .line 1024
    goto :goto_1c

    .line 1025
    :pswitch_18
    move-object/from16 v16, v5

    .line 1026
    .line 1027
    const/16 v18, 0x2

    .line 1028
    .line 1029
    iget v5, v12, Lcm2;->d:I

    .line 1030
    .line 1031
    iget v14, v12, Lcm2;->e:I

    .line 1032
    .line 1033
    iget v15, v12, Lcm2;->f:I

    .line 1034
    .line 1035
    iget v12, v12, Lcm2;->g:I

    .line 1036
    .line 1037
    invoke-virtual {v13, v5, v14, v15, v12}, Lqk2;->P(IIII)V

    .line 1038
    .line 1039
    .line 1040
    const/4 v15, 0x0

    .line 1041
    invoke-virtual {v7, v13, v15}, Lml2;->a0(Lqk2;Z)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v7, v13}, Lml2;->a(Lqk2;)Lwl2;

    .line 1045
    .line 1046
    .line 1047
    :cond_28
    :goto_1c
    add-int/lit8 v11, v11, 0x1

    .line 1048
    .line 1049
    move-object/from16 v5, v16

    .line 1050
    .line 1051
    goto/16 :goto_17

    .line 1052
    .line 1053
    :goto_1d
    add-int/lit8 v6, v6, 0x1

    .line 1054
    .line 1055
    move-object/from16 v5, v16

    .line 1056
    .line 1057
    goto/16 :goto_10

    .line 1058
    .line 1059
    :cond_29
    add-int/lit8 v5, v2, -0x1

    .line 1060
    .line 1061
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v5

    .line 1065
    check-cast v5, Ljava/lang/Boolean;

    .line 1066
    .line 1067
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1068
    .line 1069
    .line 1070
    move-result v5

    .line 1071
    if-eqz v23, :cond_30

    .line 1072
    .line 1073
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1074
    .line 1075
    .line 1076
    move-result v6

    .line 1077
    if-nez v6, :cond_30

    .line 1078
    .line 1079
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 1080
    .line 1081
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v8

    .line 1088
    :goto_1e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1089
    .line 1090
    .line 1091
    move-result v9

    .line 1092
    if-eqz v9, :cond_2a

    .line 1093
    .line 1094
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v9

    .line 1098
    check-cast v9, Lr00;

    .line 1099
    .line 1100
    invoke-static {v9}, Lml2;->G(Lr00;)Ljava/util/HashSet;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v9

    .line 1104
    invoke-interface {v6, v9}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1105
    .line 1106
    .line 1107
    goto :goto_1e

    .line 1108
    :cond_2a
    iget-object v8, v0, Lml2;->h:Lr00;

    .line 1109
    .line 1110
    if-nez v8, :cond_30

    .line 1111
    .line 1112
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v8

    .line 1116
    :goto_1f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1117
    .line 1118
    .line 1119
    move-result v9

    .line 1120
    if-eqz v9, :cond_2d

    .line 1121
    .line 1122
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v9

    .line 1126
    if-nez v9, :cond_2c

    .line 1127
    .line 1128
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v9

    .line 1132
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1133
    .line 1134
    .line 1135
    move-result v10

    .line 1136
    if-nez v10, :cond_2b

    .line 1137
    .line 1138
    goto :goto_1f

    .line 1139
    :cond_2b
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    check-cast v0, Lqk2;

    .line 1144
    .line 1145
    const/16 v17, 0x0

    .line 1146
    .line 1147
    throw v17

    .line 1148
    :cond_2c
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 1149
    .line 1150
    .line 1151
    return-void

    .line 1152
    :cond_2d
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v8

    .line 1156
    :goto_20
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1157
    .line 1158
    .line 1159
    move-result v9

    .line 1160
    if-eqz v9, :cond_30

    .line 1161
    .line 1162
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v9

    .line 1166
    if-nez v9, :cond_2f

    .line 1167
    .line 1168
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v9

    .line 1172
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1173
    .line 1174
    .line 1175
    move-result v10

    .line 1176
    if-nez v10, :cond_2e

    .line 1177
    .line 1178
    goto :goto_20

    .line 1179
    :cond_2e
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    check-cast v0, Lqk2;

    .line 1184
    .line 1185
    const/16 v17, 0x0

    .line 1186
    .line 1187
    throw v17

    .line 1188
    :cond_2f
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 1189
    .line 1190
    .line 1191
    return-void

    .line 1192
    :cond_30
    move v6, v1

    .line 1193
    :goto_21
    if-ge v6, v2, :cond_35

    .line 1194
    .line 1195
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v8

    .line 1199
    check-cast v8, Lr00;

    .line 1200
    .line 1201
    if-eqz v5, :cond_32

    .line 1202
    .line 1203
    iget-object v9, v8, Lr00;->a:Ljava/util/ArrayList;

    .line 1204
    .line 1205
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1206
    .line 1207
    .line 1208
    move-result v9

    .line 1209
    const/16 v19, 0x1

    .line 1210
    .line 1211
    add-int/lit8 v9, v9, -0x1

    .line 1212
    .line 1213
    :goto_22
    if-ltz v9, :cond_34

    .line 1214
    .line 1215
    iget-object v10, v8, Lr00;->a:Ljava/util/ArrayList;

    .line 1216
    .line 1217
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v10

    .line 1221
    check-cast v10, Lcm2;

    .line 1222
    .line 1223
    iget-object v10, v10, Lcm2;->b:Lqk2;

    .line 1224
    .line 1225
    if-eqz v10, :cond_31

    .line 1226
    .line 1227
    invoke-virtual {v0, v10}, Lml2;->h(Lqk2;)Lwl2;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v10

    .line 1231
    invoke-virtual {v10}, Lwl2;->k()V

    .line 1232
    .line 1233
    .line 1234
    :cond_31
    add-int/lit8 v9, v9, -0x1

    .line 1235
    .line 1236
    goto :goto_22

    .line 1237
    :cond_32
    iget-object v8, v8, Lr00;->a:Ljava/util/ArrayList;

    .line 1238
    .line 1239
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v8

    .line 1243
    :cond_33
    :goto_23
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1244
    .line 1245
    .line 1246
    move-result v9

    .line 1247
    if-eqz v9, :cond_34

    .line 1248
    .line 1249
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v9

    .line 1253
    check-cast v9, Lcm2;

    .line 1254
    .line 1255
    iget-object v9, v9, Lcm2;->b:Lqk2;

    .line 1256
    .line 1257
    if-eqz v9, :cond_33

    .line 1258
    .line 1259
    invoke-virtual {v0, v9}, Lml2;->h(Lqk2;)Lwl2;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v9

    .line 1263
    invoke-virtual {v9}, Lwl2;->k()V

    .line 1264
    .line 1265
    .line 1266
    goto :goto_23

    .line 1267
    :cond_34
    add-int/lit8 v6, v6, 0x1

    .line 1268
    .line 1269
    goto :goto_21

    .line 1270
    :cond_35
    iget v6, v0, Lml2;->v:I

    .line 1271
    .line 1272
    const/4 v11, 0x1

    .line 1273
    invoke-virtual {v0, v6, v11}, Lml2;->Q(IZ)V

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v0, v3, v1, v2}, Lml2;->g(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v0

    .line 1284
    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1285
    .line 1286
    .line 1287
    move-result v6

    .line 1288
    if-eqz v6, :cond_38

    .line 1289
    .line 1290
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v6

    .line 1294
    check-cast v6, Lfg1;

    .line 1295
    .line 1296
    iput-boolean v5, v6, Lfg1;->e:Z

    .line 1297
    .line 1298
    iget-object v8, v6, Lfg1;->b:Ljava/util/ArrayList;

    .line 1299
    .line 1300
    monitor-enter v8

    .line 1301
    :try_start_0
    invoke-virtual {v6}, Lfg1;->l()V

    .line 1302
    .line 1303
    .line 1304
    iget-object v9, v6, Lfg1;->b:Ljava/util/ArrayList;

    .line 1305
    .line 1306
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1307
    .line 1308
    .line 1309
    move-result v10

    .line 1310
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v9

    .line 1314
    :cond_36
    invoke-interface {v9}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1315
    .line 1316
    .line 1317
    move-result v10

    .line 1318
    if-eqz v10, :cond_37

    .line 1319
    .line 1320
    invoke-interface {v9}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v11

    .line 1324
    move-object v10, v11

    .line 1325
    check-cast v10, Lxe7;

    .line 1326
    .line 1327
    sget-object v12, Lze7;->X:Lwe5;

    .line 1328
    .line 1329
    iget-object v13, v10, Lxe7;->c:Lqk2;

    .line 1330
    .line 1331
    iget-object v13, v13, Lqk2;->J0:Landroid/view/View;

    .line 1332
    .line 1333
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1337
    .line 1338
    .line 1339
    invoke-static {v13}, Lwe5;->d(Landroid/view/View;)Lze7;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v12

    .line 1343
    iget-object v10, v10, Lxe7;->a:Lze7;

    .line 1344
    .line 1345
    sget-object v13, Lze7;->Z:Lze7;

    .line 1346
    .line 1347
    if-ne v10, v13, :cond_36

    .line 1348
    .line 1349
    if-eq v12, v13, :cond_36

    .line 1350
    .line 1351
    goto :goto_25

    .line 1352
    :catchall_0
    move-exception v0

    .line 1353
    goto :goto_26

    .line 1354
    :cond_37
    const/4 v11, 0x0

    .line 1355
    :goto_25
    check-cast v11, Lxe7;

    .line 1356
    .line 1357
    const/4 v15, 0x0

    .line 1358
    iput-boolean v15, v6, Lfg1;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1359
    .line 1360
    monitor-exit v8

    .line 1361
    invoke-virtual {v6}, Lfg1;->e()V

    .line 1362
    .line 1363
    .line 1364
    goto :goto_24

    .line 1365
    :goto_26
    monitor-exit v8

    .line 1366
    throw v0

    .line 1367
    :cond_38
    :goto_27
    if-ge v1, v2, :cond_3c

    .line 1368
    .line 1369
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v0

    .line 1373
    check-cast v0, Lr00;

    .line 1374
    .line 1375
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v5

    .line 1379
    check-cast v5, Ljava/lang/Boolean;

    .line 1380
    .line 1381
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1382
    .line 1383
    .line 1384
    move-result v5

    .line 1385
    if-eqz v5, :cond_39

    .line 1386
    .line 1387
    iget v5, v0, Lr00;->s:I

    .line 1388
    .line 1389
    if-ltz v5, :cond_39

    .line 1390
    .line 1391
    iput v7, v0, Lr00;->s:I

    .line 1392
    .line 1393
    :cond_39
    iget-object v5, v0, Lr00;->p:Ljava/util/ArrayList;

    .line 1394
    .line 1395
    if-eqz v5, :cond_3b

    .line 1396
    .line 1397
    const/4 v10, 0x0

    .line 1398
    :goto_28
    iget-object v5, v0, Lr00;->p:Ljava/util/ArrayList;

    .line 1399
    .line 1400
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1401
    .line 1402
    .line 1403
    move-result v5

    .line 1404
    if-ge v10, v5, :cond_3a

    .line 1405
    .line 1406
    iget-object v5, v0, Lr00;->p:Ljava/util/ArrayList;

    .line 1407
    .line 1408
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v5

    .line 1412
    check-cast v5, Ljava/lang/Runnable;

    .line 1413
    .line 1414
    invoke-interface {v5}, Ljava/lang/Runnable;->run()V

    .line 1415
    .line 1416
    .line 1417
    add-int/lit8 v10, v10, 0x1

    .line 1418
    .line 1419
    goto :goto_28

    .line 1420
    :cond_3a
    const/4 v11, 0x0

    .line 1421
    iput-object v11, v0, Lr00;->p:Ljava/util/ArrayList;

    .line 1422
    .line 1423
    goto :goto_29

    .line 1424
    :cond_3b
    const/4 v11, 0x0

    .line 1425
    :goto_29
    add-int/lit8 v1, v1, 0x1

    .line 1426
    .line 1427
    goto :goto_27

    .line 1428
    :cond_3c
    if-eqz v23, :cond_3e

    .line 1429
    .line 1430
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->size()I

    .line 1431
    .line 1432
    .line 1433
    move-result v0

    .line 1434
    if-gtz v0, :cond_3d

    .line 1435
    .line 1436
    goto :goto_2a

    .line 1437
    :cond_3d
    move-object/from16 v0, v25

    .line 1438
    .line 1439
    const/4 v15, 0x0

    .line 1440
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v0

    .line 1444
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1445
    .line 1446
    .line 1447
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 1448
    .line 1449
    .line 1450
    :cond_3e
    :goto_2a
    return-void

    .line 1451
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final D(I)Lqk2;
    .locals 4

    .line 1
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 2
    .line 3
    iget-object v0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lqk2;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget v3, v2, Lqk2;->z0:I

    .line 24
    .line 25
    if-ne v3, p1, :cond_0

    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object p0, p0, Lz47;->Z:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lwl2;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    iget-object v0, v0, Lwl2;->c:Lqk2;

    .line 58
    .line 59
    iget v1, v0, Lqk2;->z0:I

    .line 60
    .line 61
    if-ne v1, p1, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_3
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.method public final E(Ljava/lang/String;)Lqk2;
    .locals 4

    .line 1
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 2
    .line 3
    iget-object v0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lqk2;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v3, v2, Lqk2;->B0:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object p0, p0, Lz47;->Z:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lwl2;

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iget-object v0, v0, Lwl2;->c:Lqk2;

    .line 62
    .line 63
    iget-object v1, v0, Lqk2;->B0:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_3
    const/4 p0, 0x0

    .line 73
    return-object p0
.end method

.method public final F()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lml2;->f()Ljava/util/HashSet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lfg1;

    .line 20
    .line 21
    iget-boolean v1, v0, Lfg1;->f:Z

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, v0, Lfg1;->f:Z

    .line 27
    .line 28
    invoke-virtual {v0}, Lfg1;->e()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
.end method

.method public final H(Lqk2;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p1, Lqk2;->I0:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, Lqk2;->A0:I

    .line 7
    .line 8
    if-gtz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Lml2;->x:Lvj8;

    .line 12
    .line 13
    invoke-virtual {v0}, Lvj8;->X()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object p0, p0, Lml2;->x:Lvj8;

    .line 20
    .line 21
    iget p1, p1, Lqk2;->A0:I

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lvj8;->W(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    check-cast p0, Landroid/view/ViewGroup;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public final I()Lgl2;
    .locals 1

    .line 1
    iget-object v0, p0, Lml2;->y:Lqk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Lqk2;->v0:Lml2;

    .line 6
    .line 7
    invoke-virtual {p0}, Lml2;->I()Lgl2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lml2;->A:Lgl2;

    .line 13
    .line 14
    return-object p0
.end method

.method public final J()Lk42;
    .locals 1

    .line 1
    iget-object v0, p0, Lml2;->y:Lqk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Lqk2;->v0:Lml2;

    .line 6
    .line 7
    invoke-virtual {p0}, Lml2;->J()Lk42;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lml2;->B:Lk42;

    .line 13
    .line 14
    return-object p0
.end method

.method public final M()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lml2;->y:Lqk2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lqk2;->s()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lml2;->y:Lqk2;

    .line 14
    .line 15
    invoke-virtual {p0}, Lqk2;->n()Lml2;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lml2;->M()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final P()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lml2;->H:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean p0, p0, Lml2;->I:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public final Q(IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 2
    .line 3
    if-nez v0, :cond_1

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
    const-string p0, "No activity"

    .line 10
    .line 11
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 16
    .line 17
    iget p2, p0, Lml2;->v:I

    .line 18
    .line 19
    if-ne p1, p2, :cond_2

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_2
    iput p1, p0, Lml2;->v:I

    .line 23
    .line 24
    iget-object p1, p0, Lml2;->c:Lz47;

    .line 25
    .line 26
    iget-object p2, p1, Lz47;->Z:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p2, Ljava/util/HashMap;

    .line 29
    .line 30
    iget-object v0, p1, Lz47;->Y:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lqk2;

    .line 49
    .line 50
    iget-object v1, v1, Lqk2;->g0:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lwl2;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v1}, Lwl2;->k()V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lwl2;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    invoke-virtual {v0}, Lwl2;->k()V

    .line 87
    .line 88
    .line 89
    iget-object v1, v0, Lwl2;->c:Lqk2;

    .line 90
    .line 91
    iget-boolean v2, v1, Lqk2;->n0:Z

    .line 92
    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    invoke-virtual {v1}, Lqk2;->u()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Lz47;->O(Lwl2;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    invoke-virtual {p0}, Lml2;->e0()V

    .line 106
    .line 107
    .line 108
    iget-boolean p1, p0, Lml2;->G:Z

    .line 109
    .line 110
    if-eqz p1, :cond_7

    .line 111
    .line 112
    iget-object p1, p0, Lml2;->w:Ltk2;

    .line 113
    .line 114
    if-eqz p1, :cond_7

    .line 115
    .line 116
    iget p2, p0, Lml2;->v:I

    .line 117
    .line 118
    const/4 v0, 0x7

    .line 119
    if-ne p2, v0, :cond_7

    .line 120
    .line 121
    iget-object p1, p1, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 122
    .line 123
    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->invalidateOptionsMenu()V

    .line 124
    .line 125
    .line 126
    const/4 p1, 0x0

    .line 127
    iput-boolean p1, p0, Lml2;->G:Z

    .line 128
    .line 129
    :cond_7
    :goto_3
    return-void
.end method

.method public final R()V
    .locals 2

    .line 1
    iget-object v0, p0, Lml2;->w:Ltk2;

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
    iput-boolean v0, p0, Lml2;->H:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lml2;->I:Z

    .line 10
    .line 11
    iget-object v1, p0, Lml2;->O:Lpl2;

    .line 12
    .line 13
    iput-boolean v0, v1, Lpl2;->g:Z

    .line 14
    .line 15
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 16
    .line 17
    invoke-virtual {p0}, Lz47;->G()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lqk2;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Lqk2;->x0:Lml2;

    .line 40
    .line 41
    invoke-virtual {v0}, Lml2;->R()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    return-void
.end method

.method public final S()Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Lml2;->T(II)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final T(II)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lml2;->A(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1}, Lml2;->z(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Lml2;->z:Lqk2;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Lqk2;->j()Lml2;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Lml2;->S()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    iget-object v2, p0, Lml2;->L:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v3, p0, Lml2;->M:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2, v2, v3}, Lml2;->U(IILjava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-boolean v1, p0, Lml2;->b:Z

    .line 37
    .line 38
    :try_start_0
    iget-object p2, p0, Lml2;->L:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v1, p0, Lml2;->M:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p0, p2, v1}, Lml2;->W(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lml2;->e()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-virtual {p0}, Lml2;->e()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lml2;->g0()V

    .line 55
    .line 56
    .line 57
    iget-boolean p2, p0, Lml2;->K:Z

    .line 58
    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    iput-boolean v0, p0, Lml2;->K:Z

    .line 62
    .line 63
    invoke-virtual {p0}, Lml2;->e0()V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 67
    .line 68
    iget-object p0, p0, Lz47;->Z:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const/4 p2, 0x0

    .line 77
    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {p0, p2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 82
    .line 83
    .line 84
    return p1
.end method

.method public final U(IILjava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p2, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p2, v1

    .line 9
    :goto_0
    iget-object v2, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, -0x1

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    goto :goto_4

    .line 19
    :cond_1
    if-gez p1, :cond_3

    .line 20
    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    move v3, v1

    .line 24
    goto :goto_4

    .line 25
    :cond_2
    iget-object p1, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    add-int/lit8 v3, p1, -0x1

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_3
    iget-object v2, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    sub-int/2addr v2, v0

    .line 41
    :goto_1
    if-ltz v2, :cond_5

    .line 42
    .line 43
    iget-object v4, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Lr00;

    .line 50
    .line 51
    if-ltz p1, :cond_4

    .line 52
    .line 53
    iget v4, v4, Lr00;->s:I

    .line 54
    .line 55
    if-ne p1, v4, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_5
    :goto_2
    if-gez v2, :cond_6

    .line 62
    .line 63
    move v3, v2

    .line 64
    goto :goto_4

    .line 65
    :cond_6
    if-eqz p2, :cond_7

    .line 66
    .line 67
    move v3, v2

    .line 68
    :goto_3
    if-lez v3, :cond_9

    .line 69
    .line 70
    iget-object p2, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 71
    .line 72
    add-int/lit8 v2, v3, -0x1

    .line 73
    .line 74
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    check-cast p2, Lr00;

    .line 79
    .line 80
    if-ltz p1, :cond_9

    .line 81
    .line 82
    iget p2, p2, Lr00;->s:I

    .line 83
    .line 84
    if-ne p1, p2, :cond_9

    .line 85
    .line 86
    add-int/lit8 v3, v3, -0x1

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_7
    iget-object p1, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    sub-int/2addr p1, v0

    .line 96
    if-ne v2, p1, :cond_8

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 100
    .line 101
    :cond_9
    :goto_4
    if-gez v3, :cond_a

    .line 102
    .line 103
    return v1

    .line 104
    :cond_a
    iget-object p1, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    sub-int/2addr p1, v0

    .line 111
    :goto_5
    if-lt p1, v3, :cond_b

    .line 112
    .line 113
    iget-object p2, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    check-cast p2, Lr00;

    .line 120
    .line 121
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    add-int/lit8 p1, p1, -0x1

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_b
    return v0
.end method

.method public final V(Lqk2;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lml2;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Lqk2;->u()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-boolean v1, p1, Lqk2;->D0:Z

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void

    .line 23
    :cond_2
    :goto_0
    iget-object v0, p0, Lml2;->c:Lz47;

    .line 24
    .line 25
    iget-object v1, v0, Lz47;->Y:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    monitor-enter v1

    .line 30
    :try_start_0
    iget-object v0, v0, Lz47;->Y:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p1, Lqk2;->m0:Z

    .line 40
    .line 41
    invoke-static {p1}, Lml2;->L(Lqk2;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v1, 0x1

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iput-boolean v1, p0, Lml2;->G:Z

    .line 49
    .line 50
    :cond_3
    iput-boolean v1, p1, Lqk2;->n0:Z

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lml2;->d0(Lqk2;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p0
.end method

.method public final W(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v1, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lr00;

    .line 31
    .line 32
    iget-boolean v3, v3, Lr00;->o:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, v2, v1, p1, p2}, Lml2;->C(IILjava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lr00;

    .line 74
    .line 75
    iget-boolean v3, v3, Lr00;->o:Z

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, v1, v2, p1, p2}, Lml2;->C(IILjava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v2, -0x1

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, v2, v0, p1, p2}, Lml2;->C(IILjava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_2
    return-void

    .line 96
    :cond_6
    const-string p0, "Internal error with the back stack records"

    .line 97
    .line 98
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final X(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    const-string v4, "result_"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    iget-object v5, v0, Lml2;->w:Ltk2;

    .line 40
    .line 41
    iget-object v5, v5, Ltk2;->C0:Landroidx/appcompat/app/AppCompatActivity;

    .line 42
    .line 43
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x7

    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object v5, v0, Lml2;->m:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    const-string v5, "fragment_"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    iget-object v6, v0, Lml2;->w:Ltk2;

    .line 101
    .line 102
    iget-object v6, v6, Ltk2;->C0:Landroidx/appcompat/app/AppCompatActivity;

    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 109
    .line 110
    .line 111
    const/16 v6, 0x9

    .line 112
    .line 113
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget-object v3, v0, Lml2;->c:Lz47;

    .line 122
    .line 123
    iget-object v4, v3, Lz47;->f0:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Ljava/util/HashMap;

    .line 126
    .line 127
    iget-object v5, v3, Lz47;->Z:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v5, Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
    const-string v2, "state"

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Lnl2;

    .line 144
    .line 145
    if-nez v1, :cond_4

    .line 146
    .line 147
    return-void

    .line 148
    :cond_4
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    .line 149
    .line 150
    .line 151
    iget-object v4, v1, Lnl2;->X:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    iget-object v7, v0, Lml2;->o:Lmj0;

    .line 162
    .line 163
    const/4 v8, 0x2

    .line 164
    if-eqz v6, :cond_9

    .line 165
    .line 166
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    check-cast v6, Ljava/lang/String;

    .line 171
    .line 172
    const/4 v9, 0x0

    .line 173
    invoke-virtual {v3, v6, v9}, Lz47;->R(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 174
    .line 175
    .line 176
    move-result-object v15

    .line 177
    if-eqz v15, :cond_5

    .line 178
    .line 179
    invoke-virtual {v15, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    check-cast v6, Ltl2;

    .line 184
    .line 185
    iget-object v9, v0, Lml2;->O:Lpl2;

    .line 186
    .line 187
    iget-object v6, v6, Ltl2;->Y:Ljava/lang/String;

    .line 188
    .line 189
    iget-object v9, v9, Lpl2;->b:Ljava/util/HashMap;

    .line 190
    .line 191
    invoke-virtual {v9, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    check-cast v6, Lqk2;

    .line 196
    .line 197
    if-eqz v6, :cond_7

    .line 198
    .line 199
    invoke-static {v8}, Lml2;->K(I)Z

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    if-eqz v9, :cond_6

    .line 204
    .line 205
    invoke-virtual {v6}, Lqk2;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    :cond_6
    new-instance v9, Lwl2;

    .line 209
    .line 210
    invoke-direct {v9, v7, v3, v6, v15}, Lwl2;-><init>(Lmj0;Lz47;Lqk2;Landroid/os/Bundle;)V

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_7
    new-instance v10, Lwl2;

    .line 215
    .line 216
    iget-object v6, v0, Lml2;->w:Ltk2;

    .line 217
    .line 218
    iget-object v6, v6, Ltk2;->C0:Landroidx/appcompat/app/AppCompatActivity;

    .line 219
    .line 220
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 221
    .line 222
    .line 223
    move-result-object v13

    .line 224
    invoke-virtual {v0}, Lml2;->I()Lgl2;

    .line 225
    .line 226
    .line 227
    move-result-object v14

    .line 228
    iget-object v11, v0, Lml2;->o:Lmj0;

    .line 229
    .line 230
    iget-object v12, v0, Lml2;->c:Lz47;

    .line 231
    .line 232
    invoke-direct/range {v10 .. v15}, Lwl2;-><init>(Lmj0;Lz47;Ljava/lang/ClassLoader;Lgl2;Landroid/os/Bundle;)V

    .line 233
    .line 234
    .line 235
    move-object v9, v10

    .line 236
    :goto_3
    iget-object v6, v9, Lwl2;->c:Lqk2;

    .line 237
    .line 238
    iput-object v15, v6, Lqk2;->Y:Landroid/os/Bundle;

    .line 239
    .line 240
    iput-object v0, v6, Lqk2;->v0:Lml2;

    .line 241
    .line 242
    invoke-static {v8}, Lml2;->K(I)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    if-eqz v7, :cond_8

    .line 247
    .line 248
    invoke-virtual {v6}, Lqk2;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    :cond_8
    iget-object v6, v0, Lml2;->w:Ltk2;

    .line 252
    .line 253
    iget-object v6, v6, Ltk2;->C0:Landroidx/appcompat/app/AppCompatActivity;

    .line 254
    .line 255
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    invoke-virtual {v9, v6}, Lwl2;->m(Ljava/lang/ClassLoader;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3, v9}, Lz47;->N(Lwl2;)V

    .line 263
    .line 264
    .line 265
    iget v6, v0, Lml2;->v:I

    .line 266
    .line 267
    iput v6, v9, Lwl2;->e:I

    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_9
    iget-object v2, v0, Lml2;->O:Lpl2;

    .line 271
    .line 272
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    new-instance v4, Ljava/util/ArrayList;

    .line 276
    .line 277
    iget-object v2, v2, Lpl2;->b:Ljava/util/HashMap;

    .line 278
    .line 279
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    const/4 v6, 0x1

    .line 295
    if-eqz v4, :cond_c

    .line 296
    .line 297
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    check-cast v4, Lqk2;

    .line 302
    .line 303
    iget-object v9, v4, Lqk2;->g0:Ljava/lang/String;

    .line 304
    .line 305
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    if-eqz v9, :cond_a

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_a
    invoke-static {v8}, Lml2;->K(I)Z

    .line 313
    .line 314
    .line 315
    move-result v9

    .line 316
    if-eqz v9, :cond_b

    .line 317
    .line 318
    invoke-virtual {v4}, Lqk2;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    iget-object v9, v1, Lnl2;->X:Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    :cond_b
    iget-object v9, v0, Lml2;->O:Lpl2;

    .line 327
    .line 328
    invoke-virtual {v9, v4}, Lpl2;->g(Lqk2;)V

    .line 329
    .line 330
    .line 331
    iput-object v0, v4, Lqk2;->v0:Lml2;

    .line 332
    .line 333
    new-instance v9, Lwl2;

    .line 334
    .line 335
    invoke-direct {v9, v7, v3, v4}, Lwl2;-><init>(Lmj0;Lz47;Lqk2;)V

    .line 336
    .line 337
    .line 338
    iput v6, v9, Lwl2;->e:I

    .line 339
    .line 340
    invoke-virtual {v9}, Lwl2;->k()V

    .line 341
    .line 342
    .line 343
    iput-boolean v6, v4, Lqk2;->n0:Z

    .line 344
    .line 345
    invoke-virtual {v9}, Lwl2;->k()V

    .line 346
    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_c
    iget-object v2, v1, Lnl2;->Y:Ljava/util/ArrayList;

    .line 350
    .line 351
    iget-object v4, v3, Lz47;->Y:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v4, Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 356
    .line 357
    .line 358
    if-eqz v2, :cond_f

    .line 359
    .line 360
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    if-eqz v4, :cond_f

    .line 369
    .line 370
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    check-cast v4, Ljava/lang/String;

    .line 375
    .line 376
    invoke-virtual {v3, v4}, Lz47;->z(Ljava/lang/String;)Lqk2;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    if-eqz v5, :cond_e

    .line 381
    .line 382
    invoke-static {v8}, Lml2;->K(I)Z

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    if-eqz v4, :cond_d

    .line 387
    .line 388
    invoke-virtual {v5}, Lqk2;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    :cond_d
    invoke-virtual {v3, v5}, Lz47;->i(Lqk2;)V

    .line 392
    .line 393
    .line 394
    goto :goto_5

    .line 395
    :cond_e
    const-string v0, "No instantiated fragment for ("

    .line 396
    .line 397
    const-string v1, ")"

    .line 398
    .line 399
    invoke-static {v0, v4, v1}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    return-void

    .line 407
    :cond_f
    iget-object v2, v1, Lnl2;->Z:[Ls00;

    .line 408
    .line 409
    if-eqz v2, :cond_17

    .line 410
    .line 411
    new-instance v2, Ljava/util/ArrayList;

    .line 412
    .line 413
    iget-object v5, v1, Lnl2;->Z:[Ls00;

    .line 414
    .line 415
    array-length v5, v5

    .line 416
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 417
    .line 418
    .line 419
    iput-object v2, v0, Lml2;->d:Ljava/util/ArrayList;

    .line 420
    .line 421
    const/4 v2, 0x0

    .line 422
    :goto_6
    iget-object v5, v1, Lnl2;->Z:[Ls00;

    .line 423
    .line 424
    array-length v7, v5

    .line 425
    if-ge v2, v7, :cond_16

    .line 426
    .line 427
    aget-object v5, v5, v2

    .line 428
    .line 429
    iget-object v7, v5, Ls00;->Y:Ljava/util/ArrayList;

    .line 430
    .line 431
    new-instance v9, Lr00;

    .line 432
    .line 433
    invoke-direct {v9, v0}, Lr00;-><init>(Lml2;)V

    .line 434
    .line 435
    .line 436
    iget-object v10, v5, Ls00;->X:[I

    .line 437
    .line 438
    const/4 v11, 0x0

    .line 439
    const/4 v12, 0x0

    .line 440
    :goto_7
    array-length v13, v10

    .line 441
    if-ge v11, v13, :cond_12

    .line 442
    .line 443
    new-instance v13, Lcm2;

    .line 444
    .line 445
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 446
    .line 447
    .line 448
    add-int/lit8 v14, v11, 0x1

    .line 449
    .line 450
    aget v15, v10, v11

    .line 451
    .line 452
    iput v15, v13, Lcm2;->a:I

    .line 453
    .line 454
    invoke-static {v8}, Lml2;->K(I)Z

    .line 455
    .line 456
    .line 457
    move-result v15

    .line 458
    if-eqz v15, :cond_10

    .line 459
    .line 460
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    aget v15, v10, v14

    .line 464
    .line 465
    :cond_10
    invoke-static {}, Lo84;->values()[Lo84;

    .line 466
    .line 467
    .line 468
    move-result-object v15

    .line 469
    move/from16 p1, v8

    .line 470
    .line 471
    iget-object v8, v5, Ls00;->Z:[I

    .line 472
    .line 473
    aget v8, v8, v12

    .line 474
    .line 475
    aget-object v8, v15, v8

    .line 476
    .line 477
    iput-object v8, v13, Lcm2;->h:Lo84;

    .line 478
    .line 479
    invoke-static {}, Lo84;->values()[Lo84;

    .line 480
    .line 481
    .line 482
    move-result-object v8

    .line 483
    iget-object v15, v5, Ls00;->f0:[I

    .line 484
    .line 485
    aget v15, v15, v12

    .line 486
    .line 487
    aget-object v8, v8, v15

    .line 488
    .line 489
    iput-object v8, v13, Lcm2;->i:Lo84;

    .line 490
    .line 491
    add-int/lit8 v8, v11, 0x2

    .line 492
    .line 493
    aget v14, v10, v14

    .line 494
    .line 495
    if-eqz v14, :cond_11

    .line 496
    .line 497
    move v14, v6

    .line 498
    goto :goto_8

    .line 499
    :cond_11
    const/4 v14, 0x0

    .line 500
    :goto_8
    iput-boolean v14, v13, Lcm2;->c:Z

    .line 501
    .line 502
    add-int/lit8 v14, v11, 0x3

    .line 503
    .line 504
    aget v8, v10, v8

    .line 505
    .line 506
    iput v8, v13, Lcm2;->d:I

    .line 507
    .line 508
    add-int/lit8 v15, v11, 0x4

    .line 509
    .line 510
    aget v14, v10, v14

    .line 511
    .line 512
    iput v14, v13, Lcm2;->e:I

    .line 513
    .line 514
    add-int/lit8 v16, v11, 0x5

    .line 515
    .line 516
    aget v15, v10, v15

    .line 517
    .line 518
    iput v15, v13, Lcm2;->f:I

    .line 519
    .line 520
    add-int/lit8 v11, v11, 0x6

    .line 521
    .line 522
    aget v4, v10, v16

    .line 523
    .line 524
    iput v4, v13, Lcm2;->g:I

    .line 525
    .line 526
    iput v8, v9, Lr00;->b:I

    .line 527
    .line 528
    iput v14, v9, Lr00;->c:I

    .line 529
    .line 530
    iput v15, v9, Lr00;->d:I

    .line 531
    .line 532
    iput v4, v9, Lr00;->e:I

    .line 533
    .line 534
    invoke-virtual {v9, v13}, Lr00;->b(Lcm2;)V

    .line 535
    .line 536
    .line 537
    add-int/lit8 v12, v12, 0x1

    .line 538
    .line 539
    move/from16 v8, p1

    .line 540
    .line 541
    goto :goto_7

    .line 542
    :cond_12
    move/from16 p1, v8

    .line 543
    .line 544
    iget v4, v5, Ls00;->g0:I

    .line 545
    .line 546
    iput v4, v9, Lr00;->f:I

    .line 547
    .line 548
    iget-object v4, v5, Ls00;->h0:Ljava/lang/String;

    .line 549
    .line 550
    iput-object v4, v9, Lr00;->h:Ljava/lang/String;

    .line 551
    .line 552
    iput-boolean v6, v9, Lr00;->g:Z

    .line 553
    .line 554
    iget v4, v5, Ls00;->j0:I

    .line 555
    .line 556
    iput v4, v9, Lr00;->i:I

    .line 557
    .line 558
    iget-object v4, v5, Ls00;->k0:Ljava/lang/CharSequence;

    .line 559
    .line 560
    iput-object v4, v9, Lr00;->j:Ljava/lang/CharSequence;

    .line 561
    .line 562
    iget v4, v5, Ls00;->l0:I

    .line 563
    .line 564
    iput v4, v9, Lr00;->k:I

    .line 565
    .line 566
    iget-object v4, v5, Ls00;->m0:Ljava/lang/CharSequence;

    .line 567
    .line 568
    iput-object v4, v9, Lr00;->l:Ljava/lang/CharSequence;

    .line 569
    .line 570
    iget-object v4, v5, Ls00;->n0:Ljava/util/ArrayList;

    .line 571
    .line 572
    iput-object v4, v9, Lr00;->m:Ljava/util/ArrayList;

    .line 573
    .line 574
    iget-object v4, v5, Ls00;->o0:Ljava/util/ArrayList;

    .line 575
    .line 576
    iput-object v4, v9, Lr00;->n:Ljava/util/ArrayList;

    .line 577
    .line 578
    iget-boolean v4, v5, Ls00;->p0:Z

    .line 579
    .line 580
    iput-boolean v4, v9, Lr00;->o:Z

    .line 581
    .line 582
    iget v4, v5, Ls00;->i0:I

    .line 583
    .line 584
    iput v4, v9, Lr00;->s:I

    .line 585
    .line 586
    const/4 v4, 0x0

    .line 587
    :goto_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 588
    .line 589
    .line 590
    move-result v5

    .line 591
    if-ge v4, v5, :cond_14

    .line 592
    .line 593
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v5

    .line 597
    check-cast v5, Ljava/lang/String;

    .line 598
    .line 599
    if-eqz v5, :cond_13

    .line 600
    .line 601
    iget-object v8, v9, Lr00;->a:Ljava/util/ArrayList;

    .line 602
    .line 603
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v8

    .line 607
    check-cast v8, Lcm2;

    .line 608
    .line 609
    invoke-virtual {v3, v5}, Lz47;->z(Ljava/lang/String;)Lqk2;

    .line 610
    .line 611
    .line 612
    move-result-object v5

    .line 613
    iput-object v5, v8, Lcm2;->b:Lqk2;

    .line 614
    .line 615
    :cond_13
    add-int/lit8 v4, v4, 0x1

    .line 616
    .line 617
    goto :goto_9

    .line 618
    :cond_14
    invoke-virtual {v9, v6}, Lr00;->c(I)V

    .line 619
    .line 620
    .line 621
    invoke-static/range {p1 .. p1}, Lml2;->K(I)Z

    .line 622
    .line 623
    .line 624
    move-result v4

    .line 625
    if-eqz v4, :cond_15

    .line 626
    .line 627
    invoke-virtual {v9}, Lr00;->toString()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    new-instance v4, Lih4;

    .line 631
    .line 632
    invoke-direct {v4}, Lih4;-><init>()V

    .line 633
    .line 634
    .line 635
    new-instance v5, Ljava/io/PrintWriter;

    .line 636
    .line 637
    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 638
    .line 639
    .line 640
    const-string v4, "  "

    .line 641
    .line 642
    const/4 v7, 0x0

    .line 643
    invoke-virtual {v9, v4, v5, v7}, Lr00;->h(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 647
    .line 648
    .line 649
    goto :goto_a

    .line 650
    :cond_15
    const/4 v7, 0x0

    .line 651
    :goto_a
    iget-object v4, v0, Lml2;->d:Ljava/util/ArrayList;

    .line 652
    .line 653
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    add-int/lit8 v2, v2, 0x1

    .line 657
    .line 658
    move/from16 v8, p1

    .line 659
    .line 660
    goto/16 :goto_6

    .line 661
    .line 662
    :cond_16
    const/4 v7, 0x0

    .line 663
    goto :goto_b

    .line 664
    :cond_17
    const/4 v7, 0x0

    .line 665
    new-instance v2, Ljava/util/ArrayList;

    .line 666
    .line 667
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 668
    .line 669
    .line 670
    iput-object v2, v0, Lml2;->d:Ljava/util/ArrayList;

    .line 671
    .line 672
    :goto_b
    iget-object v2, v0, Lml2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 673
    .line 674
    iget v4, v1, Lnl2;->f0:I

    .line 675
    .line 676
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 677
    .line 678
    .line 679
    iget-object v2, v1, Lnl2;->g0:Ljava/lang/String;

    .line 680
    .line 681
    if-eqz v2, :cond_18

    .line 682
    .line 683
    invoke-virtual {v3, v2}, Lz47;->z(Ljava/lang/String;)Lqk2;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    iput-object v2, v0, Lml2;->z:Lqk2;

    .line 688
    .line 689
    invoke-virtual {v0, v2}, Lml2;->s(Lqk2;)V

    .line 690
    .line 691
    .line 692
    :cond_18
    iget-object v2, v1, Lnl2;->h0:Ljava/util/ArrayList;

    .line 693
    .line 694
    if-eqz v2, :cond_19

    .line 695
    .line 696
    move v4, v7

    .line 697
    :goto_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    if-ge v4, v3, :cond_19

    .line 702
    .line 703
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    check-cast v3, Ljava/lang/String;

    .line 708
    .line 709
    iget-object v5, v1, Lnl2;->i0:Ljava/util/ArrayList;

    .line 710
    .line 711
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v5

    .line 715
    check-cast v5, Lt00;

    .line 716
    .line 717
    iget-object v6, v0, Lml2;->l:Ljava/util/Map;

    .line 718
    .line 719
    invoke-interface {v6, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    add-int/lit8 v4, v4, 0x1

    .line 723
    .line 724
    goto :goto_c

    .line 725
    :cond_19
    new-instance v2, Ljava/util/ArrayDeque;

    .line 726
    .line 727
    iget-object v1, v1, Lnl2;->j0:Ljava/util/ArrayList;

    .line 728
    .line 729
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 730
    .line 731
    .line 732
    iput-object v2, v0, Lml2;->F:Ljava/util/ArrayDeque;

    .line 733
    .line 734
    return-void
.end method

.method public final Y()Landroid/os/Bundle;
    .locals 11

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lml2;->F()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lml2;->x()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p0, v1}, Lml2;->A(Z)Z

    .line 14
    .line 15
    .line 16
    iput-boolean v1, p0, Lml2;->H:Z

    .line 17
    .line 18
    iget-object v2, p0, Lml2;->O:Lpl2;

    .line 19
    .line 20
    iput-boolean v1, v2, Lpl2;->g:Z

    .line 21
    .line 22
    iget-object v1, p0, Lml2;->c:Lz47;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v3, v1, Lz47;->Z:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/4 v5, 0x2

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Lwl2;

    .line 60
    .line 61
    if-eqz v4, :cond_0

    .line 62
    .line 63
    iget-object v6, v4, Lwl2;->c:Lqk2;

    .line 64
    .line 65
    iget-object v7, v6, Lqk2;->g0:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v4}, Lwl2;->o()Landroid/os/Bundle;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v1, v7, v4}, Lz47;->R(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 72
    .line 73
    .line 74
    iget-object v4, v6, Lqk2;->g0:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Lml2;->K(I)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_0

    .line 84
    .line 85
    invoke-virtual {v6}, Lqk2;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    iget-object v4, v6, Lqk2;->Y:Landroid/os/Bundle;

    .line 89
    .line 90
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    iget-object v1, p0, Lml2;->c:Lz47;

    .line 95
    .line 96
    iget-object v1, v1, Lz47;->f0:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, Ljava/util/HashMap;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_2
    iget-object v3, p0, Lml2;->c:Lz47;

    .line 109
    .line 110
    iget-object v4, v3, Lz47;->Y:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v4, Ljava/util/ArrayList;

    .line 113
    .line 114
    monitor-enter v4

    .line 115
    :try_start_0
    iget-object v6, v3, Lz47;->Y:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v6, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    const/4 v7, 0x0

    .line 124
    if-eqz v6, :cond_3

    .line 125
    .line 126
    monitor-exit v4

    .line 127
    move-object v6, v7

    .line 128
    goto :goto_2

    .line 129
    :catchall_0
    move-exception p0

    .line 130
    goto/16 :goto_7

    .line 131
    .line 132
    :cond_3
    new-instance v6, Ljava/util/ArrayList;

    .line 133
    .line 134
    iget-object v8, v3, Lz47;->Y:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v8, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 143
    .line 144
    .line 145
    iget-object v3, v3, Lz47;->Y:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v3, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-eqz v8, :cond_5

    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    check-cast v8, Lqk2;

    .line 164
    .line 165
    iget-object v9, v8, Lqk2;->g0:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    invoke-static {v5}, Lml2;->K(I)Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-eqz v9, :cond_4

    .line 175
    .line 176
    invoke-virtual {v8}, Lqk2;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_5
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    :goto_2
    iget-object v3, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-lez v3, :cond_7

    .line 188
    .line 189
    new-array v4, v3, [Ls00;

    .line 190
    .line 191
    const/4 v8, 0x0

    .line 192
    :goto_3
    if-ge v8, v3, :cond_8

    .line 193
    .line 194
    new-instance v9, Ls00;

    .line 195
    .line 196
    iget-object v10, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    check-cast v10, Lr00;

    .line 203
    .line 204
    invoke-direct {v9, v10}, Ls00;-><init>(Lr00;)V

    .line 205
    .line 206
    .line 207
    aput-object v9, v4, v8

    .line 208
    .line 209
    invoke-static {v5}, Lml2;->K(I)Z

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    if-eqz v9, :cond_6

    .line 214
    .line 215
    iget-object v9, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_7
    move-object v4, v7

    .line 228
    :cond_8
    new-instance v3, Lnl2;

    .line 229
    .line 230
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 231
    .line 232
    .line 233
    iput-object v7, v3, Lnl2;->g0:Ljava/lang/String;

    .line 234
    .line 235
    new-instance v5, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 238
    .line 239
    .line 240
    iput-object v5, v3, Lnl2;->h0:Ljava/util/ArrayList;

    .line 241
    .line 242
    new-instance v7, Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 245
    .line 246
    .line 247
    iput-object v7, v3, Lnl2;->i0:Ljava/util/ArrayList;

    .line 248
    .line 249
    iput-object v2, v3, Lnl2;->X:Ljava/util/ArrayList;

    .line 250
    .line 251
    iput-object v6, v3, Lnl2;->Y:Ljava/util/ArrayList;

    .line 252
    .line 253
    iput-object v4, v3, Lnl2;->Z:[Ls00;

    .line 254
    .line 255
    iget-object v2, p0, Lml2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 256
    .line 257
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    iput v2, v3, Lnl2;->f0:I

    .line 262
    .line 263
    iget-object v2, p0, Lml2;->z:Lqk2;

    .line 264
    .line 265
    if-eqz v2, :cond_9

    .line 266
    .line 267
    iget-object v2, v2, Lqk2;->g0:Ljava/lang/String;

    .line 268
    .line 269
    iput-object v2, v3, Lnl2;->g0:Ljava/lang/String;

    .line 270
    .line 271
    :cond_9
    iget-object v2, p0, Lml2;->l:Ljava/util/Map;

    .line 272
    .line 273
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 278
    .line 279
    .line 280
    iget-object v2, p0, Lml2;->l:Ljava/util/Map;

    .line 281
    .line 282
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 287
    .line 288
    .line 289
    new-instance v2, Ljava/util/ArrayList;

    .line 290
    .line 291
    iget-object v4, p0, Lml2;->F:Ljava/util/ArrayDeque;

    .line 292
    .line 293
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 294
    .line 295
    .line 296
    iput-object v2, v3, Lnl2;->j0:Ljava/util/ArrayList;

    .line 297
    .line 298
    const-string v2, "state"

    .line 299
    .line 300
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 301
    .line 302
    .line 303
    iget-object v2, p0, Lml2;->m:Ljava/util/Map;

    .line 304
    .line 305
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-eqz v3, :cond_a

    .line 318
    .line 319
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    check-cast v3, Ljava/lang/String;

    .line 324
    .line 325
    const-string v4, "result_"

    .line 326
    .line 327
    invoke-static {v4, v3}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    iget-object v5, p0, Lml2;->m:Ljava/util/Map;

    .line 332
    .line 333
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    check-cast v3, Landroid/os/Bundle;

    .line 338
    .line 339
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 340
    .line 341
    .line 342
    goto :goto_4

    .line 343
    :cond_a
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-eqz v2, :cond_b

    .line 356
    .line 357
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    check-cast v2, Ljava/lang/String;

    .line 362
    .line 363
    const-string v3, "fragment_"

    .line 364
    .line 365
    invoke-static {v3, v2}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    check-cast v2, Landroid/os/Bundle;

    .line 374
    .line 375
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 376
    .line 377
    .line 378
    goto :goto_5

    .line 379
    :cond_b
    :goto_6
    return-object v0

    .line 380
    :goto_7
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 381
    throw p0
.end method

.method public final Z()V
    .locals 3

    .line 1
    iget-object v0, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lml2;->w:Ltk2;

    .line 14
    .line 15
    iget-object v1, v1, Ltk2;->D0:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v2, p0, Lml2;->P:Lxb;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lml2;->w:Ltk2;

    .line 23
    .line 24
    iget-object v1, v1, Ltk2;->D0:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v2, p0, Lml2;->P:Lxb;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lml2;->g0()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p0
.end method

.method public final a(Lqk2;)Lwl2;
    .locals 3

    .line 1
    iget-object v0, p1, Lqk2;->Q0:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, v0}, Lam2;->c(Lqk2;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Lml2;->K(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Lqk2;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-virtual {p0, p1}, Lml2;->h(Lqk2;)Lwl2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object p0, p1, Lqk2;->v0:Lml2;

    .line 23
    .line 24
    iget-object v1, p0, Lml2;->c:Lz47;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lz47;->N(Lwl2;)V

    .line 27
    .line 28
    .line 29
    iget-boolean v2, p1, Lqk2;->D0:Z

    .line 30
    .line 31
    if-nez v2, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Lz47;->i(Lqk2;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    iput-boolean v1, p1, Lqk2;->n0:Z

    .line 38
    .line 39
    iget-object v2, p1, Lqk2;->J0:Landroid/view/View;

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    iput-boolean v1, p1, Lqk2;->N0:Z

    .line 44
    .line 45
    :cond_2
    invoke-static {p1}, Lml2;->L(Lqk2;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    iput-boolean p1, p0, Lml2;->G:Z

    .line 53
    .line 54
    :cond_3
    return-object v0
.end method

.method public final a0(Lqk2;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lml2;->H(Lqk2;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    instance-of p1, p0, Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p0, Landroidx/fragment/app/FragmentContainerView;

    .line 12
    .line 13
    xor-int/lit8 p1, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final b(Ltk2;Lvj8;Lqk2;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 2
    .line 3
    if-nez v0, :cond_11

    .line 4
    .line 5
    iput-object p1, p0, Lml2;->w:Ltk2;

    .line 6
    .line 7
    iput-object p2, p0, Lml2;->x:Lvj8;

    .line 8
    .line 9
    iput-object p3, p0, Lml2;->y:Lqk2;

    .line 10
    .line 11
    iget-object p2, p0, Lml2;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Lhl2;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Lhl2;-><init>(Lqk2;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    iget-object p2, p0, Lml2;->y:Lqk2;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lml2;->g0()V

    .line 34
    .line 35
    .line 36
    :cond_2
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-object p2, p1, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 39
    .line 40
    invoke-virtual {p2}, Landroidx/activity/ComponentActivity;->b()Lz95;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, Lml2;->g:Lz95;

    .line 45
    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    move-object v0, p3

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move-object v0, p1

    .line 51
    :goto_1
    iget-object v1, p0, Lml2;->j:Ll00;

    .line 52
    .line 53
    invoke-virtual {p2, v0, v1}, Lz95;->a(Ld94;Lu95;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    const/4 p2, 0x0

    .line 57
    if-eqz p3, :cond_6

    .line 58
    .line 59
    iget-object p1, p3, Lqk2;->v0:Lml2;

    .line 60
    .line 61
    iget-object p1, p1, Lml2;->O:Lpl2;

    .line 62
    .line 63
    iget-object v0, p1, Lpl2;->c:Ljava/util/HashMap;

    .line 64
    .line 65
    iget-object v1, p3, Lqk2;->g0:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Lpl2;

    .line 72
    .line 73
    if-nez v1, :cond_5

    .line 74
    .line 75
    new-instance v1, Lpl2;

    .line 76
    .line 77
    iget-boolean p1, p1, Lpl2;->e:Z

    .line 78
    .line 79
    invoke-direct {v1, p1}, Lpl2;-><init>(Z)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p3, Lqk2;->g0:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_5
    iput-object v1, p0, Lml2;->O:Lpl2;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    if-eqz p1, :cond_8

    .line 91
    .line 92
    iget-object p1, p1, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->e()Lex8;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    sget-object v0, Ln71;->b:Ln71;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v1, Lyr6;

    .line 104
    .line 105
    sget-object v2, Lpl2;->h:Lol2;

    .line 106
    .line 107
    invoke-direct {v1, p1, v2, v0}, Lyr6;-><init>(Lex8;Lbx8;Lo71;)V

    .line 108
    .line 109
    .line 110
    const-class p1, Lpl2;

    .line 111
    .line 112
    sget-object v0, Lyb6;->a:Lzb6;

    .line 113
    .line 114
    invoke-virtual {v0, p1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-interface {p1}, Lzu3;->p()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 125
    .line 126
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v1, p1, v0}, Lyr6;->g(Lzu3;Ljava/lang/String;)Lxw8;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    move-object v1, p1

    .line 135
    check-cast v1, Lpl2;

    .line 136
    .line 137
    iput-object v1, p0, Lml2;->O:Lpl2;

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 141
    .line 142
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_8
    new-instance v1, Lpl2;

    .line 147
    .line 148
    invoke-direct {v1, p2}, Lpl2;-><init>(Z)V

    .line 149
    .line 150
    .line 151
    iput-object v1, p0, Lml2;->O:Lpl2;

    .line 152
    .line 153
    :goto_2
    invoke-virtual {p0}, Lml2;->P()Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    iput-boolean p1, v1, Lpl2;->g:Z

    .line 158
    .line 159
    iget-object p1, p0, Lml2;->c:Lz47;

    .line 160
    .line 161
    iget-object v0, p0, Lml2;->O:Lpl2;

    .line 162
    .line 163
    iput-object v0, p1, Lz47;->g0:Ljava/lang/Object;

    .line 164
    .line 165
    iget-object p1, p0, Lml2;->w:Ltk2;

    .line 166
    .line 167
    const/4 v0, 0x3

    .line 168
    if-eqz p1, :cond_9

    .line 169
    .line 170
    if-nez p3, :cond_9

    .line 171
    .line 172
    invoke-virtual {p1}, Ltk2;->f()Lxd6;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    new-instance v1, Lhy0;

    .line 177
    .line 178
    invoke-direct {v1, p0, v0}, Lhy0;-><init>(Ljava/lang/Object;B)V

    .line 179
    .line 180
    .line 181
    const-string v2, "android:support:fragments"

    .line 182
    .line 183
    invoke-virtual {p1, v2, v1}, Lxd6;->D(Ljava/lang/String;Lwv6;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v2}, Lxd6;->i(Ljava/lang/String;)Landroid/os/Bundle;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    if-eqz p1, :cond_9

    .line 191
    .line 192
    invoke-virtual {p0, p1}, Lml2;->X(Landroid/os/Bundle;)V

    .line 193
    .line 194
    .line 195
    :cond_9
    iget-object p1, p0, Lml2;->w:Ltk2;

    .line 196
    .line 197
    if-eqz p1, :cond_b

    .line 198
    .line 199
    iget-object p1, p1, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 200
    .line 201
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->k0:Lly0;

    .line 202
    .line 203
    if-eqz p3, :cond_a

    .line 204
    .line 205
    new-instance v1, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    iget-object v2, p3, Lqk2;->g0:Ljava/lang/String;

    .line 211
    .line 212
    const-string v3, ":"

    .line 213
    .line 214
    invoke-static {v1, v2, v3}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    goto :goto_3

    .line 219
    :cond_a
    const-string v1, ""

    .line 220
    .line 221
    :goto_3
    const-string v2, "FragmentManager:"

    .line 222
    .line 223
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    const-string v2, "StartActivityForResult"

    .line 228
    .line 229
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    new-instance v3, Ln6;

    .line 234
    .line 235
    const/4 v4, 0x2

    .line 236
    invoke-direct {v3, v4}, Ln6;-><init>(B)V

    .line 237
    .line 238
    .line 239
    new-instance v4, Lvk1;

    .line 240
    .line 241
    const/16 v5, 0xa

    .line 242
    .line 243
    invoke-direct {v4, p0, v5}, Lvk1;-><init>(Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, v2, v3, v4}, Lly0;->c(Ljava/lang/String;Lyn0;Lj6;)Lr6;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    iput-object v2, p0, Lml2;->C:Lr6;

    .line 251
    .line 252
    const-string v2, "StartIntentSenderForResult"

    .line 253
    .line 254
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    new-instance v3, Ln6;

    .line 259
    .line 260
    invoke-direct {v3, v0}, Ln6;-><init>(B)V

    .line 261
    .line 262
    .line 263
    new-instance v0, Lel2;

    .line 264
    .line 265
    const/4 v4, 0x1

    .line 266
    invoke-direct {v0, p0, v4}, Lel2;-><init>(Lml2;B)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1, v2, v3, v0}, Lly0;->c(Ljava/lang/String;Lyn0;Lj6;)Lr6;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iput-object v0, p0, Lml2;->D:Lr6;

    .line 274
    .line 275
    const-string v0, "RequestPermissions"

    .line 276
    .line 277
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    new-instance v1, Ln6;

    .line 282
    .line 283
    invoke-direct {v1, v4}, Ln6;-><init>(B)V

    .line 284
    .line 285
    .line 286
    new-instance v2, Lel2;

    .line 287
    .line 288
    invoke-direct {v2, p0, p2}, Lel2;-><init>(Lml2;B)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1, v0, v1, v2}, Lly0;->c(Ljava/lang/String;Lyn0;Lj6;)Lr6;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    iput-object p1, p0, Lml2;->E:Lr6;

    .line 296
    .line 297
    :cond_b
    iget-object p1, p0, Lml2;->w:Ltk2;

    .line 298
    .line 299
    if-eqz p1, :cond_c

    .line 300
    .line 301
    iget-object p1, p1, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 302
    .line 303
    iget-object p2, p0, Lml2;->q:Ldl2;

    .line 304
    .line 305
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->l0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 309
    .line 310
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    :cond_c
    iget-object p1, p0, Lml2;->w:Ltk2;

    .line 314
    .line 315
    if-eqz p1, :cond_d

    .line 316
    .line 317
    iget-object p1, p1, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 318
    .line 319
    iget-object p2, p0, Lml2;->r:Ldl2;

    .line 320
    .line 321
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->m0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 325
    .line 326
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    :cond_d
    iget-object p1, p0, Lml2;->w:Ltk2;

    .line 330
    .line 331
    if-eqz p1, :cond_e

    .line 332
    .line 333
    iget-object p1, p1, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 334
    .line 335
    iget-object p2, p0, Lml2;->s:Ldl2;

    .line 336
    .line 337
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->o0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 341
    .line 342
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    :cond_e
    iget-object p1, p0, Lml2;->w:Ltk2;

    .line 346
    .line 347
    if-eqz p1, :cond_f

    .line 348
    .line 349
    iget-object p1, p1, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 350
    .line 351
    iget-object p2, p0, Lml2;->t:Ldl2;

    .line 352
    .line 353
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 357
    .line 358
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    :cond_f
    iget-object p1, p0, Lml2;->w:Ltk2;

    .line 362
    .line 363
    if-eqz p1, :cond_10

    .line 364
    .line 365
    if-nez p3, :cond_10

    .line 366
    .line 367
    iget-object p1, p1, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 368
    .line 369
    iget-object p0, p0, Lml2;->u:Lfl2;

    .line 370
    .line 371
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->Z:Lf63;

    .line 375
    .line 376
    iget-object p2, p1, Lf63;->Z:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 379
    .line 380
    invoke-virtual {p2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    iget-object p0, p1, Lf63;->Y:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast p0, Ljava/lang/Runnable;

    .line 386
    .line 387
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 388
    .line 389
    .line 390
    :cond_10
    return-void

    .line 391
    :cond_11
    const-string p0, "Already attached"

    .line 392
    .line 393
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    return-void
.end method

.method public final b0(Lqk2;Lo84;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lqk2;->g0:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lml2;->c:Lz47;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lz47;->z(Ljava/lang/String;)Lqk2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p1, Lqk2;->w0:Ltk2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p1, Lqk2;->v0:Lml2;

    .line 16
    .line 17
    if-ne v0, p0, :cond_1

    .line 18
    .line 19
    :cond_0
    iput-object p2, p1, Lqk2;->R0:Lo84;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const-string p2, "Fragment "

    .line 23
    .line 24
    const-string v0, " is not an active fragment of FragmentManager "

    .line 25
    .line 26
    invoke-static {p2, p1, v0, p0}, Lb61;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final c(Lqk2;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lml2;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean v1, p1, Lqk2;->D0:Z

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-boolean v1, p1, Lqk2;->D0:Z

    .line 17
    .line 18
    iget-boolean v1, p1, Lqk2;->m0:Z

    .line 19
    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Lml2;->c:Lz47;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lz47;->i(Lqk2;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lml2;->K(I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Lqk2;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-static {p1}, Lml2;->L(Lqk2;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Lml2;->G:Z

    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public final c0(Lqk2;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lqk2;->g0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lml2;->c:Lz47;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lz47;->z(Ljava/lang/String;)Lqk2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p1, Lqk2;->w0:Ltk2;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p1, Lqk2;->v0:Lml2;

    .line 18
    .line 19
    if-ne v0, p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "Fragment "

    .line 23
    .line 24
    const-string v1, " is not an active fragment of FragmentManager "

    .line 25
    .line 26
    invoke-static {v0, p1, v1, p0}, Lb61;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    iget-object v0, p0, Lml2;->z:Lqk2;

    .line 31
    .line 32
    iput-object p1, p0, Lml2;->z:Lqk2;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lml2;->s(Lqk2;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lml2;->z:Lqk2;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lml2;->s(Lqk2;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lml2;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lml2;->h:Lr00;

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lml2;->h:Lr00;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lr00;->r:Z

    .line 19
    .line 20
    invoke-virtual {v0}, Lr00;->d()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lml2;->h:Lr00;

    .line 24
    .line 25
    new-instance v2, Lc1;

    .line 26
    .line 27
    const/16 v3, 0x15

    .line 28
    .line 29
    invoke-direct {v2, p0, v3}, Lc1;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    iget-object v3, v0, Lr00;->p:Ljava/util/ArrayList;

    .line 33
    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    new-instance v3, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v3, v0, Lr00;->p:Ljava/util/ArrayList;

    .line 42
    .line 43
    :cond_1
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lml2;->h:Lr00;

    .line 47
    .line 48
    invoke-virtual {v0}, Lr00;->e()V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    iput-boolean v0, p0, Lml2;->i:Z

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lml2;->A(Z)Z

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lml2;->F()V

    .line 58
    .line 59
    .line 60
    iput-boolean v1, p0, Lml2;->i:Z

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lml2;->h:Lr00;

    .line 64
    .line 65
    :cond_2
    return-void
.end method

.method public final d0(Lqk2;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lml2;->H(Lqk2;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_7

    .line 6
    .line 7
    iget-object v0, p1, Lqk2;->M0:Lnk2;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v2, v0, Lnk2;->b:I

    .line 15
    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    move v3, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget v3, v0, Lnk2;->c:I

    .line 21
    .line 22
    :goto_1
    add-int/2addr v3, v2

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    move v2, v1

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    iget v2, v0, Lnk2;->d:I

    .line 28
    .line 29
    :goto_2
    add-int/2addr v2, v3

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    move v0, v1

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    iget v0, v0, Lnk2;->e:I

    .line 35
    .line 36
    :goto_3
    add-int/2addr v0, v2

    .line 37
    if-lez v0, :cond_7

    .line 38
    .line 39
    sget v0, Lt36;->visible_removing_fragment_view_tag:I

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    sget v0, Lt36;->visible_removing_fragment_view_tag:I

    .line 48
    .line 49
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_4
    sget v0, Lt36;->visible_removing_fragment_view_tag:I

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Lqk2;

    .line 59
    .line 60
    iget-object p1, p1, Lqk2;->M0:Lnk2;

    .line 61
    .line 62
    if-nez p1, :cond_5

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_5
    iget-boolean v1, p1, Lnk2;->a:Z

    .line 66
    .line 67
    :goto_4
    iget-object p1, p0, Lqk2;->M0:Lnk2;

    .line 68
    .line 69
    if-nez p1, :cond_6

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_6
    invoke-virtual {p0}, Lqk2;->g()Lnk2;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iput-boolean v1, p0, Lnk2;->a:Z

    .line 77
    .line 78
    :cond_7
    :goto_5
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lml2;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Lml2;->M:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lml2;->L:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lml2;->c:Lz47;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz47;->C()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lwl2;

    .line 22
    .line 23
    iget-object v2, v1, Lwl2;->c:Lqk2;

    .line 24
    .line 25
    iget-boolean v3, v2, Lqk2;->K0:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget-boolean v3, p0, Lml2;->b:Z

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    iput-boolean v1, p0, Lml2;->K:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x0

    .line 38
    iput-boolean v3, v2, Lqk2;->K0:Z

    .line 39
    .line 40
    invoke-virtual {v1}, Lwl2;->k()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public final f()Ljava/util/HashSet;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lml2;->c:Lz47;

    .line 7
    .line 8
    invoke-virtual {v1}, Lz47;->C()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lwl2;

    .line 27
    .line 28
    iget-object v2, v2, Lwl2;->c:Lqk2;

    .line 29
    .line 30
    iget-object v2, v2, Lqk2;->I0:Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Lml2;->J()Lk42;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget v3, Lt36;->special_effects_controller_view_tag:I

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    instance-of v4, v3, Lfg1;

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    check-cast v3, Lfg1;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    new-instance v3, Lfg1;

    .line 55
    .line 56
    invoke-direct {v3, v2}, Lfg1;-><init>(Landroid/view/ViewGroup;)V

    .line 57
    .line 58
    .line 59
    sget v4, Lt36;->special_effects_controller_view_tag:I

    .line 60
    .line 61
    invoke-virtual {v2, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-object v0
.end method

.method public final f0(Ljava/lang/IllegalStateException;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lih4;

    .line 5
    .line 6
    invoke-direct {v0}, Lih4;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/io/PrintWriter;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const-string v4, "  "

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    :try_start_0
    new-array p0, v2, [Ljava/lang/String;

    .line 23
    .line 24
    iget-object v0, v0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 25
    .line 26
    invoke-virtual {v0, v4, v3, v1, p0}, Landroidx/fragment/app/FragmentActivity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-array v0, v2, [Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p0, v4, v3, v1, v0}, Lml2;->w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    :catch_0
    :goto_0
    throw p1
.end method

.method public final g(Ljava/util/ArrayList;II)Ljava/util/HashSet;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-ge p2, p3, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lr00;

    .line 13
    .line 14
    iget-object v1, v1, Lr00;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcm2;

    .line 31
    .line 32
    iget-object v2, v2, Lcm2;->b:Lqk2;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v2, v2, Lqk2;->I0:Landroid/view/ViewGroup;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-static {v2, p0}, Lfg1;->i(Landroid/view/ViewGroup;Lml2;)Lfg1;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object v0
.end method

.method public final g0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lml2;->j:Ll00;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Lu95;->f(Z)V

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lml2;->K(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lml2;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    :goto_0
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    iget-object v0, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v1, p0, Lml2;->h:Lr00;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    move v1, v3

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v1, v4

    .line 48
    :goto_1
    add-int/2addr v0, v1

    .line 49
    if-lez v0, :cond_3

    .line 50
    .line 51
    iget-object v0, p0, Lml2;->y:Lqk2;

    .line 52
    .line 53
    invoke-static {v0}, Lml2;->O(Lqk2;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move v3, v4

    .line 61
    :goto_2
    invoke-static {v2}, Lml2;->K(I)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Lml2;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    :cond_4
    iget-object p0, p0, Lml2;->j:Ll00;

    .line 71
    .line 72
    invoke-virtual {p0, v3}, Lu95;->f(Z)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw p0
.end method

.method public final h(Lqk2;)Lwl2;
    .locals 3

    .line 1
    iget-object v0, p1, Lqk2;->g0:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lml2;->c:Lz47;

    .line 4
    .line 5
    iget-object v2, v1, Lz47;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lwl2;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Lwl2;

    .line 19
    .line 20
    iget-object v2, p0, Lml2;->o:Lmj0;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, Lwl2;-><init>(Lmj0;Lz47;Lqk2;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lml2;->w:Ltk2;

    .line 26
    .line 27
    iget-object p1, p1, Ltk2;->C0:Landroidx/appcompat/app/AppCompatActivity;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Lwl2;->m(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p0, p0, Lml2;->v:I

    .line 37
    .line 38
    iput p0, v0, Lwl2;->e:I

    .line 39
    .line 40
    return-object v0
.end method

.method public final i(Lqk2;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lml2;->K(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-boolean v1, p1, Lqk2;->D0:Z

    .line 12
    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p1, Lqk2;->D0:Z

    .line 17
    .line 18
    iget-boolean v2, p1, Lqk2;->m0:Z

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-static {v0}, Lml2;->K(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Lqk2;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lml2;->c:Lz47;

    .line 32
    .line 33
    iget-object v2, v0, Lz47;->Y:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    monitor-enter v2

    .line 38
    :try_start_0
    iget-object v0, v0, Lz47;->Y:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    const/4 v0, 0x0

    .line 47
    iput-boolean v0, p1, Lqk2;->m0:Z

    .line 48
    .line 49
    invoke-static {p1}, Lml2;->L(Lqk2;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iput-boolean v1, p0, Lml2;->G:Z

    .line 56
    .line 57
    :cond_2
    invoke-virtual {p0, p1}, Lml2;->d0(Lqk2;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw p0

    .line 64
    :cond_3
    return-void
.end method

.method public final j(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lml2;->f0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 21
    .line 22
    invoke-virtual {p0}, Lz47;->G()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lqk2;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    iput-boolean v1, v0, Lqk2;->H0:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v0, v0, Lqk2;->x0:Lml2;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lml2;->j(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
.end method

.method public final k()Z
    .locals 4

    .line 1
    iget v0, p0, Lml2;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 9
    .line 10
    invoke-virtual {p0}, Lz47;->G()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lqk2;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-boolean v3, v0, Lqk2;->C0:Z

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    iget-object v0, v0, Lqk2;->x0:Lml2;

    .line 37
    .line 38
    invoke-virtual {v0}, Lml2;->k()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v1

    .line 44
    :goto_0
    if-eqz v0, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final l()Z
    .locals 7

    .line 1
    iget v0, p0, Lml2;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lml2;->c:Lz47;

    .line 9
    .line 10
    invoke-virtual {v0}, Lz47;->G()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lqk2;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-static {v5}, Lml2;->N(Lqk2;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-boolean v6, v5, Lqk2;->C0:Z

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    iget-object v6, v5, Lqk2;->x0:Lml2;

    .line 45
    .line 46
    invoke-virtual {v6}, Lml2;->l()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v6, v1

    .line 52
    :goto_1
    if-eqz v6, :cond_1

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    new-instance v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move v4, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    iget-object v0, p0, Lml2;->e:Ljava/util/ArrayList;

    .line 67
    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    :goto_2
    iget-object v0, p0, Lml2;->e:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-ge v1, v0, :cond_7

    .line 77
    .line 78
    iget-object v0, p0, Lml2;->e:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lqk2;

    .line 85
    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_6

    .line 93
    .line 94
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    iput-object v3, p0, Lml2;->e:Ljava/util/ArrayList;

    .line 101
    .line 102
    return v4
.end method

.method public final m()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lml2;->J:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lml2;->A(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lml2;->x()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lml2;->w:Ltk2;

    .line 11
    .line 12
    iget-object v2, p0, Lml2;->c:Lz47;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v0, v2, Lz47;->g0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lpl2;

    .line 19
    .line 20
    iget-boolean v0, v0, Lpl2;->f:Z

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, v1, Ltk2;->C0:Landroidx/appcompat/app/AppCompatActivity;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    xor-int/2addr v0, v1

    .line 30
    :goto_0
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lml2;->l:Ljava/util/Map;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lt00;

    .line 53
    .line 54
    iget-object v1, v1, Lt00;->X:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Ljava/lang/String;

    .line 71
    .line 72
    iget-object v4, v2, Lz47;->g0:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, Lpl2;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    invoke-virtual {v4, v3, v5}, Lpl2;->f(Ljava/lang/String;Z)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    const/4 v0, -0x1

    .line 82
    invoke-virtual {p0, v0}, Lml2;->v(I)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    iget-object v0, v0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 90
    .line 91
    iget-object v1, p0, Lml2;->r:Ldl2;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->m0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    :cond_3
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 102
    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    iget-object v0, v0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 106
    .line 107
    iget-object v1, p0, Lml2;->q:Ldl2;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->l0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_4
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 118
    .line 119
    if-eqz v0, :cond_5

    .line 120
    .line 121
    iget-object v0, v0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 122
    .line 123
    iget-object v1, p0, Lml2;->s:Ldl2;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->o0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    :cond_5
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 134
    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    iget-object v0, v0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 138
    .line 139
    iget-object v1, p0, Lml2;->t:Ldl2;

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    :cond_6
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 150
    .line 151
    if-eqz v0, :cond_8

    .line 152
    .line 153
    iget-object v1, p0, Lml2;->y:Lqk2;

    .line 154
    .line 155
    if-nez v1, :cond_8

    .line 156
    .line 157
    iget-object v0, v0, Ltk2;->F0:Landroidx/appcompat/app/AppCompatActivity;

    .line 158
    .line 159
    iget-object v1, p0, Lml2;->u:Lfl2;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->Z:Lf63;

    .line 165
    .line 166
    iget-object v2, v0, Lf63;->Z:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 169
    .line 170
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    iget-object v2, v0, Lf63;->f0:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v2, Ljava/util/HashMap;

    .line 176
    .line 177
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    if-nez v1, :cond_7

    .line 182
    .line 183
    iget-object v0, v0, Lf63;->Y:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Ljava/lang/Runnable;

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_7
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 192
    .line 193
    .line 194
    :cond_8
    :goto_2
    const/4 v0, 0x0

    .line 195
    iput-object v0, p0, Lml2;->w:Ltk2;

    .line 196
    .line 197
    iput-object v0, p0, Lml2;->x:Lvj8;

    .line 198
    .line 199
    iput-object v0, p0, Lml2;->y:Lqk2;

    .line 200
    .line 201
    iget-object v1, p0, Lml2;->g:Lz95;

    .line 202
    .line 203
    if-eqz v1, :cond_9

    .line 204
    .line 205
    iget-object v1, p0, Lml2;->j:Ll00;

    .line 206
    .line 207
    invoke-virtual {v1}, Lu95;->e()V

    .line 208
    .line 209
    .line 210
    iput-object v0, p0, Lml2;->g:Lz95;

    .line 211
    .line 212
    :cond_9
    iget-object v0, p0, Lml2;->C:Lr6;

    .line 213
    .line 214
    if-eqz v0, :cond_a

    .line 215
    .line 216
    invoke-virtual {v0}, Lr6;->i0()V

    .line 217
    .line 218
    .line 219
    iget-object v0, p0, Lml2;->D:Lr6;

    .line 220
    .line 221
    invoke-virtual {v0}, Lr6;->i0()V

    .line 222
    .line 223
    .line 224
    iget-object p0, p0, Lml2;->E:Lr6;

    .line 225
    .line 226
    invoke-virtual {p0}, Lr6;->i0()V

    .line 227
    .line 228
    .line 229
    :cond_a
    return-void
.end method

.method public final n(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lml2;->f0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 21
    .line 22
    invoke-virtual {p0}, Lz47;->G()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lqk2;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    iput-boolean v1, v0, Lqk2;->H0:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v0, v0, Lqk2;->x0:Lml2;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lml2;->n(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
.end method

.method public final o(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lml2;->f0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 21
    .line 22
    invoke-virtual {p0}, Lz47;->G()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lqk2;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v0, v0, Lqk2;->x0:Lml2;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, v1}, Lml2;->o(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz47;->D()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lqk2;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lqk2;->t()Z

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Lqk2;->x0:Lml2;

    .line 29
    .line 30
    invoke-virtual {v0}, Lml2;->p()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final q()Z
    .locals 4

    .line 1
    iget v0, p0, Lml2;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 9
    .line 10
    invoke-virtual {p0}, Lz47;->G()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lqk2;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-boolean v3, v0, Lqk2;->C0:Z

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    iget-object v0, v0, Lqk2;->x0:Lml2;

    .line 37
    .line 38
    invoke-virtual {v0}, Lml2;->q()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v1

    .line 44
    :goto_0
    if-eqz v0, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final r()V
    .locals 2

    .line 1
    iget v0, p0, Lml2;->v:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 8
    .line 9
    invoke-virtual {p0}, Lz47;->G()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lqk2;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-boolean v1, v0, Lqk2;->C0:Z

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lqk2;->x0:Lml2;

    .line 36
    .line 37
    invoke-virtual {v0}, Lml2;->r()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final s(Lqk2;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p1, Lqk2;->g0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lz47;->z(Ljava/lang/String;)Lqk2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eq p1, p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p1, Lqk2;->v0:Lml2;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lml2;->O(Lqk2;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    iget-object v0, p1, Lqk2;->l0:Ljava/lang/Boolean;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eq v0, p0, :cond_2

    .line 32
    .line 33
    :cond_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iput-object p0, p1, Lqk2;->l0:Ljava/lang/Boolean;

    .line 38
    .line 39
    iget-object p0, p1, Lqk2;->x0:Lml2;

    .line 40
    .line 41
    invoke-virtual {p0}, Lml2;->g0()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lml2;->z:Lqk2;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lml2;->s(Lqk2;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_0
    return-void
.end method

.method public final t(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lml2;->f0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 21
    .line 22
    invoke-virtual {p0}, Lz47;->G()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lqk2;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v0, v0, Lqk2;->x0:Lml2;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, v1}, Lml2;->t(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "FragmentManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lml2;->y:Lqk2;

    .line 30
    .line 31
    const-string v2, "}"

    .line 32
    .line 33
    const-string v3, "{"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lml2;->y:Lqk2;

    .line 52
    .line 53
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Lml2;->w:Ltk2;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lml2;->w:Ltk2;

    .line 87
    .line 88
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string p0, "null"

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string p0, "}}"

    .line 109
    .line 110
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method

.method public final u()Z
    .locals 5

    .line 1
    iget v0, p0, Lml2;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object p0, p0, Lml2;->c:Lz47;

    .line 9
    .line 10
    invoke-virtual {p0}, Lz47;->G()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    move v0, v1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lqk2;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-static {v3}, Lml2;->N(Lqk2;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    iget-boolean v4, v3, Lqk2;->C0:Z

    .line 40
    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    iget-object v3, v3, Lqk2;->x0:Lml2;

    .line 44
    .line 45
    invoke-virtual {v3}, Lml2;->u()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v3, v1

    .line 51
    :goto_1
    if-eqz v3, :cond_1

    .line 52
    .line 53
    move v0, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    return v0
.end method

.method public final v(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lml2;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Lml2;->c:Lz47;

    .line 6
    .line 7
    iget-object v2, v2, Lz47;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lwl2;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Lwl2;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Lml2;->Q(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lml2;->f()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lfg1;

    .line 58
    .line 59
    invoke-virtual {v2}, Lfg1;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iput-boolean v1, p0, Lml2;->b:Z

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lml2;->A(Z)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_2
    iput-boolean v1, p0, Lml2;->b:Z

    .line 72
    .line 73
    throw p1
.end method

.method public final w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string v0, "    "

    .line 2
    .line 3
    invoke-static {p1, v0}, Lpc6;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lml2;->c:Lz47;

    .line 8
    .line 9
    iget-object v2, v1, Lz47;->Y:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    const-string v3, "    "

    .line 14
    .line 15
    invoke-static {p1, v3}, Lpc6;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v1, v1, Lz47;->Z:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/4 v5, 0x0

    .line 28
    if-nez v4, :cond_1e

    .line 29
    .line 30
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v4, "Active Fragments:"

    .line 34
    .line 35
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1e

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Lwl2;

    .line 57
    .line 58
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    if-eqz v4, :cond_1d

    .line 62
    .line 63
    iget-object v4, v4, Lwl2;->c:Lqk2;

    .line 64
    .line 65
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v6, "mFragmentId=#"

    .line 72
    .line 73
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget v6, v4, Lqk2;->z0:I

    .line 77
    .line 78
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v6, " mContainerId=#"

    .line 86
    .line 87
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget v6, v4, Lqk2;->A0:I

    .line 91
    .line 92
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-string v6, " mTag="

    .line 100
    .line 101
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v6, v4, Lqk2;->B0:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string v6, "mState="

    .line 113
    .line 114
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget v6, v4, Lqk2;->X:I

    .line 118
    .line 119
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(I)V

    .line 120
    .line 121
    .line 122
    const-string v6, " mWho="

    .line 123
    .line 124
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v6, v4, Lqk2;->g0:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const-string v6, " mBackStackNesting="

    .line 133
    .line 134
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget v6, v4, Lqk2;->u0:I

    .line 138
    .line 139
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const-string v6, "mAdded="

    .line 146
    .line 147
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-boolean v6, v4, Lqk2;->m0:Z

    .line 151
    .line 152
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 153
    .line 154
    .line 155
    const-string v6, " mRemoving="

    .line 156
    .line 157
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-boolean v6, v4, Lqk2;->n0:Z

    .line 161
    .line 162
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 163
    .line 164
    .line 165
    const-string v6, " mFromLayout="

    .line 166
    .line 167
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    iget-boolean v6, v4, Lqk2;->p0:Z

    .line 171
    .line 172
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 173
    .line 174
    .line 175
    const-string v6, " mInLayout="

    .line 176
    .line 177
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    iget-boolean v6, v4, Lqk2;->q0:Z

    .line 181
    .line 182
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const-string v6, "mHidden="

    .line 189
    .line 190
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    iget-boolean v6, v4, Lqk2;->C0:Z

    .line 194
    .line 195
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 196
    .line 197
    .line 198
    const-string v6, " mDetached="

    .line 199
    .line 200
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    iget-boolean v6, v4, Lqk2;->D0:Z

    .line 204
    .line 205
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 206
    .line 207
    .line 208
    const-string v6, " mMenuVisible="

    .line 209
    .line 210
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget-boolean v6, v4, Lqk2;->G0:Z

    .line 214
    .line 215
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 216
    .line 217
    .line 218
    const-string v6, " mHasMenu="

    .line 219
    .line 220
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const-string v6, "mRetainInstance="

    .line 230
    .line 231
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    iget-boolean v6, v4, Lqk2;->E0:Z

    .line 235
    .line 236
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 237
    .line 238
    .line 239
    const-string v6, " mUserVisibleHint="

    .line 240
    .line 241
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    iget-boolean v6, v4, Lqk2;->L0:Z

    .line 245
    .line 246
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 247
    .line 248
    .line 249
    iget-object v6, v4, Lqk2;->v0:Lml2;

    .line 250
    .line 251
    if-eqz v6, :cond_0

    .line 252
    .line 253
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    const-string v6, "mFragmentManager="

    .line 257
    .line 258
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    iget-object v6, v4, Lqk2;->v0:Lml2;

    .line 262
    .line 263
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_0
    iget-object v6, v4, Lqk2;->w0:Ltk2;

    .line 267
    .line 268
    if-eqz v6, :cond_1

    .line 269
    .line 270
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    const-string v6, "mHost="

    .line 274
    .line 275
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    iget-object v6, v4, Lqk2;->w0:Ltk2;

    .line 279
    .line 280
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_1
    iget-object v6, v4, Lqk2;->y0:Lqk2;

    .line 284
    .line 285
    if-eqz v6, :cond_2

    .line 286
    .line 287
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    const-string v6, "mParentFragment="

    .line 291
    .line 292
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    iget-object v6, v4, Lqk2;->y0:Lqk2;

    .line 296
    .line 297
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    :cond_2
    iget-object v6, v4, Lqk2;->h0:Landroid/os/Bundle;

    .line 301
    .line 302
    if-eqz v6, :cond_3

    .line 303
    .line 304
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    const-string v6, "mArguments="

    .line 308
    .line 309
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    iget-object v6, v4, Lqk2;->h0:Landroid/os/Bundle;

    .line 313
    .line 314
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    :cond_3
    iget-object v6, v4, Lqk2;->Y:Landroid/os/Bundle;

    .line 318
    .line 319
    if-eqz v6, :cond_4

    .line 320
    .line 321
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    const-string v6, "mSavedFragmentState="

    .line 325
    .line 326
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    iget-object v6, v4, Lqk2;->Y:Landroid/os/Bundle;

    .line 330
    .line 331
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_4
    iget-object v6, v4, Lqk2;->Z:Landroid/util/SparseArray;

    .line 335
    .line 336
    if-eqz v6, :cond_5

    .line 337
    .line 338
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    const-string v6, "mSavedViewState="

    .line 342
    .line 343
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    iget-object v6, v4, Lqk2;->Z:Landroid/util/SparseArray;

    .line 347
    .line 348
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    :cond_5
    iget-object v6, v4, Lqk2;->f0:Landroid/os/Bundle;

    .line 352
    .line 353
    if-eqz v6, :cond_6

    .line 354
    .line 355
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    const-string v6, "mSavedViewRegistryState="

    .line 359
    .line 360
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    iget-object v6, v4, Lqk2;->f0:Landroid/os/Bundle;

    .line 364
    .line 365
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    :cond_6
    iget-object v6, v4, Lqk2;->i0:Lqk2;

    .line 369
    .line 370
    const/4 v7, 0x0

    .line 371
    if-eqz v6, :cond_7

    .line 372
    .line 373
    goto :goto_1

    .line 374
    :cond_7
    iget-object v6, v4, Lqk2;->v0:Lml2;

    .line 375
    .line 376
    if-eqz v6, :cond_8

    .line 377
    .line 378
    iget-object v8, v4, Lqk2;->j0:Ljava/lang/String;

    .line 379
    .line 380
    if-eqz v8, :cond_8

    .line 381
    .line 382
    iget-object v6, v6, Lml2;->c:Lz47;

    .line 383
    .line 384
    invoke-virtual {v6, v8}, Lz47;->z(Ljava/lang/String;)Lqk2;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    goto :goto_1

    .line 389
    :cond_8
    move-object v6, v7

    .line 390
    :goto_1
    if-eqz v6, :cond_9

    .line 391
    .line 392
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    const-string v8, "mTarget="

    .line 396
    .line 397
    invoke-virtual {p3, v8}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    const-string v6, " mTargetRequestCode="

    .line 404
    .line 405
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    iget v6, v4, Lqk2;->k0:I

    .line 409
    .line 410
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 411
    .line 412
    .line 413
    :cond_9
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    const-string v6, "mPopDirection="

    .line 417
    .line 418
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    iget-object v6, v4, Lqk2;->M0:Lnk2;

    .line 422
    .line 423
    if-nez v6, :cond_a

    .line 424
    .line 425
    move v6, v5

    .line 426
    goto :goto_2

    .line 427
    :cond_a
    iget-boolean v6, v6, Lnk2;->a:Z

    .line 428
    .line 429
    :goto_2
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 430
    .line 431
    .line 432
    iget-object v6, v4, Lqk2;->M0:Lnk2;

    .line 433
    .line 434
    if-nez v6, :cond_b

    .line 435
    .line 436
    move v6, v5

    .line 437
    goto :goto_3

    .line 438
    :cond_b
    iget v6, v6, Lnk2;->b:I

    .line 439
    .line 440
    :goto_3
    if-eqz v6, :cond_d

    .line 441
    .line 442
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    const-string v6, "getEnterAnim="

    .line 446
    .line 447
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    iget-object v6, v4, Lqk2;->M0:Lnk2;

    .line 451
    .line 452
    if-nez v6, :cond_c

    .line 453
    .line 454
    move v6, v5

    .line 455
    goto :goto_4

    .line 456
    :cond_c
    iget v6, v6, Lnk2;->b:I

    .line 457
    .line 458
    :goto_4
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 459
    .line 460
    .line 461
    :cond_d
    iget-object v6, v4, Lqk2;->M0:Lnk2;

    .line 462
    .line 463
    if-nez v6, :cond_e

    .line 464
    .line 465
    move v6, v5

    .line 466
    goto :goto_5

    .line 467
    :cond_e
    iget v6, v6, Lnk2;->c:I

    .line 468
    .line 469
    :goto_5
    if-eqz v6, :cond_10

    .line 470
    .line 471
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    const-string v6, "getExitAnim="

    .line 475
    .line 476
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    iget-object v6, v4, Lqk2;->M0:Lnk2;

    .line 480
    .line 481
    if-nez v6, :cond_f

    .line 482
    .line 483
    move v6, v5

    .line 484
    goto :goto_6

    .line 485
    :cond_f
    iget v6, v6, Lnk2;->c:I

    .line 486
    .line 487
    :goto_6
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 488
    .line 489
    .line 490
    :cond_10
    iget-object v6, v4, Lqk2;->M0:Lnk2;

    .line 491
    .line 492
    if-nez v6, :cond_11

    .line 493
    .line 494
    move v6, v5

    .line 495
    goto :goto_7

    .line 496
    :cond_11
    iget v6, v6, Lnk2;->d:I

    .line 497
    .line 498
    :goto_7
    if-eqz v6, :cond_13

    .line 499
    .line 500
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    const-string v6, "getPopEnterAnim="

    .line 504
    .line 505
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    iget-object v6, v4, Lqk2;->M0:Lnk2;

    .line 509
    .line 510
    if-nez v6, :cond_12

    .line 511
    .line 512
    move v6, v5

    .line 513
    goto :goto_8

    .line 514
    :cond_12
    iget v6, v6, Lnk2;->d:I

    .line 515
    .line 516
    :goto_8
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 517
    .line 518
    .line 519
    :cond_13
    iget-object v6, v4, Lqk2;->M0:Lnk2;

    .line 520
    .line 521
    if-nez v6, :cond_14

    .line 522
    .line 523
    move v6, v5

    .line 524
    goto :goto_9

    .line 525
    :cond_14
    iget v6, v6, Lnk2;->e:I

    .line 526
    .line 527
    :goto_9
    if-eqz v6, :cond_16

    .line 528
    .line 529
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    const-string v6, "getPopExitAnim="

    .line 533
    .line 534
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    iget-object v6, v4, Lqk2;->M0:Lnk2;

    .line 538
    .line 539
    if-nez v6, :cond_15

    .line 540
    .line 541
    move v6, v5

    .line 542
    goto :goto_a

    .line 543
    :cond_15
    iget v6, v6, Lnk2;->e:I

    .line 544
    .line 545
    :goto_a
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 546
    .line 547
    .line 548
    :cond_16
    iget-object v6, v4, Lqk2;->I0:Landroid/view/ViewGroup;

    .line 549
    .line 550
    if-eqz v6, :cond_17

    .line 551
    .line 552
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    const-string v6, "mContainer="

    .line 556
    .line 557
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    iget-object v6, v4, Lqk2;->I0:Landroid/view/ViewGroup;

    .line 561
    .line 562
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    :cond_17
    iget-object v6, v4, Lqk2;->J0:Landroid/view/View;

    .line 566
    .line 567
    if-eqz v6, :cond_18

    .line 568
    .line 569
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    const-string v6, "mView="

    .line 573
    .line 574
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    iget-object v6, v4, Lqk2;->J0:Landroid/view/View;

    .line 578
    .line 579
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    :cond_18
    invoke-virtual {v4}, Lqk2;->k()Landroid/content/Context;

    .line 583
    .line 584
    .line 585
    move-result-object v6

    .line 586
    if-eqz v6, :cond_1c

    .line 587
    .line 588
    invoke-interface {v4}, Lfx8;->e()Lex8;

    .line 589
    .line 590
    .line 591
    move-result-object v6

    .line 592
    sget-object v8, Lxc4;->c:Lol2;

    .line 593
    .line 594
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    sget-object v9, Ln71;->b:Ln71;

    .line 598
    .line 599
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    new-instance v10, Lyr6;

    .line 603
    .line 604
    invoke-direct {v10, v6, v8, v9}, Lyr6;-><init>(Lex8;Lbx8;Lo71;)V

    .line 605
    .line 606
    .line 607
    const-class v6, Lxc4;

    .line 608
    .line 609
    sget-object v8, Lyb6;->a:Lzb6;

    .line 610
    .line 611
    invoke-virtual {v8, v6}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 612
    .line 613
    .line 614
    move-result-object v6

    .line 615
    invoke-interface {v6}, Lzu3;->p()Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v8

    .line 619
    if-eqz v8, :cond_1b

    .line 620
    .line 621
    const-string v9, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 622
    .line 623
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v8

    .line 627
    invoke-virtual {v10, v6, v8}, Lyr6;->g(Lzu3;Ljava/lang/String;)Lxw8;

    .line 628
    .line 629
    .line 630
    move-result-object v6

    .line 631
    check-cast v6, Lxc4;

    .line 632
    .line 633
    iget-object v6, v6, Lxc4;->b:Lue7;

    .line 634
    .line 635
    iget v8, v6, Lue7;->Z:I

    .line 636
    .line 637
    if-lez v8, :cond_1c

    .line 638
    .line 639
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    const-string v8, "Loaders:"

    .line 643
    .line 644
    invoke-virtual {p3, v8}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    iget v8, v6, Lue7;->Z:I

    .line 648
    .line 649
    if-gtz v8, :cond_19

    .line 650
    .line 651
    goto :goto_b

    .line 652
    :cond_19
    invoke-virtual {v6, v5}, Lue7;->e(I)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v4

    .line 656
    if-eqz v4, :cond_1a

    .line 657
    .line 658
    invoke-static {}, Lio/sentry/c2;->m()V

    .line 659
    .line 660
    .line 661
    goto/16 :goto_0

    .line 662
    .line 663
    :cond_1a
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    const-string p0, "  #"

    .line 667
    .line 668
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v6, v5}, Lue7;->c(I)I

    .line 672
    .line 673
    .line 674
    move-result p0

    .line 675
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->print(I)V

    .line 676
    .line 677
    .line 678
    const-string p0, ": "

    .line 679
    .line 680
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    throw v7

    .line 684
    :cond_1b
    const-string v4, "Local and anonymous classes can not be ViewModels"

    .line 685
    .line 686
    invoke-static {v4}, Lbt;->q(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    goto/16 :goto_0

    .line 690
    .line 691
    :cond_1c
    :goto_b
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    new-instance v6, Ljava/lang/StringBuilder;

    .line 695
    .line 696
    const-string v7, "Child "

    .line 697
    .line 698
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    iget-object v7, v4, Lqk2;->x0:Lml2;

    .line 702
    .line 703
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    const-string v7, ":"

    .line 707
    .line 708
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v6

    .line 715
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    iget-object v4, v4, Lqk2;->x0:Lml2;

    .line 719
    .line 720
    const-string v6, "  "

    .line 721
    .line 722
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v6

    .line 726
    invoke-virtual {v4, v6, p2, p3, p4}, Lml2;->w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    goto/16 :goto_0

    .line 730
    .line 731
    :cond_1d
    const-string v4, "null"

    .line 732
    .line 733
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    goto/16 :goto_0

    .line 737
    .line 738
    :cond_1e
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 739
    .line 740
    .line 741
    move-result p2

    .line 742
    if-lez p2, :cond_1f

    .line 743
    .line 744
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    const-string p4, "Added Fragments:"

    .line 748
    .line 749
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    move p4, v5

    .line 753
    :goto_c
    if-ge p4, p2, :cond_1f

    .line 754
    .line 755
    invoke-virtual {v2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    check-cast v1, Lqk2;

    .line 760
    .line 761
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    const-string v3, "  #"

    .line 765
    .line 766
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 770
    .line 771
    .line 772
    const-string v3, ": "

    .line 773
    .line 774
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v1}, Lqk2;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    add-int/lit8 p4, p4, 0x1

    .line 785
    .line 786
    goto :goto_c

    .line 787
    :cond_1f
    iget-object p2, p0, Lml2;->e:Ljava/util/ArrayList;

    .line 788
    .line 789
    if-eqz p2, :cond_20

    .line 790
    .line 791
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 792
    .line 793
    .line 794
    move-result p2

    .line 795
    if-lez p2, :cond_20

    .line 796
    .line 797
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    const-string p4, "Fragments Created Menus:"

    .line 801
    .line 802
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    move p4, v5

    .line 806
    :goto_d
    if-ge p4, p2, :cond_20

    .line 807
    .line 808
    iget-object v1, p0, Lml2;->e:Ljava/util/ArrayList;

    .line 809
    .line 810
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    check-cast v1, Lqk2;

    .line 815
    .line 816
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    const-string v2, "  #"

    .line 820
    .line 821
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 825
    .line 826
    .line 827
    const-string v2, ": "

    .line 828
    .line 829
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v1}, Lqk2;->toString()Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    add-int/lit8 p4, p4, 0x1

    .line 840
    .line 841
    goto :goto_d

    .line 842
    :cond_20
    iget-object p2, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 843
    .line 844
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 845
    .line 846
    .line 847
    move-result p2

    .line 848
    if-lez p2, :cond_21

    .line 849
    .line 850
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    const-string p4, "Back Stack:"

    .line 854
    .line 855
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    move p4, v5

    .line 859
    :goto_e
    if-ge p4, p2, :cond_21

    .line 860
    .line 861
    iget-object v1, p0, Lml2;->d:Ljava/util/ArrayList;

    .line 862
    .line 863
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    check-cast v1, Lr00;

    .line 868
    .line 869
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    const-string v2, "  #"

    .line 873
    .line 874
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 878
    .line 879
    .line 880
    const-string v2, ": "

    .line 881
    .line 882
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v1}, Lr00;->toString()Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    const/4 v2, 0x1

    .line 893
    invoke-virtual {v1, v0, p3, v2}, Lr00;->h(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 894
    .line 895
    .line 896
    add-int/lit8 p4, p4, 0x1

    .line 897
    .line 898
    goto :goto_e

    .line 899
    :cond_21
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    new-instance p2, Ljava/lang/StringBuilder;

    .line 903
    .line 904
    const-string p4, "Back Stack Index: "

    .line 905
    .line 906
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    iget-object p4, p0, Lml2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 910
    .line 911
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 912
    .line 913
    .line 914
    move-result p4

    .line 915
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 916
    .line 917
    .line 918
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object p2

    .line 922
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 923
    .line 924
    .line 925
    iget-object p2, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 926
    .line 927
    monitor-enter p2

    .line 928
    :try_start_0
    iget-object p4, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 929
    .line 930
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 931
    .line 932
    .line 933
    move-result p4

    .line 934
    if-lez p4, :cond_22

    .line 935
    .line 936
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    const-string v0, "Pending Actions:"

    .line 940
    .line 941
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 942
    .line 943
    .line 944
    :goto_f
    if-ge v5, p4, :cond_22

    .line 945
    .line 946
    iget-object v0, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 947
    .line 948
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    check-cast v0, Ljl2;

    .line 953
    .line 954
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 955
    .line 956
    .line 957
    const-string v1, "  #"

    .line 958
    .line 959
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 960
    .line 961
    .line 962
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 963
    .line 964
    .line 965
    const-string v1, ": "

    .line 966
    .line 967
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 971
    .line 972
    .line 973
    add-int/lit8 v5, v5, 0x1

    .line 974
    .line 975
    goto :goto_f

    .line 976
    :catchall_0
    move-exception p0

    .line 977
    goto :goto_10

    .line 978
    :cond_22
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 979
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    const-string p2, "FragmentManager misc state:"

    .line 983
    .line 984
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 985
    .line 986
    .line 987
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    const-string p2, "  mHost="

    .line 991
    .line 992
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 993
    .line 994
    .line 995
    iget-object p2, p0, Lml2;->w:Ltk2;

    .line 996
    .line 997
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 998
    .line 999
    .line 1000
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    const-string p2, "  mContainer="

    .line 1004
    .line 1005
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1006
    .line 1007
    .line 1008
    iget-object p2, p0, Lml2;->x:Lvj8;

    .line 1009
    .line 1010
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1011
    .line 1012
    .line 1013
    iget-object p2, p0, Lml2;->y:Lqk2;

    .line 1014
    .line 1015
    if-eqz p2, :cond_23

    .line 1016
    .line 1017
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1018
    .line 1019
    .line 1020
    const-string p2, "  mParent="

    .line 1021
    .line 1022
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    iget-object p2, p0, Lml2;->y:Lqk2;

    .line 1026
    .line 1027
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1028
    .line 1029
    .line 1030
    :cond_23
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1031
    .line 1032
    .line 1033
    const-string p2, "  mCurState="

    .line 1034
    .line 1035
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1036
    .line 1037
    .line 1038
    iget p2, p0, Lml2;->v:I

    .line 1039
    .line 1040
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 1041
    .line 1042
    .line 1043
    const-string p2, " mStateSaved="

    .line 1044
    .line 1045
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1046
    .line 1047
    .line 1048
    iget-boolean p2, p0, Lml2;->H:Z

    .line 1049
    .line 1050
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1051
    .line 1052
    .line 1053
    const-string p2, " mStopped="

    .line 1054
    .line 1055
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1056
    .line 1057
    .line 1058
    iget-boolean p2, p0, Lml2;->I:Z

    .line 1059
    .line 1060
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1061
    .line 1062
    .line 1063
    const-string p2, " mDestroyed="

    .line 1064
    .line 1065
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1066
    .line 1067
    .line 1068
    iget-boolean p2, p0, Lml2;->J:Z

    .line 1069
    .line 1070
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 1071
    .line 1072
    .line 1073
    iget-boolean p2, p0, Lml2;->G:Z

    .line 1074
    .line 1075
    if-eqz p2, :cond_24

    .line 1076
    .line 1077
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1078
    .line 1079
    .line 1080
    const-string p1, "  mNeedMenuInvalidate="

    .line 1081
    .line 1082
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1083
    .line 1084
    .line 1085
    iget-boolean p0, p0, Lml2;->G:Z

    .line 1086
    .line 1087
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->println(Z)V

    .line 1088
    .line 1089
    .line 1090
    :cond_24
    return-void

    .line 1091
    :goto_10
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1092
    throw p0
.end method

.method public final x()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lml2;->f()Ljava/util/HashSet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lfg1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lfg1;->h()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final y(Ljl2;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p0, p0, Lml2;->J:Z

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const-string p0, "FragmentManager has been destroyed"

    .line 12
    .line 13
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "FragmentManager has not been attached to a host."

    .line 18
    .line 19
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p0}, Lml2;->P()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 31
    .line 32
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_3
    :goto_0
    iget-object v0, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    monitor-enter v0

    .line 39
    :try_start_0
    iget-object v1, p0, Lml2;->w:Ltk2;

    .line 40
    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    if-eqz p2, :cond_4

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "Activity has been destroyed"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_5
    iget-object p2, p0, Lml2;->a:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lml2;->Z()V

    .line 63
    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-void

    .line 67
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p0
.end method

.method public final z(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lml2;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lml2;->w:Ltk2;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p0, p0, Lml2;->J:Z

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const-string p0, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "FragmentManager has not been attached to a host."

    .line 20
    .line 21
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lml2;->w:Ltk2;

    .line 30
    .line 31
    iget-object v1, v1, Ltk2;->D0:Landroid/os/Handler;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-ne v0, v1, :cond_5

    .line 38
    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Lml2;->P()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 49
    .line 50
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    :goto_0
    iget-object p1, p0, Lml2;->L:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-nez p1, :cond_4

    .line 57
    .line 58
    new-instance p1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lml2;->L:Ljava/util/ArrayList;

    .line 64
    .line 65
    new-instance p1, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lml2;->M:Ljava/util/ArrayList;

    .line 71
    .line 72
    :cond_4
    return-void

    .line 73
    :cond_5
    const-string p0, "Must be called from main thread of fragment host"

    .line 74
    .line 75
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_6
    const-string p0, "FragmentManager is already executing transactions"

    .line 80
    .line 81
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method
